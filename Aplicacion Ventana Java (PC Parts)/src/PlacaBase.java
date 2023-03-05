/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ruflas
 */
public class PlacaBase extends Producto{
    private String chipset;

    public PlacaBase(String nombre, double precio, String especificaciones,double oferta,String chipse) {
        super(nombre, precio, especificaciones, oferta,TipoProducto.Motherboard);
        this.setChipset(chipset);
    }

    public String getChipset() {
        return this.chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
}
