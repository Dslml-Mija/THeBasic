/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_the_basics;

import javax.print.DocFlavor;

/**
 *
 * @author mija2
 */
public class Productos {
        
    public String nomProducto;
    public int precio;
    public String descripcion;
    
    Productos listaProductos[]=new Productos[10];
    
    
    

    public Productos(String nomProducto, int precio, String descripcion) {
        this.nomProducto = nomProducto;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    
    
    public Productos(){
        
        listaProductos[1]=new Productos("Alcohol en gel", 5000, "Elimina el 95% de bacterias \n Producto inflamable \n Mantengase fuera del alcanse de los niños \n");
        listaProductos[2]=new Productos("Baterias AA", 6000, "Baterias recargables AA de larga duracion \n 2000mAh");
        listaProductos[3]=new Productos("Pasta Dental", 3500, "Pasta dental marca \n Sabor menta");
        listaProductos[4]=new Productos("Arroz", 8000, "Saco de arroz de 8Kg\n 85% grano entero");
        listaProductos[5]=new Productos(nomProducto, precio, descripcion);
        listaProductos[5]=new Productos(nomProducto, precio, descripcion);
        listaProductos[5]=new Productos(nomProducto, precio, descripcion);
        listaProductos[5]=new Productos(nomProducto, precio, descripcion);
        listaProductos[5]=new Productos(nomProducto, precio, descripcion);
        
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
