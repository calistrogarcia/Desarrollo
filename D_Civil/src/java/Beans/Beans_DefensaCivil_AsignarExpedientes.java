/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Asignar;
import Modelo.Supervisor;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import utils.Constantes;
import utils.Mensaje;

/**
 *
 * @author Administrador
 */
/*@Named(value = "beans_DefensaCivil_AsignarExpedientes")
@ViewScoped */
//@ManagedBean
        public class Beans_DefensaCivil_AsignarExpedientes {

            private Asignar objAsignarReg;
            private Asignar objAsignarMod;
            private Asignar objAsignarBusq;
            private Asignar objAsignarBusqBuzon;
            
            private ArrayList<Asignar> arrAsignar=null;
            private ArrayList<Asignar> arrBusAsignar=null;
            
            private ArrayList<Asignar> arrAsignarBuzon=null;
            private ArrayList<Asignar> arrBusAsignarBuzon=null;
  
            //TabView
            
            private Integer activeTabIndex;
            private boolean bandVer=true;    
            private boolean bandMod=true;
            private boolean bandEli=true;

            //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
            private String puntAnt;
            
            public Asignar getObjAsignarReg() {
                return objAsignarReg;
            }

            public void setObjAsignarReg(Asignar objAsignarReg) {
                this.objAsignarReg = objAsignarReg;
            }

            public Asignar getObjAsignarMod() {
                return objAsignarMod;
            }

            public void setObjAsignarMod(Asignar objAsignarMod) {
                this.objAsignarMod = objAsignarMod;
            }

            public Asignar getObjAsignarBusq() {
                return objAsignarBusq;
            }

            public void setObjAsignarBusq(Asignar objAsignarBusq) {
                this.objAsignarBusq = objAsignarBusq;
            }

            public Asignar getObjAsignarBusqBuzon() {
                return objAsignarBusqBuzon;
            }

            public void setObjAsignarBusqBuzon(Asignar objAsignarBusqBuzon) {
                this.objAsignarBusqBuzon = objAsignarBusqBuzon;
            }

            public ArrayList<Asignar> getArrAsignar() {
                return arrAsignar;
            }

            public void setArrAsignar(ArrayList<Asignar> arrAsignar) {
                this.arrAsignar = arrAsignar;
            }

            public ArrayList<Asignar> getArrBusAsignar() {
                return arrBusAsignar;
            }

            public void setArrBusAsignar(ArrayList<Asignar> arrBusAsignar) {
                this.arrBusAsignar = arrBusAsignar;
            }

            public ArrayList<Asignar> getArrAsignarBuzon() {
                return arrAsignarBuzon;
            }

            public void setArrAsignarBuzon(ArrayList<Asignar> arrAsignarBuzon) {
                this.arrAsignarBuzon = arrAsignarBuzon;
            }

            public ArrayList<Asignar> getArrBusAsignarBuzon() {
                return arrBusAsignarBuzon;
            }

            public void setArrBusAsignarBuzon(ArrayList<Asignar> arrBusAsignarBuzon) {
                this.arrBusAsignarBuzon = arrBusAsignarBuzon;
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

  

             //Inicializaciones

                public void doiniciarRegistroAsignacion(){
                    this.objAsignarReg=new Asignar();
                }

            //Iniciallzaciones
                public void doiniciarModificarAsignacion(){
                    this.objAsignarMod=new Asignar();
                }

            //Iniciallzaciones  
                public void doiniciarObjBusAsignacion(){
                    this.objAsignarBusq=new Asignar();
                }

             //Iniciallzaciones
                public void doiniciarBusquedaAsignacion(){        
                    this.arrBusAsignar = new ArrayList<Asignar>();
                    this.objAsignarBusq= new Asignar();

                }
                
            //Iniciallzaciones  
                public void doiniciarObjBusquedaBuzonExpedientes(){
                    this.objAsignarBusqBuzon=new Asignar();
                }

             //Iniciallzaciones
                public void doiniciarBusquedaBuzonExpedientes(){        
                    this.arrBusAsignarBuzon = new ArrayList<Asignar>();
                    this.objAsignarBusqBuzon= new Asignar();

                }
   
            //Iniciallzaciones
                public void doiniciarListadoAsignacion(){        
                    arrAsignar = new ArrayList<Asignar>();
                }

            
            public Beans_DefensaCivil_AsignarExpedientes() {
                 try
                     {
                       doiniciarRegistroAsignacion();
                       doiniciarObjBusAsignacion();
                       doiniciarObjBusquedaBuzonExpedientes();
                       
                     } catch(Exception e ){
                     Mensaje.manejarError(e,"Error al Iniciar Proceso");
                     
                     }
             }
            
            public String doRegAsigncionExpediente(){    
              try{    
                   if(Asignar.AsignarExpediente(objAsignarReg)){
                        Mensaje.guardarMensajeExito("Registrar Supervisor","Registrado Correctamente"); this.doiniciarRegistroAsignacion();
                   }
                    else{
                        Mensaje.manejarError ("Registrar Supervisor","Error de Registro, Verificar Algoritmo");                    
                     } 
                  }catch(Exception e ){  
                        Mensaje.manejarError(e,"Registrar Supervisor");   
                  }      
                  return null;

               }
            
            
           
            public String doModAsigncionExpediente(){    
          
                this.bandMod=true;
                  
                try{    
                   if(Asignar.ModificarAsignarExpediente(objAsignarMod)){            
                            Mensaje.guardarMensajeExito("Modificado","Actualizado Correctamente");
                   }
                   else{
                            Mensaje.manejarError("Modificado","Error de Modificacion");                    
                    }         
                  }catch(Exception e ){
                            Mensaje.manejarError(e,"Actualizar Asignar");   
                  }
                  if(puntAnt.compareTo("1")==0){
                       this.doBuscarAsigncionExpediente();
                       this.activeTabIndex=Constantes.TAB_BUSQUEDA;
                   }
                   else{
                       if(puntAnt.compareTo("2")==0){    
                           //this.doListarSupervisor();
                           
                           this.activeTabIndex=Constantes.TAB_MODIFICAR;
                       }
                   }    
                 return null;
             }
         
           
            
            
            
            public ArrayList<Asignar> doBuscarAsigncionExpediente(){   
          
            this.arrBusAsignar= new ArrayList<Asignar>();
            this.arrBusAsignar=Asignar.getBuscarExpedientesDerivados(objAsignarBusq);                 
            return this.arrBusAsignar;    
          
            }
            
            
            public String getSizeRegistrosBusAsigncionExpediente() {
               if(this.arrBusAsignar==null){
                return "0";
             }            
            else{return "" + this.arrBusAsignar.size();}             
             } 
            
            
            
            public ArrayList<Asignar> doBuscarBuzonExpedientes(){   
          
            this.arrBusAsignarBuzon= new ArrayList<Asignar>();
            this.arrBusAsignarBuzon=Asignar.getBuscarExpedientesBuzonEntradaDefensaCivil(objAsignarBusqBuzon);                 
            return this.arrBusAsignarBuzon;    
          
            }
            
            
            
            
            
            
            public String getSizeRegistrosBuscarBuzonExpedientes() {
               if(this.arrBusAsignarBuzon==null){
                return "0";
             }            
            else{return "" + this.arrBusAsignarBuzon.size();}             
             } 
            
            
  
            
            // Registrar
            public String doDesactivaTabRegAsignacionExpediente(){               
               
               this.activeTabIndex=1;       
               this.doiniciarRegistroAsignacion();
               return null;
            }
            
            //Modificar lleva datos con el comand link
            
            public String modificarAsignacionExpediente(Asignar so){        
                
                this.doiniciarModificarAsignacion();
               // this.objAsignarMod=so; 
                this.objAsignarReg=so;
                this.bandMod=false;
                this.activeTabIndex=1;  
                return null;       
           }

            
            public String desactivaTabModAsignacionExpediente(){        
               this.bandMod=true;
               //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
               
               if(puntAnt.compareTo("2")==0){ 
                   this.doBuscarAsigncionExpediente();
                   this.activeTabIndex=Constantes.TAB_BUSQUEDA; 
               }
               else{
                   if(puntAnt.compareTo("1")==0){  
                       this.doiniciarModificarAsignacion();
                       this.activeTabIndex=Constantes.TAB_MODIFICAR;
                   }
               }
              Mensaje.guardarMensajeExito("Cancelar la Modificación de Expediente !!!","Asignacion");                   

               return null;
            }
  
            
        public void onClickBusq(ActionEvent evt){ 
                Object param=evt.getComponent().getAttributes().get("param");
                this.puntAnt=param.toString();  

            }
    

         
            
}