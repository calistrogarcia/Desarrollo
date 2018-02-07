/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Controlador_Sql;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Administrador
 */
@Named(value = "beans_DefensaCivil_Download")

@ManagedBean
//@SessionScoped
public class Beans_DefensaCivil_Download implements Serializable {

  
   private StreamedContent file;
   private int codigo;

    public StreamedContent getFile() {
        return file;
    }

    public void setFile(StreamedContent file) {
        this.file = file;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
    
    public void download(){
       
        ResultSet rs;
        
        try {
            
            Connection conexion = null;
            conexion = Controlador_Sql.darConexionBD();
             
             
            PreparedStatement st= conexion.prepareStatement("select archivo  from legajo where id_archivo= (?)");
            st.setInt(1, codigo);
         
            rs=st.executeQuery();
        while (rs.next()){
          //InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("archivo");
          InputStream stream = (rs.getBinaryStream("archivo"));
           file = new DefaultStreamedContent(stream,"image/jpg","descarga.jpg");
   
        }
        conexion.close();
        
        FacesMessage message = new FacesMessage("Succesful", " Archivo Descargado");
        FacesContext.getCurrentInstance().addMessage(null, message);  
           
            
         } catch (Exception e){
        
        FacesMessage message = new FacesMessage("Error de Conexion");
        FacesContext.getCurrentInstance().addMessage(null, message);  
         }
   }
    
    
    public void ver_download(){
        
        
         ResultSet rs;
         
         try {
        
             byte[] bytes=null;  
 
                 Connection conexion = null;
                 conexion = Controlador_Sql.darConexionBD();
             
                 PreparedStatement st= conexion.prepareStatement("select archivo  from legajo where id_legajo= (?)");
                 st.setInt(1, codigo);
         
                rs=st.executeQuery();
                while (rs.next()){
                bytes = rs.getBytes("archivo");
               }
               conexion.close();
        
                FacesMessage message = new FacesMessage("Succesful", " Fue Descargado");
                FacesContext.getCurrentInstance().addMessage(null, message);     
                HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
                response.getOutputStream().write(bytes);
                response.setContentType("application/pdf");
                response.addHeader("Content-Type", "application/pdf");
                response.setContentType("application/doc");
                response.addHeader("Content-Type", "application/doc");
                response.getOutputStream().close();
                FacesContext.getCurrentInstance().responseComplete();
 
              } catch (Exception e){
        
        FacesMessage message = new FacesMessage("Error de Conexion");
        FacesContext.getCurrentInstance().addMessage(null, message);  
         }  
    }
    
    public Beans_DefensaCivil_Download() {
    }
    
}
