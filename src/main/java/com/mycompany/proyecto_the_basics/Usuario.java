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
public class Usuario {

    Usuario listaUsuario[]=new Usuario[5];
    
    
    public Usuario(){
        listaUsuario[0]=new Usuario("Administrador","Admin@gmail","Admin123");
        listaUsuario[1]=new Usuario("mija","mija28@hotmail", "mija123");
        
    }
    
    

    public Usuario(String nomUsuario, String correo, String contraseña) {
        this.nomUsuario = nomUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        
    }
    
    
    private String nomUsuario;  
    private String correo;
    private String contraseña;
    
   
    public void LogIn(){
        
        int intentos=0;
        do{
            for(int i=0;i<listaUsuario.length;i++){
                
                String correo=JOptionPane.showInputDialog("Ingrese Correo");
                String contraLog=JOptionPane.showInputDialog("Ingrese contra");
                if(listaUsuario[i].correo.equals(correo)&&listaUsuario[i].contraseña.equals(contraLog)){
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    if(listaUsuario[i].nomUsuario=="adminsitrador"){
                        Adminitracion admin= new Adminitracion();
                        admin.menuAdmin();
                    }
                    
                    break;
                }else JOptionPane.showMessageDialog(null, "Datos Invalidos");
                
                intentos ++;
            }
                
        }while(intentos==3);
        
    }
    public void nuevoRegistro(){
        
        for(int i=0;i<listaUsuario.length;i++){
            if(listaUsuario[i]==null){
                String usu=JOptionPane.showInputDialog("Ingrese nombre de usuario");
                String corr=JOptionPane.showInputDialog("Ingrese Correo");
                do{
                    
                    if(!corr.contains("@")){
                        corr=JOptionPane.showInputDialog("El correo "+ corr +" esta incompleto\n Ingrese de nuevo");
                    }
                   
                }while(!corr.contains("@"));
                String contr=JOptionPane.showInputDialog("Ingrese contraseña");
                listaUsuario[i].nomUsuario=usu;
                listaUsuario[i].correo=corr;
                listaUsuario[i].contraseña=contr;
                break;
            }
        }
    }
    
                        

 

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public Usuario[] getListaUsuario() {
        
        return listaUsuario;
    }

    public void setListaUsuario(Usuario[] listaUsuario) {
        
        
        this.listaUsuario = listaUsuario;
    }
    
    
    
}
