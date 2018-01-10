/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import utils.encriptaCadenas;
import Modelo.Controlador_Sql;
import Modelo.Usuario;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import utils.Constantes;
import utils.Mensaje;

/**
 *
 * @author Administrador
 */

//@Named(value = "beanUsuario_Logeo")
//@ViewScoped

@ManagedBean(name="beanUsuario_Logeo")
//@SessionScoped

//@SessionScoped

public class BeanUsuario_Logeo {

   
   private Usuario clase_usuario = new Usuario();
   private boolean usuarioLogeado;
   private boolean flagPassIguales;
   private String  nombre_user;
   private String  clave_user;  
   private String  variable_nombre;

  
   
   
   
   public String getVariable_nombre() {
        return variable_nombre;
    }

    public void setVariable_nombre(String variable_nombre) {
        this.variable_nombre = variable_nombre;
    }
   
    public boolean isUsuarioLogeado() {
        return usuarioLogeado;
    }

    public void setUsuarioLogeado(boolean usuarioLogeado) {
        this.usuarioLogeado = usuarioLogeado;
    }

    public boolean isFlagPassIguales() {
        return flagPassIguales;
    }

    public void setFlagPassIguales(boolean flagPassIguales) {
        this.flagPassIguales = flagPassIguales;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }


    public String getClave_user() {
        return clave_user;
    }

    public void setClave_user(String clave_user) {
        this.clave_user = clave_user;
    }

    public Usuario getClase_usuario() {
        return clase_usuario;
    }

    public void setClase_usuario(Usuario clase_usuario) {
        this.clase_usuario = clase_usuario;
    }
    
    

    public String loginUsuario() throws Exception{
      
     String outcome = null;       
        flagPassIguales=false;
        try{            
        FacesContext contex = FacesContext.getCurrentInstance();                                        
         
        
        if(clase_usuario!=null){
                
                clase_usuario=this.validar(this.nombre_user, encriptaCadenas.getStringMessageDigest(this.clave_user,encriptaCadenas.MD5));                
               
                if(clase_usuario != null){          //  
                    
                    
                    variable_nombre=clase_usuario.getDescripcion();
                    
                    
                   Mensaje.addMensajeInfo("Usuario logeado correctamente"); usuarioLogeado = true; 

                    contex.getExternalContext().getSessionMap().put("usuario",clase_usuario);                       
                    contex.getExternalContext().getSessionMap().put("isSesionAlive", usuarioLogeado);                                                                                         
                    outcome=Constantes.PAGE_INGRESO_JSF;                    
               }
                
               else{
                   
                   Mensaje.addMensajeError("Usuario o Password Incorrectos");                   
                   clase_usuario= new Usuario();
                   this.nombre_user= "";
                   this.clave_user="";
                   outcome=Constantes.PAGE_LOGIN_JSF;  
                    
               }  
            }
            else{
                Mensaje.addMensajeError("Usuario o Password Incorrectos");
                clase_usuario= new Usuario();
                   this.nombre_user= "";
                   this.clave_user="";
                   
                outcome=Constantes.PAGE_LOGIN_JSF;  
                
            }
                
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }        
    return outcome+"?faces-redirect=true";         
    }
 
 public  Usuario validar(String us, String pass){
   
     
     ResultSet rs=null; 
     Connection conexion = null;
     Usuario user=null;     
     
     
        try{               
           conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall ("{call dbo.sp_java_validarUsuario(?,?)}"); 
            
            st.setString(1,us);                   
            st.setString(2,pass);
            
            
            rs = st.executeQuery();
            if(rs.next()){
                user = new Usuario();
                
               user.setNombre_usuario(us);
               
               user.setUsuario(rs.getString("usuario"));
               user.setId_tipo_usuario(rs.getInt("id_tipo_usuario"));
               user.setDescripcion(rs.getString("descripcion"));
                
                rs.close();                
                conexion.close();                
            }
       
        }catch(Exception error){
            System.out.println("Error en el metodo por: " + error.getMessage());
                error.printStackTrace();
        }
        return user;
 }
  
 
 public void salirSistema(){
     
      FacesContext contex = FacesContext.getCurrentInstance();  
        this.nombre_user="";
        this.clave_user="";
        String outcome =Constantes.PAGE_LOGIN_JSF;
        contex.getExternalContext().getSessionMap().clear();
        contex.getExternalContext().getSessionMap().put("isSesionAlive", false);
        contex.getExternalContext().invalidateSession();
        try {
            contex.getExternalContext().redirect(outcome);
        } catch (IOException ex) {
        }

    }
    
public void validarSesion() {        
        FacesContext contex = FacesContext.getCurrentInstance();
        try {
            if (contex.getExternalContext().getSessionMap().get("isSesionAlive") == null | contex.getExternalContext().getSessionMap().get("isSesionAlive").
                    toString().trim().equals("false")) {
                contex.getExternalContext().redirect("login.jsf");
                contex.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,  "Autenticacion", "El usuario No existe !!"));

            }
        } catch (Exception e) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("login.jsf");
            } catch (Exception ex) {
                
            }
        }
        
    }
    
}
