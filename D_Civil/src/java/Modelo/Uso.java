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
public class Uso implements Serializable {
    
   
  private String codigo;
  private String nombre_uso;

    public String getCodigo() {
        return codigo;
    }

    
    
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_uso() {
        return nombre_uso;
    }

    public void setNombre_uso(String nombre_uso) {
        this.nombre_uso = nombre_uso;
    }
  
  
  
    
    
}
