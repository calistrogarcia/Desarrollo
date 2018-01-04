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
public class Postal implements Serializable{
    
    private String codigo_postal;
    private String nombre_postal;

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getNombre_postal() {
        return nombre_postal;
    }

    public void setNombre_postal(String nombre_postal) {
        this.nombre_postal = nombre_postal;
    }
    
   
     public  ArrayList<SelectItem> getCargarPostal() {

        ArrayList<SelectItem> arrayPostal = new ArrayList<SelectItem>();
        Grupo obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_postal()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arrayPostal.add(new SelectItem(rs.getString("codigo_postal"), rs.getString("nombre_postal")));

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

        return arrayPostal;

    }
  
  
  
    
    
}
