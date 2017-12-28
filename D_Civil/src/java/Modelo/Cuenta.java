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

/**
 *
 * @author Administrador
 */
public class Cuenta implements Serializable{
    
  
    
  private String id_unico;
  private String anio_deuda;
  private String periodo_deuda;
  private String perido_deuda_inicial;
  private String periodo_deuda_final;
  private String monto_insoluto;
  private String gasto_administrativo;
  private String estado_cuenta;
  private String usuario;
  private String fecha_registro;
  private String hora;
  private String fecha_pago;
  private String numero_recibo;
  private String descuento;
  private String monto_reajuste;
  private String interes;
  private String numero_valor;
  private String numero_coactivo;
  private String numero_fraccionamiento;
  private String numero_expediente;
  private String tipo_tributo;
  private String numero_resolucion;
  private String estado_tributo;

   
  
  Persona Objpersona = new Persona();
  Predio Objpredio= new Predio();

   
  
  public String getNumero_resolucion() {
        return numero_resolucion;
    }

    public void setNumero_resolucion(String numero_resolucion) {
        this.numero_resolucion = numero_resolucion;
    }
  
    public String getPerido_deuda_inicial() {
        return perido_deuda_inicial;
    }

    public void setPerido_deuda_inicial(String perido_deuda_inicial) {
        this.perido_deuda_inicial = perido_deuda_inicial;
    }

    public String getPeriodo_deuda_final() {
        return periodo_deuda_final;
    }

    public void setPeriodo_deuda_final(String periodo_deuda_final) {
        this.periodo_deuda_final = periodo_deuda_final;
    }

  public Persona getObjpersona() {
        return Objpersona;
    }

    public void setObjpersona(Persona Objpersona) {
        this.Objpersona = Objpersona;
    }

    public Predio getObjpredio() {
        return Objpredio;
    }

    public void setObjpredio(Predio Objpredio) {
        this.Objpredio = Objpredio;
    }


  public String getAnio_deuda() {
        return anio_deuda;
    }

    public void setAnio_deuda(String anio_deuda) {
        this.anio_deuda = anio_deuda;
    }

    public String getPeriodo_deuda() {
        return periodo_deuda;
    }

    public void setPeriodo_deuda(String periodo_deuda) {
        this.periodo_deuda = periodo_deuda;
    }

    public String getMonto_insoluto() {
        return monto_insoluto;
    }

    public void setMonto_insoluto(String monto_insoluto) {
        this.monto_insoluto = monto_insoluto;
    }

    public String getGasto_administrativo() {
        return gasto_administrativo;
    }

    public void setGasto_administrativo(String gasto_administrativo) {
        this.gasto_administrativo = gasto_administrativo;
    }

    public String getEstado_cuenta() {
        return estado_cuenta;
    }

