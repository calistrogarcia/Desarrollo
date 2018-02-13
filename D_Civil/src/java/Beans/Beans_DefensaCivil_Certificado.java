/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Supervisor;
import Modelo.Asignar;
import Modelo.Certificado;
import static com.sun.faces.el.FacesCompositeELResolver.ELResolverChainType.Faces;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;
import utils.Constantes;
import utils.Mensaje;
import org.primefaces.model.UploadedFile;
import Modelo.Controlador_Sql;
import java.io.IOException;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.CallableStatement;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrador
 */
public class Beans_DefensaCivil_Certificado implements Serializable{

    /**
     *
     */
    private Certificado objCertificadoReg;
    private Certificado objCertificadoMod;
    private Certificado ObjCertificadoActualizarDatos;
    private Certificado objCertificadoDetalle;
    private Certificado objEliminaCertificado;
    private Certificado objBuscarCertificado;
    private Certificado objBuscarGenerarResolucion;
    private Certificado objFinalizarExpedienteIpse;
    private Certificado objDocumentoResolverReg;
    private Certificado objRegistrarArchivoVirtual;
    private Certificado objBuscarArchivoVirtual;
    

    private ArrayList<Certificado> arrCertificado = null;
    private ArrayList<Certificado> arrBusCertificado = null;
    private ArrayList<Certificado> arrArchivoVirtual = null;
    private ArrayList<Certificado> arrBusArchivoVirtual = null;
    private Certificado objBuscarReporteResoluciones;
    private ArrayList<Certificado> arrReporteResoluciones = null;
    private ArrayList<Certificado> arrBusReporteResoluciones = null;

    private String numero_expediente;
    private String tipo;               // Tipo 1 para Certificado
    private String acto;

//TabView
    private Integer activeTabIndex;
    private boolean bandVer = true;
    private boolean bandMod = true;
    private boolean bandEli = true;
    private boolean bandAsignar = true;

    public String getActo() {
        return acto;
    }

