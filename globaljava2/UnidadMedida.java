/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.globaljava2;

/**
 *
 * @author emanu
 */
public class UnidadMedida {
    private String denominacion;

    public UnidadMedida() {
    }

    public UnidadMedida(String denominacion) {
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
        return "UnidadMedida{" + "denominacion=" + denominacion + '}';
    }
    
}
