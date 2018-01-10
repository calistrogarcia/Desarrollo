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
 * @author Administrador
 */
public class Licencia implements Serializable{
    
    
    private String tipo_busqueda;
    private String consulta;
    private String  fecha_presentacion_expediente;
    private String tipo_autorizacion;
    private String numero_meses;
    private String nombre_establecimiento;
    private String registro_unico_contribuyente;
    private int capacidad_aforo;
    private int numero_estacionamiento;
    private String sector_economico;
    private String area_local_comercial;
    private String area_construida;
    private String fecha_inicio_actividad;
    private String hora_inicio_actividad;
    private String hora_final_actividad;
    private String tipo_empresa;
    private String numero_trabajadores_hombres;
    private String numero_trabajadores_mujeres;
    private String zonificacion;
    private String clasificacion_negativa;
    private int compatibilidad_uso;
    private String numero_indeci;
    private String anotaciones;
    private String parametros;
    private String afecto_ordenanza;
    private String numero_folio;
    private String anotaciones_expediente;
    private String codigo_usuario_registro;
    private String nombre_usuario_registra;
    private String numero_conadis;
    private String estado;
    private String numero_licencia;
    private String fecha_licencia;
    
    
    

    Expediente ObjExpediente = new Expediente();
    Persona ObjPersona = new Persona();
    Predio ObjPredio = new Predio();
    Uso ObjUso= new Uso();
    Direccion ObjDireccion = new Direccion();
    Giro ObjGiros = new Giro();

    
    
  
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  
    
    public String getTipo_busqueda() {
        return tipo_busqueda;
    }

