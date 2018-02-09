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

/**
 *
 * @author Judith 04/04/17
 */
public class BeanExpediente_Por_Fecha {

    private Expediente objExpedienteReg;
    private Expediente objExpedienteDetalle;
    private Expediente objExpedienteMod;
    private Expediente objEliminaExpediente;
    private Expediente objBuscarExpediente;
    private Expediente objBuscarExpedienteReportePorFecha;

    private ArrayList<Expediente> arrExpediente = null;
    private ArrayList<Expediente> arrBusExpediente = null;
    private ArrayList<Expediente> arrExpedienteReportePorFecha = null;
    private ArrayList<Expediente> arrBusExpedienteReportePorFecha = null;

    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;
    private boolean bandMod = true;
    private boolean bandEli = true;

    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Expediente getObjExpedienteReg() {
        return objExpedienteReg;
    }

    public void setObjExpedienteReg(Expediente objExpedienteReg) {
        this.objExpedienteReg = objExpedienteReg;
    }

    public Expediente getObjExpedienteDetalle() {
        return objExpedienteDetalle;
    }

    public void setObjExpedienteDetalle(Expediente objExpedienteDetalle) {
        this.objExpedienteDetalle = objExpedienteDetalle;
    }

    public Expediente getObjExpedienteMod() {
        return objExpedienteMod;
    }

    public void setObjExpedienteMod(Expediente objExpedienteMod) {
        this.objExpedienteMod = objExpedienteMod;
    }

    public Expediente getObjEliminaExpediente() {
        return objEliminaExpediente;
    }

    public Expediente getObjBuscarExpediente() {
        return objBuscarExpediente;
    }

    public void setObjBuscarExpediente(Expediente objBuscarExpediente) {
        this.objBuscarExpediente = objBuscarExpediente;
    }

    public void setObjEliminaExpediente(Expediente objEliminaExpediente) {
        this.objEliminaExpediente = objEliminaExpediente;
    }

    public ArrayList<Expediente> getArrExpediente() {
        return arrExpediente;
    }

    public void setArrExpediente(ArrayList<Expediente> arrExpediente) {
        this.arrExpediente = arrExpediente;
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

    public ArrayList<Expediente> getArrBusExpediente() {
        return arrBusExpediente;
    }

    public void setArrBusExpediente(ArrayList<Expediente> arrBusExpediente) {
        this.arrBusExpediente = arrBusExpediente;
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

    public Expediente getObjBuscarExpedienteReportePorFecha() {
        return objBuscarExpedienteReportePorFecha;
    }

    public void setObjBuscarExpedienteReportePorFecha(Expediente objBuscarExpedienteReportePorFecha) {
        this.objBuscarExpedienteReportePorFecha = objBuscarExpedienteReportePorFecha;
    }

    public ArrayList<Expediente> getArrExpedienteReportePorFecha() {
        return arrExpedienteReportePorFecha;
    }

    public void setArrExpedienteReportePorFecha(ArrayList<Expediente> arrExpedienteReportePorFecha) {
        this.arrExpedienteReportePorFecha = arrExpedienteReportePorFecha;
    }

    public ArrayList<Expediente> getArrBusExpedienteReportePorFecha() {
        return arrBusExpedienteReportePorFecha;
    }

    public void setArrBusExpedienteReportePorFecha(ArrayList<Expediente> arrBusExpedienteReportePorFecha) {
        this.arrBusExpedienteReportePorFecha = arrBusExpedienteReportePorFecha;
    }

    public String getPuntAnt() {
        return puntAnt;
    }

    public void setPuntAnt(String puntAnt) {
        this.puntAnt = puntAnt;
    }

    //Iniciallzaciones
    public void doiniciarRegistroExpediente() {
        this.objExpedienteReg = new Expediente();
    }

    //Iniciallzaciones
    public void doiniciarObjBusExpediente() {
        this.objBuscarExpediente = new Expediente();
    }

    //Iniciallzaciones
    public void doiniciarBusquedaExpediente() {

        this.arrBusExpediente = new ArrayList<Expediente>();
        this.objBuscarExpediente = new Expediente();

    }

    //Iniciallzaciones
    public void doiniciarListadoExpediente() {
        arrExpediente = new ArrayList<Expediente>();
    }

    public void doiniciarObjBusReporteExpedientesFecha() {
        this.objBuscarExpedienteReportePorFecha = new Expediente();
    }

    //Iniciallzaciones
    public void doiniciarBusquedaExpedientesFecha() {

        this.arrBusExpedienteReportePorFecha = new ArrayList<Expediente>();
        this.objBuscarExpedienteReportePorFecha = new Expediente();

    }

    //Iniciallzaciones
    public void doiniciarModificarExpediente() {
        this.objExpedienteMod = new Expediente();
    }

    //Iniciallzaciones
    public void doiniciarEliminarExpediente() {
        this.objEliminaExpediente = new Expediente();
    }

    public BeanExpediente_Por_Fecha() {
        try {
            doiniciarRegistroExpediente();
            doiniciarObjBusExpediente();
            doiniciarObjBusReporteExpedientesFecha();

        } catch (Exception e) {
            Mensaje.manejarError(e, "Error al Iniciar Proceso");
        }

    }

//    public String doRegExpediente() {
//        try {
//
//            if (Expediente.registrar_expediente(objExpedienteReg)) {
//                Mensaje.guardarMensajeExito("Registrar Expediente", "Registrado Correctamente");
//                this.doiniciarRegistroExpediente();
//            } else {
//                Mensaje.manejarError("Registrar Expediente", "Error de Registro, Verificar Algoritmo");
//            }
//
//        } catch (Exception e) {
//            Mensaje.manejarError(e, "Registrar Expediente");
//        }
//
//        return null;
//    }

    public ArrayList<Expediente> doListarExpediente() {
        this.doiniciarListadoExpediente();
        //Lista Expediente
        this.arrExpediente = Expediente.getCargarExpediente();
        return this.arrExpediente;
    }

    // Buscar Exoedientes 
    public ArrayList<Expediente> doBuscarExpediente() {
        this.arrBusExpediente = new ArrayList<Expediente>();
        //Lista Expediente
        this.arrBusExpediente = Expediente.getBuscarExpedientePorFechaParametro(objBuscarExpediente);
        return this.arrBusExpediente;
    }

    public String getSizeRegistrosExpediente() {
        if (this.arrExpediente == null) {
            return "0";
        } else {
            return "" + this.arrExpediente.size();
        }
    }

    public String getSizeRegistrosBusExpediente() {
        if (this.arrBusExpediente == null) {
            return "0";
        } else {
            return "" + this.arrBusExpediente.size();
        }
    }
    //------------------------------------------------------

    public ArrayList<Expediente> doBuscarReporteExpedientesPorFecha() {
        this.arrBusExpedienteReportePorFecha = new ArrayList<Expediente>();
        this.arrBusExpedienteReportePorFecha = Expediente.BuscaReporteExpedientesPorFecha(objBuscarExpedienteReportePorFecha);
        return this.arrBusExpedienteReportePorFecha;
    }

    public String getSizeRegistrosReporteExpedientesPorFecha() {
        if (this.arrExpedienteReportePorFecha == null) {
            return "0";
        } else {
            return "" + this.arrExpedienteReportePorFecha.size();
        }
    }

    public String getSizeRegistrosBusReporteExpedientesPorFecha() {
        if (this.arrBusExpedienteReportePorFecha == null) {
            return "0";
        } else {
            return "" + this.arrBusExpedienteReportePorFecha.size();
        }
    }
    //------------------------------------------------------

    public String doDesactivaTabReg() {
        this.activeTabIndex = 0;
        this.doiniciarRegistroExpediente();
        return null;
    }

    public String mostrarDetalleExpediente(Expediente sg) {
        this.objExpedienteDetalle = sg;
        this.bandVer = true;        //false
        this.activeTabIndex = 3; //2
        //Hace Visible el Formulario para Mostrar Detalle                 
        return null;
    }

    public String eliminarExpediente(Expediente wo) {
        this.objEliminaExpediente = wo;
        this.activeTabIndex = 5;       //5 ---4
        this.bandEli = false;
        return null;
    }

    //Modificar    
    public String modificarExpediente(Expediente so) {
        this.doiniciarModificarExpediente();
        this.objExpedienteMod = so;
        this.bandMod = false;
        this.activeTabIndex = 4; //4   ---3  
        return null;
    }

    public String desactivaTabVer() {
        this.bandVer = true;
        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
        if (puntAnt.compareTo("2") == 0) {
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("1") == 0) {

                this.activeTabIndex = Constantes.TAB_ELIMINAR;
            }
        }
        return null;

    }

    public String desactivaTabMod() {
        this.bandMod = true;
        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
        if (puntAnt.compareTo("2") == 0) {
            this.doBuscarExpediente();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("1") == 0) {
                this.doListarExpediente();
                this.activeTabIndex = Constantes.TAB_ELIMINAR;
            }
        }
        Mensaje.guardarMensajeExito("Cancelar la Modificación de Expediente !!!", "Expediente");

        return null;
    }

