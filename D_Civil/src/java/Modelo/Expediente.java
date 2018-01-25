/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import Modelo.Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.model.SelectItem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author Calistro
 */
public class Expediente implements Serializable {

    private String estado = null;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String area_inicio;
    private String area_final;
    private String correlativo_expediente;
    private String tipo_documento;
    private String numero_expediente;
    private Date fecha_presentacion_expediente;
    private String fecha_presentacion_expediente1;
    private String hora_expediente;
    private int numero_folios;
    private String codigo_contribuyente;
    private String asunto_expediente;
    private int dias_tupa;
    private Date fecha_expediente_resuelto;
    private Date ffintra;
    private String dnrodoc;
    private String estado_expediente;
    private byte limpres;
    private String cusumod;
    private String cusuari;
    private Date f_fecha;
    private String d_horas;
    private String dusured;
    private byte ltramite;
    private int nfoliofin;
    private String carefin;
    private byte larchiv;
    private String ctiprefe;
    private String drefere;
    private String dmotanu;
    private String fpassok;
    private String correlativo_expedientetmp;
    private String dnumoldtmp;
    private String nregistro;
    private String observacion;
    private String ndocume;
    private String dcontri;
    private String doficin;
    private String canexo;
    private String dasunto;
    private Date dfecdoc;
    private String cnombre;
    private String d_hasta;
    private String dtipdoc;
    private Date ffecrec;
    private String ffecrec1;
    private String destado;
    private String nro;
    private Date ffecenv;
    private String ffecenv1;
    private String caredes;
    private String daredes;
    private String c_hasta;
    private String c_desde;
    private String careas1;
    private String dareact;
    private Date xfecha;
    private String xfecha1;
    private String nombre_area;
    private String fectrami;
    private String dnombre;
    private String dnomusu;
    private String obserut;
    private String nrpendi;
    private String nrrecep;
    private String c_hasta_Deriva;
    private String dusuari_deriva;
    private String norden;
    private int flagimp;
    private String nordens;
    private String opcion;
    private String xtecnico;
    private String horrecexp;
    private String mmotobs;
    private String xcodtecn;
    private String ddocdrv;
    private int edt;
    private String xtecreci;
    private String dusrenv;
    private String dusrrec;
    private String nresuel;
    private int ntramit;
    private String fecha_resuelto_expediente_reporte;
    private String id_area;
  
    

    Persona ObjPersona = new Persona();
    Area ObjArea = new Area();

   
    public String getId_area() {
        return id_area;
    }

    public void setId_area(String id_area) {
        this.id_area = id_area;
    }

    public Area getObjArea() {
        return ObjArea;
    }

    public void setObjArea(Area ObjArea) {
        this.ObjArea = ObjArea;
    }

    public String getArea_inicio() {
        return area_inicio;
    }

    public void setArea_inicio(String area_inicio) {
        this.area_inicio = area_inicio;
    }

    public String getArea_final() {
        return area_final;
    }

    public void setArea_final(String area_final) {
        this.area_final = area_final;
    }

