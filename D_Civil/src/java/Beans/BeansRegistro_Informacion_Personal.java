/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Direccion;
import Modelo.Persona;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import org.primefaces.event.CloseEvent;
import utils.Mensaje;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author Administrador
 */

@ViewScoped

public class BeansRegistro_Informacion_Personal implements Serializable {

    private Persona objContribuyenteReg;
    private Persona objContribuyenteMod;
    private Persona objContribuyenteBusq;

  
    private ArrayList<Persona> arrContribuyente = null;
    private ArrayList<Persona> arrBusContribuyente = null;
    private ArrayList<Persona> ListaDirecciones=null;

    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;
    private boolean bandMod = true;
    private boolean bandEli = true;

    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;


    public Persona getObjContribuyenteReg() {
        return objContribuyenteReg;
    }

    public void setObjContribuyenteReg(Persona objContribuyenteReg) {
        this.objContribuyenteReg = objContribuyenteReg;
    }

    public Persona getObjContribuyenteMod() {
        return objContribuyenteMod;
    }

    public void setObjContribuyenteMod(Persona objContribuyenteMod) {
        this.objContribuyenteMod = objContribuyenteMod;
    }

    public Persona getObjContribuyenteBusq() {
        return objContribuyenteBusq;
    }

    public void setObjContribuyenteBusq(Persona objContribuyenteBusq) {
        this.objContribuyenteBusq = objContribuyenteBusq;
    }

    public ArrayList<Persona> getArrContribuyente() {
        return arrContribuyente;
    }

    public void setArrContribuyente(ArrayList<Persona> arrContribuyente) {
        this.arrContribuyente = arrContribuyente;
    }

    public ArrayList<Persona> getArrBusContribuyente() {
        return arrBusContribuyente;
    }

    public void setArrBusContribuyente(ArrayList<Persona> arrBusContribuyente) {
        this.arrBusContribuyente = arrBusContribuyente;
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

    public ArrayList<Persona> getListaDirecciones() {
        return ListaDirecciones;
    }

    public void setListaDirecciones(ArrayList<Persona> ListaDirecciones) {
        this.ListaDirecciones = ListaDirecciones;
    }
    

    //Inicializaciones
    public void doiniciarRegistroContribuyente() {
        this.objContribuyenteReg = new Persona();
    }

    //Iniciallzaciones
    public void doiniciarModificarContribuyente() {
        this.objContribuyenteMod = new Persona();
    }

    //Iniciallzaciones  
    public void doiniciarObjBusContribuyente() {
        this.objContribuyenteBusq = new Persona();
    }

    //Iniciallzaciones
    public void doiniciarBusquedaContribuyente() {
        this.arrBusContribuyente = new ArrayList<Persona>();
        this.objContribuyenteBusq = new Persona();

    }

    public BeansRegistro_Informacion_Personal() {

        doiniciarRegistroContribuyente();
        doiniciarBusquedaContribuyente();

    }

    public String doRegContribuyente() {

        try {

            if (Persona.RegistrarPersona(objContribuyenteReg)) {

                Mensaje.guardarMensajeExito("Registrar Contribuyente", "Registrado Correctamente");
                this.doiniciarRegistroContribuyente();
            } else {
                Mensaje.manejarError("Registrar Contribuyente", "Error de Registro, Verificar Algoritmo");
            }
        } catch (Exception e) {
            Mensaje.manejarError(e, "Registrar Contribuyente");
        }
        return null;

    }
    
    
     public ArrayList<Persona> doBuscarContribuyente() {

        this.arrBusContribuyente = new ArrayList<Persona>();
        this.arrBusContribuyente = Persona.BuscarContribuyente(objContribuyenteBusq);
        return this.arrBusContribuyente;

    }

    public String getSizeRegistrosBusContribuyente() {
        if (this.arrBusContribuyente == null) {
            return "0";
        } else {
            return "" + this.arrBusContribuyente.size();
        }
    }
      
    public void onClickBusq(ActionEvent evt) {

        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();

    }
    
    //---- Para cerrar Cuadros de Dialogo de Direccion-----------------------
    
     public void handleClose(CloseEvent event) {
        addMessage(event.getComponent().getId() + " closed", "So you don't like nature?");
    }
    
     public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
     
   //------------------------------------------------------------------------

    
     
     

}
