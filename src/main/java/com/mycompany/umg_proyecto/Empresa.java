/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.umg_proyecto;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Empresa {
    String codigo;
    String nombre;
    ArrayList<Plantilla> plantillas = new ArrayList<Plantilla>();

    public Empresa(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    
    
}
