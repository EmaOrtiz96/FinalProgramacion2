/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.globaljava2;

/**
 *
 * @author emanu
 */
public class ArticuloManuFacturadoDetalle {
    private Integer cantidad;
    private ArticuloInsumo ArticuloInsumo;

    public ArticuloManuFacturadoDetalle() {
    }

    public ArticuloManuFacturadoDetalle(Integer cantidad, ArticuloInsumo ArticuloInsumo) {
        this.cantidad = cantidad;
        this.ArticuloInsumo = ArticuloInsumo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ArticuloInsumo getArticuloInsumo() {
        return ArticuloInsumo;
    }

    public void setArticuloInsumo(ArticuloInsumo ArticuloInsumo) {
        this.ArticuloInsumo = ArticuloInsumo;
    }
    
}
