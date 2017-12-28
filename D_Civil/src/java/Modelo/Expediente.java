

/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.model.SelectItem;
import java.text.ParseException;  
 import java.text.SimpleDateFormat;  
  


/**
 *
 * @author Calistro
 */
public class Expediente implements Serializable{
    
   private String estado =null;
   private Date fecha_inicio;
   private Date fecha_fin;
   
   
   
   
   private Date fecha_inicial;
   private Date fecha_final;
   
   private String ccorrel;
   private String ctipdoc;
   private String dnumold; 
   private Date ffecdoc;
   private String ffecdoc1;
   private String dhordoc;
   private int nfolios;
   private String ccontri;
   private String casunto;
   private int ndiatra;
   private Date fresuel;
   private String observa;
   private Date ffintra;
   private String dnrodoc;
   private String cestado;
   private  byte limpres;
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
   private String ccorreltmp;
   private String dnumoldtmp;
   private String nregistro;
   private String nobsevres;
   //06-04-17 *J*
   private String ndocume;
   private String dcontri;
   private String doficin;
   private String canexo;
   private String dasunto;
   private Date  dfecdoc;
   //20-04-17 *J*

   private String cnombre;
   private String d_hasta;
   private String dtipdoc;
   private Date ffecrec;
    private String ffecrec1;
   private String destado;
   private String nro;
//25-04-17**J**
   private Date ffecenv;
   private String ffecenv1;
   private String caredes;
   private String daredes;
   private String c_hasta;
   private String c_desde;
//28-04-17 **J**
   private String id_area;
   private String careas1;
   private String dareact;
   private Date xfecha;
   private String xfecha1;
 
//04-05-17 **J**
   private String nombre_area;
   
//05-05-17 **J**
  private String fectrami;
  private String dnombre;
  private String dnomusu;
  private String obserut;

  //09/05/17**J**
 private String nrpendi;
 private String nrrecep;
 private String c_hasta_Deriva;
 private String dusuari_deriva;
 private String norden;
 
 //12/05/17**J**
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
  


