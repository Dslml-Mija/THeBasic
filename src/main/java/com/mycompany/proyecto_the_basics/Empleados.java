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
public class Empleados {
    
    private String nombre;
    private String puesto;
    private int codigo;
    private int bono;
    private int salarioBruto;
    private int salarioNeto;
    
    public Empleados(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public int getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(int salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public int getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(int salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
    
    
}
