/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
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
import java.util.List;
import javax.faces.model.SelectItem;

/**
 *
 * @author Administrador
 */
public class Multa implements Serializable {

    // variables para reporte de multas
    private String numero_funcion;
    private String id_unico_multa;
    private String tipo_busqueda;
    private String informacion_consulta;
    private String numero_notificacion;
    private String codigo_predio;
    private String fecha_notificacion;
    private String anio_multa;
    private String numero_multa;
    private String monto_multa;
    private String fecha_resolucion;
    private String numero_resolucion;
    private String fecha_resolucion_coactiva;
    private String referencia;
    private String observacion;
    private String numero_aviso_notificacion;

    // variables registro Multa
    
    private String lugar_infraccion;
    private String manzana;
    private String lote;
    private String numero_fiscal;
    private String numero_departamento;
    private String referencia_direccion;
    private String numero_acta;
    private String numero_acta_constatacion;
    private String fecha_ejecucion;
    private String codigo_ingraccion;
    private String valor_obra;
    private String numero_informe;
    private String fecha_multa;
    private String reclamo_expediente;
    private String resolucion_anulacion;
    private String anotacion_anulacion;
    private String estado_multa;
    private String reincidente;
    private String acta_constatacion;
    private String codigo_sancion;
    private String detalle_sanacion;
    private String correlativo;
    private String fecha_registro;
    private String hora_registro;
   

    Persona ObjPersona = new Persona();
    Direccion ObjDireccion = new Direccion();
    Area objArea = new Area();
    Giro ObjGiro = new Giro();
    Sancion ObjSancion = new Sancion(); 
    Supervisor objInspector = new Supervisor();
    Predio ObjPredio = new Predio();
    Usuario ObjUsuario = new Usuario();
    Cuenta ObjCuenta = new Cuenta();
    Grupo ObjGrupo = new Grupo();

   
    
    public Grupo getObjGrupo() {
        return ObjGrupo;
    }

    public void setObjGrupo(Grupo ObjGrupo) {
        this.ObjGrupo = ObjGrupo;
    }
    

    public Sancion getObjSancion() {
        return ObjSancion;
    }

    public void setObjSancion(Sancion ObjSancion) {
        this.ObjSancion = ObjSancion;
    }

    public String getHora_registro() {
        return hora_registro;
    }

    public void setHora_registro(String hora_registro) {
        this.hora_registro = hora_registro;
    }

    public Usuario getObjUsuario() {
        return ObjUsuario;
    }

    public void setObjUsuario(Usuario ObjUsuario) {
        this.ObjUsuario = ObjUsuario;
    }

    public Supervisor getObjInspector() {
        return objInspector;
    }

    public void setObjInspector(Supervisor objInspector) {
        this.objInspector = objInspector;
    }


    public Giro getObjGiro() {
        return ObjGiro;
    }

    public void setObjGiro(Giro ObjGiro) {
        this.ObjGiro = ObjGiro;
    }

    public Area getObjArea() {
        return objArea;
    }

    public void setObjArea(Area objArea) {
        this.objArea = objArea;
    }

    public Direccion getObjDireccion() {
        return ObjDireccion;
    }

    public void setObjDireccion(Direccion ObjDireccion) {
        this.ObjDireccion = ObjDireccion;
    }

    public Persona getObjPersona() {
        return ObjPersona;
    }

    public void setObjPersona(Persona ObjPersona) {
        this.ObjPersona = ObjPersona;
    }

    public String getTipo_busqueda() {
        return tipo_busqueda;
    }

    public void setTipo_busqueda(String tipo_busqueda) {
        this.tipo_busqueda = tipo_busqueda;
    }

    public String getNumero_notificacion() {
        return numero_notificacion;
    }

    public void setNumero_notificacion(String numero_notificacion) {
        this.numero_notificacion = numero_notificacion;
    }

    public String getFecha_notificacion() {
        return fecha_notificacion;
    }

    public void setFecha_notificacion(String fecha_notificacion) {
        this.fecha_notificacion = fecha_notificacion;
    }

    public String getCodigo_predio() {
        return codigo_predio;
    }

    public void setCodigo_predio(String codigo_predio) {
        this.codigo_predio = codigo_predio;
    }

    public String getAnio_multa() {
        return anio_multa;
    }

    public void setAnio_multa(String anio_multa) {
        this.anio_multa = anio_multa;
    }

    public String getNumero_multa() {
        return numero_multa;
    }

    public void setNumero_multa(String numero_multa) {
        this.numero_multa = numero_multa;
    }

    public String getMonto_multa() {
        return monto_multa;
    }

    public void setMonto_multa(String monto_multa) {
        this.monto_multa = monto_multa;
    }

    public String getFecha_resolucion() {
        return fecha_resolucion;
    }

    public void setFecha_resolucion(String fecha_resolucion) {
        this.fecha_resolucion = fecha_resolucion;
    }

    public String getNumero_resolucion() {
        return numero_resolucion;
    }

    public void setNumero_resolucion(String numero_resolucion) {
        this.numero_resolucion = numero_resolucion;
    }

