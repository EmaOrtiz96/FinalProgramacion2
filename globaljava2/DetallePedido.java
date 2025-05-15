/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.globaljava2;

/**
 *
 * @author emanu
 */
public class DetallePedido {
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;
    private Pedido pedido;

    public DetallePedido() {
    }

    public DetallePedido(Integer cantidad, Double subTotal, Articulo articulo, Pedido pedido) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.articulo = articulo;
        this.pedido = pedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