    public void setActo(String acto) {
        this.acto = acto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Certificado getObjCertificadoActualizarDatos() {
        return ObjCertificadoActualizarDatos;
    }

    public void setObjCertificadoActualizarDatos(Certificado ObjCertificadoActualizarDatos) {
        this.ObjCertificadoActualizarDatos = ObjCertificadoActualizarDatos;
    }

    // Radio
    private String tipo_itse;
    private List<String> nombre_tipo_itse, nombre_tipo_acto, periodo_vigencia;

    public String getTipo_itse() {
        return tipo_itse;
    }

    public void setTipo_itse(String tipo_itse) {
        this.tipo_itse = tipo_itse;
    }

    public List<String> getNombre_tipo_itse() {
        return nombre_tipo_itse;
    }

    public void setNombre_tipo_itse(List<String> nombre_tipo_itse) {
        this.nombre_tipo_itse = nombre_tipo_itse;
    }

    public List<String> getNombre_tipo_acto() {
        return nombre_tipo_acto;
    }

    public void setNombre_tipo_acto(List<String> nombre_tipo_acto) {
        this.nombre_tipo_acto = nombre_tipo_acto;
    }

    public List<String> getPeriodo_vigencia() {
        return periodo_vigencia;
    }

    public void setPeriodo_vigencia(List<String> periodo_vigencia) {
        this.periodo_vigencia = periodo_vigencia;
    }

    @PostConstruct

    public void init() {
        nombre_tipo_itse = new ArrayList<String>();
        nombre_tipo_acto = new ArrayList<String>();
        periodo_vigencia = new ArrayList<String>();

        nombre_tipo_itse.add("BASICO EX POST");
        nombre_tipo_itse.add("BASICO EX ANTE");
        nombre_tipo_itse.add("DE DETALLE");

        nombre_tipo_acto.add("RESOLUCION");
        nombre_tipo_acto.add("OFICIO");
        nombre_tipo_acto.add("CARTA");

        periodo_vigencia.add("INDETERMINADO");
        periodo_vigencia.add("DOS AÑOS");

    }

    //Bandera que apunta si el usuario al realizar un clik sobre el link de busquedad o listado total
    private String puntAnt;

    public Certificado getObjCertificadoReg() {
        return objCertificadoReg;
    }

    public void setObjCertificadoReg(Certificado objCertificadoReg) {
        this.objCertificadoReg = objCertificadoReg;
    }

    public Certificado getObjCertificadoMod() {
        return objCertificadoMod;
    }

    public void setObjCertificadoMod(Certificado objCertificadoMod) {
        this.objCertificadoMod = objCertificadoMod;
    }

    public Certificado getObjCertificadoDetalle() {
        return objCertificadoDetalle;
    }

    public void setObjCertificadoDetalle(Certificado objCertificadoDetalle) {
        this.objCertificadoDetalle = objCertificadoDetalle;
    }

    public Certificado getObjEliminaCertificado() {
        return objEliminaCertificado;
    }

    public Certificado getObjBuscarCertificado() {
        return objBuscarCertificado;
    }

    public void setObjBuscarCertificado(Certificado objBuscarCertificado) {
        this.objBuscarCertificado = objBuscarCertificado;
    }

    public Certificado getObjBuscarReporteResoluciones() {
        return objBuscarReporteResoluciones;
    }

    public void setObjBuscarReporteResoluciones(Certificado objBuscarReporteResoluciones) {
        this.objBuscarReporteResoluciones = objBuscarReporteResoluciones;
    }

    public void setObjEliminaCertificado(Certificado objEliminaCertificado) {
        this.objEliminaCertificado = objEliminaCertificado;
    }

    public ArrayList<Certificado> getArrCertificado() {
        return arrCertificado;
    }

    public void setArrCertificado(ArrayList<Certificado> arrCertificado) {
        this.arrCertificado = arrCertificado;
    }

    public ArrayList<Certificado> getArrReporteResoluciones() {
        return arrReporteResoluciones;
    }

    public void setArrReporteResoluciones(ArrayList<Certificado> arrReporteResoluciones) {
        this.arrReporteResoluciones = arrReporteResoluciones;
    }

    public ArrayList<Certificado> getArrBusReporteResoluciones() {
        return arrBusReporteResoluciones;
    }

    public void setArrBusReporteResoluciones(ArrayList<Certificado> arrBusReporteResoluciones) {
        this.arrBusReporteResoluciones = arrBusReporteResoluciones;
    }

    public Certificado getObjDocumentoResolverReg() {
        return objDocumentoResolverReg;
    }

    public void setObjDocumentoResolverReg(Certificado objDocumentoResolverReg) {
        this.objDocumentoResolverReg = objDocumentoResolverReg;
    }

    public Certificado getObjRegistrarArchivoVirtual() {
        return objRegistrarArchivoVirtual;
    }

    public void setObjRegistrarArchivoVirtual(Certificado objRegistrarArchivoVirtual) {
        this.objRegistrarArchivoVirtual = objRegistrarArchivoVirtual;
    }

    public Certificado getObjBuscarArchivoVirtual() {
        return objBuscarArchivoVirtual;
    }

    public void setObjBuscarArchivoVirtual(Certificado objBuscarArchivoVirtual) {
        this.objBuscarArchivoVirtual = objBuscarArchivoVirtual;
    }

    public ArrayList<Certificado> getArrArchivoVirtual() {
        return arrArchivoVirtual;
    }

    public void setArrArchivoVirtual(ArrayList<Certificado> arrArchivoVirtual) {
        this.arrArchivoVirtual = arrArchivoVirtual;
    }

    public ArrayList<Certificado> getArrBusArchivoVirtual() {
        return arrBusArchivoVirtual;
    }

    public void setArrBusArchivoVirtual(ArrayList<Certificado> arrBusArchivoVirtual) {
        this.arrBusArchivoVirtual = arrBusArchivoVirtual;
    }

    public Integer getActiveTabIndex() {
        return activeTabIndex;
    }

    public void setActiveTabIndex(Integer activeTabIndex) {
        this.activeTabIndex = activeTabIndex;
    }

    public boolean isBandVer() {
        return bandVer;
    }

    public void setBandVer(boolean bandVer) {
        this.bandVer = bandVer;
    }

    public boolean isBandMod() {
        return bandMod;
    }

    public ArrayList<Certificado> getArrBusCertificado() {
        return arrBusCertificado;
    }

    public void setArrBusCertificado(ArrayList<Certificado> arrBusCertificado) {
        this.arrBusCertificado = arrBusCertificado;
    }

    public void setBandMod(boolean bandMod) {
        this.bandMod = bandMod;
    }

    public boolean isBandEli() {
        return bandEli;
    }

    public void setBandEli(boolean bandEli) {
        this.bandEli = bandEli;
    }

    public boolean isBandAsignar() {
        return bandAsignar;
    }

    public void setBandAsignar(boolean bandAsignar) {
        this.bandAsignar = bandAsignar;
    }

    public String getNumero_expediente() {
        return numero_expediente;
    }

    public void setNumero_expediente(String numero_expediente) {
        this.numero_expediente = numero_expediente;
    }

    public Certificado getObjBuscarGenerarResolucion() {
        return objBuscarGenerarResolucion;
    }

    public void setObjBuscarGenerarResolucion(Certificado objBuscarGenerarResolucion) {
        this.objBuscarGenerarResolucion = objBuscarGenerarResolucion;
    }

    public Certificado getObjFinalizarExpedienteIpse() {
        return objFinalizarExpedienteIpse;
    }

    public void setObjFinalizarExpedienteIpse(Certificado objFinalizarExpedienteIpse) {
        this.objFinalizarExpedienteIpse = objFinalizarExpedienteIpse;
    }


   
    
    
    //-----------------Iniciallzaciones -----------------------------
    public void doiniciarListadoCertificado() {
        arrCertificado = new ArrayList<Certificado>();

    }

    public void doiniciarListadoReporteResoluciones() {
        arrReporteResoluciones = new ArrayList<Certificado>();

    }

    public void doiniciarObjBusArchivoVirtual() {

        this.objBuscarArchivoVirtual = new Certificado();

    }

    public void doiniciarRegistroArchivoVirtual() {

        this.objRegistrarArchivoVirtual = new Certificado();
    }

  

    public void doiniciarFinalizarExpedienteIpse() {

        this.objFinalizarExpedienteIpse = new Certificado();
    }

    public void doiniciarObjBusCertificado() {

        this.objBuscarCertificado = new Certificado();
    }

    public void doiniciarObjBusGerenerarResolucion() {

        this.objBuscarGenerarResolucion = new Certificado();
    }

    public void doiniciarRegistroCertificado() {
        this.objCertificadoReg = new Certificado();
    }

    public void doiniciarRegistroResolverDocumento() {
        this.objDocumentoResolverReg = new Certificado();
    }

    public void doiniciarObjBusReporteResoluciones() {
        this.objBuscarReporteResoluciones = new Certificado();
    }

    public void doiniciarActualizarDatos() {
        this.ObjCertificadoActualizarDatos = new Certificado();
    }

    public void doiniciarModificarCertificado() {
        this.objCertificadoMod = new Certificado();
    }

    public void doiniciarEliminarCertificado() {
        this.objEliminaCertificado = new Certificado();
    }

    //Iniciallzaciones para arrays
    public void doiniciarBusquedaCertificado() {

        this.arrBusCertificado = new ArrayList<Certificado>();
        this.objBuscarCertificado = new Certificado();

    }

    // inicializaciones
    public void doiniciarBusquedaArchivoVirtual() {
        this.arrBusArchivoVirtual = new ArrayList<Certificado>();
        this.objBuscarArchivoVirtual = new Certificado();

    }

    // inicializaciones 
    public void doiniciarBusquedaReporteResoluciones() {
        this.arrBusReporteResoluciones = new ArrayList<Certificado>();
        this.objBuscarReporteResoluciones = new Certificado();

    }

    public String getPuntAnt() {
        return puntAnt;
    }

    public void setPuntAnt(String puntAnt) {
        this.puntAnt = puntAnt;
    }

    public Beans_DefensaCivil_Certificado() {

        try {
            doiniciarRegistroArchivoVirtual();
            doiniciarRegistroResolverDocumento();
            doiniciarObjBusCertificado();
            doiniciarBusquedaArchivoVirtual();
            doiniciarObjBusGerenerarResolucion();
      

        } catch (Exception e) {
            Mensaje.manejarError(e, "Error al Iniciar Proceso");
        }

    }

    public String doRegArchivoVirtual() {
        try {
            if (Certificado.subirArchivosDigitales(objRegistrarArchivoVirtual)) {
                Mensaje.guardarMensajeExito("Registrar Archivo", "Registrado Correctamente");
                this.doiniciarRegistroArchivoVirtual();
            } else {
                Mensaje.manejarError("Subir Archivo", "Error de Registro, Verificar Algoritmo");
            }
        } catch (Exception e) {
            Mensaje.manejarError(e, "Registrar Archivo Virtual");
        }
        return null;

    }

    public void descarga_Archivo_Virtual() {

        Connection conexion = null;
        ResultSet rs;

        try {

            byte[] bytes = null;

            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            PreparedStatement st = conexion.prepareCall("{call dbo.sp_java_archivo_virtual(?)}");
            st.setInt(1, id_legajo);

            rs = st.executeQuery();
            while (rs.next()) {
                bytes = rs.getBytes("archivo");
            }
            conexion.close();

            FacesMessage message = new FacesMessage("Succesful", " Fue Descargado");
            FacesContext.getCurrentInstance().addMessage(null, message);
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();

            response.getOutputStream().write(bytes);
            response.setContentType("application/pdf");
            response.addHeader("Content-Type", "application/pdf");

            response.getOutputStream().close();

            FacesContext.getCurrentInstance().responseComplete();

        } catch (Exception e) {

            FacesMessage message = new FacesMessage("Error de Conexion");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }

    }

    

    public String doResolverExpediente() {

        this.bandMod = true;
        try {
            if (Certificado.ResolverExpediente(objFinalizarExpedienteIpse)) {

                Mensaje.guardarMensajeExito("Resolver Documento", "Resuelto Correctamente");
            } else {
                Mensaje.manejarError("Resolver Documento", "Error de Modificacion");
            }
        } catch (Exception e) {
            Mensaje.manejarError(e, "Resolver Documento");
        }
        if (puntAnt.compareTo("1") == 0) {
            this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("2") == 0) {
                this.doListarCertificado();
                this.activeTabIndex = Constantes.TAB_BUSQUEDA;
            }
        }
        return null;

    }

