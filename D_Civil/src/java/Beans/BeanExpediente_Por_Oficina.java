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


public class BeanExpediente_Por_Oficina implements Serializable{

    private Expediente objBuscarExpedienteO;
    private ArrayList<Expediente> arrExpedienteO=null;
    private ArrayList<Expediente> arrBusExpedienteO=null;
            //TabView
    private Integer activeTabIndex;
    private boolean bandVer=true;    
    private boolean bandMod=true;
    private boolean bandEli=true;
   
    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Expediente getObjBuscarExpedienteO() {
        return objBuscarExpedienteO;
    }

    public void setObjBuscarExpedienteO(Expediente objBuscarExpedienteO) {
        this.objBuscarExpedienteO = objBuscarExpedienteO;
    }

    public ArrayList<Expediente> getArrExpedienteO() {
        return arrExpedienteO;
    }

    public void setArrExpedienteO(ArrayList<Expediente> arrExpedienteO) {
        this.arrExpedienteO = arrExpedienteO;
    }

    public ArrayList<Expediente> getArrBusExpedienteO() {
        return arrBusExpedienteO;
    }

    public void setArrBusExpedienteO(ArrayList<Expediente> arrBusExpedienteO) {
        this.arrBusExpedienteO = arrBusExpedienteO;
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
    public void doiniciarListadoExpedienteO(){        
        arrExpedienteO = new ArrayList<Expediente>();
        
        
    }
    //Iniciallzaciones
    public void doiniciarBusquedaExpedienteO(){        
        this.arrBusExpedienteO = new ArrayList<Expediente>();
        this.objBuscarExpedienteO= new Expediente();

    }
     public void doiniciarObjBusExpediente(){
        this.objBuscarExpedienteO=new Expediente();
    }
    public BeanExpediente_Por_Oficina() {
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
    this.arrBusExpedienteO = new ArrayList<Expediente>();
    //Lista Expediente
    this.arrBusExpedienteO=Expediente.getBuscaExpedientesIngresadosPorOficina(objBuscarExpedienteO);
    return this.arrBusExpedienteO;    
    }
    public String getSizeRegistrosExpediente() {
        if (this.arrExpedienteO == null) {
            return "0";
        } else {
            return "" + this.arrExpedienteO.size();
        }
    }

    public String getSizeRegistrosBusExpediente() {
        if (this.arrBusExpedienteO == null) {
            return "0";
        } else {
            return "" + this.arrBusExpedienteO.size();
        }
    }
    //------------------------------------------------------

 

 public String desactivaTabVer(){               
       this.bandVer=true;
       //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
       if(puntAnt.compareTo("2")==0){ 
           this.activeTabIndex=Constantes.TAB_BUSQUEDA; 
       }
       else{
           if(puntAnt.compareTo("1")==0){ 
            
               this.activeTabIndex=Constantes.TAB_ELIMINAR;
           }
       }
       return null;
       
       
       
    }
 
 
  public void onClickBusq(ActionEvent evt){ 
        Object param=evt.getComponent().getAttributes().get("param");
        this.puntAnt=param.toString();  
        
    }
    
    
}
