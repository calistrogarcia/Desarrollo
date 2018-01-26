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
   private String codigo_medida_complementaria;
   private String medida_complementaria;

    
   
   public String getCodigo_medida_complementaria() {
        return codigo_medida_complementaria;
    }

    public void setCodigo_medida_complementaria(String codigo_medida_complementaria) {
        this.codigo_medida_complementaria = codigo_medida_complementaria;
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

    
    
  public  ArrayList<SelectItem> getCargarMedidaComplementaria() {

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
                    arrayGrupo.add(new SelectItem(rs.getString("codigo_medida_complementaria"), rs.getString("medida_complementaria")));

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
  
  
  public  ArrayList<SelectItem> getCargarTipoPersona() {

        ArrayList<SelectItem> arrayTipoPersona = new ArrayList<SelectItem>();
        Grupo obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_tipo_persona()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arrayTipoPersona.add(new SelectItem(rs.getString("codigo_tipo_persona"), rs.getString("nombre_tipo_persona")));

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

        return arrayTipoPersona;

    }
  
  
  
    
  public  ArrayList<SelectItem> getCargarTipoDocumento() {

        ArrayList<SelectItem> arrayTipoDocumento = new ArrayList<SelectItem>();
        Grupo obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_tipo_documento()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arrayTipoDocumento.add(new SelectItem(rs.getString("codigo_tipo_documento"), rs.getString("nombre_tipo_documento")));

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

        return arrayTipoDocumento;

    }
  
  
    public  ArrayList<SelectItem> getCargarTipoAutorizacionMunicipal() {

        ArrayList<SelectItem> arrayTipoAutorizacionMunicipal = new ArrayList<SelectItem>();
        Grupo obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_java_tipo_autorizacion_municipal()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arrayTipoAutorizacionMunicipal.add(new SelectItem(rs.getString("Codigo_autorizacion"), rs.getString("tipo_autorizacion")));

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

        return arrayTipoAutorizacionMunicipal;

    }
  
  
    
    
   
}
