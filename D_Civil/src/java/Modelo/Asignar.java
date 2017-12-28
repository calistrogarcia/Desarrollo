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
import javax.faces.model.SelectItem;

/**
 *
 * @author Administrador
 */
public class Asignar implements Serializable{
    
    
   // Tabla Asignacion//
    
   
  
    private String usuario_asigna;
    private String expediente;
    private int expediente_id;
    private String anotacion;
    
   // Atributos de Reporte de asignacion//
    
    private String expediente_buscar;
    private String estado_derivacion;
    private String fecha_recepcion;
    private String area_final;
    private String fecha_asignacion;
    private String fecha_registro;
    
 
    
    // Atributos para Buqueda en Buzon de entrada de expedientes de defensa civil
    

    private String expediente_consultarBuzon;
    private String fecha_resuelto;
    
    
    Certificado ObjCertificado = new Certificado();
    Supervisor objInspector = new Supervisor();
    Estado objestado = new Estado();
    Turno objTurno = new Turno();

   
    
    
    
    public String getFecha_resuelto() {
        return fecha_resuelto;
    }

    public void setFecha_resuelto(String fecha_resuelto) {
        this.fecha_resuelto = fecha_resuelto;
    }


    
    public Certificado getObjCertificado() {
        return ObjCertificado;
    }

    public void setObjCertificado(Certificado ObjCertificado) {
        this.ObjCertificado = ObjCertificado;
    }

    
    public Estado getObjestado() {
        return objestado;
    }

    public void setObjestado(Estado objestado) {
        this.objestado = objestado;
    }

    public Turno getObjTurno() {
        return objTurno;
    }

    public void setObjTurno(Turno objTurno) {
        this.objTurno = objTurno;
    }
  
    public Supervisor getObjInspector() {
        return objInspector;
    }

    public void setObjInspector(Supervisor objInspector) {
        this.objInspector = objInspector;
    }
    

    public String getUsuario_asigna() {
        return usuario_asigna;
    }

    public void setUsuario_asigna(String usuario_asigna) {
        this.usuario_asigna = usuario_asigna;
    }

  

    public int getExpediente_id() {
        return expediente_id;
    }

