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
public class BeanDerivados_Por_Gerencia implements Serializable {
  private Expediente objBuscarExpedienteDerivG;
    private ArrayList<Expediente> arrExpedienteDerivG=null;
    private ArrayList<Expediente> arrBusExpedienteDerivG=null;
            //TabView
    private Integer activeTabIndex;
    private boolean bandVer=true;    
    private boolean bandMod=true;
    private boolean bandEli=true;
   
    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Expediente getObjBuscarExpedienteDerivG() {
        return objBuscarExpedienteDerivG;
    }

    public void setObjBuscarExpedienteDerivG(Expediente objBuscarExpedienteDerivG) {
        this.objBuscarExpedienteDerivG = objBuscarExpedienteDerivG;
    }

    public ArrayList<Expediente> getArrExpedienteDerivG() {
        return arrExpedienteDerivG;
    }

    public void setArrExpedienteDerivG(ArrayList<Expediente> arrExpedienteDerivG) {
        this.arrExpedienteDerivG = arrExpedienteDerivG;
    }

    public ArrayList<Expediente> getArrBusExpedienteDerivG() {
        return arrBusExpedienteDerivG;
    }

    public void setArrBusExpedienteDerivG(ArrayList<Expediente> arrBusExpedienteDerivG) {
        this.arrBusExpedienteDerivG = arrBusExpedienteDerivG;
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
    public void doiniciarListadoExpedienteDerivG(){        
        arrExpedienteDerivG = new ArrayList<Expediente>();
        
        
    }
    //Iniciallzaciones
    public void doiniciarBusquedaExpedienteDerivG(){        
        this.arrBusExpedienteDerivG = new ArrayList<Expediente>();
        this.objBuscarExpedienteDerivG= new Expediente();

    }
     public void doiniciarObjBusExpedienteDerivG(){
        this.objBuscarExpedienteDerivG=new Expediente();
    }
    public BeanDerivados_Por_Gerencia() {
           try
        {
            doiniciarObjBusExpedienteDerivG (); 
        }
        catch(Exception e )
        {
            Mensaje.manejarError(e,"Error al Iniciar Proceso");
        }    
    }
    public ArrayList<Expediente> doBuscarExpedienteDerivG(){   
    this.arrBusExpedienteDerivG= new ArrayList<Expediente>();
    //Lista Expediente
    this.arrBusExpedienteDerivG=Expediente.getBuscaExpedientesDerivadosPorGerencia(objBuscarExpedienteDerivG);
    return this.arrBusExpedienteDerivG;    
    }
    public String getSizeRegistrosExpediente() {
        if (this.arrExpedienteDerivG == null) {
            return "0";
        } else {
            return "" + this.arrExpedienteDerivG.size();
        }
    }

    public String getSizeRegistrosBusExpedienteDesO() {
        if (this.arrBusExpedienteDerivG == null) {
            return "0";
        } else {
            return "" + this.arrBusExpedienteDerivG.size();
        }
    }
  
  public void onClickBusq(ActionEvent evt){ 
        Object param=evt.getComponent().getAttributes().get("param");
        this.puntAnt=param.toString();     
    }
  
}
