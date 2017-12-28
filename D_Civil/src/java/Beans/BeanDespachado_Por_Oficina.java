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

/**
 *
 * @author jarana
 */
@ManagedBean
public class BeanDespachado_Por_Oficina implements Serializable {

    private Expediente objBuscarExpedienteDesO;
    private ArrayList<Expediente> arrExpedienteDesO=null;
    private ArrayList<Expediente> arrBusExpedienteDesO=null;
            //TabView
    private Integer activeTabIndex;
    private boolean bandVer=true;    
    private boolean bandMod=true;
    private boolean bandEli=true;
   
    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Expediente getObjBuscarExpedienteDesO() {
        return objBuscarExpedienteDesO;
    }

    public void setObjBuscarExpedienteDesO(Expediente objBuscarExpedienteDesO) {
        this.objBuscarExpedienteDesO = objBuscarExpedienteDesO;
    }

    public ArrayList<Expediente> getArrExpedienteDesO() {
        return arrExpedienteDesO;
    }

    public void setArrExpedienteDesO(ArrayList<Expediente> arrExpedienteDesO) {
        this.arrExpedienteDesO = arrExpedienteDesO;
    }

    public ArrayList<Expediente> getArrBusExpedienteDesO() {
        return arrBusExpedienteDesO;
    }

    public void setArrBusExpedienteDesO(ArrayList<Expediente> arrBusExpedienteDesO) {
        this.arrBusExpedienteDesO = arrBusExpedienteDesO;
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
    public void doiniciarListadoExpedienteDesO(){        
        arrExpedienteDesO = new ArrayList<Expediente>();
        
        
    }
    //Iniciallzaciones
    public void doiniciarBusquedaExpedienteDesO(){        
        this.arrBusExpedienteDesO = new ArrayList<Expediente>();
        this.objBuscarExpedienteDesO= new Expediente();

    }
     public void doiniciarObjBusExpedienteDesO(){
        this.objBuscarExpedienteDesO=new Expediente();
    }

    public BeanDespachado_Por_Oficina() {
           try
        {
            doiniciarObjBusExpedienteDesO (); 
        }
        catch(Exception e )
        {
            Mensaje.manejarError(e,"Error al Iniciar Proceso");
        }    
    }
    public ArrayList<Expediente> doBuscarExpedienteDesO(){   
    this.arrBusExpedienteDesO = new ArrayList<Expediente>();
    //Lista Expediente
    this.arrBusExpedienteDesO=Expediente.getBuscaExpedientesDespachadosPorOficina(objBuscarExpedienteDesO);
    return this.arrBusExpedienteDesO;    
    }
    public String getSizeRegistrosExpediente() {
        if (this.arrExpedienteDesO == null) {
            return "0";
        } else {
            return "" + this.arrExpedienteDesO.size();
        }
    }

    public String getSizeRegistrosBusExpedienteDesO() {
        if (this.arrBusExpedienteDesO == null) {
            return "0";
        } else {
            return "" + this.arrBusExpedienteDesO.size();
        }
    }
  
  public void onClickBusq(ActionEvent evt){ 
        Object param=evt.getComponent().getAttributes().get("param");
        this.puntAnt=param.toString();     
    }

}