    public void setTipo_busqueda(String tipo_busqueda) {
        this.tipo_busqueda = tipo_busqueda;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getFecha_presentacion_expediente() {
        return fecha_presentacion_expediente;
    }

    public void setFecha_presentacion_expediente(String fecha_presentacion_expediente) {
        this.fecha_presentacion_expediente = fecha_presentacion_expediente;
    }
    
    public String getTipo_autorizacion() {
        return tipo_autorizacion;
    }

    public void setTipo_autorizacion(String tipo_autorizacion) {
        this.tipo_autorizacion = tipo_autorizacion;
    }

    public String getNumero_meses() {
        return numero_meses;
    }

    public void setNumero_meses(String numero_meses) {
        this.numero_meses = numero_meses;
    }

    public String getNombre_establecimiento() {
        return nombre_establecimiento;
    }

    public void setNombre_establecimiento(String nombre_establecimiento) {
        this.nombre_establecimiento = nombre_establecimiento;
    }

    public String getRegistro_unico_contribuyente() {
        return registro_unico_contribuyente;
    }

    public void setRegistro_unico_contribuyente(String registro_unico_contribuyente) {
        this.registro_unico_contribuyente = registro_unico_contribuyente;
    }

    public int getCapacidad_aforo() {
        return capacidad_aforo;
    }

    public void setCapacidad_aforo(int capacidad_aforo) {
        this.capacidad_aforo = capacidad_aforo;
    }

    public int getNumero_estacionamiento() {
        return numero_estacionamiento;
    }

    public void setNumero_estacionamiento(int numero_estacionamiento) {
        this.numero_estacionamiento = numero_estacionamiento;
    }

    public String getSector_economico() {
        return sector_economico;
    }

    public void setSector_economico(String sector_economico) {
        this.sector_economico = sector_economico;
    }

    public String getArea_local_comercial() {
        return area_local_comercial;
    }

    public void setArea_local_comercial(String area_local_comercial) {
        this.area_local_comercial = area_local_comercial;
    }

    public String getArea_construida() {
        return area_construida;
    }

    public void setArea_construida(String area_construida) {
        this.area_construida = area_construida;
    }

    public String getFecha_inicio_actividad() {
        return fecha_inicio_actividad;
    }

    public void setFecha_inicio_actividad(String fecha_inicio_actividad) {
        this.fecha_inicio_actividad = fecha_inicio_actividad;
    }

    public String getHora_inicio_actividad() {
        return hora_inicio_actividad;
    }

    public void setHora_inicio_actividad(String hora_inicio_actividad) {
        this.hora_inicio_actividad = hora_inicio_actividad;
    }

    public String getHora_final_actividad() {
        return hora_final_actividad;
    }

    public void setHora_final_actividad(String hora_final_actividad) {
        this.hora_final_actividad = hora_final_actividad;
    }

    public String getTipo_empresa() {
        return tipo_empresa;
    }

    public void setTipo_empresa(String tipo_empresa) {
        this.tipo_empresa = tipo_empresa;
    }

    public String getNumero_trabajadores_hombres() {
        return numero_trabajadores_hombres;
    }

    public void setNumero_trabajadores_hombres(String numero_trabajadores_hombres) {
        this.numero_trabajadores_hombres = numero_trabajadores_hombres;
    }

    public String getNumero_trabajadores_mujeres() {
        return numero_trabajadores_mujeres;
    }

    public void setNumero_trabajadores_mujeres(String numero_trabajadores_mujeres) {
        this.numero_trabajadores_mujeres = numero_trabajadores_mujeres;
    }

    public String getZonificacion() {
        return zonificacion;
    }

    public void setZonificacion(String zonificacion) {
        this.zonificacion = zonificacion;
    }

    public String getClasificacion_negativa() {
        return clasificacion_negativa;
    }

    public void setClasificacion_negativa(String clasificacion_negativa) {
        this.clasificacion_negativa = clasificacion_negativa;
    }

    public int getCompatibilidad_uso() {
        return compatibilidad_uso;
    }

    public void setCompatibilidad_uso(int compatibilidad_uso) {
        this.compatibilidad_uso = compatibilidad_uso;
    }

  

    public String getNumero_indeci() {
        return numero_indeci;
    }

    public void setNumero_indeci(String numero_indeci) {
        this.numero_indeci = numero_indeci;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getAfecto_ordenanza() {
        return afecto_ordenanza;
    }

    public void setAfecto_ordenanza(String afecto_ordenanza) {
        this.afecto_ordenanza = afecto_ordenanza;
    }

    public String getNumero_folio() {
        return numero_folio;
    }

    public void setNumero_folio(String numero_folio) {
        this.numero_folio = numero_folio;
    }

    public String getAnotaciones_expediente() {
        return anotaciones_expediente;
    }

    public void setAnotaciones_expediente(String anotaciones_expediente) {
        this.anotaciones_expediente = anotaciones_expediente;
    }

    public String getCodigo_usuario_registro() {
        return codigo_usuario_registro;
    }

    public void setCodigo_usuario_registro(String codigo_usuario_registro) {
        this.codigo_usuario_registro = codigo_usuario_registro;
    }

    public String getNombre_usuario_registra() {
        return nombre_usuario_registra;
    }

    public void setNombre_usuario_registra(String nombre_usuario_registra) {
        this.nombre_usuario_registra = nombre_usuario_registra;
    }

    public String getNumero_conadis() {
        return numero_conadis;
    }

    public void setNumero_conadis(String numero_conadis) {
        this.numero_conadis = numero_conadis;
    }

    public Expediente getObjExpediente() {
        return ObjExpediente;
    }

    public void setObjExpediente(Expediente ObjExpediente) {
        this.ObjExpediente = ObjExpediente;
    }

    public Persona getObjPersona() {
        return ObjPersona;
    }

    public void setObjPersona(Persona ObjPersona) {
        this.ObjPersona = ObjPersona;
    }

    public Predio getObjPredio() {
        return ObjPredio;
    }

    public void setObjPredio(Predio ObjPredio) {
        this.ObjPredio = ObjPredio;
    }

    public Uso getObjUso() {
        return ObjUso;
    }

    public void setObjUso(Uso ObjUso) {
        this.ObjUso = ObjUso;
    }

    public Direccion getObjDireccion() {
        return ObjDireccion;
    }

    public void setObjDireccion(Direccion ObjDireccion) {
        this.ObjDireccion = ObjDireccion;
    }

    public Giro getObjGiros() {
        return ObjGiros;
    }

    public void setObjGiros(Giro ObjGiros) {
        this.ObjGiros = ObjGiros;
    }

    public String getNumero_licencia() {
        return numero_licencia;
    }

   
    public void setNumero_licencia(String numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    public String getFecha_licencia() {
        return fecha_licencia;
    }

    public void setFecha_licencia(String fecha_licencia) {
        this.fecha_licencia = fecha_licencia;
    }
    
    
  
  public static ArrayList<Licencia> BuscarLicenciaFuncionamiento(Licencia ObjBuscarLicenciaFuncionamiento) {

        ArrayList<Licencia> arr = null;
        ResultSet rs = null;
        Licencia obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{ call dbo.sp_java_busqueda_licenciafuncionamiento_promocion_empresarial(?,?)}");


            
            if (ObjBuscarLicenciaFuncionamiento.getTipo_busqueda() != null) {
                if (ObjBuscarLicenciaFuncionamiento.getTipo_busqueda().length() > 0) {
                    st.setString(1, ObjBuscarLicenciaFuncionamiento.getTipo_busqueda());

                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            
              if (ObjBuscarLicenciaFuncionamiento.getConsulta()!= null) {
                if (ObjBuscarLicenciaFuncionamiento.getConsulta().length() > 0) {
                    st.setString(2, ObjBuscarLicenciaFuncionamiento.getConsulta() );

                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);
            }
              
              

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Licencia>();
                do {

                    obj = new Licencia();
                    
                    Persona ObjPersona = new Persona();
                    
                    ObjPersona.setCodigo_contribuyente(rs.getString("ccontri"));
                    ObjPersona.setNombre_contribuyente(rs.getString("cnombre"));
                    ObjPersona.setNombre_representante(rs.getString("nombrep"));
                    ObjPersona.setTipo_documento(rs.getString("ctipdocr"));
                    ObjPersona.setNumero_documento(rs.getString("cnumdocr"));
                    ObjPersona.setNumero_telefono_contribuyente(rs.getString("ctelfonr"));

                    obj.setObjPersona(ObjPersona);
                   
                    Predio ObjPredio = new Predio();
                    
                    ObjPredio.setDireccion_predio(rs.getString("cdirpred"));
                    ObjPredio.setCodigo_predio(rs.getString("cpredio"));
                    ObjPredio.setEstado_predio(rs.getString("nestpred"));
                    
                    
                    obj.setObjPredio(ObjPredio);
                    
                    
                     Uso ObjUso = new Uso();
                    
                     ObjUso.setNombre_uso(rs.getString("cusopre"));
                     
                     obj.setObjUso(ObjUso);
                     
                     obj.setRegistro_unico_contribuyente(rs.getString("cruc"));
                     obj.setNombre_establecimiento(rs.getString("cnombest"));
                     obj.setFecha_inicio_actividad(rs.getString("dfecini"));
                     obj.setHora_inicio_actividad(rs.getString("dhorini"));
                     obj.setHora_final_actividad(rs.getString("dhorfin"));
                     obj.setTipo_empresa(rs.getString("ctipemp"));
                     obj.setCapacidad_aforo(rs.getInt("ncapacid"));
                     obj.setNumero_estacionamiento(rs.getInt("nestacio"));
                     obj.setSector_economico(rs.getString("csectore"));
                     obj.setArea_local_comercial(rs.getString("narealoc"));
                     obj.setArea_construida(rs.getString("nareacon"));
                     obj.setNumero_trabajadores_hombres(rs.getString("nnumhom"));
                     obj.setNumero_trabajadores_mujeres(rs.getString("nnummuj"));
                     
                     Giro ObjGiro = new Giro();
                     ObjGiro.setGiro_detalle(rs.getString("cgiros"));
                     
                     obj.setObjGiros(ObjGiro);

                     
                     obj.setZonificacion(rs.getString("czonfic"));
                     obj.setClasificacion_negativa(rs.getString("cclasif"));
                     obj.setAnotaciones(rs.getString("Vobserv"));
                     obj.setAfecto_ordenanza(rs.getString("cordenanza"));
                     obj.setEstado(rs.getString("xestado"));
                     obj.setTipo_autorizacion(rs.getString("ctipaut"));
                     obj.setCompatibilidad_uso(rs.getInt("nconpat"));
                     obj.setNumero_conadis(rs.getString("cconadis"));
                     obj.setNumero_licencia(rs.getString("cnunlic"));
                     obj.setFecha_licencia(rs.getString("dfeclic"));
                     
                     Expediente ObjExpediente = new Expediente();
                     ObjExpediente.setNumero_expediente(rs.getString("dnumold"));
                     
                     obj.setObjExpediente(ObjExpediente);

                     
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
