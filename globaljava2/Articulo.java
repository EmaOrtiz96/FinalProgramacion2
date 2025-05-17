/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.globaljava2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanu
 */
public abstract class Articulo {
    protected String denominacion;
    protected Double precioVenta;
   protected List<Imagen> imagenes = new ArrayList<>();
    protected UnidadMedida UnidadMedida;

    public Articulo() {
    }

    public Articulo(String denominacion, Double precioVenta, List<Imagen> imagenenes, UnidadMedida UnidadMedida) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.imagenes = imagenenes;
        this.UnidadMedida = UnidadMedida;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    

    public UnidadMedida getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(UnidadMedida UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }
    public void addImagen(Imagen imagen) {
    imagenes.add(imagen);
    }

    
    }

