/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.Date;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Tipo_documento implements Serializable {
    
    private int codcont;
    private String ctipo;
    private String vdescri;
    private String vobjeto;
    private int cidtabl;
    private float ndecima;
    private int nestado;
    private String vusernm;
    private String vhostnm;
    private Date ddatetm;

    public int getCodcont() {
        return codcont;
    }

    public String getCtipo() {
        return ctipo;
    }

    public String getVdescri() {
        return vdescri;
    }

    public String getVobjeto() {
        return vobjeto;
    }

    public int getCidtabl() {
        return cidtabl;
    }

    public float getNdecima() {
        return ndecima;
    }

    public int getNestado() {
        return nestado;
    }

    public String getVusernm() {
        return vusernm;
    }

    public String getVhostnm() {
        return vhostnm;
    }

    public Date getDdatetm() {
        return ddatetm;
    }

    public void setCodcont(int codcont) {
        this.codcont = codcont;
    }

    public void setCtipo(String ctipo) {
        this.ctipo = ctipo;
    }

    public void setVdescri(String vdescri) {
        this.vdescri = vdescri;
    }

    public void setVobjeto(String vobjeto) {
        this.vobjeto = vobjeto;
    }

    public void setCidtabl(int cidtabl) {
        this.cidtabl = cidtabl;
    }

    public void setNdecima(float ndecima) {
        this.ndecima = ndecima;
    }

    public void setNestado(int nestado) {
        this.nestado = nestado;
    }

    public void setVusernm(String vusernm) {
        this.vusernm = vusernm;
    }

    public void setVhostnm(String vhostnm) {
        this.vhostnm = vhostnm;
    }

    public void setDdatetm(Date ddatetm) {
        this.ddatetm = ddatetm;
    }
   
    
    
}
