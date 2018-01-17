/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

//import javax.inject.Named;
import Modelo.Controlador_Sql;
import java.io.IOException;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Administrador
 */
@ManagedBean
//@Named(value = "beans_DefensaCivil_Upload")
@SessionScoped
public class Beans_DefensaCivil_Upload implements Serializable {

    private UploadedFile file;
    private String  expediente_id;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public String getExpediente_id() {
        return expediente_id;
    }

    public void setExpediente_id(String expediente_id) {
        this.expediente_id = expediente_id;
    }

  

    
     public void upload()  {
      
       try {
         if(file != null) {
            
            Connection conexion = Controlador_Sql.darConexionBD();
            PreparedStatement st= conexion.prepareStatement("{call dbo.sp_java_subir_archivos (?,?)}"); 
            st.setBinaryStream(1, file.getInputstream());
            st.setString(2, expediente_id);
             
            st.executeUpdate();
            conexion.close();
        
        
            FacesMessage message = new FacesMessage("Exito", file.getFileName() + " Fue Subido");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    } catch (Exception e){
        
        FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }
    
     
     
     }
    
    
    public Beans_DefensaCivil_Upload() {
    
    }
    
}

