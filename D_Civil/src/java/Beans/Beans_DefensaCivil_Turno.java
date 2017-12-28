/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;


import Modelo.Turno;
import java.util.ArrayList;
import java.util.Calendar;
import javax.faces.event.ActionEvent;
import javax.faces.context.FacesContext;

import utils.Constantes;
import utils.Mensaje;

/**
 *
 * @author Garcia Rivera Calistro
 */
public class Beans_DefensaCivil_Turno {

     /**
     * 
     */
   
   
    private boolean bandEli=true;
    private Turno objTurnoReg;
    private Turno objTurnoMod;
    private Turno objTurnoDetalle;
    private Turno objEliminaTurno;
    private Turno objBuscarTurno;
    private ArrayList<Turno> arrTurno=null;
    private ArrayList<Turno> arrBusTurno=null;
            //TabView
    private Integer activeTabIndex;
    private boolean bandVer=true;    
    private boolean bandMod=true; 
    
    
    
    
    
    private String firstname;
    private String lastname;
 
    public String getFirstname() {
        return firstname;
    }
 
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    
    private String puntAnt;

    public String getPuntAnt() {
        return puntAnt;
    }

    public void setPuntAnt(String puntAnt) {
        this.puntAnt = puntAnt;
    }
    

    public boolean isBandEli() {
        return bandEli;
    }

    public void setBandEli(boolean bandEli) {
        this.bandEli = bandEli;
    }

    
  
    public Turno getObjTurnoReg() {
        return objTurnoReg;
    }

    public void setObjTurnoReg(Turno objTurnoReg) {
        this.objTurnoReg = objTurnoReg;
    }

    public Turno getObjTurnoMod() {
        return objTurnoMod;
    }

    public void setObjTurnoMod(Turno objTurnoMod) {
        this.objTurnoMod = objTurnoMod;
    }

    public Turno getObjTurnoDetalle() {
        return objTurnoDetalle;
    }

    public void setObjTurnoDetalle(Turno objTurnoDetalle) {
        this.objTurnoDetalle = objTurnoDetalle;
    }

    public Turno getObjEliminaTurno() {
        return objEliminaTurno;
    }

    public void setObjEliminaTurno(Turno objEliminaTurno) {
        this.objEliminaTurno = objEliminaTurno;
    }

    public Turno getObjBuscarTurno() {
        return objBuscarTurno;
    }

    public void setObjBuscarTurno(Turno objBuscarTurno) {
        this.objBuscarTurno = objBuscarTurno;
    }

    public ArrayList<Turno> getArrTurno() {
        return arrTurno;
    }

    public void setArrTurno(ArrayList<Turno> arrTurno) {
        this.arrTurno = arrTurno;
    }

    public ArrayList<Turno> getArrBusTurno() {
        return arrBusTurno;
    }

