
package com.mycompany.entornosweb2septiembre.domain;

/**
 *
 * @author Vicente
 */
public class Menu {
    
    private String nombre;
    private String descripcion;
    private boolean disponibilidad;
    private int precio;

    public Menu(String nombre, String descripcion, boolean disponibilidad, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
