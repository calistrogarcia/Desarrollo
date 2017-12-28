/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Expediente;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import utils.Mensaje;

/**
 *
 * @author jarana
 */
@ManagedBean
public class BeanResuelto_Por_Oficina implements Serializable {

    private Expediente objBuscarExpedienteResulO;
    private ArrayList<Expediente> arrExpedienteResulO = null;
    private ArrayList<Expediente> arrBusExpedienteResulO = null;
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;
    private boolean bandMod = true;
    private boolean bandEli = true;

    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Expediente getObjBuscarExpedienteResulO() {
        return objBuscarExpedienteResulO;
    }

    public void setObjBuscarExpedienteResulO(Expediente objBuscarExpedienteResulO) {
        this.objBuscarExpedienteResulO = objBuscarExpedienteResulO;
    }

    public ArrayList<Expediente> getArrExpedienteResulO() {
        return arrExpedienteResulO;
    }

    public void setArrExpedienteResulO(ArrayList<Expediente> arrExpedienteResulO) {
        this.arrExpedienteResulO = arrExpedienteResulO;
    }

    public ArrayList<Expediente> getArrBusExpedienteResulO() {
        return arrBusExpedienteResulO;
    }

    public void setArrBusExpedienteResulO(ArrayList<Expediente> arrBusExpedienteResulO) {
        this.arrBusExpedienteResulO = arrBusExpedienteResulO;
    }

    public Integer getActiveTabIndex() {
        return activeTabIndex;
    }

    public void setActiveTabIndex(Integer activeTabIndex) {
        this.activeTabIndex = activeTabIndex;
    }

    public boolean isBandVer() {
        return bandVer;
    }

    public void setBandVer(boolean bandVer) {
        this.bandVer = bandVer;
    }

    public boolean isBandMod() {
        return bandMod;
    }

    public void setBandMod(boolean bandMod) {
        this.bandMod = bandMod;
    }

    public boolean isBandEli() {
        return bandEli;
    }

    public void setBandEli(boolean bandEli) {
        this.bandEli = bandEli;
    }

    public String getPuntAnt() {
        return puntAnt;
    }

    public void setPuntAnt(String puntAnt) {
        this.puntAnt = puntAnt;
    }
    //Iniciallzaciones

    public void doiniciarListadoExpedienteResulO() {
        arrExpedienteResulO = new ArrayList<Expediente>();

    }

    //Iniciallzaciones
    public void doiniciarBusquedaExpedienteResulO() {
        this.arrBusExpedienteResulO = new ArrayList<Expediente>();
        this.objBuscarExpedienteResulO = new Expediente();

    }

    public void doiniciarObjBusExpedienteResulO() {
        this.objBuscarExpedienteResulO = new Expediente();
    }

    public BeanResuelto_Por_Oficina() {
        try {
            doiniciarObjBusExpedienteResulO();
        } catch (Exception e) {
            Mensaje.manejarError(e, "Error al Iniciar Proceso");
        }
    }

    public ArrayList<Expediente> doBuscarExpedienteResulO() {
        this.arrBusExpedienteResulO = new ArrayList<Expediente>();
        //Lista Expediente
        this.arrBusExpedienteResulO = Expediente.getBuscaExpedientesResueltosPorOficina(objBuscarExpedienteResulO);
        return this.arrBusExpedienteResulO;
    }

    public String getSizeRegistrosExpediente() {
        if (this.arrExpedienteResulO == null) {
            return "0";
        } else {
            return "" + this.arrExpedienteResulO.size();
        }
    }

    public String getSizeRegistrosBusExpedienteResulO() {
        if (this.arrBusExpedienteResulO == null) {
            return "0";
        } else {
            return "" + this.arrBusExpedienteResulO.size();
        }
    }

    public void onClickBusq(ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();
    }

}