    public void setArrBusTurno(ArrayList<Turno> arrBusTurno) {
        this.arrBusTurno = arrBusTurno;
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
    
  //Iniciallzaciones
    public void doiniciarListadoTurno(){        
        arrTurno = new ArrayList<Turno>();
        
        
    }
//Iniciallzaciones
    public void doiniciarBusquedaTurno(){        
        this.arrBusTurno = new ArrayList<Turno>();
        this.objBuscarTurno= new Turno();
   
    }

    
    public void doiniciarRegistroTurno(){
        this.objTurnoReg=new Turno();
    }
    public void doiniciarObjBusTurno(){
        this.objBuscarTurno=new Turno();
    }
    
    public void doiniciarModificarTurno(){
        this.objTurnoMod=new Turno();
    }
      public void doiniciarEliminarTurno(){
        this.objEliminaTurno=new Turno();
    } 
    
    
    public Beans_DefensaCivil_Turno() {
        
         try
        {
            doiniciarRegistroTurno();
            doiniciarObjBusTurno(); 
        }
        catch(Exception e )
        {
            Mensaje.manejarError(e,"Error al Iniciar Proceso");
        }    

    }
    
   public String doRegTurno(){    
      try{    
       if(Turno.registrarTurno(objTurnoReg)){ 
            Mensaje.guardarMensajeExito("Registrar Turno","Registrado Correctamente");  
            this.doiniciarRegistroTurno();
       }
       else{
    Mensaje.guardarMensajeExito("Registrar Turno","Registrado Correctamente");                  
     }
         
      }catch(Exception e ){
          
     Mensaje.manejarError(e,"Registrar Turno");   
      
      }
          
     return null;
 
        
 }
public ArrayList<Turno> doListarTurno(){   
    this.doiniciarListadoTurno();            
    //Lista Turno
// this.arrTurno=Turno.getCargardetalle_normas();        Habilitar           
    return this.arrTurno;    
}
public ArrayList<Turno> doBuscarTurno(){   
    this.arrBusTurno = new ArrayList<Turno>();
    //Lista Turno
  //  this.arrBusTurno=Turno.getBuscarTurnoParametro(objBuscarTurno);          pendiente de analisis        
    return this.arrBusTurno;    
}

public String getSizeRegistrosTurno() {
 if(this.arrTurno==null){
      return "0";
    }            
 else{return "" + this.arrTurno.size();
    }             
 }  
public String getSizeRegistrosBusTurno() {
 if(this.arrBusTurno==null){
      return "0";
    }            
 else{return "" + this.arrBusTurno.size();
    }             
 }  

 public String doDesactivaTabReg(){               
       this.activeTabIndex=0;       
       this.doiniciarRegistroTurno();
       return null;
    }
     public String mostrarDetalleTurno(Turno sg){   
      
         this.objTurnoDetalle=sg;
        this.bandVer=false;        
        this.activeTabIndex=3; 
        //Hace Visible el Formulario para Mostrar Detalle                 
        return null;   
    } 
      public String eliminarTurno(Turno wo){     
        this.objEliminaTurno=wo;          
        this.activeTabIndex=5;       
        this.bandEli=false;   
        return null;   
    }
       
 //Modificar    
        public String modificarTurno(Turno so){        
       this.doiniciarModificarTurno();
        this.objTurnoMod=so;  
        this.bandMod=false;
        this.activeTabIndex=4;         
        return null;          
    }
        
        
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
 public String desactivaTabMod(){        
       this.bandMod=true;
       //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
       if(puntAnt.compareTo("2")==0){
           this.doBuscarTurno();
           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
       }
       else{
           if(puntAnt.compareTo("1")==0){    
               this.doListarTurno();
               this.activeTabIndex=Constantes.TAB_ELIMINAR;
           }
       }
      Mensaje.guardarMensajeExito("Cancelar la Modificación de Turno !!!","Turno");                   
       
       return null;
    }
 public String desactivaTabElim(){        
        this.bandEli=true;
       //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
       if(puntAnt.compareTo("2")==0){
           this.doBuscarTurno();
           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
       }
       else{
           if(puntAnt.compareTo("1")==0){    
               this.doListarTurno();
               this.activeTabIndex=Constantes.TAB_ELIMINAR;
           }
       }
      Mensaje.guardarMensajeExito("Cancelar la Eliminaciòn de Turno !!!","Turno");                          
      return null;
    }
public String doModTurno(){    
    this.bandMod=true;
      try{    /* 
       if(Turno.actualizarTurno(objTurnoMod)){            
                Mensaje.guardarMensajeExito("Actualizar Turno","Actualizado Correctamente");
       }
       else{
                Mensaje.manejarError("Actualizar Turno","Error de Modificacion");                    
        }    */     
      }catch(Exception e ){
                Mensaje.manejarError(e,"Actualizar Turno");   
      }
      if(puntAnt.compareTo("2")==0){
           this.doBuscarTurno();
           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
       }
       else{
           if(puntAnt.compareTo("1")==0){    
               this.doListarTurno();
               this.activeTabIndex=Constantes.TAB_ELIMINAR;
           }
       }    
     return null;
 }
public String doEliTurno(){    
      this.bandEli=true; 
    try{    /*
      
          if(Turno.eliminarTurno(objEliminaTurno)){               
              Mensaje.guardarMensajeExito("Eliminar Turno","Eliminar Correctamente");
       }
       else{
              Mensaje.manejarError("Actualizar Turno","Error de Modificacion");                    
        }     */
      }catch(Exception e ){
            Mensaje.manejarError(e,"Actualizar Turno");   
      }
        if(puntAnt.compareTo("2")==0){
           this.doBuscarTurno(); 
           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
       }
       else{
           if(puntAnt.compareTo("1")==0){    
               this.doListarTurno();
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
