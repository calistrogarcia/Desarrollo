/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

//import Modelo.Expediente;
import Modelo.Area;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Prueba_SP {

    public static void listardetalleexepediente() {
//
        // Expediente ing = new Expediente();
//        Expediente busc = new Expediente();
//        Expediente ofic = new Expediente(); 
//        Expediente bus = new Expediente();
//          Expediente desp = new Expediente();

//      System.out.print(Expediente.getBuscarExpedientePorFechaParametro(ing).size());
//      System.out.print(Expediente.getBuscaExpedientesIngresadosPorOficina(ofic).size());
//      System.out.print(Expediente.getExpIngresadoPorRecurr(bus).size());
//      System.out.print(Expediente.getCargarAreas().size());
//        System.out.print(Expediente.getBuscaExpedientesDespachadosPorOficina(desp).size());
//    System.out.print(Expediente.getBuscaExpedientesRecepcionadosPorOficina(ofic).size());
//System.out.print(Expediente.getCargarTrabajadorMM(area).size());
    }

//   public static void TecnicoporArea(){
//        
//    Usuario cofin= new Usuario();
//    cofin.setCofin("001");
//    System.out.print(Usuario.getCargarTecnico(cofin).size());
//   
//    }
//      
//  public static void buscarCertificado(){
//        
//    Certificado cert= new Certificado();
//    cert.setNro_expediente("41391-01-2017");
//    System.out.print( Certificado.getBuscaExpedientesPorcodigo(cert).size());
//   
//    }  
//  
    public static void buscarReporteResolucion() {

        Certificado Resol = new Certificado();
        Resol.setNro_expediente("00303-01-2017");
        System.out.print(Certificado.getBuscaReporteResoluciones(Resol).size());

    }

    public static void buscarporfecha() throws ParseException {

        SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
        //Date date = d.parse("31-03-2016");
        // System.out.println(DateFormat.getDateInstance().format(date));

        Expediente exp = new Expediente();
        Date fecha_inicio = (Date) d.parse("31-03-2016");
        exp.setFecha_inicio(fecha_inicio);

        Date fecha_fin = (Date) d.parse("31-03-2017");;

        exp.setFecha_fin(fecha_fin);

        System.out.print(Expediente.getBuscarExpedientePorFechaParametro(exp).size());

    }

    public static void buscarmulta() {

        Multa mul = new Multa();
        mul.setTipo_busqueda("1");
        mul.setInformacion_consulta("091388");

        System.out.print(Multa.BuscarMultaAdministrativa(mul).size());

    }

    public static void buscarExpedienteBuzon() {

        Asignar exp = new Asignar();
        exp.setExpediente_consultarBuzon("41407-01-2017");
        System.out.print(Asignar.getBuscarExpedientesBuzonEntradaDefensaCivil(exp).size());

    }

    public static void buscarMultas() {

        Multa m = new Multa();
        m.setTipo_busqueda("1");
        m.setInformacion_consulta("091103");
        //direc.objdireccion.setCodigo_via(" ");

        System.out.print(Multa.BuscarMultaAdministrativa(m).size());

    }

    public static void buscarDirecciones() {

        Certificado direc = new Certificado();
        direc.objdireccion.setCodigo_postal("L31");
        //direc.objdireccion.setCodigo_via(" ");

        System.out.print(Certificado.getBuscaDirecciones(direc).size());

    }
    
    public static void buscarInfractor() {

        Multa direc = new Multa();
        direc.ObjPersona.setCodigo_contribuyente("000006");
        //direc.objdireccion.setCodigo_via(" ");

        System.out.print(Multa.BuscarInfractor(direc).size());

    }
    

    public static void cargarobservacionesIpse() {

        Certificado obser = new Certificado();
        //obser.getCargarObservacionesIpse();
        //direc.objdireccion.setCodigo_via(" ");

        System.out.print(obser.getCargarObservacionesIpse().size());

    }

    public static void DesabilitarRegistroIpse() {

        // CAPEPAT, CAPEMAT, CNOMBRES, CAPENOM, NDNI, /*DFECING,*/ CDIRECCION, CTELEFONO, CEMAIL 
        Certificado ObjSup = new Certificado();
        ObjSup.setNro_expediente("18667-01-2017");
        if (Certificado.DesabilitarRegistroIpse(ObjSup)) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }

    public static void asignarExpediente() {

        Asignar objAsignar = new Asignar();

        //private String tipo_asignar;
        //private int id_turno;
        //private String usuario_asigna;
        //private int id_inspector;
        //private String estado;
        //private int expediente_id;
        // objAsignar.setTipo_asignar("2");
        objAsignar.setExpediente("41391-01-2017");
        //objAsignar.setEstado("1");
        // objAsignar.setId_inspector("Garcia Garcia Calistro");
        // objAsignar.setId_turno(1);
        objAsignar.setUsuario_asigna("Administrador");

        if (Asignar.AsignarExpediente(objAsignar)) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }

    public static void registrardireccion() {

        Certificado objdireccion = new Certificado();
        objdireccion.objdireccion.setCodigo_via("00276");
        objdireccion.objdireccion.setTipo_via("");
        objdireccion.objdireccion.setNombre_via("MANIZALES I ETAPA");
        objdireccion.objdireccion.setNombre_habilitacion("");
        objdireccion.objdireccion.setTipo_habilitacion("");
        objdireccion.objdireccion.setCodigo_habilitacion("");
        objdireccion.objdireccion.setCodigo_via("");
        objdireccion.objdireccion.setNombre_zona("");

        if (Certificado.registrarDireccion(objdireccion)) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }

    public static void registroMulta() {

        Multa m = new Multa();
        m.setNumero_funcion("01");
        m.setNumero_notificacion("000004");
        m.setFecha_notificacion("2017-11-05");
        //m.setCodigo_contribuyente("000002");
        m.ObjPredio.setCodigo_predio("");
        m.setNumero_multa("080401");
        m.setMonto_multa("162000");
        m.setFecha_resolucion("2017-11-05");
        m.setNumero_resolucion("000004");
        // m.setOficina_multa("093");
        m.setFecha_resolucion_coactiva("2017-11-05");
        m.setReferencia_direccion("MANIZALES I ETAPA");
        m.setResolucion_anulacion("");
        m.setReclamo_expediente("");
        m.setEstado_multa("");
   //     m.ObjUsuario.setUsuario("P25");
        m.setCodigo_sancion("");
        m.setDetalle_sanacion("");
        m.setObservacion("PROBANDOyy");
        m.ObjCuenta.setId_unico("");
        m.setId_unico_multa("");
        m.setReincidente("");
        m.setManzana("");
        m.setLote("");
        m.setNumero_fiscal("");
        m.setNumero_departamento("");
        m.setReferencia("");
        m.objInspector.setApellidos_nombres("PEPITO");
        m.setNumero_acta("");
        m.setNumero_informe("00002-2017");
        m.ObjGiro.setCodigo_giro("A011101");
        m.setFecha_ejecucion("2017-11-05");
        m.setFecha_registro("2017-11-05");
        m.ObjDireccion.setNombre_via("MANIZALES II ETAPA");
        m.ObjDireccion.setNombre_habilitacion("MANIZALES");
        m.setActa_constatacion("000001");
        m.ObjGiro.setGiro_detalle("CULTIVO DE ALGODON Y OTRAS QUE DAN MATERIAS TEXTILES");

        if (Multa.EditarMulta(m)) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }

    }

    public static void actualizar_registro_expediente() {

        Certificado cer = new Certificado();
        cer.setNro_expediente("41391-01-2017");
        cer.setArea("SUBG. DE DEFENSA CIVIL");
      //  cer.setContribuyente("322354");
        cer.setNombres("TORRE QUISPE JORGE LUIS");
        cer.setRazon_social("");
        cer.setRepresentante_legal("");
        cer.setDireccion("");
        cer.setAsunto("INSPECCIÓN TÉCNICA BÁSICA DE SEGURIDAD EN DEFENSA CIVIL EX POST HASTA 100 M2 Y CAPACIDAD DE ALMACENAMIENTO NO MAYORA 30% DEL ÁREA TOTAL DEL LOCAL APLICABLE, ENTRE OTROS PARA: • CASO DE DENEGATORIA DE");
        cer.setObservaciones_seguridad("yyyy");

        cer.setArea_declarada("45");
        cer.setNombre_inspector("Garcia Garcia Mariano");
        cer.setAforo(7);
        cer.Objgiros.setGiro_detalle("CULTIVO DE ESPECIAS DE FRUTO EJEMPLO: CLAVOS DE OLOR");

        cer.setAnotaciones("SOLICITA LA OPINION FAVORABLE DE DEFENSA "
                + "CIVIL PARA LA AUTORIZACION DE LOS ELEMENTOS "
                + "DE SEGURIDAD - REJAS POR LA INSEGURIDAD,"
                + " ROBOS Y FUMONES QUE SE ENCUENTRAN "
                + "UBICADOS DENTRO DE LA ZONA");
        cer.setId_tipo_licencia(1);
        cer.setDireccion_verificada("Direccion los Jasminez");
        cer.setEstado_fiscalizacion(1);
        cer.setResultado(0);

        if (Certificado.MoficardatosParaCertificado(cer)) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }

    }

    public static void EnviarMensaje() {

        Correo correo = new Correo();

        correo.setContrasenia("sjlsvekzwwscvjgt");
        correo.setUsuario_correo("calistrogarciarivera@gmail.com");
        correo.setAsunto("Java");
        correo.setMensaje("Java Test");
        correo.setDestino("cagarcia@mdsmp.gob.pe");
        correo.setNombre_archivo("");
        correo.setRuta_archivo("");
        Controlador_Correo c = new Controlador_Correo();

        if (c.enviarCorreo(correo)) {

            JOptionPane.showMessageDialog(null, "envio correctamente");

        } else {

            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    public static void detalle_cuenta() {

       Cuenta c = new Cuenta();
        c.Objpersona.setCodigo_contribuyente("000100");
        c.setTipo_tributo("ip");
        c.setPerido_deuda_inicial("2015");
        c.setPeriodo_deuda_final("2016");
        
        System.out.print(Cuenta.getConsulta_Cuenta(c).size());

    }
    
    
    public static void cargarAreas() throws Exception{
        
        Multa m = new Multa();
       // System.out.println(Multa.CargarAreas().size());
        
    }
    
    
    public static void buscarpersona() {

       Persona c = new Persona();
        c.setCodigo_contribuyente("327556");
        
        System.out.print(Persona.BuscarContribuyente(c).size());

    }
    
    
     public static void BuscarLicenciaFuncionamiento() {

       Licencia c = new Licencia();
      
        c.setTipo_busqueda("1");
        c.setConsulta("111001");
        
        System.out.print(Licencia.BuscarLicenciaFuncionamiento(c).size());

    }
     
     
     
     public static void BuscarSancion() {

       Multa c = new Multa();
      
       c.setTipo_busqueda_sancion("1");
       c.setConsulta_sancion("GDU482");
        
        System.out.print(Multa.BuscarInfraccionSancion(c).size());

    }
    
     
       public static void Reporte_Expedientes_Fechas(){

       Expediente e = new Expediente();
//      
//      e.setX("2016-01-01");
//      e.setY("2016-12-31");
        
        System.out.print(Expediente.BuscaReporteExpedientesPorFecha(e).size());

    }
    
       
       
       
        public static void registarRecurrente() {

        Persona Ob= new Persona();
        
        Ob.setTipo_persona("01");
        Ob.setTipo_documento("01");
        Ob.setNumero_documento("0855390");
        Ob.setApellido_paterno("GARCIA");
        Ob.setApellido_materno("RIVERA");
        Ob.setNombre_contribuyente("JOSE");
        Ob.ObjPostal.setCodigo_postal("L31");
        Ob.ObjDireccion.setCodigo_via("00383");
        Ob.ObjDireccion.setTipo_habilitacion("URB.");
        Ob.ObjDireccion.setNombre_habilitacion("CONDEVILLA SEÑOR");
        Ob.ObjDireccion.setNombre_via("LOS");
        Ob.ObjDireccion.setNumero("12");
        Ob.ObjDireccion.setNumero_interior("1");
        Ob.ObjDireccion.setNumero_departamento("A");
        Ob.ObjDireccion.setLetra("A");
        Ob.ObjDireccion.setBloque("3");
        Ob.ObjDireccion.setManzana("4");
        Ob.ObjDireccion.setLote("Q");
        Ob.ObjDireccion.setReferencia("xxx");
        Ob.setNumero_telefono_contribuyente("12345678");
        Ob.setNumero_fax_contribuyente("12");
        Ob.setCorreo_contribuyente("calistogarcia@hotmail.com");
        
        Ob.setFecha_nacimiento("31/12/1989");
        Ob.setNombre_representante("Sin Representante");
        Ob.setTipo_documento_representante("01");
        Ob.setNumero_documento_representante("123456789");
        Ob.setNombre_conyuge("---");
        Ob.setTipo_documento_conjuge("01");
        Ob.setNumero_documento_conjuge("--");
        Ob.setNumero_celular("999999999");
        Ob.setNumero_telefono_fijo_representante("123456789");
        Ob.setNumero_celular_representante("67890543");
        Ob.setCorreo_representante("calistogarcia@hotmail.com");
        Ob.setNumero_telefono_conjuge("--");
        Ob.setNumero_celular_conjuge("--");
        Ob.setCorreo_conyuge("--");
//        Ob.setCodigo_contribuyente("");
        
        
      
        
        if (Persona.RegistrarPersona(Ob)) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }

    }
    
      public static void BuscarUsuarios() {

       Expediente c = new Expediente();
      
       c.ObjArea.setId_area("025");
//        java.util.Date fecha_inicio;
//       c.setFecha_inicio(01-01-2017);
//        java.util.Date fecha_fin;
//       c.setFecha_fin(fecha_fin);
    //   c.setOpcion("");
        
      //  System.out.print(Expediente.getCargarComboUsuariosPorOficina(c).size());

    }
    
    

    public static void main(String[] args) throws Exception {

        //listardetalleexepediente(); 
        // TecnicoporArea();
        //buscarCertificado();
        // buscarCertificadoDAO();
        //  buscarCertificado();
        // registrarSupervisor();
        // buscarReporteResolucion();
        //ResolverExpediente();
        // DesabilitarRegistroIpse();
        //System.out.print(Certificado.cargarObservanciaIpse().size());
        //asignarExpediente();
        //actualizar_registro_expediente();
        //buscarExpedienteBuzon();
        //asignarExpediente();
        //buscarDirecciones();
        // registrardireccion();
        // buscarmulta();
        // cargarobservacionesIpse();
        // actualizar_registro_expediente();
        // buscarExpedienteBuzon();
        // EnviarMensaje();
        // registroMulta();
        // buscarMultas();
        // buscarporfecha();
        // detalle_cuenta();
        //buscarInfractor();
        //cargarAreas();
        // buscarpersona();
        // BuscarLicenciaFuncionamiento();
        // BuscarSancion();
        //Reporte_Expedientes_Fechas();
       // registarRecurrente();
       
       BuscarUsuarios();
        
    }
    
}
