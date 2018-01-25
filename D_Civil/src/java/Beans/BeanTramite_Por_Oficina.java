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
public class BeanTramite_Por_Oficina implements Serializable {

    
    private Expediente objBuscarExpedienteT;
    private ArrayList<Expediente> arrExpedienteT=null;
    private ArrayList<Expediente> arrBusExpedienteT=null;
            //TabView
    private Integer activeTabIndex;
    private boolean bandVer=true;    
    private boolean bandMod=true;
    private boolean bandEli=true;
   
    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Expediente getObjBuscarExpedienteT() {
        return objBuscarExpedienteT;
    }

    public void setObjBuscarExpedienteT(Expediente objBuscarExpedienteT) {
        this.objBuscarExpedienteT = objBuscarExpedienteT;
    }

    public ArrayList<Expediente> getArrExpedienteT() {
        return arrExpedienteT;
    }

    public void setArrExpedienteT(ArrayList<Expediente> arrExpedienteT) {
        this.arrExpedienteT = arrExpedienteT;
    }

    public ArrayList<Expediente> getArrBusExpedienteT() {
        return arrBusExpedienteT;
    }

    public void setArrBusExpedienteT(ArrayList<Expediente> arrBusExpedienteT) {
        this.arrBusExpedienteT = arrBusExpedienteT;
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
    public void doiniciarListadoExpedienteT(){        
        arrExpedienteT = new ArrayList<Expediente>();
        
        
    }
    //Iniciallzaciones
    public void doiniciarBusquedaExpedienteT(){        
        this.arrBusExpedienteT= new ArrayList<Expediente>();
        this.objBuscarExpedienteT= new Expediente();

    }
     public void doiniciarObjBusExpediente(){
        this.objBuscarExpedienteT=new Expediente();
    }
     
     
    public BeanTramite_Por_Oficina() {
         try
        {
           
            doiniciarObjBusExpediente(); 
        }
        catch(Exception e )
        {
            Mensaje.manejarError(e,"Error al Iniciar Proceso");
        }    
    }
    public ArrayList<Expediente> doBuscarExpediente(){   
    this.arrBusExpedienteT = new ArrayList<Expediente>();
    //Lista Expediente
    this.arrBusExpedienteT=Expediente.getBuscaExpedientesEnTramiPorOficina(objBuscarExpedienteT);
    return this.arrBusExpedienteT;    
    }
    public String getSizeRegistrosExpediente() {
        if (this.arrExpedienteT == null) {
            return "0";
        } else {
            return "" + this.arrExpedienteT.size();
        }
    }

    public String getSizeRegistrosBusExpediente() {
        if (this.arrBusExpedienteT== null) {
            return "0";
        } else {
            return "" + this.arrBusExpedienteT.size();
        }
    }
 
  public void onClickBusq(ActionEvent evt){ 
        Object param=evt.getComponent().getAttributes().get("param");
        this.puntAnt=param.toString();  
        
    }
    
    
    
}
