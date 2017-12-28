/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
//24-03-17 Say
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Documento_Por_Fecha implements Serializable {
    //07-04-17 *J*
   private Date fechaIni;
   private Date fechaFin;
   private int nfolios;
   private String ndocume;
   private String dcontri;
   private String doficin;
   private String canexo;
   private String dasunto;
   private Date  dfecdoc;
   private String cestado;
   private String ccorrel;
   
   Expediente obj_e =new Expediente();

    public Documento_Por_Fecha() {
    }
    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Expediente getObj_e() {
        return obj_e;
    }

    public void setObj_e(Expediente obj_e) {
        this.obj_e = obj_e;
    }

    public int getNfolios() {
        return nfolios;
    }

    public void setNfolios(int nfolios) {
        this.nfolios = nfolios;
    }

    public String getNdocume() {
        return ndocume;
    }

    public void setNdocume(String ndocume) {
        this.ndocume = ndocume;
    }

    public String getDcontri() {
        return dcontri;
    }

    public void setDcontri(String dcontri) {
        this.dcontri = dcontri;
    }

    public String getDoficin() {
        return doficin;
    }

    public void setDoficin(String doficin) {
        this.doficin = doficin;
    }

    public String getCanexo() {
        return canexo;
    }

    public void setCanexo(String canexo) {
        this.canexo = canexo;
    }

    public String getDasunto() {
        return dasunto;
    }

    public void setDasunto(String dasunto) {
        this.dasunto = dasunto;
    }

    public Date getDfecdoc() {
        return dfecdoc;
    }

    public void setDfecdoc(Date dfecdoc) {
        this.dfecdoc = dfecdoc;
    }

    public String getCestado() {
        return cestado;
    }

    public void setCestado(String cestado) {
        this.cestado = cestado;
    }

    public String getCcorrel() {
        return ccorrel;
    }

    public void setCcorrel(String ccorrel) {
        this.ccorrel = ccorrel;
    }
    
    
   Expediente objEx=new Expediente(); 

    public Expediente getObjEx() {
        return objEx;
    }

    public void setObjEx(Expediente objEx) {
        this.objEx = objEx;
    }
   

    
}
