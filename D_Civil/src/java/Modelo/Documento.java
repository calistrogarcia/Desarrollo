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
import java.util.Date;

/**
 *
 * @author Calistro
 */
public class Documento implements Serializable{
    
    private String tipo_Expediente;
    private String numero_Expediente;
    private String fecha_ingreso_Expediente;
    private String numero_dias_expediente;
    private String hora_ingreso_Expediente;
    private int    numero_folios_Expediente;
    private String codigo_recurrente;
    private String codigo_asunto; 
    private String observaciones_Expediente;
    private String estado_expediente;
    private String nombre_tipo_Expediente;
    private String nombre_recurrente;
    private String numero_identidad_recurrente;
    private String asunto_Expediente;
    private String descripcion_estado_expediente;
    private String fecha_resuelto_Expediente;
    private String cantidad_folios_resuelto;
    private String area_destino_documento;
    private String observaciones_resultado_Expediente;
    private String tipo_referencia_Expediente;
    private String numero_registro_Expediente;
    private String Expediente_resuleve_tramite;
    
    

    public String getFecha_ingreso_Expediente() {
        return fecha_ingreso_Expediente;
    }

    public void setFecha_ingreso_Expediente(String fecha_ingreso_Expediente) {
        this.fecha_ingreso_Expediente = fecha_ingreso_Expediente;
    }

    public String getHora_ingreso_Expediente() {
        return hora_ingreso_Expediente;
    }

    public void setHora_ingreso_Expediente(String hora_ingreso_Expediente) {
        this.hora_ingreso_Expediente = hora_ingreso_Expediente;
    }

    public String getTipo_Expediente() {
        return tipo_Expediente;
    }

    public void setTipo_Expediente(String tipo_Expediente) {
        this.tipo_Expediente = tipo_Expediente;
    }

    public String getAsunto_Expediente() {
        return asunto_Expediente;
    }

    public void setAsunto_Expediente(String asunto_Expediente) {
        this.asunto_Expediente = asunto_Expediente;
    }

    public String getCodigo_recurrente() {
        return codigo_recurrente;
    }

    public void setCodigo_recurrente(String codigo_recurrente) {
        this.codigo_recurrente = codigo_recurrente;
    }

    public String getNombre_recurrente() {
        return nombre_recurrente;
    }

    public void setNombre_recurrente(String nombre_recurrente) {
        this.nombre_recurrente = nombre_recurrente;
    }

    public int getNumero_folios_Expediente() {
        return numero_folios_Expediente;
    }

    public void setNumero_folios_Expediente(int numero_folios_Expediente) {
        this.numero_folios_Expediente = numero_folios_Expediente;
    }


    public String getNumero_Expediente() {
        return numero_Expediente;
    }

    public void setNumero_Expediente(String numero_Expediente) {
        this.numero_Expediente = numero_Expediente;
    }

    public String getTipo_referencia_Expediente() {
        return tipo_referencia_Expediente;
    }

    public void setTipo_referencia_Expediente(String tipo_referencia_Expediente) {
        this.tipo_referencia_Expediente = tipo_referencia_Expediente;
    }


    public String getObservaciones_Expediente() {
        return observaciones_Expediente;
    }

    public void setObservaciones_Expediente(String observaciones_Expediente) {
        this.observaciones_Expediente = observaciones_Expediente;
    }

    public String getFecha_resuelto_Expediente() {
        return fecha_resuelto_Expediente;
    }

    public void setFecha_resuelto_Expediente(String fecha_resuelto_Expediente) {
        this.fecha_resuelto_Expediente = fecha_resuelto_Expediente;
    }

    public String getCantidad_folios_resuelto() {
        return cantidad_folios_resuelto;
    }

    public void setCantidad_folios_resuelto(String cantidad_folios_resuelto) {
        this.cantidad_folios_resuelto = cantidad_folios_resuelto;
    }

    public String getNumero_registro_Expediente() {
        return numero_registro_Expediente;
    }

    public void setNumero_registro_Expediente(String numero_registro_Expediente) {
        this.numero_registro_Expediente = numero_registro_Expediente;
    }

    public String getExpediente_resuleve_tramite() {
        return Expediente_resuleve_tramite;
    }

    public void setExpediente_resuleve_tramite(String Expediente_resuleve_tramite) {
        this.Expediente_resuleve_tramite = Expediente_resuleve_tramite;
    }

