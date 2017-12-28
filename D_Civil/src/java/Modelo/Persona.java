/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Administrador
 */
public class Persona implements Serializable {

    private String codigo_contribuyente;
    
    private String nombre_contribuyente;
    private int edad;
    private String direccion_fiscal;


    public String getDireccion_fiscal() {
        return direccion_fiscal;
    }

    public void setDireccion_fiscal(String direccion_fiscal) {
        this.direccion_fiscal = direccion_fiscal;
    }

    public String getNombre_contribuyente() {
        return nombre_contribuyente;
    }

    public void setNombre_contribuyente(String nombre_contribuyente) {
        this.nombre_contribuyente = nombre_contribuyente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCodigo_contribuyente() {
        return codigo_contribuyente;
    }

    public void setCodigo_contribuyente(String codigo_contribuyente) {
        this.codigo_contribuyente = codigo_contribuyente;
    }

}
