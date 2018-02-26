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
    private String periodo;
    private String resultadoexpedientes;
    private int total;
    private String resultadoipse;
    private int totalipse;
    
    
    
    private String estado_resolucion;
    private int enero;
    private int febrero;
    private int marzo;
    private int abril;
    private int mayo;
    private int junio;
    private int julio;
    private int agosto;
    private int septiembre;
    private int octubre;
    private int noviembre;
    private int diciembre;
    
 

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

    public String getEstado_resolucion() {
        return estado_resolucion;
    }

    public void setEstado_resolucion(String estado_resolucion) {
        this.estado_resolucion = estado_resolucion;
    }

    public int getEnero() {
        return enero;
    }

    public void setEnero(int enero) {
        this.enero = enero;
    }

    public int getFebrero() {
        return febrero;
    }

    public void setFebrero(int febrero) {
        this.febrero = febrero;
    }

    public int getMarzo() {
        return marzo;
    }

    public void setMarzo(int marzo) {
        this.marzo = marzo;
    }

    public int getAbril() {
        return abril;
    }

    public void setAbril(int abril) {
        this.abril = abril;
    }

    public int getMayo() {
        return mayo;
    }

    public void setMayo(int mayo) {
        this.mayo = mayo;
    }

    public int getJunio() {
        return junio;
    }

    public void setJunio(int junio) {
        this.junio = junio;
    }

    public int getJulio() {
        return julio;
    }

    public void setJulio(int julio) {
        this.julio = julio;
    }

    public int getAgosto() {
        return agosto;
    }

    public void setAgosto(int agosto) {
        this.agosto = agosto;
    }

    public int getSeptiembre() {
        return septiembre;
    }

    public void setSeptiembre(int septiembre) {
        this.septiembre = septiembre;
    }

    public int getOctubre() {
        return octubre;
    }

    public void setOctubre(int octubre) {
        this.octubre = octubre;
    }

    public int getNoviembre() {
        return noviembre;
    }

    public void setNoviembre(int noviembre) {
        this.noviembre = noviembre;
    }

    public int getDiciembre() {
        return diciembre;
    }

    public void setDiciembre(int diciembre) {
        this.diciembre = diciembre;
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
                
                Grafico Reporte_Anual = new Grafico();
              

                Reporte_Anual.setEstado_resolucion(rs.getString("estado_resolucion"));
                Reporte_Anual.setEnero(rs.getInt("enero"));
                Reporte_Anual.setFebrero(rs.getInt("febrero"));
                Reporte_Anual.setMarzo(rs.getInt("marzo"));
                Reporte_Anual.setAbril(rs.getInt("abril"));
                Reporte_Anual.setMayo(rs.getInt("mayo"));
                Reporte_Anual.setJunio(rs.getInt("junio"));
                Reporte_Anual.setJulio(rs.getInt("julio"));
                Reporte_Anual.setAgosto(rs.getInt("agosto"));
                Reporte_Anual.setSeptiembre(rs.getInt("septiembre"));
                Reporte_Anual.setOctubre(rs.getInt("octubre"));
                Reporte_Anual.setNoviembre(rs.getInt("noviembre"));
                Reporte_Anual.setDiciembre(rs.getInt("diciembre"));

     
                informacion.add(Reporte_Anual);
       
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
