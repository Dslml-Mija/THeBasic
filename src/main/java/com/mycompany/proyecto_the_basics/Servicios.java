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
public class Servicios {
    
    private String nombres;
    private int montos;
    private int codigos;

    public Servicios(String nombres, int montos, int codigos) {
        this.nombres = nombres;
        this.montos = montos;
        this.codigos = codigos;
    }
    
    public Servicios(){
    }
    
    int pagar;
    
    public void PagoServicios(){
        
        int pagar = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de recibos que desea pagar"));
        Servicios pago[] = new Servicios[pagar];
      
        for(int x=0;x<pago.length;x++){
            JOptionPane.showMessageDialog(null, "A continuacion se le pediran los datos del recibo "+(x+1));
            
            String nombre= JOptionPane.showInputDialog("Ingrese el nombre del servicio a pagar");
             int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del recibo"));
            int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a pagar en colones por el recibos de "+nombre));
            pago[x]= new Servicios(nombre,monto,codigo);
            
            JOptionPane.showMessageDialog(null, "\nRecibo de " + pago[x].nombres + "\nMonto a pagar por el recibo: " + pago[x].montos + " Colones"+ "Codigo del recibo: "+pago[x].codigos);
        }
    }
    
    
    
}
