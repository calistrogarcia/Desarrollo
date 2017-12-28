/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Administrador
 */
public class Derivar implements Serializable {
    
 private String ccorrel;
 private int n_orden;
 private int n_order;
 private String c_desde;
 private Date ffecenv;
 private String dhorenv;
 private String c_hasta;
 private Date ffecrec;
 private String mobserva;
 private int nfolio;
 private String cusuari;
 private Date f_fecha;
 private String dhoras;
 private String ddocdrv;
 private String mmotobs;
 private int nfolios;

    public String getCcorrel() {
        return ccorrel;
    }

    public int getN_orden() {
        return n_orden;
    }

    public int getN_order() {
        return n_order;
    }

    public String getC_desde() {
        return c_desde;
    }

    public Date getFfecenv() {
        return ffecenv;
    }

    public String getDhorenv() {
        return dhorenv;
    }

    public String getC_hasta() {
        return c_hasta;
    }

    public Date getFfecrec() {
        return ffecrec;
    }

    public String getMobserva() {
        return mobserva;
    }

    public int getNfolio() {
        return nfolio;
    }

    public String getCusuari() {
        return cusuari;
    }

    public Date getF_fecha() {
        return f_fecha;
    }

    public String getDhoras() {
        return dhoras;
    }

    public String getDdocdrv() {
        return ddocdrv;
    }

    public String getMmotobs() {
        return mmotobs;
    }

    public int getNfolios() {
        return nfolios;
    }

    public void setCcorrel(String ccorrel) {
        this.ccorrel = ccorrel;
    }

    public void setN_orden(int n_orden) {
        this.n_orden = n_orden;
    }

    public void setN_order(int n_order) {
        this.n_order = n_order;
    }

    public void setC_desde(String c_desde) {
        this.c_desde = c_desde;
    }

    public void setFfecenv(Date ffecenv) {
        this.ffecenv = ffecenv;
    }

    public void setDhorenv(String dhorenv) {
        this.dhorenv = dhorenv;
    }

    public void setC_hasta(String c_hasta) {
        this.c_hasta = c_hasta;
    }

    public void setFfecrec(Date ffecrec) {
        this.ffecrec = ffecrec;
    }

    public void setMobserva(String mobserva) {
        this.mobserva = mobserva;
    }

    public void setNfolio(int nfolio) {
        this.nfolio = nfolio;
    }

    public void setCusuari(String cusuari) {
        this.cusuari = cusuari;
    }

    public void setF_fecha(Date f_fecha) {
        this.f_fecha = f_fecha;
    }

    public void setDhoras(String dhoras) {
        this.dhoras = dhoras;
    }

    public void setDdocdrv(String ddocdrv) {
        this.ddocdrv = ddocdrv;
    }

    public void setMmotobs(String mmotobs) {
        this.mmotobs = mmotobs;
    }

    public void setNfolios(int nfolios) {
        this.nfolios = nfolios;
    }
 
 
 
    
}