    public void setAsunto_expediente(String asunto_expediente) {
        this.asunto_expediente = asunto_expediente;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getCareas1() {
        return careas1;
    }

    public void setCareas1(String careas1) {
        this.careas1 = careas1;
    }

    public Persona getObjPersona() {
        return ObjPersona;
    }

    public void setObjPersona(Persona ObjPersona) {
        this.ObjPersona = ObjPersona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getCorrelativo_expediente() {
        return correlativo_expediente;
    }

    public void setCorrelativo_expediente(String correlativo_expediente) {
        this.correlativo_expediente = correlativo_expediente;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_expediente() {
        return numero_expediente;
    }

    public void setNumero_expediente(String numero_expediente) {
        this.numero_expediente = numero_expediente;
    }

    public Date getFecha_presentacion_expediente() {
        return fecha_presentacion_expediente;
    }

    public void setFecha_presentacion_expediente(Date fecha_presentacion_expediente) {
        this.fecha_presentacion_expediente = fecha_presentacion_expediente;
    }

    public String getFecha_presentacion_expediente1() {
        return fecha_presentacion_expediente1;
    }

    public void setFecha_presentacion_expediente1(String fecha_presentacion_expediente1) {
        this.fecha_presentacion_expediente1 = fecha_presentacion_expediente1;
    }

    public String getHora_expediente() {
        return hora_expediente;
    }

    public void setHora_expediente(String hora_expediente) {
        this.hora_expediente = hora_expediente;
    }

    public int getNumero_folios() {
        return numero_folios;
    }

    public void setNumero_folios(int numero_folios) {
        this.numero_folios = numero_folios;
    }

    public String getCodigo_contribuyente() {
        return codigo_contribuyente;
    }

    public void setCodigo_contribuyente(String codigo_contribuyente) {
        this.codigo_contribuyente = codigo_contribuyente;
    }

    public String getAsunto_expediente() {
        return asunto_expediente;
    }

    public void setCasunto(String asunto_expediente) {
        this.asunto_expediente = asunto_expediente;
    }

    public int getDias_tupa() {
        return dias_tupa;
    }

    public void setDias_tupa(int dias_tupa) {
        this.dias_tupa = dias_tupa;
    }

    public Date getFecha_expediente_resuelto() {
        return fecha_expediente_resuelto;
    }

    public void setFecha_expediente_resuelto(Date fecha_expediente_resuelto) {
        this.fecha_expediente_resuelto = fecha_expediente_resuelto;
    }

    public Date getFfintra() {
        return ffintra;
    }

    public void setFfintra(Date ffintra) {
        this.ffintra = ffintra;
    }

    public String getDnrodoc() {
        return dnrodoc;
    }

    public void setDnrodoc(String dnrodoc) {
        this.dnrodoc = dnrodoc;
    }

    public String getEstado_expediente() {
        return estado_expediente;
    }

    public void setEstado_expediente(String estado_expediente) {
        this.estado_expediente = estado_expediente;
    }

    public byte getLimpres() {
        return limpres;
    }

    public void setLimpres(byte limpres) {
        this.limpres = limpres;
    }

    public String getCusumod() {
        return cusumod;
    }

    public void setCusumod(String cusumod) {
        this.cusumod = cusumod;
    }

    public String getCusuari() {
        return cusuari;
    }

    public void setCusuari(String cusuari) {
        this.cusuari = cusuari;
    }

    public Date getF_fecha() {
        return f_fecha;
    }

    public void setF_fecha(Date f_fecha) {
        this.f_fecha = f_fecha;
    }

    public String getD_horas() {
        return d_horas;
    }

    public void setD_horas(String d_horas) {
        this.d_horas = d_horas;
    }

    public String getDusured() {
        return dusured;
    }

    public void setDusured(String dusured) {
        this.dusured = dusured;
    }

    public byte getLtramite() {
        return ltramite;
    }

    public void setLtramite(byte ltramite) {
        this.ltramite = ltramite;
    }

    public int getNfoliofin() {
        return nfoliofin;
    }

    public void setNfoliofin(int nfoliofin) {
        this.nfoliofin = nfoliofin;
    }

    public String getCarefin() {
        return carefin;
    }

    public void setCarefin(String carefin) {
        this.carefin = carefin;
    }

    public byte getLarchiv() {
        return larchiv;
    }

    public void setLarchiv(byte larchiv) {
        this.larchiv = larchiv;
    }

    public String getCtiprefe() {
        return ctiprefe;
    }

    public void setCtiprefe(String ctiprefe) {
        this.ctiprefe = ctiprefe;
    }

    public String getDrefere() {
        return drefere;
    }

    public void setDrefere(String drefere) {
        this.drefere = drefere;
    }

    public String getDmotanu() {
        return dmotanu;
    }

    public void setDmotanu(String dmotanu) {
        this.dmotanu = dmotanu;
    }

    public String getFpassok() {
        return fpassok;
    }

    public void setFpassok(String fpassok) {
        this.fpassok = fpassok;
    }

    public String getCorrelativo_expedientetmp() {
        return correlativo_expedientetmp;
    }

    public void setCorrelativo_expedientetmp(String correlativo_expedientetmp) {
        this.correlativo_expedientetmp = correlativo_expedientetmp;
    }

    public String getDnumoldtmp() {
        return dnumoldtmp;
    }

    public void setDnumoldtmp(String dnumoldtmp) {
        this.dnumoldtmp = dnumoldtmp;
    }

    public String getNregistro() {
        return nregistro;
    }

    public void setNregistro(String nregistro) {
        this.nregistro = nregistro;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacioncion(String observacion) {
        this.observacion = observacion;
    }

    public String getNdocume() {
        return ndocume;
    }

    public void setNdocume(String ndocume) {
        this.ndocume = ndocume;
    }

    public String getDcontri() {
        return dcontri;
    }

    public void setDcontri(String dcontri) {
        this.dcontri = dcontri;
    }

    public String getDoficin() {
        return doficin;
    }

    public void setDoficin(String doficin) {
        this.doficin = doficin;
    }

    public String getCanexo() {
        return canexo;
    }

    public void setCanexo(String canexo) {
        this.canexo = canexo;
    }

    public String getDasunto() {
        return dasunto;
    }

    public void setDasunto(String dasunto) {
        this.dasunto = dasunto;
    }

    public Date getDfecdoc() {
        return dfecdoc;
    }

    public void setDfecdoc(Date dfecdoc) {
        this.dfecdoc = dfecdoc;
    }

    public String getCnombre() {
        return cnombre;
    }

    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }

    public String getD_hasta() {
        return d_hasta;
    }

    public void setD_hasta(String d_hasta) {
        this.d_hasta = d_hasta;
    }

    public String getDtipdoc() {
        return dtipdoc;
    }

    public void setDtipdoc(String dtipdoc) {
        this.dtipdoc = dtipdoc;
    }

    public Date getFfecrec() {
        return ffecrec;
    }

    public void setFfecrec(Date ffecrec) {
        this.ffecrec = ffecrec;
    }

    public String getFfecrec1() {
        return ffecrec1;
    }

    public void setFfecrec1(String ffecrec1) {
        this.ffecrec1 = ffecrec1;
    }

    public String getDestado() {
        return destado;
    }

    public void setDestado(String destado) {
        this.destado = destado;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public Date getFfecenv() {
        return ffecenv;
    }

    public void setFfecenv(Date ffecenv) {
        this.ffecenv = ffecenv;
    }

    public String getFfecenv1() {
        return ffecenv1;
    }

    public void setFfecenv1(String ffecenv1) {
        this.ffecenv1 = ffecenv1;
    }

    public String getCaredes() {
        return caredes;
    }

    public void setCaredes(String caredes) {
        this.caredes = caredes;
    }

    public String getDaredes() {
        return daredes;
    }

    public void setDaredes(String daredes) {
        this.daredes = daredes;
    }

    public String getC_hasta() {
        return c_hasta;
    }

    public void setC_hasta(String c_hasta) {
        this.c_hasta = c_hasta;
    }

    public String getC_desde() {
        return c_desde;
    }

    public void setC_desde(String c_desde) {
        this.c_desde = c_desde;
    }

    public String getNombre_area1() {
        return careas1;
    }

    public void setNombre_area1(String careas1) {
        this.careas1 = careas1;
    }

    public String getDareact() {
        return dareact;
    }

    public void setDareact(String dareact) {
        this.dareact = dareact;
    }

    public Date getXfecha() {
        return xfecha;
    }

    public void setXfecha(Date xfecha) {
        this.xfecha = xfecha;
    }

    public String getXfecha1() {
        return xfecha1;
    }

    public void setXfecha1(String xfecha1) {
        this.xfecha1 = xfecha1;
    }

    public String getNombre_area() {
        return nombre_area;
    }

    public void setNombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
    }

    public String getFectrami() {
        return fectrami;
    }

    public void setFectrami(String fectrami) {
        this.fectrami = fectrami;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getDnomusu() {
        return dnomusu;
    }

    public void setDnomusu(String dnomusu) {
        this.dnomusu = dnomusu;
    }

    public String getObserut() {
        return obserut;
    }

    public void setObserut(String obserut) {
        this.obserut = obserut;
    }

    public String getNrpendi() {
        return nrpendi;
    }

    public void setNrpendi(String nrpendi) {
        this.nrpendi = nrpendi;
    }

    public String getNrrecep() {
        return nrrecep;
    }

    public void setNrrecep(String nrrecep) {
        this.nrrecep = nrrecep;
    }

    public String getC_hasta_Deriva() {
        return c_hasta_Deriva;
    }

    public void setC_hasta_Deriva(String c_hasta_Deriva) {
        this.c_hasta_Deriva = c_hasta_Deriva;
    }

    public String getDusuari_deriva() {
        return dusuari_deriva;
    }

    public void setDusuari_deriva(String dusuari_deriva) {
        this.dusuari_deriva = dusuari_deriva;
    }

    public String getNorden() {
        return norden;
    }

    public void setNorden(String norden) {
        this.norden = norden;
    }

    public int getFlagimp() {
        return flagimp;
    }

    public void setFlagimp(int flagimp) {
        this.flagimp = flagimp;
    }

    public String getNordens() {
        return nordens;
    }

    public void setNordens(String nordens) {
        this.nordens = nordens;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public String getXtecnico() {
        return xtecnico;
    }

    public void setXtecnico(String xtecnico) {
        this.xtecnico = xtecnico;
    }

    public String getHorrecexp() {
        return horrecexp;
    }

    public void setHorrecexp(String horrecexp) {
        this.horrecexp = horrecexp;
    }

    public String getMmotobs() {
        return mmotobs;
    }

    public void setMmotobs(String mmotobs) {
        this.mmotobs = mmotobs;
    }

    public String getXcodtecn() {
        return xcodtecn;
    }

    public void setXcodtecn(String xcodtecn) {
        this.xcodtecn = xcodtecn;
    }

    public String getDdocdrv() {
        return ddocdrv;
    }

    public void setDdocdrv(String ddocdrv) {
        this.ddocdrv = ddocdrv;
    }

    public int getEdt() {
        return edt;
    }

    public void setEdt(int edt) {
        this.edt = edt;
    }

    public String getXtecreci() {
        return xtecreci;
    }

    public void setXtecreci(String xtecreci) {
        this.xtecreci = xtecreci;
    }

    public String getDusrenv() {
        return dusrenv;
    }

    public void setDusrenv(String dusrenv) {
        this.dusrenv = dusrenv;
    }

    public String getDusrrec() {
        return dusrrec;
    }

    public void setDusrrec(String dusrrec) {
        this.dusrrec = dusrrec;
    }

    public String getNresuel() {
        return nresuel;
    }

    public void setNresuel(String nresuel) {
        this.nresuel = nresuel;
    }

    public int getNtramit() {
        return ntramit;
    }

    public void setNtramit(int ntramit) {
        this.ntramit = ntramit;
    }

    public String getFecha_resuelto_expediente_reporte() {
        return fecha_resuelto_expediente_reporte;
    }

    public void setFecha_resuelto_expediente_reporte(String fecha_resuelto_expediente_reporte) {
        this.fecha_resuelto_expediente_reporte = fecha_resuelto_expediente_reporte;
    }

    // calistro: Registro de Expedientes
    public static boolean registrar_expediente(Expediente obj_t) {
        boolean a = false;
        Connection conexion = null;
        /* variable de connexion para definir y manejar el conytrol de errores*/

        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st
                    = /*debe importarse con java la segunda opcion del cuadro de alternativas des importacion*/ conexion.prepareCall("{call [dbo].[usp_java_documento_new_update] (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,)}");
            conexion.setAutoCommit(false);

            if (obj_t.tipo_documento != null) {/*Valido la informacion set*/
                if (obj_t.tipo_documento.length() > 0) {
                    st.setString(1, obj_t.getTipo_documento());

                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (obj_t.getNumero_expediente() != null) {/*Valido la informacion set*/
                if (obj_t.getNumero_expediente().length() > 0) {
                    st.setString(2, obj_t.getNumero_expediente());

                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);
            }

            /*----------------posicion 2*/
            if (obj_t.getFecha_presentacion_expediente() != null) {/*Valido la informacion set*/

                st.setDate(3, (java.sql.Date) obj_t.getFecha_presentacion_expediente());

            } else {
                st.setDate(3, null);
            }

            if (obj_t.getHora_expediente() != null) {
                /**
                 * Valido la informacion set
                 */
                if (obj_t.getHora_expediente().length() > 0) {
                    st.setString(4, obj_t.getHora_expediente());

                } else {
                    st.setString(4, null);
                }
            } else {
                st.setString(4, null);
            }

            if (obj_t.getNumero_folios() > 0) {
                /**
                 * Valido la informacion set
                 */
                if (obj_t.getNumero_folios() > 0) {
                    st.setInt(5, obj_t.getNumero_folios());

                } else {
                    st.setInt(5, 0);
                }
            } else {
                st.setInt(5, 0);
            }
            //-------------------------------------------------------------------------------

            if (obj_t.getCodigo_contribuyente() != null) {
                /**
                 * *Valido la informacion set
                 */
                if (obj_t.getCodigo_contribuyente().length() > 0) {
                    st.setString(6, obj_t.getCodigo_contribuyente());

                } else {
                    st.setString(6, null);
                }
            } else {
                st.setString(6, null);
            }

            //-------------------------------------------------------
            if (obj_t.getAsunto_expediente() != null) {/*Valido la informacion set*/
                if (obj_t.getAsunto_expediente().length() > 0) {
                    st.setString(7, obj_t.getAsunto_expediente());

                } else {
                    st.setString(7, null);
                }
            } else {
                st.setString(7, null);
            }

            //-------------------------------------------------------
            if (obj_t.getDias_tupa() > 0) {
                /**
                 * Valido la informacion set
                 */
                if (obj_t.getDias_tupa() > 0) {
                    st.setInt(8, obj_t.getDias_tupa());
                } else {
                    st.setInt(8, 0);
                }
            } else {
                st.setInt(8, 0);
            }

            //-------------------------------------------------------       
            if (obj_t.getFecha_expediente_resuelto() != null) {/*Valido la informacion set*/

                st.setDate(9, (java.sql.Date) obj_t.getFecha_expediente_resuelto());

            } else {
                st.setDate(9, null);
            }

            //-------------------------------------------------------
            if (obj_t.getObservacion() != null) {/*Valido la informacion set*/
                if (obj_t.getObservacion().length() > 0) {
                    st.setString(10, obj_t.getObservacion());

                } else {
                    st.setString(10, null);
                }
            } else {
                st.setString(10, null);
            }

            //-------------------------------------------------------       
            if (obj_t.getFfintra() != null) {/*Valido la informacion set*/

                st.setDate(11, (java.sql.Date) obj_t.getFfintra());

            } else {
                st.setDate(11, null);
            }

            //-------------------------------------------------------   
            if (obj_t.getDnrodoc() != null) {/*Valido la informacion set*/
                if (obj_t.getDnrodoc().length() > 0) {
                    st.setString(12, obj_t.getDnrodoc());

                } else {
                    st.setString(12, null);
                }
            } else {
                st.setString(12, null);
            }

            //-------------------------------------------------------      
            if (obj_t.getEstado_expediente() != null) {/*Valido la informacion set*/
                if (obj_t.getEstado_expediente().length() > 0) {
                    st.setString(13, obj_t.getEstado_expediente());

                } else {
                    st.setString(13, null);
                }
            } else {
                st.setString(13, null);
            }

            //-------------------------------------------------------      
            if (obj_t.getLimpres() > 0) {/*Valido la informacion set*/
                if (obj_t.getLimpres() > 0) {
                    st.setByte(14, obj_t.getLimpres());

                } else {

                    st.setByte(14, obj_t.getLimpres());

                }
            } else {
                st.setByte(14, obj_t.getLimpres());
            }

            //-------------------------------------------------------     
            if (obj_t.getCusumod() != null) {/*Valido la informacion set*/
                if (obj_t.getCusumod().length() > 0) {
                    st.setString(15, obj_t.getCusumod());

                } else {
                    st.setString(15, null);
                }
            } else {
                st.setString(15, null);
            }

            //-------------------------------------------------------     
            if (obj_t.getCusuari() != null) {/*Valido la informacion set*/
                if (obj_t.getCusuari().length() > 0) {
                    st.setString(16, obj_t.getCusuari());

                } else {
                    st.setString(16, null);
                }
            } else {
                st.setString(16, null);
            }

            //-------------------------------------------------------     
            if (obj_t.getF_fecha() != null) {/*Valido la informacion set*/

                st.setDate(17, (java.sql.Date) obj_t.getF_fecha());

            } else {
                st.setDate(17, null);
            }

            //------------------------------------------------------- 
            if (obj_t.getD_horas() != null) {/*Valido la informacion set*/
                if (obj_t.getD_horas().length() > 0) {
                    st.setString(18, obj_t.getD_horas());

                } else {
                    st.setString(18, null);
                }
            } else {
                st.setString(18, null);
            }

            //------------------------------------------------------- 
            if (obj_t.getDusured() != null) {/*Valido la informacion set*/
                if (obj_t.getDusured().length() > 0) {
                    st.setString(19, obj_t.getDusured());

                } else {
                    st.setString(19, null);
                }
            } else {
                st.setString(19, null);
            }

            //------------------------------------------------------- 
            if (obj_t.getLtramite() > 0) {/*Valido la informacion set*/
                if (obj_t.getLtramite() > 0) {
                    st.setByte(20, obj_t.getLtramite());

                } else {

                    st.setByte(20, obj_t.getLtramite());

                }
            } else {
                st.setByte(20, obj_t.getLtramite());
            }

            //-------------------------------------------------------         
            if (obj_t.getNfoliofin() > 0) {
                /**
                 * Valido la informacion set
                 */
                if (obj_t.getNfoliofin() > 0) {
                    st.setInt(21, obj_t.getNfoliofin());
                } else {
                    st.setInt(21, 0);
                }
            } else {
                st.setInt(21, 0);
            }

            //-------------------------------------------------------       
            if (obj_t.getCarefin() != null) {/*Valido la informacion set*/
                if (obj_t.getCarefin().length() > 0) {
                    st.setString(22, obj_t.getCarefin());

                } else {
                    st.setString(22, null);
                }
            } else {
                st.setString(22, null);
            }

            //-------------------------------------------------------           
            if (obj_t.getLarchiv() > 0) {/*Valido la informacion set*/
                if (obj_t.getLarchiv() > 0) {
                    st.setByte(23, obj_t.getLarchiv());

                } else {

                    st.setByte(23, obj_t.getLarchiv());

                }
            } else {
                st.setByte(23, obj_t.getLarchiv());
            }

            //-------------------------------------------------------           
            if (obj_t.getCtiprefe() != null) {/*Valido la informacion set*/
                if (obj_t.getCtiprefe().length() > 0) {
                    st.setString(24, obj_t.getCtiprefe());

                } else {
                    st.setString(24, null);
                }
            } else {
                st.setString(24, null);
            }

            //-------------------------------------------------------           
            if (obj_t.getDrefere() != null) {/*Valido la informacion set*/
                if (obj_t.getDrefere().length() > 0) {
                    st.setString(25, obj_t.getDrefere());

                } else {
                    st.setString(25, null);
                }
            } else {
                st.setString(25, null);
            }

            //-------------------------------------------------------      
            if (obj_t.getDmotanu() != null) {/*Valido la informacion set*/
                if (obj_t.getDmotanu().length() > 0) {
                    st.setString(26, obj_t.getDmotanu());

                } else {
                    st.setString(26, null);
                }
            } else {
                st.setString(26, null);
            }

            //-------------------------------------------------------      
            if (obj_t.getFpassok() != null) {/*Valido la informacion set*/
                if (obj_t.getFpassok().length() > 0) {
                    st.setString(27, obj_t.getFpassok());

                } else {
                    st.setString(27, null);
                }
            } else {
                st.setString(27, null);
            }

            //-------------------------------------------------------      
            if (obj_t.getCorrelativo_expedientetmp() != null) {/*Valido la informacion set*/
                if (obj_t.getCorrelativo_expedientetmp().length() > 0) {
                    st.setString(28, obj_t.getCorrelativo_expedientetmp());

                } else {
                    st.setString(28, null);
                }
            } else {
                st.setString(28, null);
            }

            //-------------------------------------------------------      
            if (obj_t.getDnumoldtmp() != null) {/*Valido la informacion set*/
                if (obj_t.getDnumoldtmp().length() > 0) {
                    st.setString(29, obj_t.getDnumoldtmp());

                } else {
                    st.setString(29, null);
                }
            } else {
                st.setString(29, null);
            }

            //-------------------------------------------------------      
            if (obj_t.getNregistro() != null) {/*Valido la informacion set*/
                if (obj_t.getNregistro().length() > 0) {
                    st.setString(30, obj_t.getNregistro());

                } else {
                    st.setString(30, null);
                }
            } else {
                st.setString(31, null);
            }

            if (obj_t.getObservacion() != null) {/*Valido la informacion set*/
                if (obj_t.getObservacion().length() > 0) {
                    st.setString(32, obj_t.getObservacion());

                } else {
                    st.setString(32, null);
                }
            } else {
                st.setString(32, null);
            }

            //..........................................................
            st.registerOutParameter(33, java.sql.Types.VARCHAR);
            st.execute();

            /*como aseguarse si lo que registro es correcto o incorrecto  --- como proc amacenado de begins */
            if (st.getString(33) != null) {/**/
                a = true;
            }
            st.close();
            conexion.setAutoCommit(true);
            conexion.close();

        } catch (Exception error) {
            System.out.println("ERROR REGISTRAR: " + error.getMessage());
            //error.printStackTrace();
        }
        return a;
    }

//-------JUDITH 05/04/17----------------
    public static ArrayList<Expediente> getCargarExpediente() {
        ArrayList<Expediente> arr = null;
        Expediente obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = null;
            st = conexion.prepareCall("{exec [dbo].[usp_java_expedientesporfecha] }");
            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {
                    obj = new Expediente();

                    obj.setNdocume(rs.getString("NDOCUME"));
                    obj.setDcontri(rs.getString("DCONTRI"));
                    obj.setDoficin(rs.getString("DOFICIN"));
                    obj.setNumero_folios(rs.getInt("NFOLIOS"));
                    obj.setCanexo(rs.getString("CANEXO"));
                    obj.setDasunto(rs.getString("DASUNTO"));
                    obj.setCorrelativo_expediente(rs.getString("CCORREL"));
                    obj.setEstado_expediente(rs.getString("CESTADO"));
                    obj.setDfecdoc(rs.getDate("DFECDOC"));

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

//   ---------------------------JUDITH 04/04/17---------------------------------------
    public ArrayList<SelectItem> getCargarComboExpediente_dcivil() {
        ArrayList<SelectItem> arrayExpediente = new ArrayList<SelectItem>();
        Expediente obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{exec [dbo].[usp_java_expedientesporfecha] }");
            rs = st.executeQuery();
            if (rs.next()) {

                do {
                    arrayExpediente.add(new SelectItem(rs.getString("NDOCUME"),
                            rs.getString("DCONTRI") + " - " + rs.getString("DOFICIN") + "-" + rs.getInt("NFOLIOS") + "-"
                            + rs.getString("CANEXO") + "-" + rs.getString("DASUNTO") + "-" + rs.getString("CCORREL") + "-" + rs.getString("CESTADO") + "-" + rs.getDate("DFECDOC")));
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

        return arrayExpediente;
    }

//CONSULTAS POR FECHA 07-04-17 *J*
    public static ArrayList<Expediente> getBuscarExpedientePorFechaParametro(Expediente ing) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expedientes_por_fecha(?,?)}");

            if (ing.getFecha_inicio() != null) {

                st.setDate(1, new java.sql.Date(ing.getFecha_inicio().getTime()));

            } else {
                st.setDate(1, null);
            }

            if (ing.getFecha_fin() != null) {

                st.setDate(2, new java.sql.Date(ing.getFecha_fin().getTime()));

            } else {
                st.setDate(2, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setNdocume(rs.getString("NDOCUME"));
                    obj.setDcontri(rs.getString("DCONTRI"));
                    obj.setDoficin(rs.getString("DOFICIN"));
                    obj.setNumero_folios(rs.getInt("NFOLIOS"));
                    obj.setCanexo(rs.getString("CANEXO"));
                    obj.setDasunto(rs.getString("DASUNTO"));
                    obj.setCorrelativo_expediente(rs.getString("CCORREL"));
                    obj.setEstado_expediente(rs.getString("CESTADO"));
                    obj.setDfecdoc(rs.getDate("DFECDOC"));

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
    // JUDITH: BUSQUEDA DE EXPEDIENTE

    public static ArrayList<Expediente> getBusquedaDeExpedientes(Expediente busc) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_listar_expediente(?,?,?)}");

            st.setString(1, busc.getCnombre());

            if (busc.getFecha_inicio() != null) {

                //    st.setTimestamp(2,new java.sql.Timestamp(TurnoDf.getDnitur().getTime()));                    
                st.setDate(2, new java.sql.Date(busc.getFecha_inicio().getTime()));
            } else {
                st.setDate(2, null);
            }

            if (busc.getFecha_fin() != null) {

                //    st.setTimestamp(2,new java.sql.Timestamp(TurnoDf.getDnitur().getTime()));                    
                st.setDate(3, new java.sql.Date(busc.getFecha_fin().getTime()));
            } else {
                st.setDate(3, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setNro(rs.getString("nro"));
                    obj.setNumero_expediente(rs.getString("dnumold"));
                    obj.setCnombre(rs.getString("cnombre"));
                    obj.setDasunto(rs.getString("dasunto"));
                    obj.setFecha_presentacion_expediente1(rs.getString("fecha_presentacion_expediente"));
                    obj.setD_hasta(rs.getString("d_hasta"));
                    obj.setNumero_folios(rs.getInt("numero_folios"));
                    obj.setObservacioncion(rs.getString("observa"));
                    obj.setCodigo_contribuyente(rs.getString("codigo_contribuyente"));
                    obj.setDtipdoc(rs.getString("dtipdoc"));
                    obj.setFfecrec(rs.getDate("ffecrec"));
                    obj.setDestado(rs.getString("destado"));
                    obj.setDnrodoc(rs.getString("dnrodoc"));

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
        return (ArrayList<Expediente>) arr;
    }

    //JUDITH: BUSQUEDA DE EXPEDIENTES INGRESADOS POR OFICINA
    public static ArrayList<Expediente> getBuscaExpedientesIngresadosPorOficina(Expediente ofic) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expedientes_despachados_por_oficina(?,?,?)}");

            if (ofic.getNombre_area() != null) {
                if (ofic.getNombre_area().length() > 0) {
                    st.setString(1, ofic.getNombre_area());

                } else {
                    st.setString(1, null);
                }
            }

            if (ofic.getFecha_inicio() != null) {

                st.setDate(2, new java.sql.Date(ofic.getFecha_inicio().getTime()));

            } else {
                st.setDate(2, null);
            }

            if (ofic.getFecha_fin() != null) {

                st.setDate(3, new java.sql.Date(ofic.getFecha_fin().getTime()));

            } else {
                st.setDate(3, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setNumero_expediente(rs.getString("DNUMOLD"));
                    obj.setCodigo_contribuyente(rs.getString("CCONTRI"));
                    obj.setDcontri(rs.getString("DCONTRI"));
                    obj.setFfecenv(rs.getDate("FFECENV"));
                    obj.setEstado_expediente(rs.getString("CESTADO"));
                    obj.setDestado(rs.getString("DESTADO"));
                    obj.setCaredes(rs.getString("CAREDES"));
                    obj.setDaredes(rs.getString("DAREDES"));
                    obj.setCasunto(rs.getString("CASUNTO"));
                    obj.setDasunto(rs.getString("DASUNTO"));
                    obj.setDasunto(rs.getString("DASUNTO"));

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

    /**
     * JUDITH 27-04-17
     */
    // JUDITH:LISTA DE AREAS 
    public static ArrayList<Area> getCargarAreas() {
        ArrayList<Area> arr = null;
        Area obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = null;
            st = conexion.prepareCall("{call dbo.usp__java_lista_area()}");
            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Area>();
                do {
                    obj = new Area();
                    obj.setId_area(rs.getString("CAREAS"));
                    obj.setNombre_area(rs.getString("nombre_area"));
                    // obj.setNordens(rs.getString("NORDENS"));

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

  


    public ArrayList<SelectItem> getCargarComboAreas() {

        ArrayList<SelectItem> arrayAreas = new ArrayList<SelectItem>();
        Area obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_lista_area()}");
            rs = st.executeQuery();
            if (rs.next()) {
                do {
                    arrayAreas.add(new SelectItem(rs.getString("id_area"), rs.getString("nombre_area")));
//                          
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

        return arrayAreas;
    }
    
 

    /**
     * 28-04-17
     */
    //JUDITH:  DOCUMENTOS INGRESADOS POR RECURRENTE
    public static ArrayList<Expediente> getExpIngresadoPorRecurr(Expediente bus) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expedientes_por_recurrente(?,?,?)}");

            st.setString(1, bus.getCodigo_contribuyente());

            if (bus.getFecha_inicio() != null) {

                st.setDate(2, new java.sql.Date(bus.getFecha_inicio().getTime()));

            } else {
                st.setDate(2, null);
            }

            if (bus.getFecha_fin() != null) {

                st.setDate(3, new java.sql.Date(bus.getFecha_fin().getTime()));

            } else {
                st.setDate(3, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setNumero_expediente(rs.getString("DNUMOLD"));
                    obj.setFecha_presentacion_expediente1(rs.getString("FFECDOC"));
                    obj.setCasunto(rs.getString("CASUNTO"));
                    obj.setDasunto(rs.getString("DASUNTO"));
                    obj.setNombre_area(rs.getString("CAREAS"));
                    obj.setDareact(rs.getString("DAREACT"));
                    obj.setDtipdoc(rs.getString("DTIPDOC"));
                    obj.setDestado(rs.getString("DESTADO"));
                    obj.setXfecha(rs.getDate("XFECHA"));

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

    //JUDITH: BUSQUEDA DE EXPEDIENTES DESPACHADOS POR OFICINA **J**05/05/17
    public static ArrayList<Expediente> getBuscaExpedientesDespachadosPorOficina(Expediente desp) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expedientes_despachados_por_oficina(?,?,?)}");

            if (desp.getNombre_area() != null) {
                if (desp.getNombre_area().length() > 0) {
                    st.setString(1, desp.getNombre_area());

                } else {
                    st.setString(1, null);
                }
            }

            if (desp.getFecha_inicio() != null) {

                st.setDate(2, new java.sql.Date(desp.getFecha_inicio().getTime()));

            } else {
                st.setDate(2, null);
            }

            if (desp.getFecha_fin() != null) {

                st.setDate(3, new java.sql.Date(desp.getFecha_fin().getTime()));

            } else {
                st.setDate(3, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setNumero_expediente(rs.getString("DNUMOLD"));
                    obj.setCodigo_contribuyente(rs.getString("CCONTRI"));
                    obj.setDcontri(rs.getString("DCONTRI"));
                    obj.setFfecenv(rs.getDate("FFECENV"));
                    obj.setEstado_expediente(rs.getString("CESTADO"));
                    obj.setDestado(rs.getString("DESTADO"));
                    obj.setCaredes(rs.getString("CAREDES"));
                    obj.setDaredes(rs.getString("DAREDES"));
                    obj.setCasunto(rs.getString("CASUNTO"));
                    obj.setDasunto(rs.getString("DASUNTO"));

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
    //JUDITH: BUSQUEDA DE EXPEDIENTES RESUELTOS POR OFICINA

    public static ArrayList<Expediente> getBuscaExpedientesResueltosPorOficina(Expediente resul) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call sp_java_expedientes_resueltos_por_oficina(?,?,?)}");

            if (resul.ObjArea.getId_area() != null) {
                if (resul.ObjArea.getId_area().length() > 0) {
                    st.setString(1, resul.ObjArea.getId_area());

                } else {
                    st.setString(1, null);
                }
            }

            if (resul.getFecha_inicio() != null) {

                st.setDate(2, new java.sql.Date(resul.getFecha_inicio().getTime()));

            } else {
                st.setDate(2, null);
            }

            if (resul.getFecha_fin() != null) {

                st.setDate(3, new java.sql.Date(resul.getFecha_fin().getTime()));

            } else {
                st.setDate(3, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setFecha_presentacion_expediente1(rs.getString("FFECDOC"));
                    obj.setNumero_expediente(rs.getString("DNUMOLD"));
                    obj.setXfecha1(rs.getString("XFECHA"));
                    obj.setC_hasta(rs.getString("C_HASTA"));
                    obj.setFfecenv1(rs.getString("FFECENV"));
                    obj.setFfecrec1(rs.getString("FFECREC"));
                    obj.setFectrami(rs.getString("FECTRAMI"));
                    obj.setDnombre(rs.getString("DNOMBRE"));
                    obj.setNombre_area(rs.getString("DAREAS"));
                    obj.setD_hasta(rs.getString("DHASTA"));
                    obj.setDnomusu(rs.getString("DNOMUSU"));
                    obj.setObserut(rs.getString("obserut"));

                    arr.add(obj);

                } while (rs.next());
            }
            st.execute();

            conexion.setAutoCommit(true);
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        return arr;
    }

    //JUDITH: BUSQUEDA DE EXPEDIENTES INGRESADOS POR ASUNTO
    public static ArrayList<Expediente> getBuscaExpedientesPorAsunto(Expediente asun) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call sp_java_expedientes_por_asunto(?,?)}");

            if (asun.getFecha_inicio() != null) {

                st.setDate(1, new java.sql.Date(asun.getFecha_inicio().getTime()));

            } else {
                st.setDate(1, null);
            }

            if (asun.getFecha_fin() != null) {

                st.setDate(2, new java.sql.Date(asun.getFecha_fin().getTime()));

            } else {
                st.setDate(2, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setDtipdoc(rs.getString("dtipdoc"));
                    obj.setNumero_expediente(rs.getString("dnumold"));
                    obj.setFecha_presentacion_expediente1(rs.getString("fecha_presentacion_expediente"));
                    obj.setCnombre(rs.getString("drecurre"));
                    obj.setNombre_area(rs.getString("dareact"));
                    obj.setDestado(rs.getString("destado"));
                    obj.setDasunto(rs.getString("dasunto"));
                    obj.setXfecha1(rs.getString("xfecha"));
                    obj.setCasunto(rs.getString("asunto_expediente"));
                    obj.setObservacioncion(rs.getString("observa"));
                    obj.setDnomusu(rs.getString("dnomusu"));
                    obj.setDrefere(rs.getString("drefere"));
                    obj.setNresuel(rs.getString("nresuel"));
                    obj.setNtramit(rs.getInt("ntramit"));
                    obj.setObserut(rs.getString("dobserv"));

                    arr.add(obj);

                } while (rs.next());
            }
            st.execute();

            conexion.setAutoCommit(true);
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        return arr;
    }

    //JUDITH: BUSQUEDA DE EXPEDIENTES RECEPCIONADOS POR OFICINA
    public static ArrayList<Expediente> getBuscaExpedientesRecepcionadosPorOficina(Expediente ofic) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expediente_recepcionados_oficina(?,?,?)}");

            if (ofic.getNombre_area() != null) {
                if (ofic.getNombre_area().length() > 0) {
                    st.setString(1, ofic.getNombre_area());

                } else {
                    st.setString(1, null);
                }
            }

            if (ofic.getFecha_inicio() != null) {

                st.setDate(2, new java.sql.Date(ofic.getFecha_inicio().getTime()));

            } else {
                st.setDate(2, null);
            }

            if (ofic.getFecha_fin() != null) {

                st.setDate(3, new java.sql.Date(ofic.getFecha_fin().getTime()));

            } else {
                st.setDate(3, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setNumero_expediente(rs.getString("DNUMOLD"));
                    obj.setFecha_presentacion_expediente1(rs.getString("FFECDOC"));
                    obj.setFfecrec1(rs.getString("FFECREC"));
                    obj.setDnombre(rs.getString("DNOMBRE"));
                    obj.setCodigo_contribuyente(rs.getString("CCONTRI"));
                    obj.setDasunto(rs.getString("DASUNTO"));
                    obj.setObserut(rs.getString("obserut"));
                    obj.setFfecenv(rs.getDate("ffecenv"));

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
    //JUDITH: BUSQUEDA DE EXPEDIENTES DERIVADOS POR GERENCIA 08-05-17 

    public static ArrayList<Expediente> getBuscaExpedientesDerivadosPorGerencia(Expediente g) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call dbo.USP_JAVA_BUSCA_TRAMITE_GERENCIA (?,?,?,?)}");

            if (g.getFecha_inicio() != null) {

                st.setDate(1, new java.sql.Date(g.getFecha_inicio().getTime()));

            } else {
                st.setDate(1, null);
            }

            if (g.getFecha_fin() != null) {

                st.setDate(2, new java.sql.Date(g.getFecha_fin().getTime()));

            } else {
                st.setDate(2, null);
            }
            // DESDE

            if (g.getNombre_area() != null) {
                if (g.getNombre_area().length() > 0) {
                    st.setString(3, g.getNombre_area());

                } else {
                    st.setString(3, null);
                }
            }

            //HASTA 
            if (g.getNombre_area1() != null) {
                if (g.getNombre_area1().length() > 0) {
                    st.setString(4, g.getNombre_area1());

                } else {
                    st.setString(4, null);
                }
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setNdocume(rs.getString("ndocume"));
                    obj.setCnombre(rs.getString("nomraz"));
                    obj.setFecha_presentacion_expediente1(rs.getString("fecingr"));
                    obj.setNumero_folios(rs.getInt("folio"));
                    obj.setFlagimp(rs.getInt("flagimp"));
                    obj.setDasunto(rs.getString("motivo"));
                    obj.setCanexo(rs.getString("anex"));
                    obj.setC_hasta(rs.getString("hasta"));
                    obj.setNordens(rs.getString("nordens"));
                    obj.setLimpres(rs.getByte("limpres"));
                    obj.setNorden(rs.getString("norden"));
                    obj.setFfecenv1(rs.getString("ffecenv"));

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
    //JUDITH: BUSQUEDA DE EXPEDIENTES EN TRAMITE POR OFICINA 09-05-17 

    public static ArrayList<Expediente> getBuscaExpedientesEnTramiPorOficina(Expediente tramO) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expedientes_tramite_por_oficina (?,?,?,?)}");

            st.setString(1, tramO.ObjArea.getId_area());

            if (tramO.getFecha_inicio() != null) {

                st.setDate(2, new java.sql.Date(tramO.getFecha_inicio().getTime()));

            } else {
                st.setDate(2, null);
            }

            if (tramO.getFecha_fin() != null) {

                st.setDate(3, new java.sql.Date(tramO.getFecha_fin().getTime()));

            } else {
                st.setDate(3, null);
            }

            if (tramO.getOpcion() != null) {/*Valido la informacion set*/
                if (tramO.getOpcion().length() > 0) {
                    st.setString(4, tramO.getOpcion());

                } else {
                    st.setString(4, null);
                }
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setNumero_expediente(rs.getString("DNUMOLD"));
                    obj.setFecha_presentacion_expediente1(rs.getString("FFECDOC"));           
                    obj.setC_hasta(rs.getString("C_HASTA"));
                    obj.setFfecenv1(rs.getString("FFECENV"));
                    obj.setD_horas(rs.getString("DHORAENV"));
                    obj.setFfecrec1(rs.getString("FFECREC"));
                    obj.setFectrami(rs.getString("FECTRAMI"));
                    obj.setDasunto(rs.getString("DASUNTO"));
                    obj.setDnombre(rs.getString("DNOMBRE"));
                    obj.setNombre_area(rs.getString("ADESDE"));
                    obj.setD_hasta(st.getString("DAREAS"));
                    obj.setDnomusu(st.getString("DNOMUSU"));
                    obj.setObserut(st.getString("obserut"));
                    obj.setNrpendi(st.getString("nrpendi"));
                    obj.setNrrecep(st.getString("nrrecep"));
//           

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

    /**
     * JUDITH 11-05-17
     */
    // JUDITH:LISTA DE AREAS 
    public static ArrayList<Area> getCargarAreas2() {
        ArrayList<Area> arr = null;
        Area obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = null;
            st = conexion.prepareCall("{call dbo.usp__java_lista_area()}");
            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Area>();
                do {
                    obj = new Area();
                    obj.setId_area(rs.getString("CAREAS"));
                    obj.setNombre_area(rs.getString("nombre_area"));
                    // obj.setNordens(rs.getString("NORDENS"));

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

    //JUDITH: CARGANDO EN EL SelectOneMenu (COMBO)
    public ArrayList<SelectItem> getCargarComboAreas2() {
        ArrayList<SelectItem> arrayAreas = new ArrayList<SelectItem>();
        Area obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.usp__java_lista_area()}");
            rs = st.executeQuery();
            if (rs.next()) {
                do {
                    arrayAreas.add(new SelectItem(rs.getString("CAREAS"),
                            rs.getString("nombre_area")));
//                       .. rs.getString("nombre_area")+" - "+rs.getString("NORDENS") ));      
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

        return arrayAreas;
    }

    //JUDITH: BUSQUEDA DE EXPEDIENTES EN TRAMITE POR TECNICO 12-05-17 
    public static ArrayList<Expediente> getBuscaExpedienteEnTramitePorTecnico(Expediente t) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call dbo.usp_java_expedientes_tramite_oficina_tecnico_fecha (?,?,?,?)}");

            // AREA
          
            if (t.ObjArea.getId_area() != null) {
                if (t.ObjArea.getId_area().length() > 0) {
                    st.setString(1, t.ObjArea.getId_area());

                } else {
                    st.setString(1, null);
                }
            }


            //TECNICO
            if (t.getXtecnico() != null) {/*Valido la informacion set*/
                if (t.getXtecnico().length() > 0) {
                    st.setString(2, t.getXtecnico());

                } else {
                    st.setString(2, null);
                }
            }

            if (t.getFecha_inicio() != null) {

                st.setDate(3, new java.sql.Date(t.getFecha_inicio().getTime()));

            } else {
                st.setDate(3, null);
            }

            if (t.getFecha_fin() != null) {

                st.setDate(4, new java.sql.Date(t.getFecha_fin().getTime()));

            } else {
                st.setDate(4, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setNombre_area(rs.getString("nombre_area"));
                    obj.setCorrelativo_expediente(rs.getString("CCORREL"));
                    obj.setNumero_expediente(rs.getString("DNUMOLD"));
                    obj.setFecha_presentacion_expediente1(rs.getString("FFECDOC"));
                    obj.setCodigo_contribuyente(rs.getString("CCONTRI"));
                    obj.setDnombre(rs.getString("DNOMBRE"));
                    obj.setDasunto(rs.getString("DASUNTO"));
                    obj.setFfecrec1(rs.getString("FECRECEXP"));
                    obj.setHorrecexp(rs.getString("HORRECEXP"));
                    obj.setCusuari(rs.getString("CUSUARI"));
                    obj.setFfecenv1(rs.getString("XFECENVTEC"));
                    obj.setMmotobs(rs.getString("MMOTOBS"));
                    obj.setXcodtecn(rs.getString("XCODTECN"));
                    obj.setXtecnico(rs.getString("XTECNICO"));
                    obj.setFfecrec1(rs.getString("XFECRECTEC"));
                    obj.setDdocdrv(rs.getString("DDOCDRV"));
                    obj.setEdt(rs.getInt("edt"));
                    obj.setXtecreci(rs.getString("XTECRECI"));
                    obj.setNumero_folios(rs.getInt("numero_folios"));
                    obj.setDusrenv(rs.getString("dusrenv"));
                    obj.setDusrrec(rs.getString("dusrrec"));

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

    public static ArrayList<Expediente> BuscaReporteExpedientesPorFecha(Expediente ObjReporteExpedientes) {

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_reporte_Expedientes_Por_Fecha(?,?)}");

//         
//       
            if (ObjReporteExpedientes.getFecha_inicio() != null) {

                st.setDate(1, new java.sql.Date(ObjReporteExpedientes.getFecha_inicio().getTime()));

            } else {
                st.setDate(1, null);
            }

            if (ObjReporteExpedientes.getFecha_fin() != null) {

                st.setDate(2, new java.sql.Date(ObjReporteExpedientes.getFecha_fin().getTime()));

            } else {
                st.setDate(2, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setEstado_expediente(rs.getString("Estado_Expediente"));
                    obj.setNumero_expediente(rs.getString("Numero_Expediente"));

                    Persona ObjPersona = new Persona();
                    ObjPersona.setNombre_contribuyente(rs.getString("Nombre_Recurrente"));
                    obj.setObjPersona(ObjPersona);

                    obj.setAsunto_expediente(rs.getString("Asunto_Expediente"));
                    obj.setArea_inicio(rs.getString("Area_Inicio"));
                    obj.setArea_final(rs.getString("Area_Final"));
                    obj.setDias_tupa(rs.getInt("Dias_Tupa"));
                    obj.setFecha_presentacion_expediente1(rs.getString("Fecha_Presentacion_Expediente"));
                    obj.setFecha_resuelto_expediente_reporte(rs.getString("Fecha_Resuelto_Expediente"));
                    obj.setObservacion(rs.getString("Detalle_Expediente"));

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
