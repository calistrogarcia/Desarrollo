/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author Administrador
 */

import Modelo.Supervisor; 

import utils.Constantes;
import utils.Mensaje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;


@ManagedBean
@ViewScoped
public class Beans_DefensaCivil_Supervisor  implements Serializable{

    /**
     * 
     */
 
    private Supervisor objSupervisorReg;
    private Supervisor objSupervisorDetalle;
    private Supervisor objSupervisorMod;
    private Supervisor objEliminaSupervisor;
    private Supervisor objBuscarSupervisor;
    private ArrayList<Supervisor> arrSupervisor=null;
    private ArrayList<Supervisor> arrBusSupervisor=null;  
    private ArrayList<Supervisor> listaInspectores=null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer=true;    
    private boolean bandMod=true;
    private boolean bandEli=true;
    
 
    public ArrayList<Supervisor> getListaInspectores() {
        return listaInspectores;
    }

    public void setListaInspectores(ArrayList<Supervisor> listaInspectores) {
        this.listaInspectores = listaInspectores;
    }

    
   //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Supervisor getObjSupervisorReg() {
        return objSupervisorReg;
    }

    public void setObjSupervisorReg(Supervisor objSupervisorReg) {
        this.objSupervisorReg = objSupervisorReg;
    }

    public Supervisor getObjSupervisorDetalle() {
        return objSupervisorDetalle;
    }

    public void setObjSupervisorDetalle(Supervisor objSupervisorDetalle) {
        this.objSupervisorDetalle = objSupervisorDetalle;
    }
  
    public Supervisor getObjSupervisorMod() {
        return objSupervisorMod;
    }

    public void setObjSupervisorMod(Supervisor objSupervisorMod) {
        this.objSupervisorMod = objSupervisorMod;
    }


    public Supervisor getObjEliminaSupervisor() {
        return objEliminaSupervisor;
    }

    public Supervisor getObjBuscarSupervisor() {
        return objBuscarSupervisor;
    }

    public void setObjBuscarSupervisor(Supervisor objBuscarSupervisor) {
        this.objBuscarSupervisor = objBuscarSupervisor;
    }

    public void setObjEliminaSupervisor(Supervisor objEliminaSupervisor) {
        this.objEliminaSupervisor = objEliminaSupervisor;
    }

    public ArrayList<Supervisor> getArrSupervisor() {
        return arrSupervisor;
    }

    public void setArrSupervisor(ArrayList<Supervisor> arrSupervisor) {
        this.arrSupervisor = arrSupervisor;
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

    public ArrayList<Supervisor> getArrBusSupervisor() {
        return arrBusSupervisor;
    }

    public void setArrBusSupervisor(ArrayList<Supervisor> arrBusSupervisor) {
        this.arrBusSupervisor = arrBusSupervisor;
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
        public void doiniciarRegistroSupervisor(){
            this.objSupervisorReg=new Supervisor();
        }

    //Iniciallzaciones
        public void doiniciarModificarSupervisor(){
            this.objSupervisorMod=new Supervisor();
        }

    //Iniciallzaciones  
        public void doiniciarObjBusSupervisor(){
            this.objBuscarSupervisor=new Supervisor();
        }

     //Iniciallzaciones
        public void doiniciarBusquedaSupervisor(){        
            this.arrBusSupervisor = new ArrayList<Supervisor>();
            this.objBuscarSupervisor= new Supervisor();

        }

    //Iniciallzaciones
        public void doiniciarListadoSupervisor(){        
            arrSupervisor = new ArrayList<Supervisor>();
        }

     //Iniciallzaciones
          public void doiniciarEliminarSupervisor(){
            this.objEliminaSupervisor=new Supervisor();
        }


    public Beans_DefensaCivil_Supervisor() {
   
       
     try
        {
            doiniciarRegistroSupervisor();
            doiniciarObjBusSupervisor(); 
        }
        catch(Exception e )
        {
            Mensaje.manejarError(e,"Error al Iniciar Proceso");
        }    
        
 
    }
    
    
   public String doRegSupervisor(){    
      
       try{    
          
       if(Supervisor.registrarSupervisor(objSupervisorReg)){
           
            Mensaje.guardarMensajeExito("Registrar Supervisor","Registrado Correctamente"); this.doiniciarRegistroSupervisor();
          }
          else{
            Mensaje.manejarError ("Registrar Supervisor","Error de Registro, Verificar Algoritmo");                    
         } 
      }catch(Exception e ){  
            Mensaje.manejarError(e,"Registrar Supervisor");   
      }      
      return null;
     
   }


    
        public ArrayList<Supervisor> doBuscarSupervisor(){   
          
            this.arrBusSupervisor = new ArrayList<Supervisor>();
            this.arrBusSupervisor=Supervisor.getBuscarInspector(objBuscarSupervisor);                 
            return this.arrBusSupervisor;    
        }

          
        public String getSizeRegistrosBusSupervisor() {
         if(this.arrBusSupervisor==null){
              return "0";
            }            
         else{return "" + this.arrBusSupervisor.size();
            }             
         }  

         public String doDesactivaTabReg(){               
               this.activeTabIndex=1;       
               this.doiniciarRegistroSupervisor();
               return null;
            }
           
           
         //Modificar    
                public String modificarSupervisor(Supervisor so){        
                this.doiniciarModificarSupervisor();
                this.objSupervisorMod=so;  
                this.bandMod=false;
                this.activeTabIndex=1; //4   ---3  
                return null;          
            }
                
                
                
      
         public String desactivaTabMod(){        
               this.bandMod=true;
               //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
               if(puntAnt.compareTo("2")==0){ 
                   this.doBuscarSupervisor();
                   this.activeTabIndex=Constantes.TAB_BUSQUEDA;
               }
               else{
                   if(puntAnt.compareTo("1")==0){  
                       this.doiniciarModificarSupervisor();
                       this.activeTabIndex=Constantes.TAB_MODIFICAR;
                   }
               }
              Mensaje.guardarMensajeExito("Cancelar la Modificación de Supervisor !!!","Supervisor");                   

               return null;
            }
         
         
         //--------------------Desactivar cuando se ejecuta evento de cancelar -------------------------------------------------


         public String desactivaTabModifiCancelar(){        

             this.bandMod=true;
               //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 

               if(puntAnt.compareTo("2")==0){
                   this.doBuscarSupervisor();
                   this.activeTabIndex=Constantes.TAB_BUSQUEDA;
               }
               else{

                   if(puntAnt.compareTo("1")==0){    
                       // this.doListarCertificado();

                       this.doiniciarModificarSupervisor();
                       this.activeTabIndex=Constantes.TAB_MODIFICAR;

                        //this.activeTabIndex=Constantes.TAB_ELIMINAR;

                   }
               }
              Mensaje.guardarMensajeExito("Cancelar, Modificacion Inspector!!!","Modificacion");                   

               return null;
            }



         //--------------------------------------------------------------------------------------------------------------------
         
 
      

          public String doModSupervisar(){    
          
             this.bandMod=true;
              try{    
               if(Supervisor.MoficardatosSupervisor(objSupervisorMod)){            
                        Mensaje.guardarMensajeExito("Actualizar Certificado","Actualizado Correctamente");
               }
               else{
                        Mensaje.manejarError("Actualizar Certificado","Error de Modificacion");                    
                }         
              }catch(Exception e ){
                        Mensaje.manejarError(e,"Actualizar Certificado");   
              }
              if(puntAnt.compareTo("1")==0){
                   this.doBuscarSupervisor();
                   this.activeTabIndex=Constantes.TAB_BUSQUEDA;
               }
               else{
                   if(puntAnt.compareTo("2")==0){    
                     //  this.doListarSupervisor();
                       this.activeTabIndex=Constantes.TAB_BUSQUEDA;
                   }
               }    
             return null;
         }
         
          
          public void onClickBusq(ActionEvent evt){ 
                Object param=evt.getComponent().getAttributes().get("param");
                this.puntAnt=param.toString();  

            }


    
    
}
