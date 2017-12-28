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
public class Grupo implements Serializable {
    
  
   private String codigo_grupo;
   private String codigo_tipo;
   private String medida_complementaria;

  
   
   public String getCodigo_tipo() {
        return codigo_tipo;
    }

    public void setCodigo_tipo(String codigo_tipo) {
        this.codigo_tipo = codigo_tipo;
    }
   
   public String getCodigo_grupo() {
        return codigo_grupo;
    }

    public void setCodigo_grupo(String codigo_grupo) {
        this.codigo_grupo = codigo_grupo;
    }

    public String getMedida_complementaria() {
        return medida_complementaria;
    }

    public void setMedida_complementaria(String medida_complementaria) {
        this.medida_complementaria = medida_complementaria;
    }

    
    
  public  ArrayList<SelectItem> getCargarDetalleGrupo() {

        ArrayList<SelectItem> arrayGrupo = new ArrayList<SelectItem>();
        Grupo obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_medida_complementaria()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arrayGrupo.add(new SelectItem(rs.getString("codigo_tipo"), rs.getString("medida_complementaria")));

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

        return arrayGrupo;

    }
    
    
   
}
