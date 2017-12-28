/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Certificado;
import Modelo.Controlador_Sql;
import Modelo.Expediente;
import Modelo.Reporte;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

@ManagedBean

/**
 *
 * @author *JUDITH* 10/04/17
 */

public class BeanExpediente_Reporte {

    
    
    // Variables Para Reporte Estado de Expedientes Ipse
    
    private String fecha_desde;
    private String fecha_hasta;

    
    
    public String getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(String fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public String getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(String fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }
    
 
    
    public BeanExpediente_Reporte() {  
        
        
    }
    
    //Metodo para invocar el reporte y enviarle los parametros si es que necesita
    public void verReporte1() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporteClientes        
        Reporte r1 = new Reporte();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reporte/Expediente_Por_Fecha.jasper");
       
        r1.getReporte(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    //REPORTE DE BUSQUEDA DE EXPEDIENTE 18/05/17
    public void verReporte2() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporte        
        Reporte r2 = new Reporte();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reporte/Expediente_Busqueda.jasper");
       
        r2.getReporte(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
     
   
 
    //REPORTE INGRESADO POR ASUNTO
    public void verReporte4() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporte        
        Reporte r3 = new Reporte();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reporte/Expediente_Por_Asunto.jasper");
       
        r3.getReporte(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
                                                /*19-05-17*/
    //REPORTE DE EXPEDIENTE RECEPCIONADO POR OFICINA
    public void verReporte5() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporte        
        Reporte r3 = new Reporte();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reporte/Recepcionado_Por_Oficina.jasper");
       
        r3.getReporte(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    
    //REPORTE DE EXPEDIENTE DESPACHADO POR OFICINA
    public void verReporte6() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporte        
        Reporte r3 = new Reporte();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reporte/Despachado_Por_Oficina.jasper");
       
        r3.getReporte(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    
    //REPORTE DE EXPEDIENTE RESUELTO POR OFICINA
    public void verReporte7() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporte        
        Reporte r3 = new Reporte();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reporte/Resuelto_Por_Oficina.jasper");
       
        r3.getReporte(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    //REPORTE DE EXPEDIENTE INGRESADO POR RECURRENTE
    public void verReporte8() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporte        
        Reporte r3 = new Reporte();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reporte/Expediente_Por_Recurrente.jasper");
       
        r3.getReporte(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    //REPORTE DE EXPEDIENTE DERIVADO POR GERENCIA
    public void verReporte9() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        //Instancia hacia la clase reporte        
        Reporte r3 = new Reporte();
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/reporte/Derivados_Por_Gerencia.jasper");
       
        r3.getReporte(ruta);        
        FacesContext.getCurrentInstance().responseComplete();               
    }
    
      
      public void imprimir() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, JRException, IOException {
       
        Connection conexion = null;
        conexion = Controlador_Sql.darConexionBD();
         
        //Instancia hacia la clase reporte     

        HashMap<String, Object> parametros = new HashMap <String, Object>();
        parametros.put("fecha_desde", this.fecha_desde);
        parametros.put("fecha_hasta", this.fecha_hasta) ;

        File jasper = new File (FacesContext.getCurrentInstance().getExternalContext().getRealPath("/Reporte/Reporte.DefensaCivil_EstadoIpse.jasper"));
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion );
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        response.addHeader("Content-disposition", "attachment; filename=Reporte.DefensaCivil_EstadoIpse.pdf");
        ServletOutputStream  stream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
        
            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();
                    
               
    }
     
      
}