    public void setExpediente_id(int expediente_id) {
        this.expediente_id = expediente_id;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getEstado_derivacion() {
        return estado_derivacion;
    }

    public void setEstado_derivacion(String estado_derivacion) {
        this.estado_derivacion = estado_derivacion;
    }

    public String getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(String fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public String getArea_final() {
        return area_final;
    }

    public void setArea_final(String area_final) {
        this.area_final = area_final;
    }

    public String getFecha_asignacion() {
        return fecha_asignacion;
    }

    public void setFecha_asignacion(String fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }

  
    public String getExpediente_buscar() {
        return expediente_buscar;
    }

    public void setExpediente_buscar(String expediente_buscar) {
        this.expediente_buscar = expediente_buscar;
    }



    public String getExpediente_consultarBuzon() {
        return expediente_consultarBuzon;
    }

    public void setExpediente_consultarBuzon(String expediente_consultarBuzon) {
        this.expediente_consultarBuzon = expediente_consultarBuzon;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    
    
    
    
 
      //-------------------Asignacion de Expedientes a Inspector---------------------------
            
             
    public static boolean AsignarExpediente(Asignar obj ){
            
        boolean a=false;
        Connection conexion=null;
                
                try{
                   conexion=Controlador_Sql.darConexionBD();
                           
                    conexion.setAutoCommit(false);                   
                    
                    CallableStatement st=conexion.prepareCall("{call dbo.sp_java_asignar_expdiente (?,?,?,?,?,?)}");    


                   
                 if(obj.getExpediente()!=null){

                  if(obj.getExpediente().length()>0){
                    st.setString(1, obj.getExpediente());    
                    }else{
                        st.setString(1, null);
                    }
                }else{
                    st.setString(1, null); 
                }  

                  
                 if(obj.objestado.getId_estado()!=null){

                  if(obj.objestado.getId_estado().length()>0){
                    st.setString(2, obj.objestado.getId_estado());    
                    }else{
                        st.setString(2, null);
                    }
                }else{
                    st.setString(2, null); 
                }  
                 
                 
                 
                 
                  if(obj.getObjInspector().getId_inspector()!=null){

                  if(obj.getObjInspector().getId_inspector().length()>0){
                    st.setString(3, obj.getObjInspector().getId_inspector());    
                    }else{
                        st.setString(3, null);
                    }
                }else{
                    st.setString(3, null); 
                }

 
                
               if(obj.objTurno.getId_turno()!=null){

                      if(obj.objTurno.getId_turno().length()>0){
                        st.setString(4, obj.objTurno.getId_turno());    
                        }else{
                            st.setString(4, null);
                        }
                    }else{
                        st.setString(4, null); 
                    }
                
                
                if(obj.getUsuario_asigna()!=null){

                  if(obj.getUsuario_asigna().length()>0){
                    st.setString(5, obj.getUsuario_asigna());    
                    }else{
                        st.setString(5, null);
                    }
                }else{
                    st.setString(5, null); 
                }
                
                
              
                if(obj.getAnotacion()!=null){

                  if(obj.getAnotacion().length()>0){
                    st.setString(6, obj.getAnotacion());    
                    }else{
                        st.setString(6, null);
                    }
                }else{
                    st.setString(6, null); 
                }
                
                
                
                 st.execute();                                      
                   a= true;    
                   st.close();
                    conexion.setAutoCommit(true);
                   conexion.close(); 
                
               
                   
               }catch(Exception error){
                       System.out.println("Error en el metodo por: " + error.getMessage());
                       error.printStackTrace();
               }
               return a;

        }
   
    
    public static boolean ModificarAsignarExpediente(Asignar obj ){
            
        boolean a=false;
        Connection conexion=null;
                
                try{
                   conexion=Controlador_Sql.darConexionBD();
                           
                    conexion.setAutoCommit(false);                   
                    
                    CallableStatement st=conexion.prepareCall("{call dbo.sp_java_asignar_expdiente (?,?,?,?,?)}");    


                  if(obj.getExpediente()!=null){

                  if(obj.getExpediente().length()>0){
                    st.setString(1, obj.getExpediente());    
                    }else{
                        st.setString(1, null);
                    }
                }else{
                    st.setString(1, null); 
                }  

                  
                 if(obj.objestado.getId_estado()!=null){

                  if(obj.objestado.getId_estado().length()>0){
                    st.setString(2, obj.objestado.getId_estado());    
                    }else{
                        st.setString(2, null);
                    }
                }else{
                    st.setString(2, null); 
                }  
                  
                 
                 
                 
                 
               if(obj.getObjInspector().getId_inspector()!=null){

                  if(obj.getObjInspector().getId_inspector().length()>0){
                    st.setString(3, obj.getObjInspector().getId_inspector());    
                    }else{
                        st.setString(3, null);
                    }
                }else{
                    st.setString(3, null); 
                }

                
               
                   if(obj.objTurno.getId_turno()!=null){

                      if(obj.objTurno.getId_turno().length()>0){
                        st.setString(4, obj.objTurno.getId_turno());    
                        }else{
                            st.setString(4, null);
                        }
                    }else{
                        st.setString(4, null); 
                    }
                
   
                
                
                if(obj.getUsuario_asigna()!=null){

                  if(obj.getUsuario_asigna().length()>0){
                    st.setString(5, obj.getUsuario_asigna());    
                    }else{
                        st.setString(5, null);
                    }
                }else{
                    st.setString(5, null); 
                }

                   st.execute();                                      
                   a= true;    
                   st.close();
                    conexion.setAutoCommit(true);
                   conexion.close();
                   
                   
               }catch(Exception error){
                       System.out.println("Error en el metodo por: " + error.getMessage());
                       error.printStackTrace();
               }
               return a;

        }
    
    

    
     public static ArrayList<Asignar> getBuscarExpedientesDerivados(Asignar a){

        ArrayList<Asignar> arr = null;
        ResultSet rs = null;
        Asignar obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_expedientes_derivados(?)}"); 

        
           if (a.getExpediente_buscar()!= null) {
                if (a.getExpediente_buscar().length() > 0) {
                    st.setString(1, a.getExpediente_buscar());

                } else {
                    st.setString(1, null);
                }
           } 
            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Asignar>();
                do {

                    obj = new Asignar();

                    obj.setExpediente(rs.getString("expediente"));  
                  
                    obj.setEstado_derivacion(rs.getString("estado_derivacion"));  
                    obj.setFecha_recepcion(rs.getString("fecha_recepcion"));
                    obj.setArea_final(rs.getString("area_final"));
                    obj.setFecha_registro(rs.getString("fecha_registro"));
                    
                    obj.setAnotacion(rs.getString("anotaciones"));  
                    obj.objInspector.setApellidos_nombres(rs.getString("apellidos_nombres"));
                 
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
  
     
    public static ArrayList<Asignar> getBuscarExpedientesBuzonEntradaDefensaCivil(Asignar b){

        ArrayList<Asignar> arr = null;
        ResultSet rs = null;
        Asignar obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_buzon_expedientes_defensa_civil(?)}"); 

        
           if (b.getExpediente_consultarBuzon()!= null) {
                if (b.getExpediente_consultarBuzon().length() > 0) {
                    st.setString(1, b.getExpediente_consultarBuzon());

                } else {
                    st.setString(1, null);
                }
           } 
            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Asignar>();
                do {

                    obj = new Asignar();

                    obj.setExpediente(rs.getString("expediente"));  
                  
                    
                    Certificado c = new Certificado();
                    c.setFecha_expediente(rs.getString("fecha_expediente"));
                    c.setEstado_expediente(rs.getString("estado_expediente"));
                    obj.setObjCertificado(c);
                     

                    Supervisor s = new Supervisor();
                    s.setId_inspector(rs.getString("id_inspector"));
                    s.setApellidos_nombres(rs.getString("apellidos_nombres"));
               
                    /*
                    obj.setObjInspector(s);  
                    obj.setFecha_asignacion(rs.getString("fecha_asignacion"));
                    obj.setFecha_recepcion(rs.getString("fecha_recepcion"));
                    obj.setFecha_resuelto(rs.getString("fecha_resuelto"));*/
                    
                   obj.setFecha_registro(rs.getString("fecha_registro"));
                    
                    Estado e = new Estado();
                    e.setId_estado(rs.getString("id_estado"));
                    e.setNombre(rs.getString("nombre"));
                    obj.setObjestado(e);
                     
                    Turno t = new Turno();
                    
                    t.setId_turno(rs.getString("id_turno"));
                    t.setNombre(rs.getString("nombre"));
                    obj.setObjTurno(t);
                    
                    obj.setArea_final(rs.getString("area_final"));
                    

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
    
   
   
    public ArrayList<SelectItem>  getCargarComboEstados(){         
    
    ArrayList<SelectItem> arrayEstado = new ArrayList<SelectItem>();
    Estado obj=null;
    Connection conexion = null;
    ResultSet rs = null;
    try{
   
    conexion = Controlador_Sql.darConexionBD();
    CallableStatement st = conexion.prepareCall( "{call dbo.sp_java_cargar_estados()}");    
    rs = st.executeQuery();        
   
    if (rs.next()){    
          do{
              
             
              arrayEstado.add(new SelectItem(rs.getString("id_estado") , rs.getString("nombre") ));       
                              
          
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
      
    return arrayEstado;
    
 }
     
     
     
     
     
     
     
     
}


