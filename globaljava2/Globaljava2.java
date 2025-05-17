/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.globaljava2;

/**
 *
 * @author emanu
 */
public class Globaljava2 {

    public static void main(String[] args) {
        
       Imagen imagenArticulo = new Imagen("www.com");
       
       UnidadMedida unidadMedida1 = new UnidadMedida ("kilogramo");
       
       Articulo.addImagen(imagenArticulo);
       
       ArticuloManuFacturado articuloManuFacturado1 = new ArticuloManuFacturado ("biscochuelo",50.50,imagenArticulo,unidadMedida1,"con chocolate", 30,"preparacion + horno");
        System.out.println(imagenArticulo);
        System.out.println(unidadMedida1);
        








//Articulo articulo1 = new Articulo();
       // Articulo articulo2 = new Articulo();
        
    }
    
}
