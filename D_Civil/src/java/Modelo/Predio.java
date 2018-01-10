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
public class Predio implements Serializable{
    
    private  String codigo_predio;
    private  String direccion_predio;
    private  String estado_predio;

   
    
    
    public String getDireccion_predio() {
        return direccion_predio;
    }

    public void setDireccion_predio(String direccion_predio) {
        this.direccion_predio = direccion_predio;
    }
    

    
    public String getCodigo_predio() {
        return codigo_predio;
    }

    public void setCodigo_predio(String codigo_predio) {
        this.codigo_predio = codigo_predio;
    }

    public String getEstado_predio() {
        return estado_predio;
    }

    public void setEstado_predio(String estado_predio) {
        this.estado_predio = estado_predio;
    }
    
    
    
    
}