    public ArrayList<Certificado> doListarCertificado() {
        this.doiniciarListadoCertificado();
        //Lista Certificado
        // this.arrCertificado=Certificado.getBuscaExpedientesPorcodigo(objBuscarCertificado);
        return this.arrCertificado;
    }

    public ArrayList<Certificado> doListarReporteResoluciones() {

        this.doiniciarListadoReporteResoluciones();
        return this.arrBusReporteResoluciones;
    }

    public ArrayList<Certificado> doBuscarCertificado() {

        this.arrBusCertificado = new ArrayList<Certificado>();
        this.arrBusCertificado = Certificado.getBuscaExpedientesPorcodigo(objBuscarCertificado);

        return this.arrBusCertificado;

    }

    public ArrayList<Certificado> doBuscarReporteResoluciones() {

        //Lista Certificado
        this.arrBusReporteResoluciones = new ArrayList<Certificado>();
        this.arrBusReporteResoluciones = Certificado.getBuscaReporteResoluciones(objBuscarGenerarResolucion);

        return this.arrBusReporteResoluciones;

    }

    public ArrayList<Certificado> doBuscarArchivoVirtual() {

        //Lista Certificado
        this.arrBusArchivoVirtual = new ArrayList<Certificado>();
        this.arrBusArchivoVirtual = Certificado.descargarArchivosDigitales(objBuscarArchivoVirtual);

        return this.arrBusArchivoVirtual;

    }