  public Date getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(Date fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
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
  

    public String getXtecreci() {
        return xtecreci;
    }

    public void setXtecreci(String xtecreci) {
        this.xtecreci = xtecreci;
    }
 
    public int getEdt() {
        return edt;
    }

    public void setEdt(int edt) {
        this.edt = edt;
    }

    public String getDdocdrv() {
        return ddocdrv;
    }

    public void setDdocdrv(String ddocdrv) {
        this.ddocdrv = ddocdrv;
    }

    public String getXcodtecn() {
        return xcodtecn;
    }

    public void setXcodtecn(String xcodtecn) {
        this.xcodtecn = xcodtecn;
    }
  
    public String getMmotobs() {
        return mmotobs;
    }

    public void setMmotobs(String mmotobs) {
        this.mmotobs = mmotobs;
    }
 
    public String getHorrecexp() {
        return horrecexp;
    }

    public void setHorrecexp(String horrecexp) {
        this.horrecexp = horrecexp;
    }
  
    public String getXtecnico() {
        return xtecnico;
    }

    public void setXtecnico(String xtecnico) {
        this.xtecnico = xtecnico;
    }
  
    public String getNorden() {
        return norden;
    }

    public void setNorden(String norden) {
        this.norden = norden;
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

    public String getXfecha1() {
        return xfecha1;
    }

    public void setXfecha1(String xfecha1) {
        this.xfecha1 = xfecha1;
    }

    public String getCareas1() {
        return careas1;
    }

    public void setCareas1(String careas1) {
        this.careas1 = careas1;
    }
 
    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
  
    public String getFfecrec1() {
        return ffecrec1;
    }

    public void setFfecrec1(String ffecrec1) {
        this.ffecrec1 = ffecrec1;
    }

    public String getC_desde() {
        return c_desde;
    }

    public void setC_desde(String c_desde) {
        this.c_desde = c_desde;
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

    public String getFfecenv1() {
        return ffecenv1;
    }

    public void setFfecenv1(String ffecenv1) {
        this.ffecenv1 = ffecenv1;
    }

 //27-04-17**J**

    public String getC_hasta() {
        return c_hasta;
    }

    public void setC_hasta(String c_hasta) {
        this.c_hasta = c_hasta;
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

    public String getFfecdoc1() {
        return ffecdoc1;
    }

    public void setFfecdoc1(String ffecdoc1) {
        this.ffecdoc1 = ffecdoc1;
    }
  //----
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

    public String getCcorrel() {
        return ccorrel;
    }

    public void setCcorrel(String ccorrel) {
        this.ccorrel = ccorrel;
    }

    public String getCtipdoc() {
        return ctipdoc;
    }

    public void setCtipdoc(String ctipdoc) {
        this.ctipdoc = ctipdoc;
    }

    public String getDnumold() {
        return dnumold;
    }

    public void setDnumold(String dnumold) {
        this.dnumold = dnumold;
    }

    public Date getFfecdoc() {
        return ffecdoc;
    }

    public void setFfecdoc(Date ffecdoc) {
        this.ffecdoc = ffecdoc;
    }

    public String getDhordoc() {
        return dhordoc;
    }

    public void setDhordoc(String dhordoc) {
        this.dhordoc = dhordoc;
    }

    public int getNfolios() {
        return nfolios;
    }

    public void setNfolios(int nfolios) {
        this.nfolios = nfolios;
    }

    public String getCcontri() {
        return ccontri;
    }

    public void setCcontri(String ccontri) {
        this.ccontri = ccontri;
    }

    public String getCasunto() {
        return casunto;
    }

    public void setCasunto(String casunto) {
        this.casunto = casunto;
    }

    public int getNdiatra() {
        return ndiatra;
    }

    public void setNdiatra(int ndiatra) {
        this.ndiatra = ndiatra;
    }

    public Date getFresuel() {
        return fresuel;
    }

    public void setFresuel(Date fresuel) {
        this.fresuel = fresuel;
    }

    public String getObserva() {
        return observa;
    }

    public void setObserva(String observa) {
        this.observa = observa;
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

    public String getCestado() {
        return cestado;
    }

    public void setCestado(String cestado) {
        this.cestado = cestado;
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

    public String getCcorreltmp() {
        return ccorreltmp;
    }

    public void setCcorreltmp(String ccorreltmp) {
        this.ccorreltmp = ccorreltmp;
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

    public String getNobsevres() {
        return nobsevres;
    }

    public void setNobsevres(String nobsevres) {
        this.nobsevres = nobsevres;
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

    public String getId_area() {
        return id_area;
    }

    public void setId_area(String id_area) {
        this.id_area = id_area;
    }

    public String getNombre_area() {
        return nombre_area;
    }

    public void setNombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
    }
  

    public Date getFfecenv() {
        return ffecenv;
    }

    public void setFfecenv(Date ffecenv) {
        this.ffecenv = ffecenv;
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
//28-04-17 **J**
    public String getCareas() {
        return id_area;
    }

    public void setCareas(String id_area) {
        this.id_area = id_area;
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
     public String getnombre_area() {
        return nombre_area;
    }

    public void setnombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
    }
   //05-05-17 **J**

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
    
    // calistro: Registro de Expedientes
    
    public static boolean registrar_expediente(Expediente obj_t){
      boolean a=false;
      Connection conexion = null;
      /* variable de connexion para definir y manejar el conytrol de errores*/
    
      try{
          conexion=Controlador_Sql.darConexionBD();
          CallableStatement st=  /*debe importarse con java la segunda opcion del cuadro de alternativas des importacion*/
          conexion.prepareCall
         ("{call [dbo].[usp_java_documento_new_update] (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,)}"); 
          conexion.setAutoCommit(false);
    
           if(obj_t.ctipdoc!=null){/*Valido la informacion set*/
                   if(obj_t.ctipdoc.length()>0){
                       st.setString(1,obj_t.getCtipdoc());
                       
                   }else{
                    st.setString(1, null);
                    }
          }else{
              st.setString(1, null);
          }
         
          if(obj_t.getDnumold()!=null){/*Valido la informacion set*/
                   if(obj_t.getDnumold().length()>0){
                       st.setString(2,obj_t.getDnumold());
                       
                   }else{
                    st.setString(2, null);
                    }
          }else{
              st.setString(2, null);
          }
          
          
          /*----------------posicion 2*/
          
          if(obj_t.getFfecdoc()!=null){/*Valido la informacion set*/
                  
                       st.setDate(3, (java.sql.Date) obj_t.getFfecdoc());
      
          }else{
                    st.setDate(3, null);
          }
          
          
          
          
         
          if(obj_t.getDhordoc()!=null){   /**Valido la informacion set*/
                   if(obj_t.getDhordoc().length()>0){
                       st.setString(4,obj_t.getDhordoc());
                       
                   }else{
                    st.setString(4, null);
                    }
          }else{
              st.setString(4, null);
          }
          
          if(obj_t.getNfolios() > 0){/**Valido la informacion set*/
                   if(obj_t.getNfolios()>0){
                       st.setInt(5,obj_t.getNfolios());
                       
                   }else{
                    st.setInt(5, 0);
                    }
          }else{
               st.setInt(5, 0);
          }
          //-------------------------------------------------------------------------------
          
           if(obj_t.getCcontri()!=null){/***Valido la informacion set*/
                   if(obj_t.getCcontri().length()>0){
                       st.setString(6,obj_t.getCcontri());
                       
                   }else{
                    st.setString(6, null);
                    }
          }else{
              st.setString(6, null);
          }
         
          //-------------------------------------------------------
           
          if(obj_t.getCasunto()!=null){/*Valido la informacion set*/
                   if(obj_t.getCasunto().length()>0){
                       st.setString(7,obj_t.getCasunto());
                       
                   }else{
                    st.setString(7, null);
                    }
          }else{
              st.setString(7, null);
          }
           
             //-------------------------------------------------------
                  
            if(obj_t.getNdiatra() > 0){/**Valido la informacion set*/
                   if(obj_t.getNdiatra()>0){
                       st.setInt(8,obj_t.getNdiatra());  
                   }else{
                    st.setInt(8, 0);
                    }
          }else{
               st.setInt(8, 0);
          }
          
                  
               //-------------------------------------------------------       
                  
               if(obj_t.getFresuel()!=null){/*Valido la informacion set*/
                  
                       st.setDate(9, (java.sql.Date) obj_t.getFresuel());
      
          }else{
                    st.setDate(9, null);
          }
         
         
            //-------------------------------------------------------
           
         if(obj_t.getObserva()!=null){/*Valido la informacion set*/
                   if(obj_t.getObserva().length()>0){
                       st.setString(10,obj_t.getObserva());
                       
                   }else{
                    st.setString(10, null);
                    }
          }else{
              st.setString(10, null);
          }
           
         
        //-------------------------------------------------------       
                  
               if(obj_t.getFfintra()!=null){/*Valido la informacion set*/
                  
                       st.setDate(11, (java.sql.Date) obj_t.getFfintra());
      
          }else{
                    st.setDate(11, null);
          }
               
        //-------------------------------------------------------   
            
            if(obj_t.getDnrodoc()!=null){/*Valido la informacion set*/
                   if(obj_t.getDnrodoc().length()>0){
                       st.setString(12,obj_t.getDnrodoc());
                       
                   }else{
                    st.setString(12, null);
                    }
          }else{
              st.setString(12, null);
          }
      
        //-------------------------------------------------------      

        
        if(obj_t.getCestado()!=null){/*Valido la informacion set*/
                   if(obj_t.getCestado().length()>0){
                       st.setString(13,obj_t.getCestado());
                       
                   }else{
                    st.setString(13, null);
                    }
          }else{
              st.setString(13, null);
          }
      
          
        //-------------------------------------------------------      
   
        if(obj_t.getLimpres()> 0){/*Valido la informacion set*/
                   if(obj_t.getLimpres()>0){
                       st.setByte(14,obj_t.getLimpres());
                       
                   }else{
                    
                    st.setByte(14, obj_t.getLimpres());
                  
                    }
          }else{
              st.setByte(14, obj_t.getLimpres());
          }
      
        
        //-------------------------------------------------------     
        
         if(obj_t.getCusumod()!=null){/*Valido la informacion set*/
                   if(obj_t.getCusumod().length()>0){
                       st.setString(15,obj_t.getCusumod());
                       
                   }else{
                    st.setString(15, null);
                    }
          }else{
              st.setString(15, null);
          }
           
        
          //-------------------------------------------------------     
        
         if(obj_t.getCusuari()!=null){/*Valido la informacion set*/
                   if(obj_t.getCusuari().length()>0){
                       st.setString(16,obj_t.getCusuari());
                       
                   }else{
                    st.setString(16, null);
                    }
          }else{
              st.setString(16, null);
          }

         
           //-------------------------------------------------------     
        
          if(obj_t.getF_fecha()!=null){/*Valido la informacion set*/
                  
                       st.setDate(17, (java.sql.Date) obj_t.getF_fecha());
      
          }else{
                    st.setDate(17, null);
          }
    
        //------------------------------------------------------- 
             
         if(obj_t.getD_horas()!=null){/*Valido la informacion set*/
                   if(obj_t.getD_horas().length()>0){
                       st.setString(18,obj_t.getD_horas());
                       
                   }else{
                    st.setString(18, null);
                    }
          }else{
              st.setString(18, null);
          }
      
         
         //------------------------------------------------------- 
             
         if(obj_t.getDusured()!=null){/*Valido la informacion set*/
                   if(obj_t.getDusured().length()>0){
                       st.setString(19,obj_t.getDusured());
                       
                   }else{
                    st.setString(19, null);
                    }
          }else{
              st.setString(19, null);
          }
         
         
        //------------------------------------------------------- 
              
              if(obj_t.getLtramite()> 0){/*Valido la informacion set*/
                   if(obj_t.getLtramite()>0){
                       st.setByte(20,obj_t.getLtramite());
                       
                   }else{
                    
                    st.setByte(20, obj_t.getLtramite());
                  
                    }
               }     else{
              st.setByte(20, obj_t.getLtramite());
          }
      
         
          //-------------------------------------------------------         
              
          if(obj_t.getNfoliofin() > 0){/**Valido la informacion set*/
                   if(obj_t.getNfoliofin()>0){
                       st.setInt(21,obj_t.getNfoliofin());  
                   }else{
                    st.setInt(21, 0);
                    }
          }else{
               st.setInt(21, 0);
          }

          //-------------------------------------------------------       
          
         if(obj_t.getCarefin()!=null){/*Valido la informacion set*/
                   if(obj_t.getCarefin().length()>0){
                       st.setString(22,obj_t.getCarefin());
                       
                   }else{
                    st.setString(22, null);
                    }
          }else{
              st.setString(22, null);
          }
             
      //-------------------------------------------------------           
         
      if(obj_t.getLarchiv()> 0){/*Valido la informacion set*/
                   if(obj_t.getLarchiv()>0){
                       st.setByte(23,obj_t.getLarchiv());
                       
                   }else{
                    
                    st.setByte(23, obj_t.getLarchiv());
                  
                    }
               }     else{
              st.setByte(23, obj_t.getLarchiv());
          }
      
   //-------------------------------------------------------           
           
          if(obj_t.getCtiprefe()!=null){/*Valido la informacion set*/
                   if(obj_t.getCtiprefe().length()>0){
                       st.setString(24,obj_t.getCtiprefe());
                       
                   }else{
                    st.setString(24, null);
                    }
          }else{
              st.setString(24, null);
          }
   
   //-------------------------------------------------------           
           
          if(obj_t.getDrefere()!=null){/*Valido la informacion set*/
                   if(obj_t.getDrefere().length()>0){
                       st.setString(25,obj_t.getDrefere());
                       
                   }else{
                    st.setString(25, null);
                    }
          }else{
              st.setString(25, null);
          }
                 
   //-------------------------------------------------------      
          
         if(obj_t.getDmotanu()!=null){/*Valido la informacion set*/
                   if(obj_t.getDmotanu().length()>0){
                       st.setString(26,obj_t.getDmotanu());
                       
                   }else{
                    st.setString(26, null);
                    }
          }else{
              st.setString(26, null);
          }
       
    //-------------------------------------------------------      
          
         if(obj_t.getFpassok()!=null){/*Valido la informacion set*/
                   if(obj_t.getFpassok().length()>0){
                       st.setString(27,obj_t.getFpassok());
                       
                   }else{
                    st.setString(27, null);
                    }
          }else{
              st.setString(27, null);
          }
                  
   //-------------------------------------------------------      
          
         if(obj_t.getCcorreltmp()!=null){/*Valido la informacion set*/
                   if(obj_t.getCcorreltmp().length()>0){
                       st.setString(28,obj_t.getCcorreltmp());
                       
                   }else{
                    st.setString(28, null);
                    }
          }else{
              st.setString(28, null);
          }
    
       //-------------------------------------------------------      
          
         if(obj_t.getDnumoldtmp()!=null){/*Valido la informacion set*/
                   if(obj_t.getDnumoldtmp().length()>0){
                       st.setString(29,obj_t.getDnumoldtmp());
                       
                   }else{
                    st.setString(29, null);
                    }
          }else{
              st.setString(29, null);
          }
         
       //-------------------------------------------------------      
          
         if(obj_t.getNregistro()!=null){/*Valido la informacion set*/
                   if(obj_t.getNregistro().length()>0){
                       st.setString(30,obj_t.getNregistro());
                       
                   }else{
                    st.setString(30, null);
                    }
          }else{
              st.setString(31, null);
          }     
            
         if(obj_t.getNobsevres()!=null){/*Valido la informacion set*/
                   if(obj_t.getNobsevres().length()>0){
                       st.setString(32,obj_t.getNobsevres());
                       
                   }else{
                    st.setString(32, null);
                    }
          }else{
              st.setString(32, null);
          }     
          
        //..........................................................
     
            st.registerOutParameter(33,java.sql.Types.VARCHAR);
            st.execute();
          
           /*como aseguarse si lo que registro es correcto o incorrecto  --- como proc amacenado de begins */
            
            if(st.getString(33)!=null){/**/
                a=true;
            }
            st.close();
            conexion.setAutoCommit(true);
            conexion.close();
          
      }catch(Exception error){
          System.out.println("ERROR REGISTRAR: " + error.getMessage());
           //error.printStackTrace();
      }
      return a;
  }  
  
//-------JUDITH 05/04/17----------------
    public static ArrayList<Expediente> getCargarExpediente(){
    ArrayList <Expediente> arr = null;
    Expediente obj=null;
    Connection conexion = null;
    ResultSet rs = null;
     try{
       conexion = Controlador_Sql.darConexionBD();
       CallableStatement st = null;
       st= conexion.prepareCall( "{exec [dbo].[usp_java_expedientesporfecha] }"); 
        rs = st.executeQuery();
        if (rs.next()){
         arr= new ArrayList<Expediente>();
         do{
              obj =new Expediente();
              
              obj.setNdocume(rs.getString("NDOCUME"));
              obj.setDcontri(rs.getString("DCONTRI"));
              obj.setDoficin(rs.getString("DOFICIN"));
              obj.setNfolios(rs.getInt("NFOLIOS"));
              obj.setCanexo(rs.getString("CANEXO"));
              obj.setDasunto(rs.getString("DASUNTO"));
              obj.setCcorrel(rs.getString("CCORREL"));
              obj.setCestado(rs.getString("CESTADO"));
              obj.setDfecdoc(rs.getDate("DFECDOC"));

              arr.add(obj);
       } while (rs.next());
       }

       rs.close();
       st.close();
       conexion.close();
       }catch(Exception error){
                     System.out.println("Error en el metodo por: " + error.getMessage());
                     error.printStackTrace();
                 }

        return arr;
    }
   
//   ---------------------------JUDITH 04/04/17---------------------------------------
   
   public ArrayList<SelectItem>  getCargarComboExpediente_dcivil(){         
    ArrayList<SelectItem> arrayExpediente = new ArrayList<SelectItem>();
    Expediente obj=null;
    Connection conexion = null;
    ResultSet rs = null;
    try{
        conexion = Controlador_Sql.darConexionBD();
        CallableStatement st = conexion.prepareCall("{exec [dbo].[usp_java_expedientesporfecha] }");   
        rs = st.executeQuery();      
    if (rs.next()){   

               do{
                arrayExpediente.add(new SelectItem(rs.getString("NDOCUME"), 
                        rs.getString("DCONTRI")+" - "+rs.getString("DOFICIN")+"-" +rs.getInt("NFOLIOS")+"-"
                            +rs.getString("CANEXO")+"-"+rs.getString("DASUNTO")+"-"+rs.getString("CCORREL") +"-"+rs.getString("CESTADO")+"-"+rs.getDate("DFECDOC")));    
               } while (rs.next());
       
         }  
         rs.close();
         st.close();
         conexion.close();

     }catch(Exception error){
        System.out.println("Error en el metodo por: " +
                   error.getMessage());
                error.printStackTrace();
        }    
      
    return arrayExpediente;
    } 

//CONSULTAS POR FECHA 07-04-17 *J*
 
  public static ArrayList<Expediente> getBuscarExpedientePorFechaParametro(Expediente ing){

    ArrayList<Expediente> arr=null;
    ResultSet rs=null;
        Expediente obj=null;
        Connection conexion = null;

        try{
           conexion = Controlador_Sql.darConexionBD();
           conexion.setAutoCommit(false);
           conexion = Controlador_Sql.darConexionBD();
           CallableStatement st = conexion.prepareCall( "{call dbo.sp_java_expedientes_por_fecha(?,?)}");
      
      
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
         do{
            
              obj =new Expediente();

              obj.setNdocume(rs.getString("NDOCUME"));
              obj.setDcontri(rs.getString("DCONTRI"));
              obj.setDoficin(rs.getString("DOFICIN"));
              obj.setNfolios(rs.getInt("NFOLIOS"));
              obj.setCanexo(rs.getString("CANEXO"));
              obj.setDasunto(rs.getString("DASUNTO"));
              obj.setCcorrel(rs.getString("CCORREL"));
              obj.setCestado(rs.getString("CESTADO"));
              obj.setDfecdoc(rs.getDate("DFECDOC"));
                 
              arr.add(obj);
       } while (rs.next());
            }
            st.execute(); 
          // st.close();
            conexion.setAutoCommit(true);
            conexion.close();
        }catch(Exception error){
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        return arr;

    }
 // JUDITH: BUSQUEDA DE EXPEDIENTE
 
  public static ArrayList<Expediente> getBusquedaDeExpedientes(Expediente busc){

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

             
          if(busc.getFecha_inicial()!=null){
              
                   //    st.setTimestamp(2,new java.sql.Timestamp(TurnoDf.getDnitur().getTime()));                    
                       st.setDate(2,new java.sql.Date(busc.getFecha_inicial().getTime()));
          }else{
                            st.setDate(2, null);
          }
            
          
            if(busc.getFecha_final()!=null){
              
                   //    st.setTimestamp(2,new java.sql.Timestamp(TurnoDf.getDnitur().getTime()));                    
                       st.setDate(3,new java.sql.Date(busc.getFecha_final().getTime()));
          }else{
                            st.setDate(3, null);
          }
            
   

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();

                    obj.setNro(rs.getString("nro"));
                    obj.setDnumold(rs.getString("dnumold")); 
                    obj.setCnombre(rs.getString("cnombre"));
                    obj.setDasunto(rs.getString("dasunto")); 
                    obj.setFfecdoc1(rs.getString("ffecdoc"));   
                    obj.setD_hasta(rs.getString("d_hasta"));
                    obj.setNfolios(rs.getInt("nfolios"));
                    obj.setObserva(rs.getString("observa"));
                    obj.setCcontri(rs.getString("ccontri"));
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
        return arr;
    }
  
  //JUDITH: BUSQUEDA DE EXPEDIENTES INGRESADOS POR OFICINA
  public static ArrayList<Expediente> getBuscaExpedientesIngresadosPorOficina(Expediente ofic){

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expedientes_despachados_por_oficina(?,?,?)}");
            
            if (ofic.getCareas()!=null){
                   if (ofic.getCareas().length() > 0) {
                    st.setString(1, ofic.getCareas());

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

                    obj.setDnumold(rs.getString("DNUMOLD")); 
                    obj.setCcontri(rs.getString("CCONTRI"));
                    obj.setDcontri(rs.getString("DCONTRI")); 
                    obj.setFfecenv(rs.getDate("FFECENV"));   
                    obj.setCestado(rs.getString("CESTADO"));
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
  
      /**JUDITH 27-04-17 */
  // JUDITH:LISTA DE AREAS 
  public static ArrayList<Area> getCargarAreas(){
      ArrayList<Area> arr=null;
      Area obj=null;
      Connection conexion = null;
      ResultSet rs = null;
     try{
       conexion = Controlador_Sql.darConexionBD();
       CallableStatement st = null;
       st= conexion.prepareCall( "{call dbo.usp__java_lista_area()}");
        rs = st.executeQuery();
        if (rs.next()){
         arr= new ArrayList<Area>();
         do{
              obj =new Area();
              obj.setId_area(rs.getString("CAREAS"));
              obj.setNombre_area(rs.getString("nombre_area"));
             // obj.setNordens(rs.getString("NORDENS"));

              arr.add(obj);
       } while (rs.next());
       }

       rs.close();
       st.close();
       conexion.close();
       }catch(Exception error){
                     System.out.println("Error en el metodo por: " + error.getMessage());
                     error.printStackTrace();
                 }
        return arr;  
  }
  
  //JUDITH: CARGANDO EN EL SelectOneMenu (COMBO)
  
  
  public ArrayList<SelectItem>  getCargarComboAreas(){  
      
    ArrayList<SelectItem> arrayAreas = new ArrayList<SelectItem>();
    Area obj=null;
    Connection conexion = null;
    ResultSet rs = null;
    try{
    conexion = Controlador_Sql.darConexionBD();
    CallableStatement st = conexion.prepareCall( "{call dbo.sp_java_lista_area()}");    
    rs = st.executeQuery();        
    if (rs.next()){    
          do{
                arrayAreas.add(new SelectItem(rs.getString("id_area"), 
                        rs.getString("nombre_area") ));          
//                       .. rs.getString("nombre_area")+" - "+rs.getString("NORDENS") ));      
            } while (rs.next());
       
         }  
         rs.close();
         st.close();
         conexion.close();

     }catch(Exception error){
        System.out.println("Error en el metodo por: " +
                   error.getMessage());
                error.printStackTrace();
        }    
      
    return arrayAreas;
    }
  
  /** 28-04-17*/
  //JUDITH:  DOCUMENTOS INGRESADOS POR RECURRENTE
   public static ArrayList<Expediente> getExpIngresadoPorRecurr(Expediente bus){

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expedientes_por_recurrente(?,?,?)}");
            
            st.setString(1, bus.getCcontri());

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

                    obj.setDnumold(rs.getString("DNUMOLD")); 
                    obj.setFfecdoc1(rs.getString("FFECDOC"));
                    obj.setCasunto(rs.getString("CASUNTO")); 
                    obj.setDasunto(rs.getString("DASUNTO")); 
                    obj.setCareas(rs.getString("CAREAS"));   
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
  public static ArrayList<Expediente> getBuscaExpedientesDespachadosPorOficina(Expediente desp){

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expedientes_despachados_por_oficina(?,?,?)}");
            
       
                if (desp.getCareas()!=null){
                   if (desp.getCareas().length() > 0) {
                    st.setString(1, desp.getCareas());

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

                    obj.setDnumold(rs.getString("DNUMOLD")); 
                    obj.setCcontri(rs.getString("CCONTRI"));
                    obj.setDcontri(rs.getString("DCONTRI")); 
                    obj.setFfecenv(rs.getDate("FFECENV"));   
                    obj.setCestado(rs.getString("CESTADO"));
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
  public static ArrayList<Expediente> getBuscaExpedientesResueltosPorOficina(Expediente resul){

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call sp_java_expedientes_resueltos_por_oficina(?,?,?)}");
            
         
            if (resul.getCareas()!=null){
                   if (resul.getCareas().length() > 0) {
                    st.setString(1, resul.getCareas());

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
                    
                    obj.setFfecdoc1(rs.getString("FFECDOC"));
                    obj.setDnumold(rs.getString("DNUMOLD"));
                    obj.setXfecha1(rs.getString("XFECHA"));
                    obj.setC_hasta(rs.getString("C_HASTA")); 
                    obj.setFfecenv1(rs.getString("FFECENV"));  
                    obj.setFfecrec1(rs.getString("FFECREC"));
                    obj.setFectrami(rs.getString("FECTRAMI"));
                    obj.setDnombre(rs.getString("DNOMBRE"));
                    obj.setnombre_area(rs.getString("DAREAS"));
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
  public static ArrayList<Expediente> getBuscaExpedientesPorAsunto(Expediente asun){

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

                st.setDate(2, new java.sql.Date(asun.getFecha_inicio().getTime()));

            } else {
                st.setDate(2, null);
            }

            if (asun.getFecha_fin() != null) {

                st.setDate(3, new java.sql.Date(asun.getFecha_fin().getTime()));

            } else {
                st.setDate(3, null);
            }
            
          
            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Expediente>();
                do {

                    obj = new Expediente();
                    
                    obj.setDtipdoc(rs.getString("dtipdoc"));
                    obj.setDnumold(rs.getString("dnumold"));
                    obj.setFfecdoc1(rs.getString("ffecdoc"));
                    obj.setCnombre(rs.getString("drecurre")); 
                    obj.setnombre_area(rs.getString("dareact"));  
                    obj.setDestado(rs.getString("destado")); 
                    obj.setDasunto(rs.getString("dasunto"));
                    obj.setXfecha1(rs.getString("xfecha"));
                    obj.setCasunto(rs.getString("casunto"));
                    obj.setObserva(rs.getString("observa"));
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
  public static ArrayList<Expediente> getBuscaExpedientesRecepcionadosPorOficina(Expediente ofic){

        ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expediente_recepcionados_oficina(?,?,?)}");
           

            if (ofic.getCareas()!=null){
                   if (ofic.getCareas().length() > 0) {
                    st.setString(1, ofic.getCareas());

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

                    obj.setDnumold(rs.getString("DNUMOLD")); 
                    obj.setFfecdoc1(rs.getString("FFECDOC"));
                    obj.setFfecrec1(rs.getString("FFECREC")); 
                    obj.setDnombre(rs.getString("DNOMBRE"));   
                    obj.setCcontri(rs.getString("CCONTRI"));
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
  public static ArrayList<Expediente> getBuscaExpedientesDerivadosPorGerencia(Expediente g){

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

            if (g.getCareas()!=null){
                   if (g.getCareas().length() > 0) {
                    st.setString(3, g.getCareas());

                } else {
                    st.setString(3, null);
                }
            }

           //HASTA 
              if (g.getCareas1()!=null){
                   if (g.getCareas1().length() > 0) {
                    st.setString(4, g.getCareas1());

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
                    obj.setFfecdoc1(rs.getString("fecingr")); 
                    obj.setNfolios(rs.getInt("folio"));   
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
  public static ArrayList<Expediente> getBuscaExpedientesEnTramiPorOficina(Expediente tramO){
      
   ArrayList<Expediente> arr = null;
        ResultSet rs = null;
        Expediente obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();

            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expedientes_tramite_por_oficina (?,?,?,?)}");
           
            st.setString(1,tramO.getCareas()); 
            
            
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

                    obj.setDnumold(rs.getString("DNUMOLD")); 
                    obj.setFfecdoc1(rs.getString("FFECDOC"));
//                    obj.setFfecdoc1(rs.getString("fecingr")); 
                    obj.setC_hasta(rs.getString("C_HASTA"));   
                    obj.setFfecenv1(rs.getString("FFECENV"));
                    obj.setD_horas(rs.getString("DHORAENV"));
                    obj.setFfecrec1(rs.getString("FFECREC"));
                    obj.setFectrami(rs.getString("FECTRAMI"));
                    obj.setDasunto(rs.getString("DASUNTO"));
                    obj.setDnombre(rs.getString("DNOMBRE"));
                    obj.setnombre_area(rs.getString("ADESDE"));
                    obj.setD_hasta(st.getString("DAREAS"));
                    obj.setDnomusu(st.getString("DNOMUSU"));
                    obj.setObserut(st.getString("obserut"));
                    obj.setNrpendi(st.getString("nrpendi"));
                    obj.setNrrecep(st.getString("nrrecep"));
//                    obj.setC_hasta_Deriva(st.getString("c_hasta_deriva"));
//                    obj.setDusuari_deriva(st.getString("dusuari_deriva"));
                    
                    
                    

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
  
        /**JUDITH 11-05-17 */
  // JUDITH:LISTA DE AREAS 
  public static ArrayList<Area> getCargarAreas2(){
      ArrayList<Area> arr=null;
      Area obj=null;
      Connection conexion = null;
      ResultSet rs = null;
     try{
       conexion = Controlador_Sql.darConexionBD();
       CallableStatement st = null;
       st= conexion.prepareCall( "{call dbo.usp__java_lista_area()}");
        rs = st.executeQuery();
        if (rs.next()){
         arr= new ArrayList<Area>();
         do{
              obj =new Area();
              obj.setId_area(rs.getString("CAREAS"));
              obj.setNombre_area(rs.getString("nombre_area"));
             // obj.setNordens(rs.getString("NORDENS"));

              arr.add(obj);
       } while (rs.next());
       }

       rs.close();
       st.close();
       conexion.close();
       }catch(Exception error){
                     System.out.println("Error en el metodo por: " + error.getMessage());
                     error.printStackTrace();
                 }
        return arr;  
  }
  
  //JUDITH: CARGANDO EN EL SelectOneMenu (COMBO)
  public ArrayList<SelectItem>  getCargarComboAreas2(){         
    ArrayList<SelectItem> arrayAreas = new ArrayList<SelectItem>();
    Area obj=null;
    Connection conexion = null;
    ResultSet rs = null;
    try{
    conexion = Controlador_Sql.darConexionBD();
    CallableStatement st = conexion.prepareCall( "{call dbo.usp__java_lista_area()}");    
    rs = st.executeQuery();        
    if (rs.next()){    
          do{
                arrayAreas.add(new SelectItem(rs.getString("CAREAS"), 
                        rs.getString("nombre_area") ));          
//                       .. rs.getString("nombre_area")+" - "+rs.getString("NORDENS") ));      
            } while (rs.next());
       
         }  
         rs.close();
         st.close();
         conexion.close();

     }catch(Exception error){
        System.out.println("Error en el metodo por: " +
                   error.getMessage());
                error.printStackTrace();
        }    
      
    return arrayAreas;
    }
  
   //JUDITH: BUSQUEDA DE EXPEDIENTES EN TRAMITE POR TECNICO 12-05-17 
  public static ArrayList<Expediente> getBuscaExpedienteEnTramitePorTecnico(Expediente t){

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

            if (t.getCareas()!=null){
                   if (t.getCareas().length() > 0) {
                    st.setString(1, t.getCareas());

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

                    obj.setnombre_area(rs.getString("nombre_area")); 
                    obj.setCcorrel(rs.getString("CCORREL"));
                    obj.setDnumold(rs.getString("DNUMOLD")); 
                    obj.setFfecdoc1(rs.getString("FFECDOC"));   
                    obj.setCcontri(rs.getString("CCONTRI"));
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
                    obj.setNfolios(rs.getInt("nfolios"));
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
  

//  public static ArrayList<Areas> getCargarAreas(){
//      ArrayList<Areas> arr=null;
//      Area obj=null;
//      Connection conexion = null;
//      ResultSet rs = null;
//     try{
//       conexion = Controlador_Sql.darConexionBD();
//       CallableStatement st = null;
//       st= conexion.prepareCall( "{call dbo.usp__java_lista_area()}");
//        rs = st.executeQuery();
//        if (rs.next()){
//         arr= new ArrayList<Areas>();
//         do{
//              obj =new Area();
//              obj.setCareas(rs.getString("CAREAS"));
//              obj.setnombre_area(rs.getString("nombre_area"));
//              obj.setNordens(rs.getString("NORDENS"));
//
//              arr.add(obj);
//       } while (rs.next());
//       }
//
//       rs.close();
//       st.close();
//       conexion.close();
//       }catch(Exception error){
//                     System.out.println("Error en el metodo por: " + error.getMessage());
//                     error.printStackTrace();
//                 }
//        return arr;  
//  }
  
}
