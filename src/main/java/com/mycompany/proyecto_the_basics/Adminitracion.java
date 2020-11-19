/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_the_basics;

import javax.swing.JOptionPane;

/**
 *
 * @author mija2
 */
public class Adminitracion {

    public Adminitracion(String admin, String contra) {
        this.admin = admin;
        this.contra = contra;
    }

    public String getAdmin() {
        return admin;
    }

    public String getContra() {
        return contra;
    }
    private String admin;
    private String contra;
    private String inventario;
    private int dinCaja;
    private String empleados;
    private String Facturacion;
    private int cierreCaja;
    
    public Adminitracion(){}
    public void logAdmin(){
        int contador=0;
        do{
            String logAd=JOptionPane.showInputDialog("Ingrese Usuario");
            String logCon=JOptionPane.showInputDialog("ingrese contraseña");
            if(logAd==admin&&logCon==contra){
                
            }
            contador++;
            
        }while(contador!=3);
    }
    
    public String getInventario() {
        return inventario;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    public int getDinCaja() {
        return dinCaja;
    }

    public void setDinCaja(int dinCaja) {
        this.dinCaja = dinCaja;
    }

    public String getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String empleados) {
        this.empleados = empleados;
    }

    public String getFacturacion() {
        return Facturacion;
    }

    public void setFacturacion(String Facturacion) {
        this.Facturacion = Facturacion;
    }

    public int getCierreCaja() {
        return cierreCaja;
    }

    public void setCierreCaja(int cierreCaja) {
        this.cierreCaja = cierreCaja;
    }
    
    
    
    
}