    public ArrayList<Certificado> dogenerarResoluciones() {

        this.arrBusReporteResoluciones = new ArrayList<Certificado>();
        //Lista Certificado
        this.arrBusReporteResoluciones = Certificado.getGenerarResoluciones(objBuscarCertificado);

        return this.arrBusReporteResoluciones;
    }

    public String getSizeRegistrosCertificado() {

        if (this.arrCertificado == null) {
            return "0";
        } else {
            return "" + this.arrCertificado.size();
        }
    }

    public String getSizeRegistrosBusCertificado() {

        if (this.arrBusCertificado == null) {
            return "0";
        } else {
            return "" + this.arrBusCertificado.size();
        }
    }

    public String getSizeRegistrosArchivoVirtual() {

        if (this.arrArchivoVirtual == null) {
            return "0";
        } else {
            return "" + this.arrArchivoVirtual.size();
        }
    }

    public String getSizeRegistrosBusArchivoVirtual() {

        if (this.arrBusArchivoVirtual == null) {
            return "0";
        } else {
            return "" + this.arrBusArchivoVirtual.size();
        }
    }

    public String getSizeRegistrosReporteResoluciones() {

        if (this.arrReporteResoluciones == null) {
            return "0";
        } else {
            return "" + this.arrReporteResoluciones.size();
        }
    }

