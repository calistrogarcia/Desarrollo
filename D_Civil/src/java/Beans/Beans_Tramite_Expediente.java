/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Documento;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import utils.Constantes;
import utils.Mensaje;

/**
 *
 * @author Administrador
 */
public class Beans_Tramite_Expediente {
  
    private Documento objDocumentoReg;
    private Documento objDocumentoMod;
    private Documento objDocumentoDetalle;
    private Documento objEliminaDocumento;
    private Documento objBuscarDocumento;
    private ArrayList<Documento> arrDocumento=null;
    private ArrayList<Documento> arrBusDocumento=null;
    
    //TabView
    private Integer activeTabIndex;
    private boolean bandVer=true;    
    private boolean bandMod=true;
    private boolean bandEli=true;
    private String Numero_exepdiente ; // Numero de Expediente para Generar reporte de Documentos Expost
    private String tipo;               // Tipo 1 para Documento

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
// Radio
     
    private String tipo_itse;
    
    private List<String> nombre_tipo_itse, nombre_tipo_acto, periodo_vigencia; 

    public String getTipo_itse() {
        return tipo_itse;
    }

    public void setTipo_itse(String tipo_itse) {
        this.tipo_itse = tipo_itse;
    }

    public List<String> getNombre_tipo_itse() {
        return nombre_tipo_itse;
    }

    public void setNombre_tipo_itse(List<String> nombre_tipo_itse) {
        this.nombre_tipo_itse = nombre_tipo_itse;
    }

    public List<String> getNombre_tipo_acto() {
        return nombre_tipo_acto;
    }

    public void setNombre_tipo_acto(List<String> nombre_tipo_acto) {
        this.nombre_tipo_acto = nombre_tipo_acto;
    }

    public List<String> getPeriodo_vigencia() {
        return periodo_vigencia;
    }

    public void setPeriodo_vigencia(List<String> periodo_vigencia) {
        this.periodo_vigencia = periodo_vigencia;
    }
    
   
     
   @PostConstruct
   
    public void init() {
        nombre_tipo_itse = new ArrayList<String>();
        nombre_tipo_acto = new ArrayList<String>();
        periodo_vigencia = new ArrayList<String>();
        
        nombre_tipo_itse.add("BASICO EX POST");
        nombre_tipo_itse.add("BASICO EX ANTE");
        nombre_tipo_itse.add("DE DETALLE");
        
        nombre_tipo_acto.add("RESOLUCION");
        nombre_tipo_acto.add("OFICIO");
        nombre_tipo_acto.add("CARTA");
        
        periodo_vigencia.add("INDETERMINADO");
        periodo_vigencia.add("DOS AÑOS");
  
    }
    
    public String getNumero_exepdiente() {
        return Numero_exepdiente;
    }

    public void setNumero_exepdiente(String Numero_exepdiente) {
        this.Numero_exepdiente = Numero_exepdiente;
    }
    
   //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;


    public Documento getObjDocumentoReg() {
        return objDocumentoReg;
    }

    public void setObjDocumentoReg(Documento objDocumentoReg) {
        this.objDocumentoReg = objDocumentoReg;
    }

  
    public Documento getObjDocumentoMod() {
        return objDocumentoMod;
    }

    public void setObjDocumentoMod(Documento objDocumentoMod) {
        this.objDocumentoMod = objDocumentoMod;
    }

    public Documento getObjDocumentoDetalle() {
        return objDocumentoDetalle;
    }

    public void setObjDocumentoDetalle(Documento objDocumentoDetalle) {
        this.objDocumentoDetalle = objDocumentoDetalle;
    }

    public Documento getObjEliminaDocumento() {
        return objEliminaDocumento;
    }

    public Documento getObjBuscarDocumento() {
        return objBuscarDocumento;
    }

    public void setObjBuscarDocumento(Documento objBuscarDocumento) {
        this.objBuscarDocumento = objBuscarDocumento;
    }

    public void setObjEliminaDocumento(Documento objEliminaDocumento) {
        this.objEliminaDocumento = objEliminaDocumento;
    }

    public ArrayList<Documento> getArrDocumento() {
        return arrDocumento;
    }

