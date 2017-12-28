/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Certificado;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import Modelo.Cuenta;
import java.util.ArrayList;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Administrador
 */
//@Named(value = "beansDetalle_Economico")
//@ViewScoped
public class BeansDetalle_Economico {

   
    
    private Cuenta objBuscarDetalle_economico;
    private ArrayList<Cuenta> arrDetalle_economico = null;
    private ArrayList<Cuenta> arrBusDetalle_economico = null;
    private boolean bandVer = true;
    private boolean bandMod = true;
    private boolean bandEli = true;
    private String puntAnt;

   
    public Cuenta getObjBuscarDetalle_economico() {
        return objBuscarDetalle_economico;
    }

    public void setObjBuscarDetalle_economico(Cuenta objBuscarDetalle_economico) {
        this.objBuscarDetalle_economico = objBuscarDetalle_economico;
    }

    public ArrayList<Cuenta> getArrDetalle_economico() {
        return arrDetalle_economico;
    }

    public void setArrDetalle_economico(ArrayList<Cuenta> arrDetalle_economico) {
        this.arrDetalle_economico = arrDetalle_economico;
    }

    public ArrayList<Cuenta> getArrBusDetalle_economico() {
        return arrBusDetalle_economico;
    }

    public void setArrBusDetalle_economico(ArrayList<Cuenta> arrBusDetalle_economico) {
        this.arrBusDetalle_economico = arrBusDetalle_economico;
    }

    public String getPuntAnt() {
        return puntAnt;
    }

    public void setPuntAnt(String puntAnt) {
        this.puntAnt = puntAnt;
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
    
    
    
    // Inicializando Objetos.--
    
    public void doiniciarObjBusqDetalle_Economico(){
        
        objBuscarDetalle_economico = new Cuenta();
        
    }
    
     public void doiniciarBusquedaDetalle_economico() {
        this.arrDetalle_economico = new ArrayList<Cuenta>();
        this.objBuscarDetalle_economico = new Cuenta();

    }
     
     
    public ArrayList<Cuenta> doBuscarDetalle_Economico() {

        this.arrBusDetalle_economico = new ArrayList<Cuenta>();
        this.arrBusDetalle_economico = Cuenta.getConsulta_Cuenta(objBuscarDetalle_economico);

        return this.arrBusDetalle_economico;

    }
    
 
    public BeansDetalle_Economico() {
        
        doiniciarBusquedaDetalle_economico();
        doBuscarDetalle_Economico();
    
    }
    
    
     public void onClickBusq(ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();

    }

    
    
}