    public void setEstado_cuenta(String estado_cuenta) {
        this.estado_cuenta = estado_cuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getNumero_recibo() {
        return numero_recibo;
    }

    public void setNumero_recibo(String numero_recibo) {
        this.numero_recibo = numero_recibo;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getMonto_reajuste() {
        return monto_reajuste;
    }

    public void setMonto_reajuste(String monto_reajuste) {
        this.monto_reajuste = monto_reajuste;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public String getNumero_valor() {
        return numero_valor;
    }

    public void setNumero_valor(String numero_valor) {
        this.numero_valor = numero_valor;
    }

    public String getNumero_coactivo() {
        return numero_coactivo;
    }

    public void setNumero_coactivo(String numero_coactivo) {
        this.numero_coactivo = numero_coactivo;
    }

    public String getNumero_fraccionamiento() {
        return numero_fraccionamiento;
    }

    public void setNumero_fraccionamiento(String numero_fraccionamiento) {
        this.numero_fraccionamiento = numero_fraccionamiento;
    }

    public String getNumero_expediente() {
        return numero_expediente;
    }

    public void setNumero_expediente(String numero_expediente) {
        this.numero_expediente = numero_expediente;
    }

    public String getTipo_tributo() {
        return tipo_tributo;
    }

    public void setTipo_tributo(String tipo_tributo) {
        this.tipo_tributo = tipo_tributo;
    }
    
    public String getId_unico() {
        return id_unico;
    }

    public void setId_unico(String id_unico) {
        this.id_unico = id_unico;
    }

    public String getEstado_tributo() {
        return estado_tributo;
    }

    public void setEstado_tributo(String estado_tributo) {
        this.estado_tributo = estado_tributo;
    }

    
 
  public static ArrayList<Cuenta> getConsulta_Cuenta(Cuenta detalle_economico){

       ArrayList<Cuenta> arr = null;
        ResultSet rs = null;
        Cuenta obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_consulta_cuenta_prueba(?,?,?,?,?)}"); 

       
           
           if (detalle_economico.getEstado_tributo() != null) {/*Valido la informacion set*/
                if (detalle_economico.getEstado_tributo().length() > 0) {
                    st.setString(1, detalle_economico.getEstado_tributo());

                } else {
                    st.setString(1, null);
                }
           }
            
            
            if (detalle_economico.Objpersona.getCodigo_contribuyente() != null) {/*Valido la informacion set*/
                if (detalle_economico.Objpersona.getCodigo_contribuyente().length() > 0) {
                    st.setString(2, detalle_economico.Objpersona.getCodigo_contribuyente());

                } else {
                    st.setString(2, null);
                }
           }
           
           
            if (detalle_economico.getTipo_tributo() != null) {/*Valido la informacion set*/
                if (detalle_economico.getTipo_tributo().length() > 0) {
                    st.setString(3, detalle_economico.getTipo_tributo());

                } else {
                    st.setString(3, null);
                }
           }

           
           if (detalle_economico.getPerido_deuda_inicial() != null) {/*Valido la informacion set*/
                if (detalle_economico.getPerido_deuda_inicial().length() > 0) {
                    st.setString(4, detalle_economico.getPerido_deuda_inicial());

                } else {
                    st.setString(4, null);
                }
           } 
            
           
            if (detalle_economico.getPeriodo_deuda_final() != null) {/*Valido la informacion set*/
                if (detalle_economico.getPeriodo_deuda_final().length() > 0) {
                    st.setString(5, detalle_economico.getPeriodo_deuda_final());

                } else {
                    st.setString(5, null);
                }
           } 
           
           
            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Cuenta>();
                do {

                    obj = new Cuenta();
                    
                    Persona ObjPersona = new Persona() ;

                    ObjPersona.setCodigo_contribuyente(rs.getString("codigo_contribuyente"));
                    ObjPersona.setNombre_contribuyente(rs.getString("nombre"));
                    ObjPersona.setDireccion_fiscal(rs.getString("direccion_fiscal"));

                    obj.setObjpersona(ObjPersona);
                    
                    Predio ObjPredio = new Predio ();
                    
                    ObjPredio.setCodigo_predio(rs.getString("codigo_predio"));
                    
                    obj.setObjpredio(ObjPredio);
                    
                    obj.setAnio_deuda(rs.getString("anio_deuda"));
                    obj.setPeriodo_deuda(rs.getString("periodo_deuda"));
                    obj.setMonto_insoluto(rs.getString("monto_insoluto"));
                    obj.setGasto_administrativo(rs.getString("gasto_administrativo"));
                    obj.setEstado_cuenta(rs.getString("estado_cuenta"));
                    obj.setFecha_registro(rs.getString("fecha_registro"));
                    obj.setHora(rs.getString("hora"));
                    obj.setFecha_pago(rs.getString("fecha_pago"));
                    obj.setNumero_recibo(rs.getString("numero_recibo"));
                    obj.setDescuento(rs.getString("descuento"));
                    obj.setMonto_reajuste(rs.getString("monto_reajuste"));
                    obj.setInteres(rs.getString("interes"));
                    obj.setNumero_valor(rs.getString("numero_valor"));
                    obj.setNumero_coactivo(rs.getString("numero_coactivo"));
                    obj.setNumero_fraccionamiento(rs.getString("numero_fraccionamiento"));
                    obj.setNumero_expediente(rs.getString("numero_expediente"));
                    obj.setNumero_resolucion(rs.getString("numero_resolucion"));
                    obj.setTipo_tributo(rs.getString("tipo_tributo"));
                    
   
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
