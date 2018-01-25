/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Controlador_Sql;
import Modelo.Expediente;
import Modelo.Usuario;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import utils.Mensaje;
/**
 *
 * @author jarana
 */
@ManagedBean

public class BeanTramite_Por_Tecnico implements Serializable{
    
    private Expediente objBuscarExpedienteTramT;
    private ArrayList<Expediente> arrExpedienteTramT=null;
    private ArrayList<Expediente> arrBusExpedienteTramT=null;
            //TabView
    private Integer activeTabIndex;
    private boolean bandVer=true;    
    private boolean bandMod=true;
    private boolean bandEli=true;  
    
    private String areas;
    private List<String> ListaUsuarios = new ArrayList<String>();
 
  
    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    
    public List<String> getListaUsuarios() {
        return ListaUsuarios;
    }

    public void setListaUsuarios(List<String> ListaUsuarios) {
        this.ListaUsuarios = ListaUsuarios;
    }
    
 
   
    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Expediente getObjBuscarExpedienteTramT() {
        return objBuscarExpedienteTramT;
    }

    public void setObjBuscarExpedienteTramT(Expediente objBuscarExpedienteTramT) {
        this.objBuscarExpedienteTramT = objBuscarExpedienteTramT;
    }

    public ArrayList<Expediente> getArrExpedienteTramT() {
        return arrExpedienteTramT;
    }

    public void setArrExpedienteTramT(ArrayList<Expediente> arrExpedienteTramT) {
        this.arrExpedienteTramT = arrExpedienteTramT;
    }

    public ArrayList<Expediente> getArrBusExpedienteTramT() {
        return arrBusExpedienteTramT;
    }

    public void setArrBusExpedienteTramT(ArrayList<Expediente> arrBusExpedienteTramT) {
        this.arrBusExpedienteTramT = arrBusExpedienteTramT;
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
    public void doiniciarListadoExpedienteTramT(){        
        arrExpedienteTramT = new ArrayList<Expediente>();
        
        
    }
    //Iniciallzaciones
    public void doiniciarBusquedaExpedienteTramT(){        
        this.arrBusExpedienteTramT = new ArrayList<Expediente>();
        this.objBuscarExpedienteTramT= new Expediente();

    }
     public void doiniciarObjBusExpedienteTramT(){
        this.objBuscarExpedienteTramT=new Expediente();
    }
   
    public BeanTramite_Por_Tecnico() {
        try
        {
            doiniciarObjBusExpedienteTramT (); 
        }
        catch(Exception e )
        {
            Mensaje.manejarError(e,"Error al Iniciar Proceso");
        }     
    }
    public ArrayList<Expediente> doBuscarExpedienteTramT(){   
    this.arrBusExpedienteTramT = new ArrayList<Expediente>();
    //Lista Expediente
    this.arrBusExpedienteTramT=Expediente.getBuscaExpedienteEnTramitePorTecnico(objBuscarExpedienteTramT);
    return this.arrBusExpedienteTramT;    
    }
    public String getSizeRegistrosExpediente() {
        if (this.arrExpedienteTramT == null) {
            return "0";
        } else {
            return "" + this.arrExpedienteTramT.size();
        }
    }

    public String getSizeRegistrosBusExpedienteTramT() {
        if (this.arrBusExpedienteTramT == null) {
            return "0";
        } else {
            return "" + this.arrBusExpedienteTramT.size();
        }
    }
  
  public void onClickBusq(ActionEvent evt){ 
        Object param=evt.getComponent().getAttributes().get("param");
        this.puntAnt=param.toString();     
    }

 
  public void CargarUsuarios(){
      
     switch(areas){
      
         case "025":
             ListaUsuarios.add("Garcia Rivera");
             break;
         case "048":
              ListaUsuarios.add("Anibal Palomino");
             
             break;           
      
    }
  
     
  }
  
  
    
}