    public String desactivaTabElim() {
        this.bandEli = true;
        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
        if (puntAnt.compareTo("2") == 0) {
            this.doBuscarExpediente();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("1") == 0) {
                this.doListarExpediente();
                this.activeTabIndex = Constantes.TAB_ELIMINAR;
            }
        }
        Mensaje.guardarMensajeExito("Cancelar la Eliminaciòn de Expediente!!!", "Expediente");
        return null;
    }
//public String doModExpediente(){    
//    this.bandMod=true;
//      try{    
//       if(Trabajador.actualizarExpediente(objExpedienteMod)){            
//                Mensaje.guardarMensajeExito("Actualizar Expediente","Actualizado Correctamente");
//       }
//       else{
//                Mensaje.manejarError("Actualizar Expediente","Error de Modificacion");                    
//        }         
//      }catch(Exception e ){
//                Mensaje.manejarError(e,"Actualizar Expediente");   
//      }
//      if(puntAnt.compareTo("2")==0){ 
//           this.doBuscarExpediente();
//           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
//       }
//       else{
//           if(puntAnt.compareTo("1")==0){    
//               this.doListarExpediente();
//               this.activeTabIndex=Constantes.TAB_ELIMINAR;
//           }
//       }    
//     return null;
// }
//public String doEliExpediente(){    
//      this.bandEli=true;
//    try{    
//      
//          if(Trabajador.eliminarExpediente(objEliminaExpediente)){               
//              Mensaje.guardarMensajeExito("Eliminar Expediente","Eliminar Correctamente");
//       }
//       else{
//              Mensaje.manejarError("Actualizar Expediente","Error de Modificacion");                    
//        }     
//      }catch(Exception e ){
//            Mensaje.manejarError(e,"Actualizar Expediente");   
//      }
//        if(puntAnt.compareTo("2")==0){ 
//           this.doBuscarExpediente(); 
//           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
//       }
//       else{
//           if(puntAnt.compareTo("1")==0){    
//               this.doListarExpediente();
//               this.activeTabIndex=Constantes.TAB_ELIMINAR;
//           }
//       }       
//     return null;
// }

    public void onClickBusq(ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();

    }

}
