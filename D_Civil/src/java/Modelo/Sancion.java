/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.faces.model.SelectItem;

/**
 *
 * @author Administrador
 */
public class Sancion implements Serializable {
    
   private String codigo_sancion;
   private String nombre_sancion;
   private String tasa_sancion;

 

   public String getCodigo_sancion() {
        return codigo_sancion;
    }

    public void setCodigo_sancion(String codigo_sancion) {
        this.codigo_sancion = codigo_sancion;
    }
    
  
    public String getNombre_sancion() {
        return nombre_sancion;
    }

    public void setNombre_sancion(String nombre_sancion) {
        this.nombre_sancion = nombre_sancion;
    }

    public String getTasa_sancion() {
        return tasa_sancion;
    }

    public void setTasa_sancion(String tasa_sancion) {
        this.tasa_sancion = tasa_sancion;
    }
    
    
    
   
   
      public ArrayList<SelectItem> getCargarSacionRas() {

        ArrayList<SelectItem> arraySancion = new ArrayList<SelectItem>();
        Sancion obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_regimen_aplicacion_sanciones()}");
            rs = st.executeQuery();
            if (rs.next()) {
                do {
                    arraySancion.add(new SelectItem(rs.getString("codigo_sancion"), rs.getString("nombre_sancion")));
//                    
                } while (rs.next());

            }
            rs.close();
            st.close();
            conexion.close();

        } catch (Exception error) {
            System.out.println("Error en el metodo por: "
                    + error.getMessage());
            error.printStackTrace();
        }

        return arraySancion;
    } 
     
}
