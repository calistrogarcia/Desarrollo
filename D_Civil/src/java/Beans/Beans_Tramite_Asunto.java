/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Asunto;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.model.SelectItem;

/**
 *
 * @author Administrador
 */
public class Beans_Tramite_Asunto implements Serializable {

    private ArrayList<SelectItem> asuntos_expedientes= null;
    

    public Beans_Tramite_Asunto() {
        
    }
  
      public void cargarAsuntoExpediente (String codigo_asunto) {
        
        asuntos_expedientes= new ArrayList<>();
        Asunto Dao = new Asunto();
        try{

         for(Asunto Obj: Dao.CargarAsunto_Expediente(codigo_asunto)){            
              SelectItem s = new SelectItem(Obj.getCodigo_asunto(), Obj.getNombre_asunto());
              asuntos_expedientes.add(s);             
             } 
        
        
        }catch (SQLException ex){
            System.out.print(ex.getMessage());
        }     
    }
 
      public ArrayList<SelectItem> getAsuntos_expedientes() {
        return asuntos_expedientes;
    }

    public void setAsuntos_expedientes(ArrayList<SelectItem> asuntos_expedientes) {
        this.asuntos_expedientes = asuntos_expedientes;
    }
    
    

}
