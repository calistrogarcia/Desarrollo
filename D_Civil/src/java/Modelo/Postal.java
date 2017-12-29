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
public class Postal implements Serializable{
    
    private String codigo_postal;
    private String nombre_postal;

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getNombre_postal() {
        return nombre_postal;
    }

    public void setNombre_postal(String nombre_postal) {
        this.nombre_postal = nombre_postal;
    }
    
   
    
    
}
