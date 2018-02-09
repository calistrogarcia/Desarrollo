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
import javax.faces.model.SelectItem;


/**
 *
 * @author Administrador
 */
public class Persona implements Serializable {

    private String tipo_busqueda;
    private String consulta;
    private String codigo_contribuyente;  
    private String tipo_persona;
    private String tipo_documento;
    private String numero_documento;
    private String apellido_paterno;
    private String apellido_materno;
    private String nombre_contribuyente;
    private String numero_telefono_contribuyente;
    private String numero_fax_contribuyente;
    private String correo_contribuyente;
    private String usuario_registro;
    private String hora_registro;
    private String usuario_red;
    private String fecha_nacimiento;    
    private String nombres_apellidos;
    private String numero_celular;
    private String nombre_representante;
    private String tipo_documento_representante;
    private String numero_documento_representante;
    private String nombre_conyuge;
    private String tipo_documento_conjuge;
    private String numero_documento_conjuge;
    private String numero_telefono_fijo_representante;
    private String numero_telefono_conjuge;
    private String numero_celular_representante;
    private String correo_representante;
    private String numero_celular_conjuge;
    private String correo_conyuge;
    private String observacion;
    private String fecha_registro;
    private String nombre_usuario_registro;
    private String nombre_usuario_modificacion;
    private String usuario_modificacion;
    private String fecha_modificacion;
    private String nombre_tipo_persona;
    private String nombre_tipo_documento;
    
   
   
    private int edad;
    private String direccion_fiscal;


    Postal ObjPostal = new Postal();
    Poblado ObjPoblado= new Poblado();
    Direccion ObjDireccion= new Direccion();
    Area ObjArea = new Area();

   
    
    
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


    public String getNombre_tipo_documento() {
        return nombre_tipo_documento;
    }

    public void setNombre_tipo_documento(String nombre_tipo_documento) {
        this.nombre_tipo_documento = nombre_tipo_documento;
    }

    
    public String getNombre_tipo_persona() {
        return nombre_tipo_persona;
    }

    public void setNombre_tipo_persona(String nombre_tipo_persona) {
        this.nombre_tipo_persona = nombre_tipo_persona;
    }

    
    public String getNombre_usuario_registro() {
        return nombre_usuario_registro;
    }

    public void setNombre_usuario_registro(String nombre_usuario_registro) {
        this.nombre_usuario_registro = nombre_usuario_registro;
    }

    public String getNombre_usuario_modificacion() {
        return nombre_usuario_modificacion;
    }

    public void setNombre_usuario_modificacion(String nombre_usuario_modificacion) {
        this.nombre_usuario_modificacion = nombre_usuario_modificacion;
    }
    
    public String getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getUsuario_modificacion() {
        return usuario_modificacion;
    }

    public void setUsuario_modificacion(String usuario_modificacion) {
        this.usuario_modificacion = usuario_modificacion;
    }

    
    public String getNumero_celular_representante() {
        return numero_celular_representante;
    }

    public void setNumero_celular_representante(String numero_celular_representante) {
        this.numero_celular_representante = numero_celular_representante;
    }

    public String getCorreo_representante() {
        return correo_representante;
    }

    public void setCorreo_representante(String correo_representante) {
        this.correo_representante = correo_representante;
    }
    
    public String getNumero_telefono_fijo_representante() {
        return numero_telefono_fijo_representante;
    }

    public void setNumero_telefono_fijo_representante(String numero_telefono_fijo_representante) {
        this.numero_telefono_fijo_representante = numero_telefono_fijo_representante;
    }

    public String getNumero_celular_conjuge() {
        return numero_celular_conjuge;
    }

    public void setNumero_celular_conjuge(String numero_celular_conjuge) {
        this.numero_celular_conjuge = numero_celular_conjuge;
    }

    
    
    public Direccion getObjDireccion() {
        return ObjDireccion;
    }

    public void setObjDireccion(Direccion ObjDireccion) {
        this.ObjDireccion = ObjDireccion;
    }

    public Postal getObjPostal() {
        return ObjPostal;
    }

    public void setObjPostal(Postal ObjPostal) {
        this.ObjPostal = ObjPostal;
    }

    public Poblado getObjPoblado() {
        return ObjPoblado;
    }

