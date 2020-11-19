/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_the_basics;

/**
 *
 * @author mija2
 */
public class Facturacion {
    
    private int NumFactura;
    private String fechaFactrua;
    private String Usurio;
    private String articulos;
    private int Descuentos;
    private int IVa;
    private int total;
    private String direccionEnvio;

    public Facturacion(int NumFactura, String fechaFactrua, String Usurio, String articulos, int Descuentos, int IVa, int total, String direccionEnvio) {
        this.NumFactura = NumFactura;
        this.fechaFactrua = fechaFactrua;
        this.Usurio = Usurio;
        this.articulos = articulos;
        this.Descuentos = Descuentos;
        this.IVa = IVa;
        this.total = total;
        this.direccionEnvio = direccionEnvio;
    }

    public int getNumFactura() {
        return NumFactura;
    }

    public void setNumFactura(int NumFactura) {
        this.NumFactura = NumFactura;
    }

    public String getFechaFactrua() {
        return fechaFactrua;
    }

    public void setFechaFactrua(String fechaFactrua) {
        this.fechaFactrua = fechaFactrua;
    }

    public String getUsurio() {
        return Usurio;
    }

    public void setUsurio(String Usurio) {
        this.Usurio = Usurio;
    }

    public String getArticulos() {
        return articulos;
    }

    public void setArticulos(String articulos) {
        this.articulos = articulos;
    }

    public int getDescuentos() {
        return Descuentos;
    }

    public void setDescuentos(int Descuentos) {
        this.Descuentos = Descuentos;
    }

    public int getIVa() {
        return IVa;
    }

    public void setIVa(int IVa) {
        this.IVa = IVa;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }
    
    
}
