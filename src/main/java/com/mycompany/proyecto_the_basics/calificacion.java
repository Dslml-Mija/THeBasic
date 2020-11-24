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
public class calificacion {
    int info;
    int relleno;
    int mostar;
    int resp;
    
   
    
    
    //RECORDATORIO :***CREAR ARREGLO EN PRINCIPAL***
    
    public static void info (int lista[]){
        String rec;
        
        
        JOptionPane.showMessageDialog(null," ***MENSAJE CONFIDENCIAL*** \n"
                + "   ESTIMADO CLIENTE. \n"
                + "Le agradecemos su tiempo, al querer realizar la siguiente encuesta.  ");
        
        JOptionPane.showMessageDialog(null,"Primero, nos gustaría que nos contara si tiene alguna queja \n"
                                           + "y/o recomedación, la puede ingresar en la siguuente cajita. " );
        
        rec= JOptionPane.showInputDialog(" Cajita de recomendación y/o queja🎁 ");
        JOptionPane.showMessageDialog(null, "   Recomendación y/o queja   \n"
                                      + rec + " \n "
                                      + "Pulse OK para enviar su texto a gerencia. "
                
        );
        JOptionPane.showMessageDialog(null," Su mensaje fue enviado con exito, puede continuar \n"
                + "con la encuesta" );
        
        
} //fin info
    
    public static void relleno (int lista []){
        JOptionPane.showMessageDialog(null, "    ESTIMAD@ CLIENTE.   \n"
                + "Esperamos que encontrara todo lo que necesitaba.\n"
                + "Es de suma importancia su opinión sobre nuestro local. A continuación \n"
                + "se le realizara una serie de preguntas, donde podra calificarnos. \n"
                + "De ante mano, agradecemos su preferencia por nosotros. \n"
                + "- Super The Basic"
                
                
        );
        
        JOptionPane.showMessageDialog(null, " Puede calificar la encuesta de la siguiente manera: \n"
                + "*De 0-5, poco satisfecho. \n"
                + "*De 6-10, muy satisfecho. \n"
                + " Por favor califique la encuesta de forma global. "
                
                
        );
        
   for (int i=0; i<lista.length; i++){
       
       lista[i]= Integer.parseInt(JOptionPane.showInputDialog("Indique una probabilidad global para las siguientes preguntas. \n"
               + "1. ¿Está satisfecho con nuestra compañía? \n"
               + "2. ¿Volvería a comprar nuestros productos? \n"
               + "3. ¿Considera que nuestros productos son de buena calidad? \n"
       ));
       
   
   }// fin for
        
        
  }// fin relleno
    

   public static void mostrar (int lista[]){
       
       float acumulador = 0;
       float acumulador2 = 0;
       float total = 0;
       float total2 = 0;
       
       
       for(int i=0; i<lista.length; i++){
            if (lista[i]>5){
                acumulador =1+acumulador;
            
            }
 
            else if(lista[i] <5){
          
                acumulador2 =1+acumulador2;
            
            }
      
   
       } // fin for 
         total = ((acumulador/3)*100);
     
        total2 = ((acumulador2/3)*100);
     
        JOptionPane.showMessageDialog(null, "El porcentaje de clientes seleccionados que están satisfechos \n"
             + "es de: "+ total);
     
        JOptionPane.showMessageDialog(null, "El porcentaje de clientes seleccionados que están insatisfechos \n"
             + "es de: "+ total2);
     
   
   } 
}
