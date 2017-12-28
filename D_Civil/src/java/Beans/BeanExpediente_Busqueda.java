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
import utils.Constantes;
import utils.Mensaje;

@ManagedBean
public class BeanExpediente_Busqueda implements Serializable {

    private Expediente objBuscarExpediente;
    private ArrayList<Expediente> arrExpediente = null;
    private ArrayList<Expediente> arrBusExpediente = null;
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;
    private boolean bandMod = true;
    private boolean bandEli = true;

    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Expediente getObjBuscarExpediente() {
        return objBuscarExpediente;
    }

    public void setObjBuscarExpediente(Expediente objBuscarExpediente) {
        this.objBuscarExpediente = objBuscarExpediente;
    }

    public ArrayList<Expediente> getArrExpediente() {
        return arrExpediente;
    }

    public void setArrExpediente(ArrayList<Expediente> arrExpediente) {
        this.arrExpediente = arrExpediente;
    }

    public ArrayList<Expediente> getArrBusExpediente() {
        return arrBusExpediente;
    }

    public void setArrBusExpediente(ArrayList<Expediente> arrBusExpediente) {
        this.arrBusExpediente = arrBusExpediente;
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
    public void doiniciarListadoExpediente() {
        arrExpediente = new ArrayList<Expediente>();

    }

    //Iniciallzaciones
    public void doiniciarBusquedaExpediente() {
        this.arrBusExpediente = new ArrayList<Expediente>();
        this.objBuscarExpediente = new Expediente();

    }

    public void doiniciarObjBusExpediente() {
        this.objBuscarExpediente = new Expediente();
    }

    public BeanExpediente_Busqueda() {
        try {
            doiniciarObjBusExpediente();
        } catch (Exception e) {
            Mensaje.manejarError(e, "Error al Iniciar Proceso");
        }
    }

    public ArrayList<Expediente> doBuscarExpediente() {
        this.arrBusExpediente = new ArrayList<Expediente>();
        //Lista Expediente
        this.arrBusExpediente = Expediente.getBusquedaDeExpedientes(objBuscarExpediente);
        return this.arrBusExpediente;
    }

    public String getSizeRegistrosExpediente() {
        if (this.arrExpediente == null) {
            return "0";
        } else {
            return "" + this.arrExpediente.size();
        }
    }

    public String getSizeRegistrosBusExpediente() {
        if (this.arrBusExpediente == null) {
            return "0";
        } else {
            return "" + this.arrBusExpediente.size();
        }
    }

    public String desactivaTabVer() {
        this.bandVer = true;
        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
        if (puntAnt.compareTo("2") == 0) {
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("1") == 0) {

                this.activeTabIndex = Constantes.TAB_ELIMINAR;
            }
        }
        return null;
    }

    public void onClickBusq(ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();
    }

}