    public String getSizeRegistrosBusReporteResoluciones() {
        if (this.arrBusReporteResoluciones == null) {
            return "0";
        } else {
            return "" + this.arrBusReporteResoluciones.size();
        }
    }

    public String doDesactivaTabReg() {
        this.activeTabIndex = 1;
        this.doiniciarRegistroCertificado();
        return null;
    }

    public String mostrarDetalleCertificado(Certificado sg) {
        this.objCertificadoDetalle = sg;
        this.bandVer = false;
        this.activeTabIndex = 3; //3
        //Hace Visible el Formulario para Mostrar Detalle                 
        return null;
    }

    public String eliminarCertificado(Certificado wo) {

        this.objEliminaCertificado = wo;
        this.activeTabIndex = 2;
        this.bandEli = false;
        return null;
    }

    //para Modificar el ipse  
    public String modificarCertificado(Certificado so) {

        this.doiniciarModificarCertificado();
        this.objCertificadoMod = so;
        this.bandMod = false;
        this.activeTabIndex = 1;  // Verifica la Posesion de la Pestaña para activarla. -- Ver Constantes       
        return null;
    }

    // para imprimir resoluciones ipse
    public String Generar_resoluciones_ipse(Certificado ge) {

        this.doiniciarBusquedaReporteResoluciones();
        this.objBuscarGenerarResolucion = ge;
        this.bandMod = false;
        this.activeTabIndex = 2;  // Verifica la Posesion de la Pestaña para activarla. -- Ver Constantes       
        return null;
    }

    public String Finalizar_Expediente_Ipse(Certificado fi) {

        this.doiniciarModificarCertificado();
        this.objFinalizarExpedienteIpse = fi;
        this.bandMod = false;
        this.activeTabIndex = 3;  // Verifica la Posesion de la Pestaña para activarla. -- Ver Constantes       
        return null;
    }

    // para anexar archivos virtuales ipse
    public String RegistrarArchivoVirtual(Certificado re) {

        this.doiniciarRegistroArchivoVirtual();
        this.objRegistrarArchivoVirtual = re;
        this.bandMod = false;
        this.activeTabIndex = 5;  // Verifica la Posesion de la Pestaña para activarla. -- Ver Constantes       
        return null;
    }

    public String BuscarArchivoVirtual(Certificado bu) {

        this.doiniciarBusquedaArchivoVirtual();
        this.objBuscarArchivoVirtual = bu;
        this.bandMod = false;
        this.activeTabIndex = 4;  // Verifica la Posesion de la Pestaña para activarla. -- Ver Constantes       
        return null;
    }

