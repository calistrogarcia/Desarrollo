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
public class Asunto implements Serializable  {
    
    private String casunto;
    private String asunto;
    private int ndias;
    private String id_area;
    private byte creclam;
    private byte lprocedimiento;
    private byte ntiempo;
    private String ctipdoc;
    private String ctipdocs;
    private int nestado;
    private String modalidad;
    private String tipo;
    private String blegal;
    private String areaini;
    private String arearesu;
    private String recu_reconsid;
    private String recu_apela;
    private String califica;
    private String cod_form;
    
    private String dasunto;

    public String getCasunto() {
        return casunto;
    }

    public String getAsunto() {
        return asunto;
    }

    public int getNdias() {
        return ndias;
    }

    public String getCareas() {
        return id_area;
    }

    public byte getCreclam() {
        return creclam;
    }

    public byte getLprocedimiento() {
        return lprocedimiento;
    }

    public byte getNtiempo() {
        return ntiempo;
    }

    public String getCtipdoc() {
        return ctipdoc;
    }

    public String getCtipdocs() {
        return ctipdocs;
    }

    public int getNestado() {
        return nestado;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getBlegal() {
        return blegal;
    }

    public String getAreaini() {
        return areaini;
    }

    public String getArearesu() {
        return arearesu;
    }

    public String getRecu_reconsid() {
        return recu_reconsid;
    }

    public String getRecu_apela() {
        return recu_apela;
    }

    public String getCalifica() {
        return califica;
    }

    public String getCod_form() {
        return cod_form;
    }

    public void setCasunto(String casunto) {
        this.casunto = casunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setNdias(int ndias) {
        this.ndias = ndias;
    }

    public void setCareas(String id_area) {
        this.id_area = id_area;
    }

    public void setCreclam(byte creclam) {
        this.creclam = creclam;
    }

    public void setLprocedimiento(byte lprocedimiento) {
        this.lprocedimiento = lprocedimiento;
    }

    public void setNtiempo(byte ntiempo) {
        this.ntiempo = ntiempo;
    }

    public void setCtipdoc(String ctipdoc) {
        this.ctipdoc = ctipdoc;
    }

    public void setCtipdocs(String ctipdocs) {
        this.ctipdocs = ctipdocs;
    }

    public void setNestado(int nestado) {
        this.nestado = nestado;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setBlegal(String blegal) {
        this.blegal = blegal;
    }

    public void setAreaini(String areaini) {
        this.areaini = areaini;
    }

    public void setArearesu(String arearesu) {
        this.arearesu = arearesu;
    }

    public void setRecu_reconsid(String recu_reconsid) {
        this.recu_reconsid = recu_reconsid;
    }

    public void setRecu_apela(String recu_apela) {
        this.recu_apela = recu_apela;
    }

    public void setCalifica(String califica) {
        this.califica = califica;
    }

    public void setCod_form(String cod_form) {
        this.cod_form = cod_form;
    }

    public String getDasunto() {
        return dasunto;
    }

    public void setDasunto(String dasunto) {
        this.dasunto = dasunto;
    }
    
    
    
    
    
}
