/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.ArrayList;
import java.util.List;
import utils.Constantes;
import utils.Mensaje;
import java.sql.Connection;
import java.sql.DriverManager;
import Modelo.Multa;
import Modelo.Sancion;

import Modelo.Supervisor;
import Modelo.Asignar;
import Modelo.Certificado;
import static com.sun.faces.el.FacesCompositeELResolver.ELResolverChainType.Faces;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;
import utils.Constantes;
import utils.Mensaje;
import org.primefaces.model.UploadedFile;
import Modelo.Controlador_Sql;
import java.io.IOException;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.CallableStatement;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrador
 */
public class Beans_Fiscalizacion_Multas {

    private Multa objMultaReg;
    private Multa objMultaMod;
    private Multa objMultaBusq;
    private Multa ObjMultaBuqInfractor;
    
  
    private ArrayList<Multa> arrMulta = null;
    private ArrayList<Multa> arrBusMulta = null;
    private ArrayList<Multa> arrMultaInfractor = null;
    private ArrayList<Multa> arrBusMultaInfractor = null;
   

    //TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;
    private boolean bandMod = true;
    private boolean bandEli = true;

    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Multa getObjMultaReg() {
        return objMultaReg;
    }

    public void setObjMultaReg(Multa objMultaReg) {
        this.objMultaReg = objMultaReg;
    }

    public Multa getObjMultaMod() {
        return objMultaMod;
    }

    public void setObjMultaMod(Multa objMultaMod) {
        this.objMultaMod = objMultaMod;
    }

    public Multa getObjMultaBusq() {
        return objMultaBusq;
    }

    public void setObjMultaBusq(Multa objMultaBusq) {
        this.objMultaBusq = objMultaBusq;
    }

    public ArrayList<Multa> getArrMulta() {
        return arrMulta;
    }

    public void setArrMulta(ArrayList<Multa> arrMulta) {
        this.arrMulta = arrMulta;
    }

    public ArrayList<Multa> getArrBusMulta() {
        return arrBusMulta;
    }

    public void setArrBusMulta(ArrayList<Multa> arrBusMulta) {
        this.arrBusMulta = arrBusMulta;
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

    public Multa getObjMultaBuqInfractor() {
        return ObjMultaBuqInfractor;
    }

    public void setObjMultaBuqInfractor(Multa ObjMultaBuqInfractor) {
        this.ObjMultaBuqInfractor = ObjMultaBuqInfractor;
    }

    public ArrayList<Multa> getArrMultaInfractor() {
        return arrMultaInfractor;
    }

    public void setArrMultaInfractor(ArrayList<Multa> arrMultaInfractor) {
        this.arrMultaInfractor = arrMultaInfractor;
    }

    public ArrayList<Multa> getArrBusMultaInfractor() {
        return arrBusMultaInfractor;
    }

    public void setArrBusMultaInfractor(ArrayList<Multa> arrBusMultaInfractor) {
        this.arrBusMultaInfractor = arrBusMultaInfractor;
    }


    //Inicializaciones
    public void doiniciarRegistroMulta() {
        this.objMultaReg = new Multa();
    }

    //Iniciallzaciones
    public void doiniciarModificarMulta() {
        this.objMultaMod = new Multa();
    }

    //Iniciallzaciones  
    public void doiniciarObjBusMulta() {
        this.objMultaBusq = new Multa();
    }


    //Iniciallzaciones
    public void doiniciarBusquedaMulta() {
        this.arrBusMulta = new ArrayList<Multa>();
        this.objMultaBusq = new Multa();

    }
    
  //Iniciallzaciones  
    public void doiniciarObjBusMultaInfractor() {
        this.ObjMultaBuqInfractor = new Multa();
    }
    
    
    //Iniciallzaciones
    public void doiniciarBusquedaMultaInfractor() {
        this.arrBusMultaInfractor = new ArrayList<Multa>();
        this.ObjMultaBuqInfractor = new Multa();

    }
    
    
    //Iniciallzaciones
    public void doiniciarListadoMulta() {
        arrMulta = new ArrayList<Multa>();
    }
    
    
    //Iniciallzaciones
    public void doiniciarListadoInfractorMulta() {
        arrMultaInfractor = new ArrayList<Multa>();
    }

    public Beans_Fiscalizacion_Multas() {

        try {
            doiniciarBusquedaMulta();
            doiniciarRegistroMulta();
            doiniciarModificarMulta();
            doiniciarBusquedaMultaInfractor();
            

        } catch (Exception e) {
            Mensaje.manejarError(e, "Error al Iniciar Proceso");

        }

    }

    public String doRegMulta() {

        try {

            if (Multa.registrarMulta(objMultaReg)) {

                Mensaje.guardarMensajeExito("Registrar Multa", "Registrado Correctamente");
                this.doiniciarRegistroMulta();
            } else {
                Mensaje.manejarError("Registrar Multa", "Error de Registro, Verificar Algoritmo");
            }
        } catch (Exception e) {
            Mensaje.manejarError(e, "Registrar Supervisor");
        }
        return null;

    }

    public String doEditarMulta() {

        this.bandMod = true;
        try {
            if (Multa.EditarMulta(objMultaMod)) {
                Mensaje.guardarMensajeExito("Actualizar Multa Administrativa", "Actualizado Correctamente");
            } else {
                Mensaje.manejarError("Actualizar Multa Administrativa", "Error de Modificacion");
            }
        } catch (Exception e) {
            Mensaje.manejarError(e, "Actualizar Multa Administrativa");
        }
        if (puntAnt.compareTo("1") == 0) {
           // this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("2") == 0) {
                //  this.doListarCertificado();
                this.activeTabIndex = Constantes.TAB_BUSQUEDA;
            }
        }
        return null;
    }

