/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Licencia;
import java.util.ArrayList;
import javax.faces.event.ActionEvent;
import utils.Constantes;
import utils.Mensaje;

/**
 *
 * @author Administrador
 */
public class BeansPromocion_Empresarial_Licencias {
    
    private Licencia objLicenciaReg;
    private Licencia objLicenciaMod;
    private Licencia objLicenciaBusq;
    
    private ArrayList<Licencia> arrLicencia = null;
    private ArrayList<Licencia> arrBusLicencia = null;

    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;
    private boolean bandMod = true;
    private boolean bandEli = true;

    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;
    
    public Licencia getObjLicenciaReg() {
        return objLicenciaReg;
    }
    
    public void setObjLicenciaReg(Licencia objLicenciaReg) {
        this.objLicenciaReg = objLicenciaReg;
    }
    
    public Licencia getObjLicenciaMod() {
        return objLicenciaMod;
    }
    
    public void setObjLicenciaMod(Licencia objLicenciaMod) {
        this.objLicenciaMod = objLicenciaMod;
    }
    
    public Licencia getObjLicenciaBusq() {
        return objLicenciaBusq;
    }
    
    public void setObjLicenciaBusq(Licencia objLicenciaBusq) {
        this.objLicenciaBusq = objLicenciaBusq;
    }
    
    public ArrayList<Licencia> getArrLicencia() {
        return arrLicencia;
    }
    
    public void setArrLicencia(ArrayList<Licencia> arrLicencia) {
        this.arrLicencia = arrLicencia;
    }
    
    public ArrayList<Licencia> getArrBusLicencia() {
        return arrBusLicencia;
    }
    
    public void setArrBusLicencia(ArrayList<Licencia> arrBusLicencia) {
        this.arrBusLicencia = arrBusLicencia;
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
    public void doiniciarRegistroLicencia() {
        this.objLicenciaReg = new Licencia();
    }

    //Iniciallzaciones
    public void doiniciarModificarLicencia() {
        this.objLicenciaMod = new Licencia();
    }

    //Iniciallzaciones  
    public void doiniciarObjBusLicencia() {
        this.objLicenciaBusq = new Licencia();
    }

    //Iniciallzaciones
    public void doiniciarBusquedaLicencia() {
        this.arrBusLicencia = new ArrayList<Licencia>();
        this.objLicenciaBusq = new Licencia();
        
    }
    
    public BeansPromocion_Empresarial_Licencias() {
        
        try {
            
            doiniciarObjBusLicencia();
            
        } catch (Exception e) {
            Mensaje.manejarError(e, "Error al Iniciar Proceso");
            
        }        
    }

    
    
     // comand link   
    public String modificarLicencia(Licencia so) {

        this.doiniciarModificarLicencia();
        this.objLicenciaMod = so;
        this.bandMod = false;
        this.activeTabIndex = 1;  // Verifica la Posesion de la Pestaña para activarla. -- Ver Constantes       
        return null;

    }
    
    
    // Buscar Licencia
    public ArrayList<Licencia> doBuscarLicenciaFuncionamiento() {
        
        this.arrBusLicencia = new ArrayList<Licencia>();
        this.arrBusLicencia = Licencia.BuscarLicenciaFuncionamiento(objLicenciaBusq);
        return this.arrBusLicencia;
        
    }
    
    public String getSizeRegistrosBusLicencia() {
        if (this.arrBusLicencia == null) {
            return "0";
        } else {
            return "" + this.arrBusLicencia.size();
        }
    }
    
    
      //--------------------Desactivar cuando se ejecuta evento de cancelar -------------------------------------------------
   
      public String desactivarEditarLicencia() {

        this.bandMod = true;
        if (puntAnt.compareTo("2") == 0) {
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {

            if (puntAnt.compareTo("1") == 0) {

                this.activeTabIndex = Constantes.TAB_MODIFICAR;
                
            }
        }

        Mensaje.guardarMensajeExito("Cancelar, Editar Licencia !!!", "Licencias");

        return null;
    }


    
     public void onClickBusq(ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();

    }
    
}
