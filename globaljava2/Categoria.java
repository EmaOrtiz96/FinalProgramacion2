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
public class Categoria {
    private String denominacion;
    private List<Categoria> categorias;
    private List<Articulo> articulos;

    public Categoria() {
    }

    public Categoria(String denominacion, List<Categoria> categorias, List<Articulo> articulos) {
        this.denominacion = denominacion;
        this.categorias = categorias;
        this.articulos = articulos;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
    
}
