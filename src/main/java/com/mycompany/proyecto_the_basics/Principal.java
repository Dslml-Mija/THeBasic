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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int menu;
            JOptionPane.showMessageDialog(null, "Bienvenido a The Basic Store");
                do{
                
                menu= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la accion que desea ralizar \n"
                        +"1.Usuario \n2.Registro \n3.Administrador \n0.Salir"));
                if(menu==1){
                    Usuario logIn=new Usuario();
                    logIn.LogIn();
                    calificacion cali=new calificacion();
                   
                    
                }
                if(menu==2){
                    Usuario registro= new Usuario();
                    registro.nuevoRegistro();
                    registro.LogIn();
                }
                if(menu==3){
                    Usuario logIn =new Usuario();
                    logIn.LogIn();
                }
                
                
                
            }while(menu!=0);
    }
    public static void nuevo(){}
    
}