    public void setArrDocumento(ArrayList<Documento> arrDocumento) {
        this.arrDocumento = arrDocumento;
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

    public ArrayList<Documento> getArrBusDocumento() {
        return arrBusDocumento;
    }

    public void setArrBusDocumento(ArrayList<Documento> arrBusDocumento) {
        this.arrBusDocumento = arrBusDocumento;
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
//Iniciallzaciones
    public void doiniciarListadoDocumento(){        
        arrDocumento = new ArrayList<Documento>();
        
        
    }
//Iniciallzaciones
    public void doiniciarBusquedaDocumento(){        
        this.arrBusDocumento = new ArrayList<Documento>();
        this.objBuscarDocumento= new Documento();  
    }

    public String getPuntAnt() {
        return puntAnt;
    }

    public void setPuntAnt(String puntAnt) {
        this.puntAnt = puntAnt;
    }
    
    
    public void doiniciarRegistroDocumento(){
        this.objDocumentoReg=new Documento();
    }
    public void doiniciarObjBusDocumento(){
        this.objBuscarDocumento=new Documento();
    }
    
    public void doiniciarModificarDocumento(){
        this.objDocumentoMod=new Documento();
    }
      public void doiniciarEliminarDocumento(){
        this.objEliminaDocumento=new Documento();
    }
    
    
    
    public Beans_Tramite_Expediente() {
    

      try
        {
            doiniciarRegistroDocumento();
            doiniciarObjBusDocumento(); 
        }
        catch(Exception e )
        {
            Mensaje.manejarError(e,"Error al Iniciar Proceso");
        }     
          
    }

    
 /*   public String doRegDocumento(){    
     try{    
       if(Documento.registarasistencia(objDocumentoReg)){
Mensaje.guardarMensajeExito
("Registrar Documento",
"Registrado Correctamente");
this.doiniciarRegistroDocumento();
       }
       else{
 Mensaje.manejarError
("Registrar Documento","Error de Registro");                    
     }
         
      }catch(Exception e ){
 Mensaje.manejarError(e,"Registrar Documento");   
      }
          
     return null;
        
 }
       */
    

public ArrayList<Documento> doListarDocumento(){   
    this.doiniciarListadoDocumento();            
    //Lista Documento
  // this.arrDocumento=Documento.getBuscaExpedientesPorcodigo(objBuscarDocumento);
    return this.arrDocumento;    
}



public ArrayList<Documento> doBuscarDocumento(){   
    this.arrBusDocumento = new ArrayList<Documento>();
    //Lista Documento
  //this.arrBusDocumento=Documento.getBuscarDocumentoParametro(objBuscarDocumento); // revisar 
    this.arrBusDocumento=Documento.getTramiteConsultarExpediente(objBuscarDocumento);
  
    return this.arrBusDocumento;    
}

public String getSizeRegistrosDocumento() {
 if(this.arrDocumento==null){
      return "0";
    }            
 else{return "" + this.arrDocumento.size();
    }             
 }  
public String getSizeRegistrosBusDocumento() {
 if(this.arrBusDocumento==null){
      return "0";
    }            
 else{return "" + this.arrBusDocumento.size();
    }             
 }  

 public String doDesactivaTabReg(){               
       this.activeTabIndex=1;       
       this.doiniciarRegistroDocumento();
       return null;
    }
     public String mostrarDetalleDocumento(Documento sg){   
        this.objDocumentoDetalle=sg;
        this.bandVer=false;        
        this.activeTabIndex=3; //3
        //Hace Visible el Formulario para Mostrar Detalle                 
        return null;   
    } 
      public String eliminarDocumento(Documento wo){     
        this.objEliminaDocumento=wo;          
        this.activeTabIndex=5;        
        this.bandEli=false;   
        return null;   
    }
      
       
 //Modificar    
      
        public String modificarDocumento(Documento so){        
        this.doiniciarModificarDocumento();
        this.objDocumentoMod=so;  
        this.bandMod=false;
        this.activeTabIndex=1;  // Verifica la Posesion de la Pestaña para activarla. en total Hay Iten 6-- Ver Constantes       
        return null;          
    }
        
        
 public String desactivaTabVer(){               
       this.bandVer=true;
       //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
       if(puntAnt.compareTo("1")==0){
           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
       }
       else{
           if(puntAnt.compareTo("2")==0){
            
               this.activeTabIndex=Constantes.TAB_ELIMINAR;
           }
       }
       return null;
       
    }
 
 
 public String desactivaTabMod(){        
       this.bandMod=true;
       //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
     
       
       if(puntAnt.compareTo("2")==0){
           this.doBuscarDocumento();
           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
       }
       else{
           if(puntAnt.compareTo("1")==0){    
               // this.doListarDocumento();
               
                this.doiniciarModificarDocumento();
                this.activeTabIndex=Constantes.TAB_MODIFICAR;

                //this.activeTabIndex=Constantes.TAB_ELIMINAR;
                
           }
       }
      Mensaje.guardarMensajeExito("Cancelar la Modificación de Documento !!!","Documento");                   
       
       return null;
    }
 public String desactivaTabElim(){        
        this.bandEli=true;
       //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
       if(puntAnt.compareTo("1")==0){
           this.doBuscarDocumento();
           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
       }
      
       else{
           if(puntAnt.compareTo("2")==0){    
               this.doListarDocumento();
               this.activeTabIndex=Constantes.TAB_ELIMINAR;
           }
       } 
      Mensaje.guardarMensajeExito("Cancelar la Eliminaciòn de Documento !!!","Documento");                          
      return null;
    }
public String doModDocumento(){    
    this.bandMod=true;
    /* 
    try{    
       if(Documento.MoficardatosParaDocumento(objDocumentoMod)){            
                Mensaje.guardarMensajeExito("Actualizar Documento","Actualizado Correctamente");
       }
       else{
                Mensaje.manejarError("Actualizar Documento","Error de Modificacion");                    
        }         
      }catch(Exception e ){
                Mensaje.manejarError(e,"Actualizar Documento");   
      }
    
    */
      if(puntAnt.compareTo("1")==0){
           this.doBuscarDocumento();
           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
       }
       else{
           if(puntAnt.compareTo("2")==0){    
               this.doListarDocumento();
               this.activeTabIndex=Constantes.TAB_ELIMINAR;
           }
       }    
     return null;
 }

/*
public String doEliDocumento(){    
     
    this.bandEli=true;
    try{    
      
          if(Documento.eliminarDocumento(objEliminaDocumento)){               
              Mensaje.guardarMensajeExito("Eliminar Documento","Eliminar Correctamente");
       }
       else{
              Mensaje.manejarError("Actualizar Documento","Error de Modificacion");                    
        }     
      }catch(Exception e ){
            Mensaje.manejarError(e,"Actualizar Documento");   
      }
        if(puntAnt.compareTo("2")==0){
           this.doBuscarDocumento(); 
           this.activeTabIndex=Constantes.TAB_BUSQUEDA;
       }
       else{
           if(puntAnt.compareTo("1")==0){    
               this.doListarDocumento();
               this.activeTabIndex=Constantes.TAB_ELIMINAR;
           }
       }       
     return null;
 }

*/
  public void onClickBusq(ActionEvent evt){ 
        Object param=evt.getComponent().getAttributes().get("param");
        this.puntAnt=param.toString();  
        
    }
    
 
    public void verReporteDefensaCivilDocumento() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, JRException, IOException {
       
        Connection conexion;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conexion = DriverManager.getConnection("jdbc:sqlserver://192.168.0.202;databaseName=integralsmp", "sa","mdsmp*2017");

        //Instancia hacia la clase reporte     

        HashMap<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("EXPEDIENTE", this.Numero_exepdiente) ;
        parametros.put("TIPO", this.tipo) ;
        
        File jasper = new File (FacesContext.getCurrentInstance().getExternalContext().getRealPath("/reporte/Documento.DefensaCivil.jasper"));
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion );
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.addHeader("Content-disposition", "attachment; filename=Documento.DefensaCivil.pdf");
        ServletOutputStream  stream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
  
            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();
                    
    }
     
    
      public void verReporteDefensaCivilResolucion() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, JRException, IOException {
       
        Connection conexion;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conexion = DriverManager.getConnection("jdbc:sqlserver://192.168.0.202;databaseName=integralsmp", "sa","mdsmp*2017");

        //Instancia hacia la clase reporte     

         HashMap<String, Object> parametros = new HashMap<String, Object>();
   
        parametros.put("EXPEDIENTE_RESOLUCION", this.Numero_exepdiente) ;
        File jasper = new File (FacesContext.getCurrentInstance().getExternalContext().getRealPath("/reporte/Resolucion_DefensaCivil.jasper"));
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion );
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.addHeader("Content-disposition", "attachment; filename=Resolucion_DefensaCivil.pdf");
        ServletOutputStream  stream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
  
            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();
                    
    }
  
   public void verReporteDefensaCivilResolucion_Improcedente() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, JRException, IOException {
       
        Connection conexion;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conexion = DriverManager.getConnection("jdbc:sqlserver://192.168.0.202;databaseName=integralsmp", "sa","mdsmp*2017");

        //Instancia hacia la clase reporte     

         HashMap<String, Object> parametros = new HashMap<String, Object>();
   
        parametros.put("RESOLUCION_IMPROCEDENTE", this.Numero_exepdiente) ;
        File jasper = new File (FacesContext.getCurrentInstance().getExternalContext().getRealPath("/reporte/Resolucion_improcedente_DefensaCivil.jasper"));
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion );
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.addHeader("Content-disposition", "attachment; filename=Resolucion_improcedente_DefensaCivil.pdf");
        ServletOutputStream  stream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
  
            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();
                    
    }
      
      
  

    
}
