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
public class Giro implements Serializable  {
    
    private String codigo_giro;
    private String giro_detalle;

    public String getCodigo_giro() {
        return codigo_giro;
    }

    public void setCodigo_giro(String codigo_giro) {
        this.codigo_giro = codigo_giro;
    }

    public String getGiro_detalle() {
        return giro_detalle;
    }

    public void setGiro_detalle(String giro_detalle) {
        this.giro_detalle = giro_detalle;
    }
    
    
    
    
    
    
    
}
