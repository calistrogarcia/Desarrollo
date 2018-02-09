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

/**
 *
 * @author Administrador
 */
public class Direccion implements Serializable {
    
    private String codigo_postal;
    private String codigo_via;
    private String tipo_via;
    private String nombre_via;
    private String nombre_habilitacion;
    private String tipo_habilitacion;
    private String codigo_habilitacion;
    private String codigo_zona;
    private String nombre_zona;
    private String manzana;
    private String lote; 
    private String numero;
    private String numero_departamento;
    private String numero_interior;
    private String letra;
    private String bloque; 
    private String referencia;
    private String detalle_direccion;
    private String detalle_habilitacion;
    private String cuadra;

    
    
    Postal ObjPostal = new Postal();

    
    
    public Postal getObjPostal() {
        return ObjPostal;
    }

    public void setObjPostal(Postal ObjPostal) {
        this.ObjPostal = ObjPostal;
    }

    public Direccion(){
        
    }

    public String getCodigo_via() {
        return codigo_via;
    }

    public void setCodigo_via(String codigo_via) {
        this.codigo_via = codigo_via;
    }

    public String getTipo_via() {
        return tipo_via;
    }

    public void setTipo_via(String tipo_via) {
        this.tipo_via = tipo_via;
    }

    public String getNombre_via() {
        return nombre_via;
    }

    public void setNombre_via(String nombre_via) {
        this.nombre_via = nombre_via;
    }

    public String getTipo_habilitacion() {
        return tipo_habilitacion;
    }

    public void setTipo_habilitacion(String tipo_habilitacion) {
        this.tipo_habilitacion = tipo_habilitacion;
    }

    public String getCodigo_habilitacion() {
        return codigo_habilitacion;
    }

    public void setCodigo_habilitacion(String codigo_habilitacion) {
        this.codigo_habilitacion = codigo_habilitacion;
    }

  

    public String getNombre_zona() {
        return nombre_zona;
    }

    public void setNombre_zona(String nombre_zona) {
        this.nombre_zona = nombre_zona;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero_departamento() {
        return numero_departamento;
    }

    public void setNumero_departamento(String numero_departamento) {
        this.numero_departamento = numero_departamento;
    }

    public String getNumero_interior() {
        return numero_interior;
    }

    public void setNumero_interior(String numero_interior) {
        this.numero_interior = numero_interior;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDetalle_direccion() {
        return detalle_direccion;
    }

    public void setDetalle_direccion(String detalle_direccion) {
        this.detalle_direccion = detalle_direccion;
    }

    public String getCuadra() {
        return cuadra;
    }

    public void setCuadra(String cuadra) {
        this.cuadra = cuadra;
    }

    public String getNombre_habilitacion() {
        return nombre_habilitacion;
    }

    public void setNombre_habilitacion(String nombre_habilitacion) {
        this.nombre_habilitacion = nombre_habilitacion;
    }

    public String getCodigo_zona() {
        return codigo_zona;
    }

    public void setCodigo_zona(String codigo_zona) {
        this.codigo_zona = codigo_zona;
    }

    public String getDetalle_habilitacion() {
        return detalle_habilitacion;
    }

    public void setDetalle_habilitacion(String detalle_habilitacion) {
        this.detalle_habilitacion = detalle_habilitacion;
    }
  
    
    
    public static boolean registrarDireccion(Direccion Objdireccion) {
        boolean a = false;
        Connection conexion = null;
        /* variable de connexion para definir y manejar el conytrol de errores*/
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st
                    = conexion.prepareCall("{call dbo.sp_java_registarDireccion (?,?,?,?,?,?,?,?)}");
            conexion.setAutoCommit(false);

            if (Objdireccion.getCodigo_via() != null) {
                if (Objdireccion.getCodigo_via().length() > 0) {
                    st.setString(1, Objdireccion.getCodigo_via());

                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (Objdireccion.getTipo_via() != null) {
                if (Objdireccion.getTipo_via().length() > 0) {
                    st.setString(2, Objdireccion.getTipo_via());

                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);
            }
            //---------------------------------------

            if (Objdireccion.getNombre_via() != null) {
                if (Objdireccion.getNombre_via().length() > 0) {
                    st.setString(3, Objdireccion.getNombre_via());

                } else {
                    st.setString(3, null);
                }
            } else {
                st.setString(3, null);
            }
            //---------------------------------------

            if (Objdireccion.getNombre_habilitacion() != null) {
                if (Objdireccion.getNombre_habilitacion().length() > 0) {
                    st.setString(4, Objdireccion.getNombre_habilitacion());
                } else {
                    st.setString(4, null);
                }
            } else {
                st.setString(4, null);
            }

            //---------------------------------------   
            if (Objdireccion.getTipo_habilitacion() != null) {
                if (Objdireccion.getTipo_habilitacion().length() > 0) {
                    st.setString(5, Objdireccion.getTipo_habilitacion());
                } else {
                    st.setString(5, null);
                }
            } else {
                st.setString(5, null);
            }

            //--------------------------------------- 
            if (Objdireccion.getCodigo_habilitacion() != null) {
                if (Objdireccion.getCodigo_habilitacion().length() > 0) {
                    st.setString(6, Objdireccion.getCodigo_habilitacion());
                } else {
                    st.setString(6, null);
                }
            } else {
                st.setString(6, null);
            }

            //--------------------------------------- 
            if (Objdireccion.getCodigo_zona() != null) {
                if (Objdireccion.getCodigo_zona().length() > 0) {
                    st.setString(7, Objdireccion.getCodigo_zona());
                } else {
                    st.setString(7, null);
                }
            } else {
                st.setString(7, null);
            }

            if (Objdireccion.getNombre_zona() != null) {
                if (Objdireccion.getNombre_zona().length() > 0) {
                    st.setString(8, Objdireccion.getNombre_zona());
                } else {
                    st.setString(8, null);
                }
            } else {
                st.setString(8, null);
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
 
    
    
    
    
   public static ArrayList<Direccion> getBuscaDirecciones(Direccion direciones) {

        ArrayList<Direccion> arr = null;
        ResultSet rs = null;
        Direccion obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_vias_direccion(?)}");

            if (direciones.ObjPostal.getCodigo_postal() != null) {/*Valido la informacion set*/
                if (direciones.ObjPostal.getCodigo_postal().length() > 0) {
                    st.setString(1, direciones.ObjPostal.getCodigo_postal());

                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }
          

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Direccion>();

                do {

                    obj = new Direccion();

                 

                    obj.setCodigo_via(rs.getString("codigo_via"));
                    obj.setTipo_via(rs.getString("tipo_via"));
                    obj.setNombre_via(rs.getString("nombre_via"));
                    obj.setNombre_habilitacion(rs.getString("nombre_habilitaciones"));
                    obj.setTipo_habilitacion(rs.getString("tipo_habilitacion"));
                    obj.setCodigo_habilitacion(rs.getString("codigo_habilitacion"));
                    obj.setCodigo_zona(rs.getString("codigo_zona"));
                    obj.setNombre_zona(rs.getString("nombre_zona"));
                    obj.setDetalle_habilitacion(rs.getString("detalle_habilitacion"));

                    Postal ObjPostal = new Postal();
                    
                    ObjPostal.setCodigo_postal(rs.getString("codigo_postal"));
                    
                    obj.setObjPostal(ObjPostal);

                    arr.add(obj);

                } while (rs.next());
            }
            st.execute();
            st.close();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        return arr;
    } 
    
  
   
   
   
    
}
