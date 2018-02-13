
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Administrador
 */
public class Certificado implements Serializable {

   

    private String nro_expediente;
    private String fecha_expediente;
    private Date fecha_expediente_Act;
    private String asunto;
    private String area_declarada;
    private String area;
    private String razon_social;
    private String representante_legal;
    private String Direccion;
    private String direccion_verificada;
    private String nro_municipal;
    private String nombre_inspector;
    private Date fecha_ipse;
    private int aforo;
    private int id_tipo_licencia;
    private String descripcion_tipo_licencia;
    private String numero_identificacion;
    private boolean estado_fiscalizacion;
    private String observaciones_seguridad;
    private int resultado;
    private String anotaciones;
    private String fiscalizaciones;
    private String resultados_expediente_ipse;
    private String numero_resolucion;
    private String correlativo_expediente;
    private String anotacion;
    private String area_final;
    private String total_folios;
    private String usuario_modificacion;
    private String numero_registro;
    private String observaciones;
    private String fecha_resuelto;
    private String observancia_ipse;
    private String area_verificada;

    

    Giro Objgiros = new Giro();
    Supervisor supervisor = new Supervisor();

    Direccion objdireccion = new Direccion();
    Upload objUpload = new Upload();
    Download objDownload = new Download();
    ObservacionIpse objObservacion = new ObservacionIpse();
    Boton objboton = new Boton();
    Postal ObjPostal = new Postal();
    Persona ObjPersona = new Persona();
    Expediente ObjExpediente = new Expediente ();
    
  
 
    public String getResultados_expediente_ipse() {
        return resultados_expediente_ipse;
    }

    public void setResultados_expediente_ipse(String resultados_expediente_ipse) {
        this.resultados_expediente_ipse = resultados_expediente_ipse;
    }


    public Expediente getObjExpediente() {
        return ObjExpediente;
    }

    public void setObjExpediente(Expediente ObjExpediente) {
        this.ObjExpediente = ObjExpediente;
    }

    
    public Certificado() {

    }

    public Boton getObjboton() {
        return objboton;
    }

    public void setObjboton(Boton objboton) {
        this.objboton = objboton;
    }

    public Persona getObjPersona() {
        return ObjPersona;
    }

    public void setObjPersona(Persona ObjPersona) {
        this.ObjPersona = ObjPersona;
    }
    
    
    public Download getObjDownload() {
        return objDownload;
    }

    public void setObjDownload(Download objDownload) {
        this.objDownload = objDownload;
    }

    public Upload getObjUpload() {
        return objUpload;
    }

    public void setObjUpload(Upload objUpload) {
        this.objUpload = objUpload;
    }

    public Giro getObjgiros() {
        return Objgiros;
    }

    public void setObjgiros(Giro Objgiros) {
        this.Objgiros = Objgiros;
    }

    public String getObservaciones_seguridad() {
        return observaciones_seguridad;
    }

    public void setObservaciones_seguridad(String observaciones_seguridad) {
        this.observaciones_seguridad = observaciones_seguridad;
    }



    public int getId_tipo_licencia() {
        return id_tipo_licencia;
    }

    public void setId_tipo_licencia(int id_tipo_licencia) {
        this.id_tipo_licencia = id_tipo_licencia;
    }

    public String getDescripcion_tipo_licencia() {
        return descripcion_tipo_licencia;
    }

    public void setDescripcion_tipo_licencia(String descripcion_tipo_licencia) {
        this.descripcion_tipo_licencia = descripcion_tipo_licencia;
    }

// razon_social, representante_legal, direccion, nro_municpal, 
// nombre_inspector, fecha_ipse, aforo
    public Date getFecha_expediente_Act() {
        return fecha_expediente_Act;
    }