    public String getObservaciones_resultado_Expediente() {
        return observaciones_resultado_Expediente;
    }

    public void setObservaciones_resultado_Expediente(String observaciones_resultado_Expediente) {
        this.observaciones_resultado_Expediente = observaciones_resultado_Expediente;
    }

    public String getNumero_dias_expediente() {
        return numero_dias_expediente;
    }

    public void setNumero_dias_expediente(String numero_dias_expediente) {
        this.numero_dias_expediente = numero_dias_expediente;
    }

    public String getCodigo_asunto() {
        return codigo_asunto;
    }

    public void setCodigo_asunto(String codigo_asunto) {
        this.codigo_asunto = codigo_asunto;
    }

    public String getEstado_expediente() {
        return estado_expediente;
    }

    public void setEstado_expediente(String estado_expediente) {
        this.estado_expediente = estado_expediente;
    }

    public String getNombre_tipo_Expediente() {
        return nombre_tipo_Expediente;
    }

    public void setNombre_tipo_Expediente(String nombre_tipo_Expediente) {
        this.nombre_tipo_Expediente = nombre_tipo_Expediente;
    }

    public String getNumero_identidad_recurrente() {
        return numero_identidad_recurrente;
    }

    public void setNumero_identidad_recurrente(String numero_identidad_recurrente) {
        this.numero_identidad_recurrente = numero_identidad_recurrente;
    }

    public String getDescripcion_estado_expediente() {
        return descripcion_estado_expediente;
    }

    public void setDescripcion_estado_expediente(String descripcion_estado_expediente) {
        this.descripcion_estado_expediente = descripcion_estado_expediente;
    }

    public String getArea_destino_documento() {
        return area_destino_documento;
    }

    public void setArea_destino_documento(String area_destino_documento) {
        this.area_destino_documento = area_destino_documento;
    }
    
    
 public static ArrayList<Documento> getTramiteConsultarExpediente(Documento exp){

        ArrayList<Documento> arr = null;
        ResultSet rs = null;
        Documento obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_TramiteConsultarExpediente(?)}"); 

           if (exp.getNumero_Expediente() != null) {/*Valido la informacion set*/
                if (exp.getNumero_Expediente().length() > 0) {
                    st.setString(1, exp.getNumero_Expediente());

                } else {
                    st.setString(1, null);
                }
           }
            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Documento>();
                do {
                    
                    obj = new Documento();
                    
                    obj.setTipo_Expediente(rs.getString("CTIPDOC"));
                    obj.setNumero_Expediente(rs.getString("DNUMOLD"));
                    obj.setFecha_ingreso_Expediente(rs.getString("FFECDOC"));  
                    obj.setHora_ingreso_Expediente(rs.getString("DHORDOC"));
                    obj.setNumero_folios_Expediente(rs.getInt("NFOLIOS"));
                    obj.setCodigo_recurrente(rs.getString("CCONTRI"));
                    obj.setCodigo_asunto(rs.getString("CASUNTO"));
                    obj.setObservaciones_Expediente(rs.getString("OBSERVA"));
                    obj.setEstado_expediente(rs.getString("CESTADO"));
                    obj.setNombre_tipo_Expediente(rs.getString("DTIPDOC"));
                    obj.setNombre_recurrente(rs.getString("DCONTRI")); 
                    obj.setNumero_identidad_recurrente(rs.getString("DOCCONTRI"));
                    obj.setAsunto_Expediente(rs.getString("DASUNTO"));
                    obj.setDescripcion_estado_expediente(rs.getString("DESTADO"));
                    obj.setFecha_resuelto_Expediente(rs.getString("FRESUEL"));
                    obj.setArea_destino_documento(rs.getString("CAREFIN"));
                    obj.setObservaciones_resultado_Expediente(rs.getString("DREFERE")); 
                    obj.setTipo_referencia_Expediente(rs.getString("CtipRefe"));
                    obj.setNumero_registro_Expediente(rs.getString("NREGISTRO"));
                    obj.setExpediente_resuleve_tramite(rs.getString("NOBSEVRES"));
                    
                   
                    arr.add(obj);

                } while (rs.next());
            }
            st.execute();
            // st.close();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        return arr;
    } 

   
    
     
    
    
    
    
 
}
