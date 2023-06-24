function validarInput(inputElement) { // ReqJ24
    if (inputElement.checkValidity()) {
        inputElement.style.borderColor = "green"; // ReqF19
    } else {
        inputElement.style.borderColor = "red"; // ReqF19
    }
}

function mostrarAyuda(inputElement) { // ReqJ26
    var ayudaId = "ayuda" + inputElement.name.charAt(0).toUpperCase() + inputElement.name.slice(1);
    document.getElementById(ayudaId).style.display = "inline";
}

function ocultarAyuda(inputElement) {
    var ayudaId = "ayuda" + inputElement.name.charAt(0).toUpperCase() + inputElement.name.slice(1);
    document.getElementById(ayudaId).style.display = "none";
}

function validarFormulario() {
    var miFormulario = document.forms.miFormulario;
    var todosLosInputsValidos = true;

    for (var i = 0; i < miFormulario.length; i++) {
        if (!miFormulario[i].checkValidity()) {
            todosLosInputsValidos = false;
            break;
        }
    }

    if (!todosLosInputsValidos) {
        alert('Por favor, corrija los errores en el formulario.');
    }

    return todosLosInputsValidos;
}

function cambiarColor(colorId) { // ReqJ28
    var colorInput = document.getElementById(colorId);
    var colorSeleccionado = colorInput.value;

    // Detener la animación y establecer el color de fondo
    document.body.style.animation = 'none';
    document.body.style.backgroundImage = 'none';
    document.body.style.backgroundColor = colorSeleccionado;
}

// Función con varios parámetros (ReqJ21)
function funcionConParametros(x, y, operation) {
    if (operation % 2 !== 0) {
        var result = parseInt(x) + parseInt(y);
        document.getElementById("x").value = result;
    } else {
        document.getElementById("x").value = x - y;
    }
}

//ReqJ26 SE LE LLAMA EN principal.html
let circle;
window.onload = function () {
    circle = document.getElementById("circle");
}
//ReqJ26
function showCircle() {
    circle.classList.remove("hidden");
}

//ReqJ26
function moveCircle(event) {
    circle.style.left = `${event.clientX - 25}px`;
    circle.style.top = `${event.clientY - 25}px`;
}
//ReqJ26
function hideCircle() {
    circle.classList.add("hidden");
}

//ReqJ24 SE LE LLAMA EN principal.html
function toggleCircle(event) {
    if (event.key === 'm' || event.key === 'M') {
      if (circle.classList.contains("hidden")) {
        showCircle();
      } else {
        hideCircle();
      }
    }
  }