    public void setFecha_expediente_Act(Date fecha_expediente_Act) {
        this.fecha_expediente_Act = fecha_expediente_Act;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getRepresentante_legal() {
        return representante_legal;
    }

    public void setRepresentante_legal(String representante_legal) {
        this.representante_legal = representante_legal;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNro_municipal() {
        return nro_municipal;
    }

    public void setNro_municipal(String nro_municipal) {
        this.nro_municipal = nro_municipal;
    }

    public String getNombre_inspector() {
        return nombre_inspector;
    }

    public void setNombre_inspector(String nombre_inspector) {
        this.nombre_inspector = nombre_inspector;
    }

    public Date getFecha_ipse() {
        return fecha_ipse;
    }

    public void setFecha_ipse(Date fecha_ipse) {
        this.fecha_ipse = fecha_ipse;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public String getArea_declarada() {
        return area_declarada;
    }

    public void setArea_declarada(String area_declarada) {
        this.area_declarada = area_declarada;
    }

    public String getFecha_expediente() {
        return fecha_expediente;
    }

    public void setFecha_expediente(String fecha_expediente) {
        this.fecha_expediente = fecha_expediente;
    }

    public String getNro_expediente() {
        return nro_expediente;
    }

    public void setNro_expediente(String nro_expediente) {
        this.nro_expediente = nro_expediente;
    }

  

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getFiscalizaciones() {
        return fiscalizaciones;
    }

    public void setFiscalizaciones(String fiscalizaciones) {
        this.fiscalizaciones = fiscalizaciones;
    }

  
    public String getNumero_resolucion() {
        return numero_resolucion;
    }

    public void setNumero_resolucion(String numero_resolucion) {
        this.numero_resolucion = numero_resolucion;
    }

    public String getCorrelativo_expediente() {
        return correlativo_expediente;
    }

    public void setCorrelativo_expediente(String correlativo_expediente) {
        this.correlativo_expediente = correlativo_expediente;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

    public String getArea_final() {
        return area_final;
    }

    public void setArea_final(String area_final) {
        this.area_final = area_final;
    }

    public String getTotal_folios() {
        return total_folios;
    }

    public void setTotal_folios(String total_folios) {
        this.total_folios = total_folios;
    }

    public String getUsuario_modificacion() {
        return usuario_modificacion;
    }

    public void setUsuario_modificacion(String usuario_modificacion) {
        this.usuario_modificacion = usuario_modificacion;
    }

    public String getNumero_registro() {
        return numero_registro;
    }

    public void setNumero_registro(String numero_registro) {
        this.numero_registro = numero_registro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFecha_resuelto() {
        return fecha_resuelto;
    }

    public void setFecha_resuelto(String fecha_resuelto) {
        this.fecha_resuelto = fecha_resuelto;
    }

    public String getObservancia_ipse() {
        return observancia_ipse;
    }

    public void setObservancia_ipse(String observancia_ipse) {
        this.observancia_ipse = observancia_ipse;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

  

    public Direccion getObjdireccion() {
        return objdireccion;
    }

    public void setObjdireccion(Direccion objdireccion) {
        this.objdireccion = objdireccion;
    }

    public String getDireccion_verificada() {
        return direccion_verificada;
    }

    public void setDireccion_verificada(String direccion_verificada) {
        this.direccion_verificada = direccion_verificada;
    }


    public ObservacionIpse getObjObservacion() {
        return objObservacion;
    }

    public void setObjObservacion(ObservacionIpse objObservacion) {
        this.objObservacion = objObservacion;
    }

    public String getArea_verificada() {
        return area_verificada;
    }

    public void setArea_verificada(String area_verificada) {
        this.area_verificada = area_verificada;
    }

    public boolean isEstado_fiscalizacion() {
        return estado_fiscalizacion;
    }

    public void setEstado_fiscalizacion(boolean estado_fiscalizacion) {
        this.estado_fiscalizacion = estado_fiscalizacion;
    }

    public Postal getObjPostal() {
        return ObjPostal;
    }

    public void setObjPostal(Postal ObjPostal) {
        this.ObjPostal = ObjPostal;
    }

  

    public ArrayList<SelectItem> getCargarComboGiros() {

        ArrayList<SelectItem> arrayGiros = new ArrayList<SelectItem>();
        Giro obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_CargarGiros()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {

                    arrayGiros.add(new SelectItem(rs.getString("codigo_giro"), rs.getString("giro_detalle")));

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

        return arrayGiros;

    }

    public ArrayList<SelectItem> getCargarObservacionesIpse() {

        ArrayList<SelectItem> arrayObservaciones = new ArrayList<SelectItem>();
        ObservacionIpse obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_observaciones()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {

                    arrayObservaciones.add(new SelectItem(rs.getString("id_observancia"), rs.getString("observancia")));

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

        return arrayObservaciones;

    }

    public ArrayList<SelectItem> getCargarTiposIpse() {

        ArrayList<SelectItem> arrayGiros = new ArrayList<SelectItem>();
        Giro obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_cargartiposipse()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arrayGiros.add(new SelectItem(rs.getString("nombre")));

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

        return arrayGiros;
    }

    public static ArrayList<Certificado> getBuscaExpedientesPorcodigo(Certificado cert) {

        ArrayList<Certificado> arr = null;
        ResultSet rs = null;
        Certificado obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expediente_por_contribuyente(?)}");

            if (cert.getNro_expediente() != null) {/*Valido la informacion set*/
                if (cert.getNro_expediente().length() > 0) {
                    st.setString(1, cert.getNro_expediente());

                } else {
                    st.setString(1, null);
                }
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Certificado>();
                do {

                    obj = new Certificado();

                    Upload U = new Upload();

                    U.setExpediente_id(rs.getString("expediente_id"));

                    obj.setObjUpload(U);

                    obj.setNro_expediente(rs.getString("expediente"));
                    obj.setFecha_expediente(rs.getString("fecha_expediente"));
                   
                    Persona ObjPersona = new Persona();
                    ObjPersona.setCodigo_contribuyente(rs.getString("codigo"));
                    ObjPersona.setNombres_apellidos(rs.getString("nombres_apellidos"));
                   
                    obj.setObjPersona(ObjPersona);
                    
                    
                    obj.setAsunto(rs.getString("asunto"));
                    obj.setArea_declarada(rs.getString("area_declarada"));
                    obj.setArea(rs.getString("area_final"));
                    obj.setRazon_social(rs.getString("razon_social"));
                    obj.setRepresentante_legal(rs.getString("representante_legal"));
                    obj.setDireccion(rs.getString("direccion"));
                    obj.setNombre_inspector(rs.getString("nombre_Inspector"));
                    obj.setAforo(rs.getInt("aforo"));

                    Giro G = new Giro();

                    G.setCodigo_giro(rs.getString("codigo_giro"));
                    obj.setObjgiros(G);

                    obj.setId_tipo_licencia(rs.getInt("id_tipo_licencia"));
                    obj.setDescripcion_tipo_licencia(rs.getString("descripcion_tipo_licencia"));
                    obj.setNumero_identificacion(rs.getString("numero_identidad"));
                    obj.setEstado_fiscalizacion(rs.getBoolean("estado_fiscalizacion"));
                    obj.setObservaciones_seguridad(rs.getString("observaciones_seguridad"));
                    obj.setResultado(rs.getInt("resultado"));
                    obj.setAnotaciones(rs.getString("anotaciones"));
                     Expediente ObjExpediente = new Expediente ();
                    
                    ObjExpediente.setEstado_expediente(rs.getString("estado_expediente"));
                    
                    obj.setObjExpediente(ObjExpediente);
                    
                    obj.setDireccion_verificada(rs.getString("direccion_verificada"));
                    obj.setArea_verificada(rs.getString("area_verificada"));
                    
                    Boton b = new Boton();
                    b.setEstado_boton(rs.getString("estado_editar"));
                    obj.setObjboton(b);

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

    public static ArrayList<Certificado> getBuscaReporteResoluciones(Certificado resol) {

        ArrayList<Certificado> arr = null;
        ResultSet rs = null;
        Certificado obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_reporteresoluciones(?)}");

            if (resol.getNro_expediente() != null) {/*Valido la informacion set*/
                if (resol.getNro_expediente().length() > 0) {
                    st.setString(1, resol.getNro_expediente());

                } else {
                    st.setString(1, null);
                }
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Certificado>();
                do {

                    obj = new Certificado();

                    obj.setNro_expediente(rs.getString("expediente"));
                    obj.setFecha_expediente(rs.getString("fecha_expediente"));
                    obj.setNumero_resolucion(rs.getString("numero_resolucion"));
                   
                    Persona ObjPersona = new Persona();
                    
                    ObjPersona.setCodigo_contribuyente(rs.getString("codigo"));
                    ObjPersona.setNombres_apellidos(rs.getString("nombres_apellidos"));
                    
                    obj.setObjPersona(ObjPersona);
                    
                    
                    

                    Giro gr = new Giro();

                    gr.setGiro_detalle(rs.getString("giro_detalle"));
                    
                    obj.setObjgiros(gr);

                    obj.setDescripcion_tipo_licencia(rs.getString("descripcion_tipo_licencia"));       
                
                    obj.setObservaciones_seguridad(rs.getString("observaciones_seguridad"));
                    
                    obj.setResultados_expediente_ipse(rs.getString("resultado"));

                    obj.setCorrelativo_expediente(rs.getString("correlativo_expediente"));
                    
                    Expediente ObjExpediente = new Expediente() ;
                    
                    ObjExpediente.setEstado_expediente(rs.getString("estado_expediente"));
                    
                    obj.setObjExpediente(ObjExpediente);
                    
                    
                    obj.setAnotacion(rs.getString("anotacion"));
                    obj.setArea_final(rs.getString("area_final"));
                    obj.setTotal_folios(rs.getString("total_folios"));
                    obj.setUsuario_modificacion(rs.getString("usuario_modificacion"));
                    obj.setNumero_registro(rs.getString("numero_registro"));
                    obj.setObservaciones(rs.getString("observaciones"));

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

    public static ArrayList<Certificado> getGenerarResoluciones(Certificado genarar) {

        ArrayList<Certificado> arr = null;
        ResultSet rs = null;
        Certificado obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_generar_numero_expediente(?)}");

            if (genarar.getNro_expediente() != null) {/*Valido la informacion set*/
                if (genarar.getNro_expediente().length() > 0) {
                    st.setString(1, genarar.getNro_expediente());

                } else {
                    st.setString(1, null);
                }
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Certificado>();
                do {

                    obj = new Certificado();

                    obj.setNro_expediente(rs.getString("expediente"));
                    obj.setFecha_expediente(rs.getString("fecha_expediente"));
                    obj.setNumero_resolucion(rs.getString("numero_resolucion"));
                          Persona ObjPersona = new Persona();
                    ObjPersona.setCodigo_contribuyente(rs.getString("codigo"));
                    ObjPersona.setNombres_apellidos(rs.getString("nombres_apellidos"));
                    obj.setObjPersona(ObjPersona);
                    
                   

                    Giro gir = new Giro();

                    gir.setGiro_detalle("giro_detalle");
                    obj.setObjgiros(gir);

                    obj.setDescripcion_tipo_licencia(rs.getString("descripcion_tipo_licencia"));                   
                    obj.setFiscalizaciones(rs.getString("estado_fiscalizacion"));
                    obj.setObservaciones_seguridad(rs.getString("observaciones_seguridad"));
                    obj.setResultados_expediente_ipse(rs.getString("resultado"));

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

    public static boolean ActualizarDatosExpediente(Certificado ObjetoCertificado) {

        boolean a = false;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            //    CallableStatement st=conexion.prepareCall("{call sp_actualizarasistencia(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");                   
            conexion.setAutoCommit(false);

            CallableStatement st = conexion.prepareCall("{call sp_java_actualiza_expediente_por_contribuyente(?)}");

            if (ObjetoCertificado.getNro_expediente() != null) {

                if (ObjetoCertificado.getNro_expediente().length() > 0) {
                    st.setString(1, ObjetoCertificado.getNro_expediente());
                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            st.execute();
            a = true;
            st.close();
            conexion.setAutoCommit(true);
            conexion.close();

        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        return a;

    }

    public static boolean MoficardatosParaCertificado(Certificado obj) {
        boolean a = false;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();

            conexion.setAutoCommit(false);

            CallableStatement st = conexion.prepareCall("{call sp_java_actualizar_expediente_por_contribuyente(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            if (obj.getNro_expediente() != null) {

                if (obj.getNro_expediente().length() > 0) {
                    st.setString(1, obj.getNro_expediente());
                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (obj.getArea() != null) {

                if (obj.getArea().length() > 0) {

                    st.setString(2, obj.getArea());
                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);

            }

            if (obj.ObjPersona.getCodigo_contribuyente() != null) {
                if (obj.ObjPersona.getCodigo_contribuyente().length() > 0) {
                    st.setString(3, obj.ObjPersona.getCodigo_contribuyente());
                } else {
                    st.setString(3, null);
                }
            } else {
                st.setString(3, null);

            }

            if (obj.ObjPersona.getNombres_apellidos() != null) {
                if (obj.ObjPersona.getNombres_apellidos().length() > 0) {

                    st.setString(4, obj.ObjPersona.getNombres_apellidos());
                } else {
                    st.setString(4, null);
                }
            } else {
                st.setString(4, null);

            }

            if (obj.getRazon_social() != null) {

                if (obj.getRazon_social().length() > 0) {
                    st.setString(5, obj.getRazon_social());
                } else {
                    st.setString(5, null);
                }
            } else {
                st.setString(5, null);

            }

            if (obj.getRepresentante_legal() != null) {

                if (obj.getRepresentante_legal().length() > 0) {
                    st.setString(6, obj.getRepresentante_legal());
                } else {
                    st.setString(6, null);
                }
            } else {
                st.setString(6, null);
            }

            if (obj.getDireccion() != null) {

                if (obj.getDireccion().length() > 0) {
                    st.setString(7, obj.getDireccion());
                } else {
                    st.setString(7, null);
                }
            } else {
                st.setString(7, null);

            }

            if (obj.getAsunto() != null) {

                if (obj.getAsunto().length() > 0) {

                    st.setString(8, obj.getAsunto());
                } else {
                    st.setString(8, null);
                }
            } else {
                st.setString(8, null);

            }
            /* 
                     if(obj.getRegobservaciones_seguridad()!=null){
                     
                          if(obj.getRegobservaciones_seguridad()!=null){
                                  st.setObject(9, obj.getRegobservaciones_seguridad());
                                
                         }else{
                            st.setString(9, null);
                         }
                      }else{
                        st.setString(9, null);
             
                     }   */

            if (obj.getObservaciones_seguridad() != null) {

                if (obj.getObservaciones_seguridad().length() > 0) {

                    st.setObject(9, obj.getObservaciones_seguridad());
                } else {
                    st.setString(9, null);
                }
            } else {
                st.setString(9, null);

            }

            if (obj.getArea_declarada() != null) {

                if (obj.getArea_declarada().length() > 0) {
                    st.setString(10, obj.getArea_declarada());
                } else {
                    st.setString(10, null);
                }
            } else {
                st.setString(10, null);

            }

            if (obj.getNombre_inspector() != null) {

                if (obj.getNombre_inspector().length() > 0) {
                    st.setString(11, obj.getNombre_inspector());
                } else {
                    st.setString(11, null);
                }
            } else {
                st.setString(11, null);

            }

            st.setInt(12, obj.getAforo());

            if (obj.Objgiros.getCodigo_giro() != null) {

                if (obj.Objgiros.getCodigo_giro().length() > 0) {
                    st.setString(13, obj.Objgiros.getCodigo_giro());
                } else {
                    st.setString(13, null);
                }
            } else {
                st.setString(13, null);

            }

            if (obj.getAnotaciones() != null) {

                if (obj.getAnotaciones().length() > 0) {

                    st.setString(14, obj.getAnotaciones());
                } else {
                    st.setString(14, null);
                }
            } else {
                st.setString(14, null);

            }

            if (obj.getDireccion_verificada() != null) {

                if (obj.getDireccion_verificada().length() > 0) {
                    st.setString(15, obj.getDireccion_verificada());
                } else {
                    st.setString(15, null);
                }
            } else {
                st.setString(15, null);

            }

            if (obj.getArea_verificada() != null) {

                if (obj.getArea_verificada().length() > 0) {
                    st.setString(16, obj.getArea_verificada());
                } else {
                    st.setString(16, null);
                }
            } else {
                st.setString(16, null);

            }

            st.setInt(17, obj.getId_tipo_licencia());

            st.setBoolean(18, obj.isEstado_fiscalizacion());
            st.setInt(19, obj.getResultado());

            st.execute();
            a = true;
            st.close();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        return a;

    }

    //------------------ RESOLVER EXPEDIENTE ENVIAR ACTUALIZAR DATOS DE EXPEDIENTE EN EL SISTEMA SIGTA----------------//
    public static boolean ResolverExpediente(Certificado obj) {

        boolean a = false;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();

            conexion.setAutoCommit(false);

            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_documento_update_resuelto (?,?,?,?,?,?,?,?)}");

            if (obj.getCorrelativo_expediente() != null) {

                if (obj.getCorrelativo_expediente().length() > 0) {
                    st.setString(1, obj.getCorrelativo_expediente());
                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (obj.ObjExpediente.getEstado_expediente() != null) {

                if (obj.ObjExpediente.getEstado_expediente().length() > 0) {

                    st.setString(2, obj.ObjExpediente.getEstado_expediente());
                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);

            }

            if (obj.getAnotacion() != null) {
                if (obj.getAnotacion().length() > 0) {
                    st.setString(3, obj.getAnotacion());
                } else {
                    st.setString(3, null);
                }
            } else {
                st.setString(3, null);

            }

            if (obj.getArea_final() != null) {
                if (obj.getArea_final().length() > 0) {

                    st.setString(4, obj.getArea_final());
                } else {
                    st.setString(4, null);
                }
            } else {
                st.setString(4, null);

            }

            if (obj.getTotal_folios() != null) {

                if (obj.getTotal_folios().length() > 0) {
                    st.setString(5, obj.getTotal_folios());
                } else {
                    st.setString(5, null);
                }
            } else {
                st.setString(5, null);

            }

            if (obj.getUsuario_modificacion() != null) {

                if (obj.getUsuario_modificacion().length() > 0) {
                    st.setString(6, obj.getUsuario_modificacion());
                } else {
                    st.setString(6, null);
                }
            } else {
                st.setString(6, null);
            }

            if (obj.getNumero_registro() != null) {

                if (obj.getNumero_registro().length() > 0) {
                    st.setString(7, obj.getNumero_registro());
                } else {
                    st.setString(7, null);
                }
            } else {
                st.setString(7, null);

            }

            if (obj.getObservaciones() != null) {

                if (obj.getObservaciones().length() > 0) {

                    st.setString(8, obj.getObservaciones());
                } else {
                    st.setString(8, null);
                }
            } else {
                st.setString(8, null);

            }

            st.execute();
            a = true;
            st.close();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        return a;

    }

    public static boolean DesabilitarRegistroIpse(Certificado obj) {

        boolean a = false;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();

            conexion.setAutoCommit(false);

            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_desabilitar_ipse (?)}");

            if (obj.getNro_expediente() != null) {

                if (obj.getNro_expediente().length() > 0) {
                    st.setString(1, obj.getNro_expediente());
                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            st.execute();
            a = true;
            st.close();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        return a;

    }

    public static ArrayList<Certificado> cargarObservanciaIpse() throws Exception {

        ArrayList<Certificado> arr = null;
        Certificado obj = null;
        Connection conexion = null;
        ResultSet rs = null;

        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = null;
            st = conexion.prepareCall("{call dbo.sp_java_lista_observancia_ipse()}");
            rs = st.executeQuery();

            if (rs.next()) {
                arr = new ArrayList<Certificado>();
                do {
                    obj = new Certificado();

                    obj.setObservancia_ipse(rs.getString("observancia"));

                    arr.add(obj);
                } while (rs.next());

            }

            rs.close();
            st.close();
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }

        return arr;
    }

    public  ArrayList<SelectItem> getCargarInpectores() {

        ArrayList<SelectItem> arraySupervisor = new ArrayList<SelectItem>();
        Supervisor obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_lista_inspectores()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arraySupervisor.add(new SelectItem(rs.getString("id_inspector"), rs.getString("apellidos_nombres")));

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

        return arraySupervisor;

    }


   
    public static boolean subirArchivosDigitales(Certificado ObjSubir) {

        boolean a = false;
        Connection conexion = null;
        /* variable de connexion para definir y manejar el conytrol de errores*/
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st
                    = /*deve importarse con java la segunda opcion del cuadro de alternativas des importacion*/ conexion.prepareCall("{call dbo.sp_java_subir_archivo(?,?,?)}");
            conexion.setAutoCommit(false);

            if (ObjSubir.objUpload.getExpediente_id() != null) {
                if (ObjSubir.objUpload.getExpediente_id().length() > 0) {
                    st.setString(1, ObjSubir.objUpload.getExpediente_id());
                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (ObjSubir.objUpload.getNombre_archivo() != null) {
                if (ObjSubir.objUpload.getNombre_archivo().length() > 0) {
                    st.setString(2, ObjSubir.objUpload.getNombre_archivo());
                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);
            }

            if (ObjSubir.objUpload.getFile() != null) {

                st.setBinaryStream(3, ObjSubir.objUpload.getFile().getInputstream());
            } else {

                st.setString(3, null);
            }

            //---------------------------------------  expediente_id
            st.execute();
            st.close();
            conexion.commit();

        } catch (Exception e) {
            try {

                // Vuelve atras los cambios
                conexion.rollback();
            } catch (Exception ee) {//Manejo de errores}
                System.out.println("ERROR REGISTRAR: " + ee.getMessage());
            }
        } finally {
            try {

                // Cierra la conexión
                if (conexion != null) {
                    conexion.close();
                }

            } catch (Exception e) {//Manejo de errores}

                System.out.println("ERROR REGISTRAR: " + e.getMessage());
            }
        }
        return true;
    }

    public static ArrayList<Certificado> descargarArchivosDigitales(Certificado ObjDescargar) {

        ArrayList<Certificado> arr = null;
        ResultSet rs = null;
        Certificado obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_descargar_archivo(?)}");

            if (ObjDescargar.ObjPersona.getCodigo_contribuyente() != null) {/*Valido la informacion set*/
                if (ObjDescargar.ObjPersona.getCodigo_contribuyente().length() > 0) {
                    st.setString(1, ObjDescargar.ObjPersona.getCodigo_contribuyente());

                } else {
                    st.setString(1, null);
                }
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Certificado>();
                do {

                    obj = new Certificado();

                    obj.setNro_expediente(rs.getString("expediente"));

                    Download d = new Download();
                    d.setId_legajo(rs.getString("id_legajo"));
                    d.setNombre_archivo(rs.getString("nombre_archivo"));

                    obj.setObjDownload(d);

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
