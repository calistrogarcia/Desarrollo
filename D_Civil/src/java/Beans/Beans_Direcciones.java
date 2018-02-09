/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Direccion;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.event.ActionEvent;
import utils.Mensaje;

/**
 *
 * @author Administrador
 */
//@Named(value = "Beans_Direcciones")
//@Dependent
public class Beans_Direcciones  implements Serializable{

 
    private Direccion objRegistrarDirecciones;
    private Direccion objBuscarDirecciones;
    private ArrayList<Direccion> arrDirecciones = null;
    private ArrayList<Direccion> arrBusDirecciones = null;
    
    private Integer activeTabIndex;
    private boolean bandVer = true;
    private boolean bandMod = true;
    private boolean bandEli = true;
    private boolean bandAsignar = true;
    private String puntAnt;

   
    
    
    
    public Direccion getObjRegistrarDirecciones() {
        return objRegistrarDirecciones;
    }

    public void setObjRegistrarDirecciones(Direccion objRegistrarDirecciones) {
        this.objRegistrarDirecciones = objRegistrarDirecciones;
    }

    public Direccion getObjBuscarDirecciones() {
        return objBuscarDirecciones;
    }

    public void setObjBuscarDirecciones(Direccion objBuscarDirecciones) {
        this.objBuscarDirecciones = objBuscarDirecciones;
    }

    public ArrayList<Direccion> getArrDirecciones() {
        return arrDirecciones;
    }

    public void setArrDirecciones(ArrayList<Direccion> arrDirecciones) {
        this.arrDirecciones = arrDirecciones;
    }

    public ArrayList<Direccion> getArrBusDirecciones() {
        return arrBusDirecciones;
    }

    public void setArrBusDirecciones(ArrayList<Direccion> arrBusDirecciones) {
        this.arrBusDirecciones = arrBusDirecciones;
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

    public boolean isBandAsignar() {
        return bandAsignar;
    }

    public void setBandAsignar(boolean bandAsignar) {
        this.bandAsignar = bandAsignar;
    }

    public String getPuntAnt() {
        return puntAnt;
    }

    public void setPuntAnt(String puntAnt) {
        this.puntAnt = puntAnt;
    }
    
    
    
  // Inicializaciones
    
    
     public void doiniciarObjBusDirecciones() {

        this.objBuscarDirecciones = new Direccion();

    }
    public void doiniciarRegistroDirecciones() {

        this.objRegistrarDirecciones = new Direccion();
    }

    public void doiniciarBusquedaDirecciones() {
        this.arrBusDirecciones = new ArrayList<Direccion>();
        this.objBuscarDirecciones = new Direccion();

    }
    
    
    public Beans_Direcciones() {
   
    doiniciarObjBusDirecciones();
    doiniciarRegistroDirecciones();
    
    
    }
    
    
      public String doRegDirecciones(Direccion var_listadodirecciones) {

        try {

            if (Direccion.registrarDireccion(var_listadodirecciones)) {

                Mensaje.guardarMensajeExito("Registrar Supervisor", "Registrado Correctamente");
                this.doiniciarRegistroDirecciones();

            } else {
                Mensaje.manejarError("Registrar Supervisor", "Error de Registro, Verificar Algoritmo");
            }
        } catch (Exception e) {
            Mensaje.manejarError(e, "Registrar Supervisor");
        }
        return null;

    }
    
    
    
    
    
     public ArrayList<Direccion> doBuscarDirecciones() {

        this.arrBusDirecciones = new ArrayList<Direccion>();
        this.arrBusDirecciones = Direccion.getBuscaDirecciones(objBuscarDirecciones);

        return this.arrBusDirecciones;

    }
     
      public String getSizeRegistrosDirecciones() {

        if (this.arrDirecciones == null) {
            return "0";
        } else {
            return "" + this.arrDirecciones.size();
        }
    }

    public String getSizeRegistrosBusDirecciones() {

        if (this.arrBusDirecciones == null) {
            return "0";
        } else {
            return "" + this.arrBusDirecciones.size();
        }
    }
    
    
       public void onClickBusq(ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();

    }
    
}
