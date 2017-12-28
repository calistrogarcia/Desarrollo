/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;


import Modelo.Expediente;
import utils.Mensaje;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import utils.Constantes;

@ManagedBean

public class BeanExpediente_Por_Asunto implements Serializable {
    private Expediente objBuscarExpedienteAsun;
    private ArrayList<Expediente> arrExpedienteAsun=null;
    private ArrayList<Expediente> arrBusExpedienteAsun=null;
            //TabView
    private Integer activeTabIndex;
    private boolean bandVer=true;    
    private boolean bandMod=true;
    private boolean bandEli=true;
   
    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Expediente getObjBuscarExpedienteAsun() {
        return objBuscarExpedienteAsun;
    }

    public void setObjBuscarExpedienteAsun(Expediente objBuscarExpedienteAsun) {
        this.objBuscarExpedienteAsun = objBuscarExpedienteAsun;
    }

    public ArrayList<Expediente> getArrExpedienteAsun() {
        return arrExpedienteAsun;
    }

    public void setArrExpedienteAsun(ArrayList<Expediente> arrExpedienteAsun) {
        this.arrExpedienteAsun = arrExpedienteAsun;
    }

    public ArrayList<Expediente> getArrBusExpedienteAsun() {
        return arrBusExpedienteAsun;
    }

    public void setArrBusExpedienteAsun(ArrayList<Expediente> arrBusExpedienteAsun) {
        this.arrBusExpedienteAsun = arrBusExpedienteAsun;
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
    public void doiniciarListadoExpedienteAsun(){        
        arrExpedienteAsun = new ArrayList<Expediente>();
        
        
    }
    //Iniciallzaciones
    public void doiniciarBusquedaExpedienteAsun(){        
        this.arrBusExpedienteAsun = new ArrayList<Expediente>();
        this.objBuscarExpedienteAsun= new Expediente();

    }
     public void doiniciarObjBusExpediente(){
        this.objBuscarExpedienteAsun=new Expediente();
    }
//   
    public BeanExpediente_Por_Asunto() {
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
    this.arrBusExpedienteAsun = new ArrayList<Expediente>();
    //Lista Expediente
    this.arrBusExpedienteAsun=Expediente.getBuscaExpedientesPorAsunto(objBuscarExpedienteAsun);
    return this.arrBusExpedienteAsun;    
    }
    public String getSizeRegistrosExpediente() {
        if (this.arrExpedienteAsun== null) {
            return "0";
        } else {
            return "" + this.arrExpedienteAsun.size();
        }
    }

    public String getSizeRegistrosBusExpediente() {
        if (this.arrBusExpedienteAsun == null) {
            return "0";
        } else {
            return "" + this.arrBusExpedienteAsun.size();
        }
    }

  public void onClickBusq(ActionEvent evt){ 
        Object param=evt.getComponent().getAttributes().get("param");
        this.puntAnt=param.toString();  
        
    }
    
    
}
