/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.globaljava2;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author emanu
 */
public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate FechaPedido;
    private Factura factura;
    private Sucursal sucursal;
    private Domicilio domicilio;
}
