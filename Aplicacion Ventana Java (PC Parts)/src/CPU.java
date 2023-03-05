/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ruflas
 */
public class CPU extends Producto {
    private String chipset;

    public CPU(String nombre, double precio, String especificaciones, double oferta,String chipse) {
        super(nombre, precio, especificaciones, oferta, TipoProducto.CPU);
        this.setChipset(chipset);
    }

    public String getChipset() {
        return this.chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
}

