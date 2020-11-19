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
public class Registro {
    
    private String newEsuario;
    private String newCedula;
    private String newCorreo;
    private String newContraseña;
    private String newDireccion;

    public Registro(String newEsuario, String newCedula, String newCorreo, String newContraseña, String newDireccion) {
        this.newEsuario = newEsuario;
        this.newCedula = newCedula;
        this.newCorreo = newCorreo;
        this.newContraseña = newContraseña;
        this.newDireccion = newDireccion;
    }
    
    
    public String getNewEsuario() {
        return newEsuario;
    }

    public void setNewEsuario(String newEsuario) {
        this.newEsuario = newEsuario;
    }

    public String getNewCedula() {
        return newCedula;
    }

    public void setNewCedula(String newCedula) {
        this.newCedula = newCedula;
    }

    public String getNewCorreo() {
        return newCorreo;
    }

    public void setNewCorreo(String newCorreo) {
        this.newCorreo = newCorreo;
    }

    public String getNewContraseña() {
        return newContraseña;
    }

    public void setNewContraseña(String newContraseña) {
        this.newContraseña = newContraseña;
    }

    public String getNewDireccion() {
        return newDireccion;
    }

    public void setNewDireccion(String newDireccion) {
        this.newDireccion = newDireccion;
    }
    

    
    
}
