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
    
    Usuario listaUsuarios[]=new Usuario[5];
    
    public Usuario(){
        listaUsuarios[0]=new Usuario("Administrador", null, "Admin@gmail","Admin123", null);
        listaUsuarios[1]=new Usuario("mija", "154456462", "mija28@hotmail", "mija123", "SanJose");
        
    }
    
    private String nomUsuario;
    private String cedula;
    private String correo;
    private String contraseña;
    private String direccion;
    
    

    public Usuario(String nomUsuario, String cedula, String correo, String contraseña, String direccion) {
        this.nomUsuario = nomUsuario;
        this.cedula = cedula;
        this.correo = correo;
        this.contraseña = contraseña;
        this.direccion = direccion;
    }
    
    
    public void LogIn(){
        
        int intentos=0;
        do{
            for(int i=0;i<listaUsuarios.length;i++){
                
                String correo=JOptionPane.showInputDialog("Ingrese Correo");
                String contraLog=JOptionPane.showInputDialog("Ingrese contra");
                if(listaUsuarios[i].correo==correo&&listaUsuarios[i].contraseña==contraLog){
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    break;
                }else JOptionPane.showMessageDialog(null, "Datos Invalidos");
                
                intentos ++;
            }
                
        }while(intentos==3);
        
    }
    public void nuevoRegistro(){
        for(int i=0;i<listaUsuarios.length;i++){
            if(listaUsuarios[i]==null){
                String usu=JOptionPane.showInputDialog("Ingrese nombre de usuario");
                String dir=JOptionPane.showInputDialog("direccion de facturacion");
                String ced=JOptionPane.showInputDialog("Ingrese cedula");
                String corr=JOptionPane.showInputDialog("Ingrese Correo");
                do{
                    
                    if(!corr.contains("@")){
                        corr=JOptionPane.showInputDialog("El correo "+ corr +" esta incompleto\n Ingrese de nuevo");
                    }
                   
                }while(!corr.contains("@"));
                String contr=JOptionPane.showInputDialog("Ingrese contraseña");
                listaUsuarios[i]= new Usuario(usu, ced, corr, contr, dir);
                break;
            }
        }
    }
    
                        
    public Usuario[] getListaUsuarios() {
        
        return listaUsuarios;
    }

    public void setListaUsuarios(Usuario[] listaUsuarios) {
        
        this.listaUsuarios = listaUsuarios;
    }
 

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
