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
public class Servicios {
    
    public String recAgua;
    public String recTel;
    public String recLuz;
    public String recInter;
    public String racMarchamo;
    public String numRegistro;
    public String recCable;

    public Servicios(String recAgua, String recTel, String recLuz, String recInter, String racMarchamo, String numRegistro, String recCable) {
        this.recAgua = recAgua;
        this.recTel = recTel;
        this.recLuz = recLuz;
        this.recInter = recInter;
        this.racMarchamo = racMarchamo;
        this.numRegistro = numRegistro;
        this.recCable = recCable;
    }

    public static void PagoServicios() {
        
        
    }
    
    public String getRecAgua() {
        return recAgua;
    }

    public void setRecAgua(String recAgua) {
        this.recAgua = recAgua;
    }

    public String getRecTel() {
        return recTel;
    }

    public void setRecTel(String recTel) {
        this.recTel = recTel;
    }

    public String getRecLuz() {
        return recLuz;
    }

    public void setRecLuz(String recLuz) {
        this.recLuz = recLuz;
    }

    public String getRecInter() {
        return recInter;
    }

    public void setRecInter(String recInter) {
        this.recInter = recInter;
    }

    public String getRacMarchamo() {
        return racMarchamo;
    }

    public void setRacMarchamo(String racMarchamo) {
        this.racMarchamo = racMarchamo;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getRecCable() {
        return recCable;
    }

    public void setRecCable(String recCable) {
        this.recCable = recCable;
    }
    
    
    
}
