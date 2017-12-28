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
public class Ruta  implements Serializable {
    
  private String ccorrel;
  private int n_orden;
  private String c_desde;
  private String c_hasta;
  private Date ffecenv;
  private String dhorenv;
  private Date ffecrec;
  private String casunto;
  private String obserut;
  private int nfolios;
  private byte limpres;
  private String cusumod;
  private String cusuari;
  private Date f_fecha;
  private String d_horas;
  private String dusured;
  private String cenvia;
  private String crecep;
  private String fpasook;

    public String getCcorrel() {
        return ccorrel;
    }

    public int getN_orden() {
        return n_orden;
    }

    public String getC_desde() {
        return c_desde;
    }

    public String getC_hasta() {
        return c_hasta;
    }

    public Date getFfecenv() {
        return ffecenv;
    }

    public String getDhorenv() {
        return dhorenv;
    }

    public Date getFfecrec() {
        return ffecrec;
    }

    public String getCasunto() {
        return casunto;
    }

    public String getObserut() {
        return obserut;
    }

    public int getNfolios() {
        return nfolios;
    }

    public byte getLimpres() {
        return limpres;
    }

    public String getCusumod() {
        return cusumod;
    }

    public String getCusuari() {
        return cusuari;
    }

    public Date getF_fecha() {
        return f_fecha;
    }

    public String getD_horas() {
        return d_horas;
    }

    public String getDusured() {
        return dusured;
    }

    public String getCenvia() {
        return cenvia;
    }

    public String getCrecep() {
        return crecep;
    }

    public String getFpasook() {
        return fpasook;
    }

    public void setCcorrel(String ccorrel) {
        this.ccorrel = ccorrel;
    }

    public void setN_orden(int n_orden) {
        this.n_orden = n_orden;
    }

    public void setC_desde(String c_desde) {
        this.c_desde = c_desde;
    }

    public void setC_hasta(String c_hasta) {
        this.c_hasta = c_hasta;
    }

    public void setFfecenv(Date ffecenv) {
        this.ffecenv = ffecenv;
    }

    public void setDhorenv(String dhorenv) {
        this.dhorenv = dhorenv;
    }

    public void setFfecrec(Date ffecrec) {
        this.ffecrec = ffecrec;
    }

    public void setCasunto(String casunto) {
        this.casunto = casunto;
    }

    public void setObserut(String obserut) {
        this.obserut = obserut;
    }

    public void setNfolios(int nfolios) {
        this.nfolios = nfolios;
    }

    public void setLimpres(byte limpres) {
        this.limpres = limpres;
    }

    public void setCusumod(String cusumod) {
        this.cusumod = cusumod;
    }

    public void setCusuari(String cusuari) {
        this.cusuari = cusuari;
    }

    public void setF_fecha(Date f_fecha) {
        this.f_fecha = f_fecha;
    }

    public void setD_horas(String d_horas) {
        this.d_horas = d_horas;
    }

    public void setDusured(String dusured) {
        this.dusured = dusured;
    }

    public void setCenvia(String cenvia) {
        this.cenvia = cenvia;
    }

    public void setCrecep(String crecep) {
        this.crecep = crecep;
    }

    public void setFpasook(String fpasook) {
        this.fpasook = fpasook;
    }

  
  
  
    
    
    
}
