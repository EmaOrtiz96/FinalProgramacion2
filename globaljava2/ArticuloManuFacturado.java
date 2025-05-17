/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.globaljava2;

import java.util.List;

/**
 *
 * @author emanu
 */
public class ArticuloManuFacturado extends Articulo{
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private List<ArticuloManuFacturadoDetalle> articuloManuFacturadoDetalles;

    public ArticuloManuFacturado() {
    }

    public ArticuloManuFacturado(String descripcion, Integer tiempoEstimadoMinutos, String preparacion, Articulo articulo, String denominacion, Double precioVenta, com.mycompany.globaljava2.UnidadMedida UnidadMedida) {
        super(denominacion, precioVenta, UnidadMedida);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
        
    }

    

//    public ArticuloManuFacturado(String descripcion, Integer tiempoEstimadoMinutos, String preparacion, List<ArticuloManuFacturadoDetalle> articuloManuFacturadoDetalles, Articulo articulo) {
//        this.descripcion = descripcion;
//        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
//        this.preparacion = preparacion;
//        this.articuloManuFacturadoDetalles = articuloManuFacturadoDetalles;
//        this.articulo = articulo;
//    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public List<ArticuloManuFacturadoDetalle> getArticuloManuFacturadoDetalles() {
        return articuloManuFacturadoDetalles;
    }

    public void setArticuloManuFacturadoDetalles(List<ArticuloManuFacturadoDetalle> articuloManuFacturadoDetalles) {
        this.articuloManuFacturadoDetalles = articuloManuFacturadoDetalles;
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

    public List<Imagen> getImagenenes() {
        return imagenenes;
    }

    public void setImagenenes(List<Imagen> imagenenes) {
        this.imagenenes = imagenenes;
    }

    public com.mycompany.globaljava2.UnidadMedida getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(com.mycompany.globaljava2.UnidadMedida UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }
    
    
}