    public String getFecha_resolucion_coactiva() {
        return fecha_resolucion_coactiva;
    }

    public void setFecha_resolucion_coactiva(String fecha_resolucion_coactiva) {
        this.fecha_resolucion_coactiva = fecha_resolucion_coactiva;
    }

    public Predio getObjPredio() {
        return ObjPredio;
    }

    public void setObjPredio(Predio ObjPredio) {
        this.ObjPredio = ObjPredio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    

    public String getNumero_aviso_notificacion() {
        return numero_aviso_notificacion;
    }

    public void setNumero_aviso_notificacion(String numero_aviso_notificacion) {
        this.numero_aviso_notificacion = numero_aviso_notificacion;
    }

    public String getInformacion_consulta() {
        return informacion_consulta;
    }

    public void setInformacion_consulta(String informacion_consulta) {
        this.informacion_consulta = informacion_consulta;
    }

    public String getLugar_infraccion() {
        return lugar_infraccion;
    }

    public void setLugar_infraccion(String lugar_infraccion) {
        this.lugar_infraccion = lugar_infraccion;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getNumero_fiscal() {
        return numero_fiscal;
    }

    public void setNumero_fiscal(String numero_fiscal) {
        this.numero_fiscal = numero_fiscal;
    }

    public String getNumero_departamento() {
        return numero_departamento;
    }

    public void setNumero_departamento(String numero_departamento) {
        this.numero_departamento = numero_departamento;
    }

    public String getReferencia_direccion() {
        return referencia_direccion;
    }

    public void setReferencia_direccion(String referencia_direccion) {
        this.referencia_direccion = referencia_direccion;
    }

    public String getNumero_acta() {
        return numero_acta;
    }

    public void setNumero_acta(String numero_acta) {
        this.numero_acta = numero_acta;
    }

    public String getFecha_ejecucion() {
        return fecha_ejecucion;
    }

    public void setFecha_ejecucion(String fecha_ejecucion) {
        this.fecha_ejecucion = fecha_ejecucion;
    }

    public String getCodigo_ingraccion() {
        return codigo_ingraccion;
    }

    public void setCodigo_ingraccion(String codigo_ingraccion) {
        this.codigo_ingraccion = codigo_ingraccion;
    }

    public String getValor_obra() {
        return valor_obra;
    }

    public void setValor_obra(String valor_obra) {
        this.valor_obra = valor_obra;
    }

    public String getNumero_informe() {
        return numero_informe;
    }

    public void setNumero_informe(String numero_informe) {
        this.numero_informe = numero_informe;
    }

    public String getActa_constatacion() {
        return acta_constatacion;
    }

    public void setActa_constatacion(String acta_constatacion) {
        this.acta_constatacion = acta_constatacion;
    }

    public String getFecha_multa() {
        return fecha_multa;
    }

    public void setFecha_multa(String fecha_multa) {
        this.fecha_multa = fecha_multa;
    }

    public String getNumero_acta_constatacion() {
        return numero_acta_constatacion;
    }

    public void setNumero_acta_constatacion(String numero_acta_constatacion) {
        this.numero_acta_constatacion = numero_acta_constatacion;
    }

    public String getNumero_funcion() {
        return numero_funcion;
    }

    public void setNumero_funcion(String numero_funcion) {
        this.numero_funcion = numero_funcion;
    }

    public String getReclamo_expediente() {
        return reclamo_expediente;
    }

    public void setReclamo_expediente(String reclamo_expediente) {
        this.reclamo_expediente = reclamo_expediente;
    }

    public String getResolucion_anulacion() {
        return resolucion_anulacion;
    }

    public void setResolucion_anulacion(String resolucion_anulacion) {
        this.resolucion_anulacion = resolucion_anulacion;
    }

    public String getAnotacion_anulacion() {
        return anotacion_anulacion;
    }

    public void setAnotacion_anulacion(String anotacion_anulacion) {
        this.anotacion_anulacion = anotacion_anulacion;
    }

    public String getEstado_multa() {
        return estado_multa;
    }

    public void setEstado_multa(String estado_multa) {
        this.estado_multa = estado_multa;
    }

    public String getId_unico_multa() {
        return id_unico_multa;
    }

    public void setId_unico_multa(String id_unico_multa) {
        this.id_unico_multa = id_unico_multa;
    }

    public Cuenta getObjCuenta() {
        return ObjCuenta;
    }

    public void setObjCuenta(Cuenta ObjCuenta) {
        this.ObjCuenta = ObjCuenta;
    }

    public String getReincidente() {
        return reincidente;
    }

    public void setReincidente(String reincidente) {
        this.reincidente = reincidente;
    }

    public String getCodigo_sancion() {
        return codigo_sancion;
    }

    public void setCodigo_sancion(String codigo_sancion) {
        this.codigo_sancion = codigo_sancion;
    }

    public String getDetalle_sanacion() {
        return detalle_sanacion;
    }

    public void setDetalle_sanacion(String detalle_sanacion) {
        this.detalle_sanacion = detalle_sanacion;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    
    


    public static ArrayList<Multa> BuscarMultaAdministrativa(Multa m) {

        ArrayList<Multa> arr = null;
        ResultSet rs = null;
        Multa obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_java_multas_administrativas(?,?)}");

            if (m.getTipo_busqueda() != null) {
                if (m.getTipo_busqueda().length() > 0) {
                    st.setString(1, m.getTipo_busqueda());

                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (m.getInformacion_consulta() != null) {
                if (m.getInformacion_consulta().length() > 0) {
                    st.setString(2, m.getInformacion_consulta());

                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Multa>();
                do {

                    obj = new Multa();

                    obj.setNumero_multa(rs.getString("nnumnot"));
                    Predio Objpredio = new Predio();
                    Objpredio.setCodigo_predio(rs.getString("cpredio"));
                    obj.setObjPredio(Objpredio);

                    Persona ObjPersona = new Persona();

                    ObjPersona.setCodigo_contribuyente(rs.getString("ccontri"));
                    ObjPersona.setNombre_contribuyente(rs.getString("cnombre"));
                    ObjPersona.setDireccion_fiscal(rs.getString("dnomvia"));

                    obj.setObjPersona(ObjPersona);

                    Direccion ObjDireccion = new Direccion();
                    ObjDireccion.setNombre_via(rs.getString("via"));
                    ObjDireccion.setHabilitacion(rs.getString("haburb"));

                    obj.setObjDireccion(ObjDireccion);

                    obj.setReferencia_direccion(rs.getString("crefere"));

                    obj.setAnio_multa(rs.getString("cano"));
                    obj.setCorrelativo(rs.getString("ccorrel"));
                    
                    Sancion ObjSancion = new Sancion ();
                    
                    ObjSancion.setCodigo_sancion(rs.getString("cmulta"));
                    ObjSancion.setNombre_sancion(rs.getString("dmulta"));
                    
                    obj.setObjSancion(ObjSancion);
                    
                    obj.setNumero_resolucion(rs.getString("cnumres"));
                    obj.setFecha_resolucion(rs.getString("dfecres"));
                    obj.setMonto_multa(rs.getString("monto"));

                    Area ObjArea = new Area();
                    ObjArea.setId_area(rs.getString("cofisan"));
                    obj.setObjArea(ObjArea);

                    obj.setFecha_resolucion_coactiva(rs.getString("dfecrec"));
                    obj.setResolucion_anulacion(rs.getString("cresanu"));
                    obj.setReclamo_expediente(rs.getString("crecexp"));

                    Usuario ObjUsuario = new Usuario();
                    ObjUsuario.setUsuario(rs.getString("cusutra"));
                    obj.setObjUsuario(ObjUsuario);

                    obj.setFecha_registro(rs.getString("dfectra"));
                    obj.setHora_registro(rs.getString("dhortra"));
                    
                    Grupo ObjGrupo = new Grupo();
                    
                    ObjGrupo.setCodigo_tipo(rs.getString("csancio"));
                    
                    obj.setObjGrupo(ObjGrupo);
                    
                    obj.setFecha_notificacion(rs.getString("dfecnot"));
                    obj.setReincidente(rs.getString("nreinci"));

                    Cuenta Objcuenta = new Cuenta();
                    Objcuenta.setId_unico(rs.getString("id_unico"));
                    Objcuenta.setEstado_cuenta(rs.getString("cestado"));

                    obj.setObjCuenta(Objcuenta);

                    obj.setId_unico_multa(rs.getString("id_corrl"));
                    obj.setNumero_aviso_notificacion(rs.getString("NumAviso"));
                    obj.setDetalle_sanacion(rs.getString("msancio"));
                    obj.setObservacion(rs.getString("mobserv"));
                    obj.setManzana(rs.getString("manzana"));
                    obj.setLote(rs.getString("lote"));
                    obj.setNumero_fiscal(rs.getString("nro_fiscal"));
                    obj.setNumero_departamento(rs.getString("dpto_int"));
                    obj.setReferencia(rs.getString("referencia"));

                    Supervisor ObjInspector = new Supervisor();
                    ObjInspector.setApellidos_nombres(rs.getString("ins_municipal"));
                    obj.setObjInspector(ObjInspector);

                    obj.setNumero_acta(rs.getString("nro_acta"));
                    obj.setNumero_informe(rs.getString("nro_informe"));

                    Giro ObjGiro = new Giro();
                    ObjGiro.setCodigo_giro(rs.getString("giro"));
                    ObjGiro.setGiro_detalle(rs.getString("OTROS_GIROS"));

                    obj.setObjGiro(ObjGiro);

                    obj.setFecha_ejecucion(rs.getString("f_ejecucion"));
                    obj.setFecha_registro(rs.getString("f_registro"));
                    obj.setActa_constatacion(rs.getString("ACTA_CONSTATACION"));

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
    
    
     public static ArrayList<Multa> BuscarInfractor(Multa ObjBusquedaInfractor) {

        ArrayList<Multa> arr = null;
        ResultSet rs = null;
        Multa obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_java_direccion_fiscal(?)}");

            if (ObjBusquedaInfractor.ObjPersona.getCodigo_contribuyente()!= null) {
                if (ObjBusquedaInfractor.ObjPersona.getCodigo_contribuyente().length() > 0) {
                    st.setString(1,ObjBusquedaInfractor.ObjPersona.getCodigo_contribuyente());

                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }


            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Multa>();
                do {

                   obj = new Multa();

                    Persona ObjPersonas = new Persona();

                    ObjPersonas.setNombre_contribuyente(rs.getString("cnombre"));
                    ObjPersonas.setDireccion_fiscal(rs.getString("dnomvia"));
                    

                    obj.setObjPersona(ObjPersonas);

                    
                    
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

    public static boolean EditarMulta(Multa ObjEditarMulta) {
        boolean a = false;
        Connection conexion = null;
        /* variable de connexion para definir y manejar el conytrol de errores*/
        try {
            conexion = Controlador_Sql.darConexionBD();

            conexion.setAutoCommit(false);

            CallableStatement st = conexion.prepareCall("{call sp_java_registro_multas_administrativas (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            if (ObjEditarMulta.getNumero_funcion() != null) {

                if (ObjEditarMulta.getNumero_funcion().length() > 0) {
                    st.setString(1, ObjEditarMulta.getNumero_funcion());
                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (ObjEditarMulta.getNumero_notificacion() != null) {

                if (ObjEditarMulta.getNumero_notificacion().length() > 0) {

                    st.setString(2, ObjEditarMulta.getNumero_notificacion());
                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);

            }

            if (ObjEditarMulta.getFecha_notificacion() != null) {
                if (ObjEditarMulta.getFecha_notificacion().length() > 0) {
                    st.setString(3, ObjEditarMulta.getFecha_notificacion());
                } else {
                    st.setString(3, null);
                }
            } else {
                st.setString(3, null);

            }

            if (ObjEditarMulta.ObjPersona.getCodigo_contribuyente() != null) {

                if (ObjEditarMulta.ObjPersona.getCodigo_contribuyente().length() > 0) {
                    st.setString(4, ObjEditarMulta.ObjPersona.getCodigo_contribuyente());
                } else {
                    st.setString(4, null);
                }
            } else {
                st.setString(4, null);

            }

            if (ObjEditarMulta.ObjPredio.getCodigo_predio() != null) {
                if (ObjEditarMulta.ObjPredio.getCodigo_predio().length() > 0) {

                    st.setString(5, ObjEditarMulta.ObjPredio.getCodigo_predio());
                } else {
                    st.setString(5, null);
                }
            } else {
                st.setString(5, null);

            }

            if (ObjEditarMulta.getNumero_multa() != null) {

                if (ObjEditarMulta.getNumero_multa().length() > 0) {
                    st.setString(6, ObjEditarMulta.getNumero_multa());
                } else {
                    st.setString(6, null);
                }
            } else {
                st.setString(6, null);
            }

            if (ObjEditarMulta.getMonto_multa() != null) {

                if (ObjEditarMulta.getMonto_multa().length() > 0) {

                    st.setString(7, ObjEditarMulta.getMonto_multa());
                } else {
                    st.setString(7, null);
                }
            } else {
                st.setString(7, null);

            }

            if (ObjEditarMulta.getFecha_resolucion() != null) {

                if (ObjEditarMulta.getFecha_resolucion().length() > 0) {

                    st.setString(8, ObjEditarMulta.getFecha_resolucion());
                } else {
                    st.setString(8, null);
                }
            } else {
                st.setString(8, null);

            }

            if (ObjEditarMulta.getNumero_resolucion() != null) {

                if (ObjEditarMulta.getNumero_resolucion().length() > 0) {

                    st.setObject(9, ObjEditarMulta.getNumero_resolucion());
                } else {
                    st.setString(9, null);
                }
            } else {
                st.setString(9, null);

            }

            if (ObjEditarMulta.objArea.getId_area() != null) {

                if (ObjEditarMulta.objArea.getId_area().length() > 0) {
                    st.setString(10, ObjEditarMulta.objArea.getId_area());
                } else {
                    st.setString(10, null);
                }
            } else {
                st.setString(10, null);

            }

            if (ObjEditarMulta.getFecha_resolucion_coactiva() != null) {

                if (ObjEditarMulta.getFecha_resolucion_coactiva().length() > 0) {

                    st.setString(11, ObjEditarMulta.getFecha_resolucion_coactiva());
                } else {
                    st.setString(11, null);
                }
            } else {
                st.setString(11, null);

            }

            if (ObjEditarMulta.getReferencia_direccion() != null) {

                if (ObjEditarMulta.getReferencia_direccion().length() > 0) {
                    st.setString(12, ObjEditarMulta.getReferencia_direccion());
                } else {
                    st.setString(12, null);
                }
            } else {
                st.setString(12, null);

            }

            if (ObjEditarMulta.getResolucion_anulacion() != null) {

                if (ObjEditarMulta.getResolucion_anulacion().length() > 0) {
                    st.setString(13, ObjEditarMulta.getResolucion_anulacion());
                } else {
                    st.setString(13, null);
                }
            } else {
                st.setString(13, null);

            }

            if (ObjEditarMulta.getReclamo_expediente() != null) {

                if (ObjEditarMulta.getReclamo_expediente().length() > 0) {

                    st.setString(14, ObjEditarMulta.getReclamo_expediente());
                } else {
                    st.setString(14, null);
                }
            } else {
                st.setString(14, null);

            }

            if (ObjEditarMulta.getEstado_multa() != null) {

                if (ObjEditarMulta.getEstado_multa().length() > 0) {
                    st.setString(15, ObjEditarMulta.getEstado_multa());
                } else {
                    st.setString(15, null);
                }
            } else {
                st.setString(15, null);

            }

            if (ObjEditarMulta.ObjUsuario.getUsuario() != null) {

                if (ObjEditarMulta.ObjUsuario.getUsuario().length() > 0) {
                    st.setString(16, ObjEditarMulta.ObjUsuario.getUsuario());
                } else {
                    st.setString(16, null);
                }
            } else {
                st.setString(16, null);

            }

            if (ObjEditarMulta.getCodigo_sancion() != null) {

                if (ObjEditarMulta.getCodigo_sancion().length() > 0) {
                    st.setString(17, ObjEditarMulta.getCodigo_sancion());
                } else {
                    st.setString(17, null);
                }
            } else {
                st.setString(17, null);

            }

            if (ObjEditarMulta.getDetalle_sanacion() != null) {

                if (ObjEditarMulta.getDetalle_sanacion().length() > 0) {
                    st.setString(18, ObjEditarMulta.getDetalle_sanacion());
                } else {
                    st.setString(18, null);
                }
            } else {
                st.setString(18, null);

            }

            if (ObjEditarMulta.getObservacion() != null) {

                if (ObjEditarMulta.getObservacion().length() > 0) {
                    st.setString(19, ObjEditarMulta.getObservacion());
                } else {
                    st.setString(19, null);
                }
            } else {
                st.setString(19, null);

            }

            if (ObjEditarMulta.ObjCuenta.getId_unico() != null) {

                if (ObjEditarMulta.ObjCuenta.getId_unico().length() > 0) {
                    st.setString(20, ObjEditarMulta.ObjCuenta.getId_unico());
                } else {
                    st.setString(20, null);
                }
            } else {
                st.setString(20, null);

            }

            if (ObjEditarMulta.getId_unico_multa() != null) {

                if (ObjEditarMulta.getId_unico_multa().length() > 0) {

                    st.setString(21, ObjEditarMulta.getId_unico_multa());
                } else {
                    st.setString(21, null);
                }
            } else {
                st.setString(21, null);

            }

            if (ObjEditarMulta.getReincidente() != null) {

                if (ObjEditarMulta.getReincidente().length() > 0) {

                    st.setString(22, ObjEditarMulta.getReincidente());
                } else {
                    st.setString(22, null);
                }
            } else {
                st.setString(22, null);

            }

            if (ObjEditarMulta.getCorrelativo() != null) {

                if (ObjEditarMulta.getCorrelativo().length() > 0) {

                    st.setString(23, ObjEditarMulta.getCorrelativo());
                } else {
                    st.setString(23, null);
                }
            } else {
                st.setString(23, null);

            }

            if (ObjEditarMulta.getManzana() != null) {

                if (ObjEditarMulta.getManzana().length() > 0) {

                    st.setString(24, ObjEditarMulta.getManzana());
                } else {
                    st.setString(24, null);
                }
            } else {
                st.setString(24, null);

            }

            if (ObjEditarMulta.getLote() != null) {

                if (ObjEditarMulta.getLote().length() > 0) {

                    st.setString(25, ObjEditarMulta.getLote());
                } else {
                    st.setString(25, null);
                }
            } else {
                st.setString(25, null);

            }

            if (ObjEditarMulta.getNumero_fiscal() != null) {

                if (ObjEditarMulta.getNumero_fiscal().length() > 0) {

                    st.setString(26, ObjEditarMulta.getNumero_fiscal());
                } else {
                    st.setString(26, null);
                }
            } else {
                st.setString(26, null);

            }

            if (ObjEditarMulta.getNumero_departamento() != null) {

                if (ObjEditarMulta.getNumero_departamento().length() > 0) {

                    st.setString(27, ObjEditarMulta.getNumero_departamento());
                } else {
                    st.setString(27, null);
                }
            } else {
                st.setString(27, null);

            }

            if (ObjEditarMulta.getReferencia() != null) {

                if (ObjEditarMulta.getReferencia().length() > 0) {

                    st.setString(28, ObjEditarMulta.getReferencia());
                } else {
                    st.setString(28, null);
                }
            } else {
                st.setString(28, null);

            }

            if (ObjEditarMulta.objInspector.getApellidos_nombres() != null) {

                if (ObjEditarMulta.objInspector.getApellidos_nombres().length() > 0) {

                    st.setString(29, ObjEditarMulta.objInspector.getApellidos_nombres());
                } else {
                    st.setString(29, null);
                }
            } else {
                st.setString(29, null);

            }

            if (ObjEditarMulta.getNumero_acta() != null) {

                if (ObjEditarMulta.getNumero_acta().length() > 0) {

                    st.setString(30, ObjEditarMulta.getNumero_acta());
                } else {
                    st.setString(30, null);
                }
            } else {
                st.setString(30, null);

            }

            if (ObjEditarMulta.getNumero_informe() != null) {

                if (ObjEditarMulta.getNumero_informe().length() > 0) {

                    st.setString(31, ObjEditarMulta.getNumero_informe());
                } else {
                    st.setString(31, null);
                }
            } else {
                st.setString(31, null);

            }

            if (ObjEditarMulta.ObjGiro.getCodigo_giro() != null) {

                if (ObjEditarMulta.ObjGiro.getCodigo_giro().length() > 0) {

                    st.setString(32, ObjEditarMulta.ObjGiro.getCodigo_giro());
                } else {
                    st.setString(32, null);
                }
            } else {
                st.setString(32, null);

            }

            if (ObjEditarMulta.getFecha_ejecucion() != null) {

                if (ObjEditarMulta.getFecha_ejecucion().length() > 0) {

                    st.setString(33, ObjEditarMulta.getFecha_ejecucion());
                } else {
                    st.setString(33, null);
                }
            } else {
                st.setString(33, null);

            }

            if (ObjEditarMulta.getFecha_registro() != null) {

                if (ObjEditarMulta.getFecha_registro().length() > 0) {

                    st.setString(34, ObjEditarMulta.getFecha_registro());
                } else {
                    st.setString(34, null);
                }
            } else {
                st.setString(34, null);

            }

            if (ObjEditarMulta.ObjDireccion.getNombre_via() != null) {

                if (ObjEditarMulta.ObjDireccion.getNombre_via().length() > 0) {

                    st.setString(35, ObjEditarMulta.ObjDireccion.getNombre_via());
                } else {
                    st.setString(35, null);
                }
            } else {
                st.setString(35, null);

            }

            if (ObjEditarMulta.ObjDireccion.getHabilitacion() != null) {

                if (ObjEditarMulta.ObjDireccion.getHabilitacion().length() > 0) {

                    st.setString(36, ObjEditarMulta.ObjDireccion.getHabilitacion());
                } else {
                    st.setString(36, null);
                }
            } else {
                st.setString(36, null);

            }

            if (ObjEditarMulta.getActa_constatacion() != null) {

                if (ObjEditarMulta.getActa_constatacion().length() > 0) {

                    st.setString(37, ObjEditarMulta.getActa_constatacion());
                } else {
                    st.setString(37, null);
                }
            } else {
                st.setString(37, null);

            }

            if (ObjEditarMulta.ObjGiro.getGiro_detalle() != null) {

                if (ObjEditarMulta.ObjGiro.getGiro_detalle().length() > 0) {

                    st.setString(38, ObjEditarMulta.ObjGiro.getGiro_detalle());
                } else {
                    st.setString(38, null);
                }
            } else {
                st.setString(38, null);

            }

            //--------------------------------------- 
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

    public ArrayList<SelectItem> CargarComboGiro() {

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

    public static boolean registrarMulta(Multa ObjRegistrar) {

        boolean a = false;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();

            conexion.setAutoCommit(false);

            CallableStatement st = conexion.prepareCall("{call sp_java_registro_multas_administrativas (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            if (ObjRegistrar.getNumero_funcion() != null) {

                if (ObjRegistrar.getNumero_funcion().length() > 0) {
                    st.setString(1, ObjRegistrar.getNumero_funcion());
                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (ObjRegistrar.getNumero_notificacion() != null) {

                if (ObjRegistrar.getNumero_notificacion().length() > 0) {

                    st.setString(2, ObjRegistrar.getNumero_notificacion());
                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);

            }

            if (ObjRegistrar.getFecha_notificacion() != null) {
                if (ObjRegistrar.getFecha_notificacion().length() > 0) {
                    st.setString(3, ObjRegistrar.getFecha_notificacion());
                } else {
                    st.setString(3, null);
                }
            } else {
                st.setString(3, null);

            }

            if (ObjRegistrar.ObjPersona.getCodigo_contribuyente() != null) {

                if (ObjRegistrar.ObjPersona.getCodigo_contribuyente().length() > 0) {
                    st.setString(4, ObjRegistrar.ObjPersona.getCodigo_contribuyente());
                } else {
                    st.setString(4, null);
                }
            } else {
                st.setString(4, null);

            }

            if (ObjRegistrar.ObjPredio.getCodigo_predio() != null) {
                if (ObjRegistrar.ObjPredio.getCodigo_predio().length() > 0) {

                    st.setString(5, ObjRegistrar.ObjPredio.getCodigo_predio());
                } else {
                    st.setString(5, null);
                }
            } else {
                st.setString(5, null);

            }

            if (ObjRegistrar.getNumero_multa() != null) {

                if (ObjRegistrar.getNumero_multa().length() > 0) {
                    st.setString(6, ObjRegistrar.getNumero_multa());
                } else {
                    st.setString(6, null);
                }
            } else {
                st.setString(6, null);
            }

            if (ObjRegistrar.getMonto_multa() != null) {

                if (ObjRegistrar.getMonto_multa().length() > 0) {

                    st.setString(7, ObjRegistrar.getMonto_multa());
                } else {
                    st.setString(7, null);
                }
            } else {
                st.setString(7, null);

            }

            if (ObjRegistrar.getFecha_resolucion() != null) {

                if (ObjRegistrar.getFecha_resolucion().length() > 0) {

                    st.setString(8, ObjRegistrar.getFecha_resolucion());
                } else {
                    st.setString(8, null);
                }
            } else {
                st.setString(8, null);

            }

            if (ObjRegistrar.getNumero_resolucion() != null) {

                if (ObjRegistrar.getNumero_resolucion().length() > 0) {

                    st.setObject(9, ObjRegistrar.getNumero_resolucion());
                } else {
                    st.setString(9, null);
                }
            } else {
                st.setString(9, null);

            }

            if (ObjRegistrar.objArea.getId_area() != null) {

                if (ObjRegistrar.objArea.getId_area().length() > 0) {
                    st.setString(10, ObjRegistrar.objArea.getId_area());
                } else {
                    st.setString(10, null);
                }
            } else {
                st.setString(10, null);

            }

            if (ObjRegistrar.getFecha_resolucion_coactiva() != null) {

                if (ObjRegistrar.getFecha_resolucion_coactiva().length() > 0) {

                    st.setString(11, ObjRegistrar.getFecha_resolucion_coactiva());
                } else {
                    st.setString(11, null);
                }
            } else {
                st.setString(11, null);

            }

            if (ObjRegistrar.getReferencia_direccion() != null) {

                if (ObjRegistrar.getReferencia_direccion().length() > 0) {
                    st.setString(12, ObjRegistrar.getReferencia_direccion());
                } else {
                    st.setString(12, null);
                }
            } else {
                st.setString(12, null);

            }

            if (ObjRegistrar.getResolucion_anulacion() != null) {

                if (ObjRegistrar.getResolucion_anulacion().length() > 0) {
                    st.setString(13, ObjRegistrar.getResolucion_anulacion());
                } else {
                    st.setString(13, null);
                }
            } else {
                st.setString(13, null);

            }

            if (ObjRegistrar.getReclamo_expediente() != null) {

                if (ObjRegistrar.getReclamo_expediente().length() > 0) {

                    st.setString(14, ObjRegistrar.getReclamo_expediente());
                } else {
                    st.setString(14, null);
                }
            } else {
                st.setString(14, null);

            }

            if (ObjRegistrar.getEstado_multa() != null) {

                if (ObjRegistrar.getEstado_multa().length() > 0) {
                    st.setString(15, ObjRegistrar.getEstado_multa());
                } else {
                    st.setString(15, null);
                }
            } else {
                st.setString(15, null);

            }

            if (ObjRegistrar.ObjUsuario.getUsuario() != null) {

                if (ObjRegistrar.ObjUsuario.getUsuario().length() > 0) {
                    st.setString(16, ObjRegistrar.ObjUsuario.getUsuario());
                } else {
                    st.setString(16, null);
                }
            } else {
                st.setString(16, null);

            }

            if (ObjRegistrar.getCodigo_sancion() != null) {

                if (ObjRegistrar.getCodigo_sancion().length() > 0) {
                    st.setString(17, ObjRegistrar.getCodigo_sancion());
                } else {
                    st.setString(17, null);
                }
            } else {
                st.setString(17, null);

            }

            if (ObjRegistrar.getDetalle_sanacion() != null) {

                if (ObjRegistrar.getDetalle_sanacion().length() > 0) {
                    st.setString(18, ObjRegistrar.getDetalle_sanacion());
                } else {
                    st.setString(18, null);
                }
            } else {
                st.setString(18, null);

            }

            if (ObjRegistrar.getObservacion() != null) {

                if (ObjRegistrar.getObservacion().length() > 0) {
                    st.setString(19, ObjRegistrar.getObservacion());
                } else {
                    st.setString(19, null);
                }
            } else {
                st.setString(19, null);

            }

            if (ObjRegistrar.ObjCuenta.getId_unico() != null) {

                if (ObjRegistrar.ObjCuenta.getId_unico().length() > 0) {
                    st.setString(20, ObjRegistrar.ObjCuenta.getId_unico());
                } else {
                    st.setString(20, null);
                }
            } else {
                st.setString(20, null);

            }

            if (ObjRegistrar.getId_unico_multa() != null) {

                if (ObjRegistrar.getId_unico_multa().length() > 0) {

                    st.setString(21, ObjRegistrar.getId_unico_multa());
                } else {
                    st.setString(21, null);
                }
            } else {
                st.setString(21, null);

            }

            if (ObjRegistrar.getReincidente() != null) {

                if (ObjRegistrar.getReincidente().length() > 0) {

                    st.setString(22, ObjRegistrar.getReincidente());
                } else {
                    st.setString(22, null);
                }
            } else {
                st.setString(22, null);

            }

            if (ObjRegistrar.getCorrelativo() != null) {

                if (ObjRegistrar.getCorrelativo().length() > 0) {

                    st.setString(23, ObjRegistrar.getCorrelativo());
                } else {
                    st.setString(23, null);
                }
            } else {
                st.setString(23, null);

            }

            if (ObjRegistrar.getManzana() != null) {

                if (ObjRegistrar.getManzana().length() > 0) {

                    st.setString(24, ObjRegistrar.getManzana());
                } else {
                    st.setString(24, null);
                }
            } else {
                st.setString(24, null);

            }

            if (ObjRegistrar.getLote() != null) {

                if (ObjRegistrar.getLote().length() > 0) {

                    st.setString(25, ObjRegistrar.getLote());
                } else {
                    st.setString(25, null);
                }
            } else {
                st.setString(25, null);

            }

            if (ObjRegistrar.getNumero_fiscal() != null) {

                if (ObjRegistrar.getNumero_fiscal().length() > 0) {

                    st.setString(26, ObjRegistrar.getNumero_fiscal());
                } else {
                    st.setString(26, null);
                }
            } else {
                st.setString(26, null);

            }

            if (ObjRegistrar.getNumero_departamento() != null) {

                if (ObjRegistrar.getNumero_departamento().length() > 0) {

                    st.setString(27, ObjRegistrar.getNumero_departamento());
                } else {
                    st.setString(27, null);
                }
            } else {
                st.setString(27, null);

            }

            if (ObjRegistrar.getReferencia() != null) {

                if (ObjRegistrar.getReferencia().length() > 0) {

                    st.setString(28, ObjRegistrar.getReferencia());
                } else {
                    st.setString(28, null);
                }
            } else {
                st.setString(28, null);

            }

            if (ObjRegistrar.objInspector.getApellidos_nombres() != null) {

                if (ObjRegistrar.objInspector.getApellidos_nombres().length() > 0) {

                    st.setString(29, ObjRegistrar.objInspector.getApellidos_nombres());
                } else {
                    st.setString(29, null);
                }
            } else {
                st.setString(29, null);

            }

            if (ObjRegistrar.getNumero_acta() != null) {

                if (ObjRegistrar.getNumero_acta().length() > 0) {

                    st.setString(30, ObjRegistrar.getNumero_acta());
                } else {
                    st.setString(30, null);
                }
            } else {
                st.setString(30, null);

            }

            if (ObjRegistrar.getNumero_informe() != null) {

                if (ObjRegistrar.getNumero_informe().length() > 0) {

                    st.setString(31, ObjRegistrar.getNumero_informe());
                } else {
                    st.setString(31, null);
                }
            } else {
                st.setString(31, null);

            }

            if (ObjRegistrar.ObjGiro.getCodigo_giro() != null) {

                if (ObjRegistrar.ObjGiro.getCodigo_giro().length() > 0) {

                    st.setString(32, ObjRegistrar.ObjGiro.getCodigo_giro());
                } else {
                    st.setString(32, null);
                }
            } else {
                st.setString(32, null);

            }

            if (ObjRegistrar.getFecha_ejecucion() != null) {

                if (ObjRegistrar.getFecha_ejecucion().length() > 0) {

                    st.setString(33, ObjRegistrar.getFecha_ejecucion());
                } else {
                    st.setString(33, null);
                }
            } else {
                st.setString(33, null);

            }

            if (ObjRegistrar.getFecha_registro() != null) {

                if (ObjRegistrar.getFecha_registro().length() > 0) {

                    st.setString(34, ObjRegistrar.getFecha_registro());
                } else {
                    st.setString(34, null);
                }
            } else {
                st.setString(34, null);

            }

            if (ObjRegistrar.ObjDireccion.getNombre_via() != null) {

                if (ObjRegistrar.ObjDireccion.getNombre_via().length() > 0) {

                    st.setString(35, ObjRegistrar.ObjDireccion.getNombre_via());
                } else {
                    st.setString(35, null);
                }
            } else {
                st.setString(35, null);

            }

            if (ObjRegistrar.ObjDireccion.getHabilitacion() != null) {

                if (ObjRegistrar.ObjDireccion.getHabilitacion().length() > 0) {

                    st.setString(36, ObjRegistrar.ObjDireccion.getHabilitacion());
                } else {
                    st.setString(36, null);
                }
            } else {
                st.setString(36, null);

            }

            if (ObjRegistrar.getActa_constatacion() != null) {

                if (ObjRegistrar.getActa_constatacion().length() > 0) {

                    st.setString(37, ObjRegistrar.getActa_constatacion());
                } else {
                    st.setString(37, null);
                }
            } else {
                st.setString(37, null);

            }

            if (ObjRegistrar.ObjGiro.getGiro_detalle() != null) {

                if (ObjRegistrar.ObjGiro.getGiro_detalle().length() > 0) {

                    st.setString(38, ObjRegistrar.ObjGiro.getGiro_detalle());
                } else {
                    st.setString(38, null);
                }
            } else {
                st.setString(38, null);

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



    public ArrayList<SelectItem> CargarInspector() {

        ArrayList<SelectItem> arrayInspector = new ArrayList<SelectItem>();
        Supervisor Obj= null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_lista_inspectores()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arrayInspector.add(new SelectItem(rs.getString("id_inspector"), rs.getString("apellidos_nombres")));

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

        return arrayInspector;
    }

}
