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
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import utils.Constantes;
import utils.Mensaje;

/**
 *
 * @author jarana
 */
@ManagedBean
public class BeanRecepcionado_Por_Oficina implements Serializable {

   private Expediente objBuscarExpedienteRecepO;
    private ArrayList<Expediente> arrExpedienteRecepO=null;
    private ArrayList<Expediente> arrBusExpedienteRecepO=null;
            //TabView
    private Integer activeTabIndex;
    private boolean bandVer=true;    
    private boolean bandMod=true;
    private boolean bandEli=true;
   
    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Expediente getObjBuscarExpedienteRecepO() {
        return objBuscarExpedienteRecepO;
    }

    public void setObjBuscarExpedienteRecepO(Expediente objBuscarExpedienteRecepO) {
        this.objBuscarExpedienteRecepO = objBuscarExpedienteRecepO;
    }

    public ArrayList<Expediente> getArrExpedienteRecepO() {
        return arrExpedienteRecepO;
    }

    public void setArrExpedienteRecepO(ArrayList<Expediente> arrExpedienteRecepO) {
        this.arrExpedienteRecepO = arrExpedienteRecepO;
    }

    public ArrayList<Expediente> getArrBusExpedienteRecepO() {
        return arrBusExpedienteRecepO;
    }

    public void setArrBusExpedienteRecepO(ArrayList<Expediente> arrBusExpedienteRecepO) {
        this.arrBusExpedienteRecepO = arrBusExpedienteRecepO;
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
    public void doiniciarListadoExpedienteRecepO(){        
        arrExpedienteRecepO = new ArrayList<Expediente>();
        
        
    }
    //Iniciallzaciones
    public void doiniciarBusquedaExpedienteRecepO(){        
        this.arrBusExpedienteRecepO = new ArrayList<Expediente>();
        this.objBuscarExpedienteRecepO= new Expediente();

    }
     public void doiniciarObjBusExpediente(){
        this.objBuscarExpedienteRecepO=new Expediente();
    }
    
    public BeanRecepcionado_Por_Oficina() {
         try
        {
            doiniciarObjBusExpediente  (); 
        }
        catch(Exception e )
        {
            Mensaje.manejarError(e,"Error al Iniciar Proceso");
        }    
    }
     public ArrayList<Expediente> doBuscarExpediente(){   
    this.arrBusExpedienteRecepO = new ArrayList<Expediente>();
    //Lista Expediente
    this.arrBusExpedienteRecepO=Expediente.getBuscaExpedientesRecepcionadosPorOficina(objBuscarExpedienteRecepO);
    return this.arrBusExpedienteRecepO;    
    }
    public String getSizeRegistrosExpediente() {
        if (this.arrExpedienteRecepO == null) {
            return "0";
        } else {
            return "" + this.arrExpedienteRecepO.size();
        }
    }

    public String getSizeRegistrosBusExpediente() {
        if (this.arrBusExpedienteRecepO== null) {
            return "0";
        } else {
            return "" + this.arrBusExpedienteRecepO.size();
        }
    }
 
  public void onClickBusq(ActionEvent evt){ 
        Object param=evt.getComponent().getAttributes().get("param");
        this.puntAnt=param.toString();  
        
    }
    
    
}
