/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author Administrador
 */
public class Download implements Serializable {
    
  
    
   private StreamedContent file;
   private String id_legajo;
   private String nombre_archivo;

   
    public StreamedContent getFile() {
        return file;
    }

    public void setFile(StreamedContent file) {
        this.file = file;
    }

    public String getId_legajo() {
        return id_legajo;
    }

    public void setId_legajo(String id_legajo) {
        this.id_legajo = id_legajo;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }


    
  
   
 
}