    // comand link   
    public String modificarCertificado(Multa so) {

        this.doiniciarModificarMulta();
        this.objMultaMod = so;
        this.bandMod = false;
        this.activeTabIndex = 1;  // Verifica la Posesion de la Pestaña para activarla. -- Ver Constantes       
        return null;

    }

    public ArrayList<Multa> doBuscarMulta() {

        this.arrBusMulta = new ArrayList<Multa>();
        this.arrBusMulta = Multa.BuscarMultaAdministrativa(objMultaBusq);
        return this.arrBusMulta;

    }

    public String getSizeRegistrosBusMulta() {
        if (this.arrBusMulta == null) {
            return "0";
        } else {
            return "" + this.arrBusMulta.size();
        }
    }
    
    
   // Buscar Direccion de Infractor
      
    public ArrayList<Multa> doBuscarInfractorMulta() {

        this.arrBusMultaInfractor = new ArrayList<Multa>();
        this.arrBusMultaInfractor = Multa.BuscarInfractor(ObjMultaBuqInfractor);
        return this.arrBusMultaInfractor;

    }

    public String getSizeRegistrosBusInfractroMulta() {
        if (this.arrBusMultaInfractor == null) {
            return "0";
        } else {
            return "" + this.arrBusMultaInfractor.size();
        }
    }
    
    

    
   //--------------------Desactivar cuando se ejecuta evento de cancelar -------------------------------------------------
   
    
    public String desactivarEditarMulta() {

        this.bandMod = true;

        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
        if (puntAnt.compareTo("2") == 0) {

           // this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {

            if (puntAnt.compareTo("1") == 0) {
                // this.doListarCertificado();

                //this.doiniciarModificarCertificado();
                this.activeTabIndex = Constantes.TAB_MODIFICAR;

                //this.activeTabIndex=Constantes.TAB_ELIMINAR;
            }
        }

        Mensaje.guardarMensajeExito("Cancelar, Editar Multa !!!", "Multa Administrativa");

        return null;
    }
    
    // Metodo para autocompletar
    
    
    public List<String> autoCompletarBusqueda(String query) {
        List<String> resultado = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            resultado.add(query + i);
        }
         
        return resultado;
    }
    
    

    public void onClickBusq(ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();

    }

}
