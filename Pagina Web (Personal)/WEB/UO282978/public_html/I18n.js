//ReqI12
function performCalculations() {
    const number1 = parseFloat(document.getElementById("number1").value); //ReqI12
    const number2 = parseFloat(document.getElementById("number2").value);//ReqI12
    const date = new Date(document.getElementById("date").value); //ReqI12

    const decimalResult = number1 * number2; 
    const currencyResult = number1 + number2; 
    const dateResult = new Date(date.getTime() + (number1 * 86400000));// ReqI15 

    document.getElementById("decimalResult").innerText = "Resultado en decimal: " + decimalFormatter.format(decimalResult);//ReqI13 //ReqI12
    document.getElementById("currencyResult").innerText = "Resultado en moneda: " + currencyFormatter.format(currencyResult); //ReqI14 //ReqI12
    document.getElementById("dateResult").innerText = "Resultado en fecha corta: " + shortDateFormatter.format(dateResult) + " - Fecha larga: " + longDateFormatter.format(dateResult); //ReqI16 
}
//ReqI12
function reset(){
     document.getElementById("number1").value = '';
     document.getElementById("number2").value = '';
     document.getElementById("date").value = '';
     document.getElementById("decimalResult").innerText = "Resultado en decimal: ";
    document.getElementById("currencyResult").innerText = "Resultado en moneda: ";
    document.getElementById("dateResult").innerText = "Resultado en fecha corta: ";
}

function changeToEnglish() {
    document.documentElement.setAttribute('lang', 'en');

    decimalFormatter = new Intl.NumberFormat('en', {minimumFractionDigits: 2, maximumFractionDigits: 2});
    currencyFormatter = new Intl.NumberFormat('en', {style: 'currency', currency: 'USD'});
    shortDateFormatter = new Intl.DateTimeFormat('en', {dateStyle: 'short'});
    longDateFormatter = new Intl.DateTimeFormat('en', {dateStyle: 'full'});

    performCalculations();
}

function changeToSpanish() {
    document.documentElement.setAttribute('lang', 'es');

    decimalFormatter = new Intl.NumberFormat('es', {minimumFractionDigits: 2, maximumFractionDigits: 2});
    currencyFormatter = new Intl.NumberFormat('es', {style: 'currency', currency: 'EUR'});
    shortDateFormatter = new Intl.DateTimeFormat('es', {dateStyle: 'short'});
    longDateFormatter = new Intl.DateTimeFormat('es', {dateStyle: 'full'});

    performCalculations();
}



