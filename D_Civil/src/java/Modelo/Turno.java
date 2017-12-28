/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.text.SimpleDateFormat;

/**
 *
 * @author Administrador
 */
public class Turno implements Serializable{

    
  private String id_turno;
  private String nombre;
  private Date inicio_turno ;  
  private Date fin_turno;
  


   public Turno(){
  
   }

    public String getId_turno() {
        return id_turno;
    }

    public void setId_turno(String id_turno) {
        this.id_turno = id_turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getInicio_turno() {
        return inicio_turno;
    }

    public void setInicio_turno(Date inicio_turno) {
        this.inicio_turno = inicio_turno;
    }

    public Date getFin_turno() {
        return fin_turno;
    }

    public void setFin_turno(Date fin_turno) {
        this.fin_turno = fin_turno;
    }

   

     public static boolean registrarTurno(Turno Objturno){
      boolean a=false;
      Connection conexion = null;
      /* variable de connexion para definir y manejar el conytrol de errores*/
      try{
          conexion=Controlador_Sql.darConexionBD();
          CallableStatement st=  /*deve importarse con java la segunda opcion del cuadro de alternativas des importacion*/
          conexion.prepareCall ("{call  sp_java_registar_turnos(?,?,?)}");
          conexion.setAutoCommit(false);
       
          if (Objturno.getNombre() != null) {
              if (Objturno.getNombre().length() > 0) {
                  st.setString(1, Objturno.getNombre());

              } else {
                  st.setString(1, null);
              }
          } else {
              st.setString(1, null);
          }

          if (Objturno.getInicio_turno() != null) {

              //    st.setTimestamp(2,new java.sql.Timestamp(TurnoDf.getDnitur().getTime()));                    
              st.setDate(2, new java.sql.Date(Objturno.getInicio_turno().getTime()));
          } else {
              st.setDate(2, null);
          }
          //---------------------------------------

          if (Objturno.getFin_turno() != null) {

              st.setDate(3, new java.sql.Date(Objturno.getFin_turno().getTime()));

          } else {
              st.setDate(3, null);
          }


          
         st.execute();
         st.close();
         conexion.commit();
             
      }catch(Exception e){
         try{

                // Vuelve atras los cambios
                conexion.rollback();
            } catch(Exception ee){//Manejo de errores}
                System.out.println("ERROR REGISTRAR: " + ee.getMessage());
            }
        } finally{
            try{

                // Cierra la conexión
                if( conexion != null )
                    conexion.close();

            } catch(Exception e){//Manejo de errores}
        
             System.out.println("ERROR REGISTRAR: " + e.getMessage());   
          }
     }
   return true;
    }
    
  
  
    
}
