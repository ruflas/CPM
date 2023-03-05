

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ruflas
 */
public class Producto {

    private double precio;
    private String nombre;
    private String especificaciones;
    private double oferta;
    private TipoProducto tipo;

    public Producto(String nombre, double precio, String especificaciones, TipoProducto tipo) {
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setEspecificaciones(especificaciones);
        this.setOferta(0);
        this.setTipo(tipo);
    }

    public Producto(String nombre, double precio, String especificaciones, double oferta, TipoProducto tipo) {
        this(nombre, precio, especificaciones, tipo);
        this.setOferta(oferta);
    }
    
    public void setOferta(double oferta) {
        if (oferta > 0.0 && oferta <= 1.0) {
            this.oferta = oferta;
        }
    }

    public double getOferta() {
        return this.oferta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\n");
        sb.append(precio).append("\n");
        sb.append("Especificaciones:\n");
        sb.append(especificaciones).append("\n");
        sb.append("Tipo: ").append(tipo.toString());
        return sb.toString();
    }
}
