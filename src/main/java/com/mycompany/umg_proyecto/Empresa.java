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
    private String codigo;
    private String nombre;
    ArrayList<Plantilla> plantillas = new ArrayList<Plantilla>();

    public Empresa(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Plantilla> getPlantillas() {
        return plantillas;
    }

    public void setPlantillas(ArrayList<Plantilla> plantillas) {
        this.plantillas = plantillas;
    }
    
    
    
    
}