    public String ActuaizarDatos(Certificado actualizardatos) {
        this.doiniciarActualizarDatos();
        this.ObjCertificadoActualizarDatos = actualizardatos;
        this.bandMod = false;
        this.activeTabIndex = 1;  // Verifica la Posesion de la Pestaña para activarla. en total Hay Iten 2-- Ver Constantes       
        return null;
    }

   


    
    public String desactivaTabMod() {

        this.bandMod = true;
        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 

        if (puntAnt.compareTo("2") == 0) {
            this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {

            if (puntAnt.compareTo("1") == 0) {
                // this.doListarCertificado();

                this.doiniciarModificarCertificado();
                this.activeTabIndex = Constantes.TAB_MODIFICAR;

                //this.activeTabIndex=Constantes.TAB_ELIMINAR;
            }
        }
        Mensaje.guardarMensajeExito("Cancelar la Modificación de Certificado !!!", "Certificado");

        return null;
    }

    //--------------------Desactivar cuando se ejecuta evento de cancelar -------------------------------------------------
    public String desactivaTabModificarIpse() {

        this.bandMod = true;

        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
        if (puntAnt.compareTo("2") == 0) {

            this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {

            if (puntAnt.compareTo("1") == 0) {
                // this.doListarCertificado();

                this.doiniciarModificarCertificado();
                this.activeTabIndex = Constantes.TAB_MODIFICAR;

                //this.activeTabIndex=Constantes.TAB_ELIMINAR;
            }
        }

        Mensaje.guardarMensajeExito("Cancelar, Editar Ipse !!!", "Inspeccion Tecnica de Seguridad");

        return null;
    }

    //--------------------Desactivar cuando se ejecuta evento de cancelar -------------------------------------------------
    public String desactivaVistaConsultaArchivos() {

        this.bandMod = true;

        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
        if (puntAnt.compareTo("2") == 0) {

            this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {

            if (puntAnt.compareTo("1") == 0) {
                // this.doListarCertificado();

                this.doiniciarModificarCertificado();
                this.activeTabIndex = Constantes.TAB_MODIFICAR;

                //this.activeTabIndex=Constantes.TAB_ELIMINAR;
            }
        }

        Mensaje.guardarMensajeExito("Cancelar, Editar Ipse !!!", "Inspeccion Tecnica de Seguridad");

        return null;
    }

    public String desactivaTabModAsignacionExpediente() {
        this.bandMod = true;
        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 

        if (puntAnt.compareTo("2") == 0) {

            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("1") == 0) {

                this.activeTabIndex = Constantes.TAB_MODIFICAR;
            }
        }
        Mensaje.guardarMensajeExito("Cancelar la Modificación de Expediente !!!", "Asignacion");

        return null;

    }

    //--------------------------------------------------------------------------------------------------------------------
    public String desactivaTabGenerarResolucionesIpse() {

        this.bandMod = true;
        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 

        if (puntAnt.compareTo("2") == 0) {

            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {

            if (puntAnt.compareTo("1") == 0) {

                this.activeTabIndex = Constantes.TAB_MODIFICAR;

            }
        }
        Mensaje.guardarMensajeExito("Cancelar, Generar Resolucion Ipse !!!", " Generar Resolucion Ipse ");

        return null;
    }

    //--------------------------------------------------------------------------------------------------------------------
    public String desactivaTabResolverIpse() {

        this.bandMod = true;
        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 

        if (puntAnt.compareTo("2") == 0) {
            this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {

            if (puntAnt.compareTo("1") == 0) {
                // this.doListarCertificado();

                this.doiniciarModificarCertificado();
                this.activeTabIndex = Constantes.TAB_MODIFICAR;

                //this.activeTabIndex=Constantes.TAB_ELIMINAR;
            }
        }
        Mensaje.guardarMensajeExito("Cancelar, Resolver Ipse !!!", "Inspeccion Tecnica de Seguridad");

        return null;
    }

    //---------------------------Cancelar boton:  eliminar Ipse tab_eliminar_ipse------------------------------------------
    public String desactivaEliminarIpse() {

        this.bandEli = true;

        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
        if (puntAnt.compareTo("2") == 0) {

            this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {

            if (puntAnt.compareTo("1") == 0) {
                // this.doListarCertificado();

                this.doiniciarEliminarCertificado();
                this.activeTabIndex = Constantes.TAB_ELIMINAR;

                //this.activeTabIndex=Constantes.TAB_ELIMINAR;
            }
        }

        Mensaje.guardarMensajeExito("Cancelar, Eliminar Ipse !!!", "Cancelar");

        return null;
    }

    //----------------------------------------------------------------------------------------------------------------------
    public String desactivaTabElim() {

        this.bandEli = true;
        //Pregunta si la Detalle Mostrada Proviene de una Busqueda Simple:2 o de un listado total:1 
        if (puntAnt.compareTo("1") == 0) {
            this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("2") == 0) {
                this.doListarCertificado();
                this.activeTabIndex = Constantes.TAB_ELIMINAR;
            }
        }
        Mensaje.guardarMensajeExito("Cancelar la Eliminaciòn de Certificado !!!", "Certificado");
        return null;
    }

    public String doModCertificado() {

        this.bandMod = true;
        try {
            if (Certificado.MoficardatosParaCertificado(objCertificadoMod)) {
                Mensaje.guardarMensajeExito("Actualizar Certificado", "Actualizado Correctamente");
            } else {
                Mensaje.manejarError("Actualizar Certificado", "Error de Modificacion");
            }
        } catch (Exception e) {
            Mensaje.manejarError(e, "Actualizar Certificado");
        }
        if (puntAnt.compareTo("1") == 0) {
            this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("2") == 0) {
                //  this.doListarCertificado();
                this.activeTabIndex = Constantes.TAB_BUSQUEDA;
            }
        }
        return null;
    }

    public String doActualizarDatosExpediente() {
        this.bandMod = true;
        try {
            if (Certificado.ActualizarDatosExpediente(ObjCertificadoActualizarDatos)) {

                Mensaje.guardarMensajeExito("Actualizar Certificado", "Actualizado Correctamente");
            } else {
                Mensaje.manejarError("Actualizar Certificado", "Error de Modificacion");
            }
        } catch (Exception e) {
            Mensaje.manejarError(e, "Actualizar Certificado");
        }
        if (puntAnt.compareTo("1") == 0) {
            this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("2") == 0) {
                this.doListarCertificado();
                this.activeTabIndex = Constantes.TAB_ELIMINAR;
            }
        }
        return null;
    }

    //---------------- Eliminar Registro de Inspeccion Ipse----------------------
    public String doEliCertificado() {

        this.bandEli = true;
        try {

            if (Certificado.DesabilitarRegistroIpse(objCertificadoReg)) // Desabilitar Ipse
            {
                Mensaje.guardarMensajeExito("Eliminar Registro Ipse", "Eliminar Correctamente");
            } else {
                Mensaje.manejarError("Verificar Posiblemente Tiene Resolucion Generada", "Error de Modificacion");
            }
        } catch (Exception e) {
            Mensaje.manejarError(e, "Actualizar Ipse");
        }
        if (puntAnt.compareTo("2") == 0) {
            this.doBuscarCertificado();
            this.activeTabIndex = Constantes.TAB_BUSQUEDA;
        } else {
            if (puntAnt.compareTo("1") == 0) {
                this.doListarCertificado();
                this.activeTabIndex = Constantes.TAB_ELIMINAR;
            }
        }
        return null;
    }

    public void onClickBusq(ActionEvent evt) {
        Object param = evt.getComponent().getAttributes().get("param");
        this.puntAnt = param.toString();

    }

//-----------------------Impresion de Resoluciones---------------------------//
    public void imprimir() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, JRException, IOException {

        Connection conexion = null;
        conexion = Controlador_Sql.darConexionBD();

        if ((tipo.compareTo("1") == 0) && (acto.compareTo("1") == 0)) {

            //Instancia hacia la clase reporte     
            HashMap<String, Object> parametros = new HashMap<String, Object>();
//            parametros.put("expediente", this.ObjNumero_Expediente.getNro_expediente());
            parametros.put("expediente", this.numero_expediente);
            parametros.put("tipo", this.tipo);
            parametros.put("acto", this.acto);

            File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/Reporte/Certificado.DefensaCivil.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion);
            HttpServletResponse response
                    = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.addHeader("Content-disposition", "attachment; filename=Certificados.pdf");
            ServletOutputStream stream = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, stream);

            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();

        } else if ((tipo.compareTo("1") == 0) && (acto.compareTo("2") == 0)) {

            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("expediente", this.numero_expediente);
            parametros.put("tipo", this.tipo);
            parametros.put("acto", this.acto);

            File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/Reporte/Resolucion_DefensaCivil.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion);
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.addHeader("Content-disposition", "attachment; filename=Resolucion_DefensaCivil.pdf");
            ServletOutputStream stream = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, stream);

            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();

        } else if ((tipo.compareTo("2") == 0) && (acto.compareTo("2") == 0)) {

            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("expediente", this.numero_expediente);
            parametros.put("tipo", this.tipo);
            parametros.put("acto", this.acto);

            File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/Reporte/Resolucion_DefensaCivil.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion);
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.addHeader("Content-disposition", "attachment; filename=Resolucion_DefensaCivil.pdf");
            ServletOutputStream stream = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, stream);

            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();

        } else if ((tipo.compareTo("3") == 0) && (acto.compareTo("2") == 0)) {

            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("expediente", this.numero_expediente);
            parametros.put("tipo", this.tipo);
            parametros.put("acto", this.acto);

            File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/Reporte/Resolucion_DefensaCivil.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion);
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.addHeader("Content-disposition", "attachment; filename=Resolucion_DefensaCivil.pdf");
            ServletOutputStream stream = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, stream);

            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();

        } else if ((tipo.compareTo("1") == 0) && (acto.compareTo("0") == 0)) {

            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("expediente", this.numero_expediente);
            parametros.put("tipo", this.tipo);
            parametros.put("acto", this.acto);

            File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/Reporte/Resolucion_improcedente_Expost_DefensaCivil.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion);
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.addHeader("Content-disposition", "attachment; filename=Resolucion_Improcedente_Expost.pdf");
            ServletOutputStream stream = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, stream);

            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();

        } else if ((tipo.compareTo("2") == 0) && (acto.compareTo("0") == 0)) {

            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("expediente", this.numero_expediente);
            parametros.put("tipo", this.tipo);
            parametros.put("acto", this.acto);

            File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/Reporte/Resolucion_improcedente_Exante_DefensaCivil.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion);
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.addHeader("Content-disposition", "attachment; filename=Resolucion_Improcdente_Exantet.pdf");
            ServletOutputStream stream = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, stream);

            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();

        } else if ((tipo.compareTo("3") == 0) && (acto.compareTo("0") == 0)) {

            HashMap<String, Object> parametros = new HashMap<String, Object>();

            parametros.put("expediente", this.numero_expediente);
            parametros.put("tipo", this.tipo);
            parametros.put("acto", this.acto);

            File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/Reporte/Resolucion_improcedente_Detalle_DefensaCivil.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, conexion);
            HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            response.addHeader("Content-disposition", "attachment; filename=Resolucion_Improcdente_Detalle.pdf");
            ServletOutputStream stream = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, stream);

            stream.flush();
            stream.close();
            FacesContext.getCurrentInstance().responseComplete();

        }

    }

    private int id_legajo = 1;

    public int getId_legajo() {
        return id_legajo;
    }

    public void setId_legajo(int id_legajo) {
        this.id_legajo = id_legajo;
    }

    //---Seleccionar Informacion de Observacia----//
    private List<String> observacion;

    public List<String> getObservacion() {
        return observacion;
    }

    public void setObservacion(List<String> observacion) {
        this.observacion = observacion;
    }

    //-----------------Picklist----------------------//
    private DualListModel<Certificado> PickListCertificado;
    private ArrayList<Certificado> Piclist = null;

    //-------------------------- Carga de PickList-------------------------------//
    public DualListModel<Certificado> getPickListCertificado() throws Exception {

        if (PickListCertificado == null) {
            PickListCertificado = new DualListModel<Certificado>();
        }
        PickListCertificado.setSource(DoPickList());

        return PickListCertificado;

    }

    public void setPickListCertificado(DualListModel<Certificado> PickListCertificado) {
        this.PickListCertificado = PickListCertificado;
    }

    public ArrayList<Certificado> getPiclist() {
        return Piclist;
    }

    public void setPiclist(ArrayList<Certificado> Piclist) {
        this.Piclist = Piclist;
    }

    public ArrayList<Certificado> DoPickList() throws Exception {

        //Lista Observancia    
        this.Piclist = new ArrayList<Certificado>();
        this.Piclist = Certificado.cargarObservanciaIpse();

        return this.Piclist;
    }

    //-----------------------------------------------Fin
    public void onTransfer(TransferEvent event) {
        StringBuilder builder = new StringBuilder();
        for (Object item : event.getItems()) {
            builder.append(((Certificado) item).getObservancia_ipse()).append("<br />");
        }

        FacesMessage msg = new FacesMessage();
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        msg.setSummary("Items Transferred");
        msg.setDetail(builder.toString());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onSelect(SelectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", event.getObject().toString()));
    }

    public void onUnselect(UnselectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Unselected", event.getObject().toString()));
    }

    public void onReorder() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "List Reordered", null));
    }

    public void showresultado() {

        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "targetPicklist Size:" + PickListCertificado.getTarget().size() + "SourcePicklist Size:" + PickListCertificado.getSource(), null));
    }

}
