/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author elsyc
 */
public class Datos {
    
    String nombre, apellido, fechaN, lugar;
    int edad;
    
public Datos (String nombre, String apellido, String fechaN, String lugar, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaN = fechaN;
    this.lugar = lugar;
    this.edad = edad;
}

public void mostrarDatos(){
    
    System.out.println("***Datos Generales***\n");
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Fecha de nacimiento: " + fechaN);
    System.out.println("Lugar: " + lugar);
    System.out.println("Edad: " + edad);
    
    }
}
