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
public class Nomina {
    

    private String empleado;
    private int id;
    private int horas;
    private int pagas;
    
     public Nomina(){
    }

    public Nomina(String empleado, int id, int horas, int pagas) {
        this.empleado = empleado;
        this.id = id;
        this.horas = horas;
        this.pagas = pagas;
    }
    
    Nomina informaciones[] = new Nomina[4];
 
    public void pago(){
        
        informaciones[0]= new Nomina("",0,0,0);
        informaciones[1]= new Nomina("",0,0,0);
        informaciones[2]= new Nomina("",0,0,0 );
        informaciones[3]= new Nomina("",0,0,0);
        
            for(int x=0;x<informaciones.length;x++){
                JOptionPane.showMessageDialog(null, "Por favor ingrese los siguientes datos del empleado para calcular su salario");
                
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
                int ids = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del empleado"));
                int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas en este mes"));
                int paga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto que se le paga al empleado por hora trabajada"));
                informaciones[x]=new Nomina(nombre,ids,hora,paga);
                
                int salario = (hora*4*paga);
                if(hora>46){
                    JOptionPane.showMessageDialog(null, "El empleado recibira un aumento del 5% por trabaja mas de 46 horas este mes");
                    double extras = (salario*1.05);
                    JOptionPane.showMessageDialog(null, "\nNombre del empleado: "+informaciones[x].empleado + "\nID del empleado: "+informaciones[x].id+ "\nHoras trabajadas: "
                            +informaciones[x].horas+ " Horas"+ "\nPago por cada hora trabajada: "+informaciones[x].pagas+ " Dolares" +"\nSalario del empleado por este mes: "+ extras+ " Dolares");
                }else{
                    JOptionPane.showMessageDialog(null, "\nNombre del empleado: "+informaciones[x].empleado + "\nID del empleado: "+informaciones[x].id+ "\nHoras trabajadas: "
                            +informaciones[x].horas+ " Horas"+ "\nPago por cada hora trabajada: "+informaciones[x].pagas+ " Dolares" +"\nSalario del empleado por este mes: "+ salario+ " Dolares");
                }
            }
    }
}