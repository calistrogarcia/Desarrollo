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
public class Area implements Serializable {
  
    
  private String id_area;
  private String nombre_area;
  private String estado;

    public String getId_area() {
        return id_area;
    }

    public void setId_area(String id_area) {
        this.id_area = id_area;
    }

    public String getNombre_area() {
        return nombre_area;
    }

    public void setNombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  
    
    public  ArrayList<SelectItem> getCargarAreas() {

        ArrayList<SelectItem> arrayArea = new ArrayList<SelectItem>();
        Area obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_lista_area()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arrayArea.add(new SelectItem(rs.getString("id_area"), rs.getString("nombre_area")));

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

        return arrayArea;

    }
    
  
  


    
}