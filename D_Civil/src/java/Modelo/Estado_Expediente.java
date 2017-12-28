/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Calistro
 */
public class Estado_Expediente implements Serializable{
    
    private String cgrutip;
    private String ccodtip;
    private String dcoptip;
    private int xestado;
    private int xorden;
    private  float nporcen;

    public String getCgrutip() {
        return cgrutip;
    }

    public String getCcodtip() {
        return ccodtip;
    }

    public String getDcoptip() {
        return dcoptip;
    }

    public int getXestado() {
        return xestado;
    }

    public int getXorden() {
        return xorden;
    }

    public float getNporcen() {
        return nporcen;
    }

    public void setCgrutip(String cgrutip) {
        this.cgrutip = cgrutip;
    }

    public void setCcodtip(String ccodtip) {
        this.ccodtip = ccodtip;
    }

    public void setDcoptip(String dcoptip) {
        this.dcoptip = dcoptip;
    }

    public void setXestado(int xestado) {
        this.xestado = xestado;
    }

    public void setXorden(int xorden) {
        this.xorden = xorden;
    }

    public void setNporcen(float nporcen) {
        this.nporcen = nporcen;
    }
    
    
    
}
