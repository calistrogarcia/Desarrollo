/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Grafico implements Serializable {
    
    private int expediente_id;
    private String expediente;
    private String codigocontribuyente;
    private String nombre_apellidos;
    private int area_declarada;
    private int cantidad_expedientes;
    private String estado_resolucion;
    private String periodo;
    private String resultadoexpedientes;
    private int total;
    private String resultadoipse;
    private int totalipse;
    
    


    public String getCodigocontribuyente() {
        return codigocontribuyente;
    }

    public void setCodigocontribuyente(String codigocontribuyente) {
        this.codigocontribuyente = codigocontribuyente;
    }

    public int getExpediente_id() {
        return expediente_id;
    }

    public String getNombre_apellidos() {
        return nombre_apellidos;
    }

    public void setNombre_apellidos(String nombre_apellidos) {
        this.nombre_apellidos = nombre_apellidos;
    }

  
    public void setExpediente_id(int expediente_id) {
        this.expediente_id = expediente_id;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public int getArea_declarada() {
        return area_declarada;
    }

    public void setArea_declarada(int area_declarada) {
        this.area_declarada = area_declarada;
    }

    public int getCantidad_expedientes() {
        return cantidad_expedientes;
    }

    public void setCantidad_expedientes(int cantidad_expedientes) {
        this.cantidad_expedientes = cantidad_expedientes;
    }

   
    public String getEstado_resolucion() {
        return estado_resolucion;
    }

    public void setEstado_resolucion(String estado_resolucion) {
        this.estado_resolucion = estado_resolucion;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getResultadoexpedientes() {
        return resultadoexpedientes;
    }

    public void setResultadoexpedientes(String resultadoexpedientes) {
        this.resultadoexpedientes = resultadoexpedientes;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getResultadoipse() {
        return resultadoipse;
    }

    public void setResultadoipse(String resultadoipse) {
        this.resultadoipse = resultadoipse;
    }

    public int getTotalipse() {
        return totalipse;
    }

    public void setTotalipse(int totalipse) {
        this.totalipse = totalipse;
    }
    
    
    
     public static List<Grafico> listar() throws SQLException {
        
        List<Grafico> lista = null;
        ResultSet rs;
        Connection conexion = null;
        conexion = Controlador_Sql.darConexionBD();
        
        
        try {
 
            PreparedStatement st =conexion.prepareCall( "{call dbo.sp_reportegraficototal()}"); 
 
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
           
                Grafico pro = new Grafico();
             
                pro.setResultadoexpedientes(rs.getString("resultado"));
                pro.setTotal(rs.getInt("total"));
                lista.add(pro);

            }
            rs.close();
        
 
          } catch (Exception e) {
            //Alguna logica de excepcion
          } finally {
            if (conexion != null) {
                conexion.close();
             }
         }
         return lista;
      }
     
     
      public static List<Grafico> listaripse() throws SQLException {
        
        List<Grafico> lista = null;
        ResultSet rs;
        Connection conexion = null;
        conexion = Controlador_Sql.darConexionBD();
        
        
        try {
 
            PreparedStatement st =conexion.prepareCall( "{call dbo.sp_java_reportegraficotipoipse()}"); 
 
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
               
                Grafico pro = new Grafico();
             
                pro.setResultadoexpedientes(rs.getString("resultadoipse"));
                pro.setTotal(rs.getInt("totalipse"));
                lista.add(pro);


            }
            rs.close();
        
 
          } catch (Exception e) {
            //Alguna logica de excepcion
          } finally {
            if (conexion != null) {
                conexion.close();
             }
         }
         return lista;
      }
     
     
     
     public static List<Grafico> personalizado() throws SQLException {
        
        List<Grafico> informacion = null;
        ResultSet rs;
        Connection conexion = null;
        conexion = Controlador_Sql.darConexionBD();
        
        
        try {
 
            PreparedStatement st =conexion.prepareCall( "{call dbo.sp_reportegraficopersonalizado()}"); 
            
            //select codigo,nombres_apellidos from Expediente
                    
            rs = st.executeQuery();
            
            informacion = new ArrayList();
            
            while (rs.next()) {
                
                Grafico pro = new Grafico();
              
         
               
                pro.setCantidad_expedientes(rs.getInt("cantidad_expedientes"));
                pro.setEstado_resolucion(rs.getString("estado_resolucion"));
                pro.setPeriodo(rs.getString("periodo"));
     
                informacion.add(pro);
       
            }

            rs.close();
        
 
          } catch (Exception e) {
            //Alguna logica de excepcion
          } finally {
            if (conexion != null) {
                conexion.close();
             }
         }
         return informacion;
      }
     
      
  
}
