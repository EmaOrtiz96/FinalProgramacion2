/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.globaljava2;

/**
 *
 * @author emanu
 */
public class Imagen {
    private String denominacion;

    public Imagen() {
    }

    public Imagen(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Imagen{" + "denominacion=" + denominacion + '}';
    }
    
    
}
