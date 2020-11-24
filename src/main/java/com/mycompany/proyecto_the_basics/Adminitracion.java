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

   

    
    
    
    
    
    public Adminitracion(){    
    }
    public void menuAdmin(){
        int menu;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu de Administrador \n"+"1. Empleados \n"+"2. peoductos \n"));
            switch(menu){
               
                case 1:
                    //nomina
                    Nomina nomina=new Nomina();
                    nomina.pago();
                case 2:
                    Productos mostrar =new Productos();
                    mostrar.mostrarProductos();
                    //productos
            
            }
            
            
            
            
        }while(menu!=0);
    }
    
    
  

   
    
    
    
    
}