    public void setObjPoblado(Poblado ObjPoblado) {
        this.ObjPoblado = ObjPoblado;
    }

    public Area getObjArea() {
        return ObjArea;
    }

    public void setObjArea(Area ObjArea) {
        this.ObjArea = ObjArea;
    }
    
    
    public String getDireccion_fiscal() {
        return direccion_fiscal;
    }

    public void setDireccion_fiscal(String direccion_fiscal) {
        this.direccion_fiscal = direccion_fiscal;
    }

    public String getNombre_contribuyente() {
        return nombre_contribuyente;
    }

    public void setNombre_contribuyente(String nombre_contribuyente) {
        this.nombre_contribuyente = nombre_contribuyente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCodigo_contribuyente() {
        return codigo_contribuyente;
    }

    public void setCodigo_contribuyente(String codigo_contribuyente) {
        this.codigo_contribuyente = codigo_contribuyente;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getNumero_telefono_contribuyente() {
        return numero_telefono_contribuyente;
    }

    public void setNumero_telefono_contribuyente(String numero_telefono_contribuyente) {
        this.numero_telefono_contribuyente = numero_telefono_contribuyente;
    }

    public String getNumero_fax_contribuyente() {
        return numero_fax_contribuyente;
    }

    public void setNumero_fax_contribuyente(String numero_fax_contribuyente) {
        this.numero_fax_contribuyente = numero_fax_contribuyente;
    }

    public String getCorreo_contribuyente() {
        return correo_contribuyente;
    }

    public void setCorreo_contribuyente(String correo_contribuyente) {
        this.correo_contribuyente = correo_contribuyente;
    }

    public String getUsuario_registro() {
        return usuario_registro;
    }

    public void setUsuario_registro(String usuario_registro) {
        this.usuario_registro = usuario_registro;
    }

    public String getHora_registro() {
        return hora_registro;
    }

    public void setHora_registro(String hora_registro) {
        this.hora_registro = hora_registro;
    }

    public String getUsuario_red() {
        return usuario_red;
    }

    public void setUsuario_red(String usuario_red) {
        this.usuario_red = usuario_red;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombres_apellidos() {
        return nombres_apellidos;
    }

    public void setNombres_apellidos(String nombres_apellidos) {
        this.nombres_apellidos = nombres_apellidos;
    }

    public String getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }

    public String getNombre_representante() {
        return nombre_representante;
    }

    public void setNombre_representante(String nombre_representante) {
        this.nombre_representante = nombre_representante;
    }

    public String getTipo_documento_representante() {
        return tipo_documento_representante;
    }

    public void setTipo_documento_representante(String tipo_documento_representante) {
        this.tipo_documento_representante = tipo_documento_representante;
    }

    public String getNumero_documento_representante() {
        return numero_documento_representante;
    }

    public void setNumero_documento_representante(String numero_documento_representante) {
        this.numero_documento_representante = numero_documento_representante;
    }

    public String getNombre_conyuge() {
        return nombre_conyuge;
    }

    public void setNombre_conyuge(String nombre_conyuge) {
        this.nombre_conyuge = nombre_conyuge;
    }

    public String getTipo_documento_conjuge() {
        return tipo_documento_conjuge;
    }

    public void setTipo_documento_conjuge(String tipo_documento_conjuge) {
        this.tipo_documento_conjuge = tipo_documento_conjuge;
    }

    public String getNumero_documento_conjuge() {
        return numero_documento_conjuge;
    }

    public void setNumero_documento_conjuge(String numero_documento_conjuge) {
        this.numero_documento_conjuge = numero_documento_conjuge;
    }

    public String getCorreo_conyuge() {
        return correo_conyuge;
    }

    public void setCorreo_conyuge(String correo_conyuge) {
        this.correo_conyuge = correo_conyuge;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getNumero_telefono_conjuge() {
        return numero_telefono_conjuge;
    }

    public void setNumero_telefono_conjuge(String numero_telefono_conjuge) {
        this.numero_telefono_conjuge = numero_telefono_conjuge;
    }

    
    
      
   public static boolean RegistrarPersona(Persona ObjPersona) {
        boolean a = false;
        Connection conexion = null;
        /* variable de connexion para definir y manejar el conytrol de errores*/
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st
                 =  conexion.prepareCall("{call dbo.sp_java_registrar_contribuyente (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

               conexion.setAutoCommit(false);

            if (ObjPersona.getTipo_persona() != null) {
                if (ObjPersona.getTipo_persona().length() > 0) {
                    st.setString(1, ObjPersona.getTipo_persona());

                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (ObjPersona.getTipo_documento()!= null) {
                if (ObjPersona.getTipo_documento().length() > 0) {
                    st.setString(2, ObjPersona.getTipo_documento());

                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);
            }
           // ---------------------------------------

            if (ObjPersona.getNumero_documento() != null) {
                if (ObjPersona.getNumero_documento().length() > 0) {
                    st.setString(3, ObjPersona.getNumero_documento());

                } else {
                    st.setString(3, null);
                }
            } else {
                st.setString(3, null);
            }
            //---------------------------------------

            if (ObjPersona.getApellido_paterno() != null) {
                if (ObjPersona.getApellido_paterno().length() > 0) {
                    st.setString(4, ObjPersona.getApellido_paterno());
                } else {
                    st.setString(4, null);
                }
            } else {
                st.setString(4, null);
            }

            //---------------------------------------   
            if (ObjPersona.getApellido_materno() != null) {
                if (ObjPersona.getApellido_materno() .length() > 0) {
                    st.setString(5, ObjPersona.getApellido_materno());
                } else {
                    st.setString(5, null);
                }
            } else {
                st.setString(5, null);
            }

            //--------------------------------------- 
            if (ObjPersona.getNombre_contribuyente() != null) {
                if (ObjPersona.getNombre_contribuyente().length() > 0) {
                    st.setString(6, ObjPersona.getNombre_contribuyente());
                } else {
                    st.setString(6, null);
                }
            } else {
                st.setString(6, null);
            }

            //--------------------------------------- 
            if (ObjPersona.ObjPostal.getCodigo_postal()!= null) {
                if (ObjPersona.ObjPostal.getCodigo_postal().length() > 0) {
                    st.setString(7, ObjPersona.ObjPostal.getCodigo_postal());
                } else {
                    st.setString(7, null);
                }
            } else {
                st.setString(7, null);
            }

            if (ObjPersona.ObjDireccion.getCodigo_via() != null) {
                if (ObjPersona.ObjDireccion.getCodigo_via().length() > 0) {
                    st.setString(8, ObjPersona.ObjDireccion.getCodigo_via());
                } else {
                    st.setString(8, null);
                }
            } else {
                st.setString(8, null);
            }

            
            if (ObjPersona.ObjDireccion.getTipo_habilitacion() != null) {
                if (ObjPersona.ObjDireccion.getTipo_habilitacion().length() > 0) {
                    st.setString(9, ObjPersona.ObjDireccion.getTipo_habilitacion());
                } else {
                    st.setString(9, null);
                }
            } else {
                st.setString(9, null);
            }
            
            
             if (ObjPersona.ObjDireccion.getNombre_habilitacion() != null) {
                if (ObjPersona.ObjDireccion.getNombre_habilitacion().length() > 0) {
                    st.setString(10, ObjPersona.ObjDireccion.getNombre_habilitacion());
                } else {
                    st.setString(10, null);
                }
            } else {
                st.setString(10, null);
            }
            
             
//            if (ObjPersona.ObjDireccion.getTipo_via() != null) {
//                if (ObjPersona.ObjDireccion.getTipo_via().length() > 0) {
//                    st.setString(11, ObjPersona.ObjDireccion.getTipo_via());
//                } else {
//                    st.setString(11, null);
//                }
//            } else {
//                st.setString(11, null);
//            }
            
            
             if (ObjPersona.ObjDireccion.getNombre_via() != null) {
                if (ObjPersona.ObjDireccion.getNombre_via().length() > 0) {
                    st.setString(11, ObjPersona.ObjDireccion.getNombre_via());
                } else {
                    st.setString(11, null);
                }
            } else {
                st.setString(11, null);
            }
            
             
              if (ObjPersona.ObjDireccion.getNumero() != null) {
                if (ObjPersona.ObjDireccion.getNumero().length() > 0) {
                    st.setString(12, ObjPersona.ObjDireccion.getNumero());
                } else {
                    st.setString(12, null);
                }
            } else {
                st.setString(12, null);
            }
            
                
             if (ObjPersona.ObjDireccion.getNumero_interior() != null) {
                if (ObjPersona.ObjDireccion.getNumero_interior().length() > 0) {
                    st.setString(13, ObjPersona.ObjDireccion.getNumero_interior());
                } else {
                    st.setString(13, null);
                }
            } else {
                st.setString(13, null);
            }
             
            
              if (ObjPersona.ObjDireccion.getNumero_departamento() != null) {
                if (ObjPersona.ObjDireccion.getNumero_departamento().length() > 0) {
                    st.setString(14, ObjPersona.ObjDireccion.getNumero_departamento());
                } else {
                    st.setString(14, null);
                }
            } else {
                st.setString(14, null);
            }
            
              
               if (ObjPersona.ObjDireccion.getLetra() != null) {
                if (ObjPersona.ObjDireccion.getLetra().length() > 0) {
                    st.setString(15, ObjPersona.ObjDireccion.getLetra());
                } else {
                    st.setString(15, null);
                }
            } else {
                st.setString(15, null);
            }
            
            
            if (ObjPersona.ObjDireccion.getBloque() != null) {
                if (ObjPersona.ObjDireccion.getBloque().length() > 0) {
                    st.setString(16, ObjPersona.ObjDireccion.getBloque());
                } else {
                    st.setString(16, null);
                }
            } else {
                st.setString(16, null);
            }    
               
            
            
            if (ObjPersona.ObjDireccion.getManzana() != null) {
                if (ObjPersona.ObjDireccion.getManzana().length() > 0) {
                    st.setString(17, ObjPersona.ObjDireccion.getManzana());
                } else {
                    st.setString(17, null);
                }
            } else {
                st.setString(17, null);
            }  
             
             
            if (ObjPersona.ObjDireccion.getLote() != null) {
                if (ObjPersona.ObjDireccion.getLote().length() > 0) {
                    st.setString(18, ObjPersona.ObjDireccion.getLote());
                } else {
                    st.setString(18, null);
                }
            } else {
                st.setString(18, null);
            }  
            
           
           if (ObjPersona.ObjDireccion.getReferencia() != null) {
                if (ObjPersona.ObjDireccion.getReferencia().length() > 0) {
                    st.setString(19, ObjPersona.ObjDireccion.getReferencia());
                } else {
                    st.setString(19, null);
                }
            } else {
                st.setString(19, null);
            }  
             
             
           
            if (ObjPersona.getNumero_telefono_contribuyente() != null) {
                if (ObjPersona.getNumero_telefono_contribuyente().length() > 0) {
                    st.setString(20, ObjPersona.getNumero_telefono_contribuyente());
                } else {
                    st.setString(20, null);
                }
            } else {
                st.setString(20, null);
            } 
            
           
            
             if (ObjPersona.getNumero_fax_contribuyente() != null) {
                if (ObjPersona.getNumero_fax_contribuyente().length() > 0) {
                    st.setString(21, ObjPersona.getNumero_fax_contribuyente());
                } else {
                    st.setString(21, null);
                }
            } else {
                st.setString(21, null);
            } 
           
           
            
            if (ObjPersona.getCorreo_contribuyente() != null) {
                if (ObjPersona.getCorreo_contribuyente().length() > 0) {
                    st.setString(22, ObjPersona.getCorreo_contribuyente());
                } else {
                    st.setString(22, null);
                }
            } else {
                st.setString(22, null);
            } 
            
            
            
//            if (ObjPersona.getUsuario_registro() != null) {
//                if (ObjPersona.getUsuario_registro().length() > 0) {
//                    st.setString(24, ObjPersona.getUsuario_registro());
//                } else {
//                    st.setString(24, null);
//                }
//            } else {
//                st.setString(24, null);
//            } 
//            
//            
//           if (ObjPersona.getHora_registro() != null) {
//                if (ObjPersona.getHora_registro().length() > 0) {
//                    st.setString(25, ObjPersona.getHora_registro());
//                } else {
//                    st.setString(25, null);
//                }
//            } else {
//                st.setString(25, null);
//            } 
//            
//           
//           if (ObjPersona.getUsuario_red() != null) {
//                if (ObjPersona.getUsuario_red().length() > 0) {
//                    st.setString(26, ObjPersona.getUsuario_red());
//                } else {
//                    st.setString(26, null);
//                }
//            } else {
//                st.setString(26, null);
//            } 
            
           
            if (ObjPersona.getFecha_nacimiento() != null) {
                if (ObjPersona.getFecha_nacimiento().length() > 0) {
                    st.setString(23, ObjPersona.getFecha_nacimiento());
                } else {
                    st.setString(23, null);
                }
            } else {
                st.setString(23, null);
            } 
            
            
            
//            if (ObjPersona.ObjDireccion.getZona() != null) {
//                if (ObjPersona.ObjDireccion.getZona().length() > 0) {
//                    st.setString(25, ObjPersona.ObjDireccion.getZona());
//                } else {
//                    st.setString(25, null);
//                }
//            } else {
//                st.setString(25, null);
//            } 
//            
//            
//           if (ObjPersona.ObjDireccion.getBloque() != null) {
//                if (ObjPersona.ObjDireccion.getBloque().length() > 0) {
//                    st.setString(26, ObjPersona.ObjDireccion.getBloque());
//                } else {
//                    st.setString(26, null);
//                }
//            } else {
//                st.setString(26, null);
//                
//            }  
           
           
//            if (ObjPersona.ObjArea.getId_area()!= null) {
//                if (ObjPersona.ObjDireccion.getBloque().length() > 0) {
//                    st.setString(30, ObjPersona.ObjDireccion.getBloque());
//                } else {
//                    st.setString(30, null);
//                }
//            } else {
//                st.setString(30, null);
//                
//            }  
//            
            
//          if (ObjPersona.ObjPoblado.getCodigo_poblado()!= null) {
//                if (ObjPersona.ObjPoblado.getCodigo_poblado().length() > 0) {
//                    st.setString(27, ObjPersona.ObjPoblado.getCodigo_poblado());
//                } else {
//                    st.setString(27, null);
//                }
//            } else {
//                st.setString(27, null);
//                
//            }    
           
          
           if (ObjPersona.getNombre_representante()!= null) {
                
               if (ObjPersona.getNombre_representante().length() > 0) {
                    
                   st.setString(24, ObjPersona.getNombre_representante());
                   
                } else {
                    st.setString(24, null);
                }
            } else {
                st.setString(24, null);
                
            } 
           
           
           if (ObjPersona.getTipo_documento_representante()!= null) {
                
               if (ObjPersona.getTipo_documento_representante().length() > 0) {
                    
                   st.setString(25, ObjPersona.getTipo_documento_representante());
                   
                } else {
                    st.setString(25, null);
                }
            } else {
                st.setString(25, null);
                
            }    
            
          
          if (ObjPersona.getNumero_documento_representante()!= null) {
                
               if (ObjPersona.getNumero_documento_representante().length() > 0) {
                    
                   st.setString(26, ObjPersona.getNumero_documento_representante());
                   
                } else {
                    st.setString(26, null);
                }
            } else {
                st.setString(26, null);
                
            }    
            
          
          if (ObjPersona.getNombre_conyuge()!= null) {
                
               if (ObjPersona.getNombre_conyuge().length() > 0) {
                    
                   st.setString(27, ObjPersona.getNombre_conyuge());
                   
                } else {
                    st.setString(27, null);
                }
            } else {
                st.setString(27, null);
                
            }  
          
            
           if (ObjPersona.getTipo_documento_conjuge()!= null) {
                
               if (ObjPersona.getTipo_documento_conjuge().length() > 0) {
                    
                   st.setString(28, ObjPersona.getTipo_documento_conjuge());
                   
                } else {
                    st.setString(28, null);
                }
            } else {
                st.setString(28, null);
                
            }  
           
            if (ObjPersona.getNumero_documento_conjuge()!= null) {
                
               if (ObjPersona.getNumero_documento_conjuge().length() > 0) {
                    
                   st.setString(29, ObjPersona.getNumero_documento_conjuge());
                   
                } else {
                    st.setString(29, null);
                }
            } else {
                st.setString(29, null);
                
            } 
            
            if (ObjPersona.getNumero_celular()!= null) {
                
               if (ObjPersona.getNumero_celular().length() > 0) {
                    
                   st.setString(30, ObjPersona.getNumero_celular());
                   
                } else {
                    st.setString(30, null);
                }
            } else {
                st.setString(30, null);
                
            }
            

             
            
            if (ObjPersona.getNumero_telefono_fijo_representante()!= null) {
                
               if (ObjPersona.getNumero_telefono_fijo_representante().length() > 0) {
                    
                   st.setString(31, ObjPersona.getNumero_telefono_fijo_representante());
                   
                } else {
                    st.setString(31, null);
                }
            } else {
                st.setString(31, null);
                
            }
            
            
              
            if (ObjPersona.getNumero_celular_representante()!= null) {
                
               if (ObjPersona.getNumero_celular_representante().length() > 0) {
                    
                   st.setString(32, ObjPersona.getNumero_celular_representante());
                   
                } else {
                    st.setString(32, null);
                }
            } else {
                st.setString(32, null);
                
            }
            
          
            
             if (ObjPersona.getCorreo_representante()!= null) {
                
               if (ObjPersona.getCorreo_representante().length() > 0) {
                    
                   st.setString(33, ObjPersona.getCorreo_representante());
                   
                } else {
                    st.setString(33, null);
                }
            } else {
                st.setString(33, null);
                
            }
             
             
             
            if (ObjPersona.getNumero_telefono_conjuge()!= null) {
                
               if (ObjPersona.getNumero_telefono_conjuge().length() > 0) {
                    
                   st.setString(34, ObjPersona.getNumero_telefono_conjuge());
                   
                } else {
                    st.setString(34, null);
                }
            } else {
                st.setString(34, null);
                
            }
  
             
              if (ObjPersona.getNumero_celular_conjuge()!= null) {
                
               if (ObjPersona.getNumero_celular_conjuge().length() > 0) {
                    
                   st.setString(35, ObjPersona.getNumero_celular_conjuge());
                   
                } else {
                    st.setString(35, null);
                }
            } else {
                st.setString(35, null);
                
            }
            
           
            
              if (ObjPersona.getCorreo_conyuge()!= null) {
                
               if (ObjPersona.getCorreo_conyuge().length() > 0) {
                    
                   st.setString(36, ObjPersona.getCorreo_conyuge());
                   
                } else {
                    st.setString(36, null);
                }
            } else {
                st.setString(36, null);
                
            }
////              
////            if (ObjPersona.getCodigo_contribuyente()!= null) {
////                
////               if (ObjPersona.getCodigo_contribuyente().length() > 0) {
////                    
////                   st.setString(37, ObjPersona.getCodigo_contribuyente());
////                   
////                } else {
////                    st.setString(37, null);
////                }
////            } else {
////                st.setString(37, null);
////                
////            }
//               
              
            
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

    public static ArrayList<Persona> BuscarContribuyente(Persona ObjBuscarContribuyente) {

        ArrayList<Persona> arr = null;
        ResultSet rs = null;
        Persona obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call sp_java_buscar_contribuyente(?,?)}");

            if (ObjBuscarContribuyente.getTipo_busqueda()!= null) {
                if (ObjBuscarContribuyente.getTipo_busqueda().length() > 0) {
                    st.setString(1, ObjBuscarContribuyente.getTipo_busqueda());

                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }
            
            if (ObjBuscarContribuyente.getConsulta()!= null) {
                if (ObjBuscarContribuyente.getConsulta().length() > 0) {
                    st.setString(2, ObjBuscarContribuyente.getConsulta());

                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);
            }


            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Persona>();
                do {

                    obj = new Persona();

                    obj.setCodigo_contribuyente(rs.getString("CCONTRI"));
                    obj.setTipo_persona(rs.getString("CTIPPER"));
                    obj.setTipo_documento(rs.getString("CTIPDOC"));
                    obj.setNumero_documento(rs.getString("DTIPDOC"));
                    obj.setApellido_paterno(rs.getString("DPATERN"));
                    obj.setApellido_materno(rs.getString("DMATERN"));
                    obj.setNombre_contribuyente(rs.getString("DNOMBRE"));
                    obj.setNombres_apellidos(rs.getString("CNOMBRE"));
                   
                    Postal ObjPostal = new Postal();
                    ObjPostal.setCodigo_postal(rs.getString("CPOSTAL"));
                    ObjPostal.setNombre_postal(rs.getString("DPOSTAL"));
                    
                    obj.setObjPostal(ObjPostal);
                    
                    
                    Direccion ObjDireccion = new Direccion();
                    
                    ObjDireccion.setCodigo_via(rs.getString("CCODVIA")); 
                    ObjDireccion.setTipo_habilitacion(rs.getString("DTIPURB"));
                    ObjDireccion.setNombre_habilitacion(rs.getString("DNOMURB"));
                    ObjDireccion.setTipo_via(rs.getString("DTIPVIA"));
                    ObjDireccion.setNombre_via(rs.getString("DNOMVIA"));
                    ObjDireccion.setNumero(rs.getString("DNROFIS"));
                    ObjDireccion.setNumero_departamento(rs.getString("DDEPFIS"));
                    ObjDireccion.setNumero_interior(rs.getString("DINTFIS"));
                    ObjDireccion.setLetra(rs.getString("DLETFIS"));
                    ObjDireccion.setBloque(rs.getString("DBLOFIS"));
                    ObjDireccion.setManzana(rs.getString("DMZAFIS"));
                    ObjDireccion.setLote(rs.getString("DLOTFIS"));
                    ObjDireccion.setReferencia(rs.getString("DREFERE"));
                    ObjDireccion.setBloque(rs.getString("DBLOFIS"));
                    ObjDireccion.setNombre_zona(rs.getString("DNOMZON"));
                    ObjDireccion.setCuadra(rs.getString("CUADRA"));
                    

                    obj.setObjDireccion(ObjDireccion);
                    
                    obj.setNumero_telefono_contribuyente(rs.getString("DNUMTEL"));
                    obj.setNumero_fax_contribuyente(rs.getString("DNUMFAX"));
                    obj.setCorreo_contribuyente(rs.getString("DE_MAIL"));
                    obj.setUsuario_registro(rs.getString("CUSUARI"));
                    obj.setFecha_registro(rs.getString("F_FECHA"));
                    obj.setUsuario_modificacion(rs.getString("CUSUMOD"));
                    obj.setFecha_modificacion(rs.getString("FFECMOD"));
                    obj.setHora_registro(rs.getString("D_HORAS"));
                    obj.setUsuario_red(rs.getString("DUSURED"));
                    obj.setFecha_nacimiento(rs.getString("FECNACI"));
                    obj.setNombre_usuario_registro(rs.getString("DUSUARI"));
                    obj.setNombre_usuario_modificacion(rs.getString("DUSUMOD"));
                    obj.setNombre_tipo_persona(rs.getString("DTIPPER"));
                    obj.setNombre_tipo_documento(rs.getString("DDOCUME"));
                    obj.setNombre_representante(rs.getString("nombre_representante"));
                    obj.setTipo_documento_representante(rs.getString("tipo_Doc_representante"));
                    obj.setNumero_documento_representante(rs.getString("numero_doc_representante"));
                    obj.setNumero_telefono_fijo_representante(rs.getString("fijo_representante"));
                    obj.setNumero_celular_representante(rs.getString("cel_representante"));
                    obj.setCorreo_representante(rs.getString("correo_representante"));
                    obj.setNombre_conyuge(rs.getString("nombre_conyuge"));
                    obj.setTipo_documento_conjuge(rs.getString("tipo_Doc_conyuge"));
                    obj.setNumero_documento_conjuge(rs.getString("numero_Doc_conyuge"));
                    obj.setNumero_telefono_conjuge(rs.getString("fijo_conyuge"));
                    obj.setNumero_celular_conjuge(rs.getString("cel_conyuge"));
                    obj.setCorreo_conyuge(rs.getString("correo_conyuge"));
                    obj.setNumero_celular(rs.getString("dnumcelular"));
                    obj.setDireccion_fiscal(rs.getString("direccion_fiscal"));
                    
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
    
   
    public ArrayList<SelectItem> getBuscarNombresContribuyente() {

        ArrayList<SelectItem> arrayContribuyente = new ArrayList<SelectItem>();
        Persona Obj= null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.java_buscar_nombres_contribuyente()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arrayContribuyente.add(new SelectItem(rs.getString("codigo_contribuyente"), rs.getString("nombre_contribuyente")));
                    
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

        return arrayContribuyente;
    }
    
   
    
    
}
