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
public class Poblado implements Serializable{
  
   private String codigo_poblado;
   private String nombre_poblado;
   private String tipo_poblado;

   
   public String getCodigo_poblado() {
        return codigo_poblado;
    }

    public void setCodigo_poblado(String codigo_poblado) {
        this.codigo_poblado = codigo_poblado;
    }

    public String getNombre_poblado() {
        return nombre_poblado;
    }

    public void setNombre_poblado(String nombre_poblado) {
        this.nombre_poblado = nombre_poblado;
    }

    public String getTipo_poblado() {
        return tipo_poblado;
    }

    public void setTipo_poblado(String tipo_poblado) {
        this.tipo_poblado = tipo_poblado;
    }
   
   
    
    
}
