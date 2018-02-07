/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Asunto;
import Modelo.Expediente;
import Modelo.Grupo;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.persistence.criteria.Selection;
import utils.Mensaje;

/**
 *
 * @author Administrador
 */
public class Beans_Tramite_Registro_Expedientes implements Serializable {

    
    private Expediente objRegistroExpediente;
    private Expediente objModificarExpediente;
    private Expediente objBuscarExpediente;
    private ArrayList<Expediente> arrayExpediente = null;
    private ArrayList<Expediente> arrayBusquedaExpediente = null;   
    private ArrayList<SelectItem> tipo_documento_expediente= null;
    
    
    private String codigo_asunto;
    
    private Integer activeTabIndex;
    private boolean banderaVer = true;
    private boolean banderaModificar = true;
    private boolean banderaEliminar = true;
    private String  evento;
    
    
    @ManagedProperty(value = "#{beans_Tramite_Asunto}")
    private Beans_Tramite_Asunto beans_Tramite_Asunto =  new Beans_Tramite_Asunto();


    
    public Expediente getObjRegistroExpediente() {
        return objRegistroExpediente;
    }

    public void setObjRegistroExpediente(Expediente objRegistroExpediente) {
        this.objRegistroExpediente = objRegistroExpediente;
    }

    public Expediente getObjModificarExpediente() {
        return objModificarExpediente;
    }

    public void setObjModificarExpediente(Expediente objModificarExpediente) {
        this.objModificarExpediente = objModificarExpediente;
    }

    public Expediente getObjBuscarExpediente() {
        return objBuscarExpediente;
    }

    public void setObjBuscarExpediente(Expediente objBuscarExpediente) {
        this.objBuscarExpediente = objBuscarExpediente;
    }

    public ArrayList<Expediente> getArrayExpediente() {
        return arrayExpediente;
    }

    public void setArrayExpediente(ArrayList<Expediente> arrayExpediente) {
        this.arrayExpediente = arrayExpediente;
    }

    public ArrayList<Expediente> getArrayBusquedaExpediente() {
        return arrayBusquedaExpediente;
    }

    public void setArrayBusquedaExpediente(ArrayList<Expediente> arrayBusquedaExpediente) {
        this.arrayBusquedaExpediente = arrayBusquedaExpediente;
    }

    public Integer getActiveTabIndex() {
        return activeTabIndex;
    }

    public void setActiveTabIndex(Integer activeTabIndex) {
        this.activeTabIndex = activeTabIndex;
    }

    public boolean isBanderaVer() {
        return banderaVer;
    }

    public void setBanderaVer(boolean banderaVer) {
        this.banderaVer = banderaVer;
    }

    public boolean isBanderaModificar() {
        return banderaModificar;
    }

    public void setBanderaModificar(boolean banderaModificar) {
        this.banderaModificar = banderaModificar;
    }

    public boolean isBanderaEliminar() {
        return banderaEliminar;
    }

    public void setBanderaEliminar(boolean banderaEliminar) {
        this.banderaEliminar = banderaEliminar;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getCodigo_asunto() {
        return codigo_asunto;
    }

    public void setCodigo_asunto(String codigo_asunto) {
        this.codigo_asunto = codigo_asunto;
    }

    public Beans_Tramite_Asunto getBeans_Tramite_Asunto() {
        return beans_Tramite_Asunto;
    }

    public void setBeans_Tramite_Asunto(Beans_Tramite_Asunto beans_Tramite_Asunto) {
        this.beans_Tramite_Asunto = beans_Tramite_Asunto;
    }

 

    //Inicializaciones
    public void doiniciarRegistroExpediente() {
        this.objRegistroExpediente = new Expediente();
    }

    //Iniciallzaciones
    public void doiniciarModificarExpediente() {
        this.objModificarExpediente= new Expediente();
    }

    //Iniciallzaciones  
    public void doiniciarObjBuscarExpediente() {
        this.objBuscarExpediente = new Expediente();
    }

    //Iniciallzaciones
    public void doiniciarBusquedaExpediente() {
        this.arrayBusquedaExpediente= new ArrayList<Expediente>();
        this.objBuscarExpediente = new Expediente();

    }
    
    
    public Beans_Tramite_Registro_Expedientes() {
   
    doiniciarRegistroExpediente();  
    doiniciarBusquedaExpediente();
    
    
    }
    
    
     public String doRegistrarExpediente() {

        try {

            if (Expediente.registrar_expediente(objRegistroExpediente)) {
                Mensaje.manejarError("Registrar Expediente", "Error de Registro, Verificar Algoritmo");
            } else {
                
                Mensaje.guardarMensajeExito("Registrar Expediente", "Registrado Correctamente");
                this.doiniciarRegistroExpediente();
            }
        } catch (Exception e) {
            Mensaje.manejarError(e, "Registrar Expediente");
        }
        return null;

    }
       
     // para cargar informacion en un combo.
     
    public ArrayList<SelectItem> getTipo_documento_expediente() {
       
     
        if (tipo_documento_expediente== null) {              
            tipo_documento_expediente= new ArrayList<>();     
          Grupo Dao = new Grupo();    
          try {
        
          for(Grupo Obj: Dao.CargarTipoDocumento_Expediente()){            
              SelectItem s = new SelectItem(Obj.getCodigo_tipo_documento_expediente(), Obj.getNombre_tipo_documento_expediente());
              tipo_documento_expediente.add(s);             
             } 
          }catch (SQLException ex) {             
            System.out.println("Error en el metodo por: " + ex.getMessage());            
            ex.printStackTrace();   
          }  
        }
          
        return tipo_documento_expediente;
    }
    
    public void CargarAsunto_Expediente() throws SQLException {

       beans_Tramite_Asunto.cargarAsuntoExpediente(codigo_asunto);
      
    }
    
    public void onClickBusq(ActionEvent evt) {

        Object parametro_evento = evt.getComponent().getAttributes().get("param");
        this.evento = parametro_evento.toString();

    }
    
    
    
    
    
}
