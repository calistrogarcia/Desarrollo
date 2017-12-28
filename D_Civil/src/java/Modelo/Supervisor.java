/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.faces.model.SelectItem;

/**
 *
 * @author Administrador
 */
public class Supervisor implements Serializable {

    private String id_inspector;
    private String apellido_paterno;
    private String apellido_materno;
    private String nombres;
    private String apellidos_nombres;
    private String nro_dni;
    private Date fecha_ingreso;
    private String direccion;
    private String telefono;
    private String correo;
    private String estado;

    public Supervisor(String apellido_paterno, String apellido_materno, String nombres, String nro_dni, String direccion, String telefono, String correo) {

        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.nombres = nombres;
        this.nro_dni = nro_dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;

    }

    public Supervisor() {

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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos_nombres() {
        return apellidos_nombres;
    }

    public void setApellidos_nombres(String apellidos_nombres) {
        this.apellidos_nombres = apellidos_nombres;
    }

    public String getNro_dni() {
        return nro_dni;
    }

    public void setNro_dni(String nro_dni) {
        this.nro_dni = nro_dni;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getId_inspector() {
        return id_inspector;
    }

    public void setId_inspector(String id_inspector) {
        this.id_inspector = id_inspector;
    }

    public static boolean registrarSupervisor(Supervisor ObjSup) {
        boolean a = false;
        Connection conexion = null;
        /* variable de connexion para definir y manejar el conytrol de errores*/
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st
                    = /*deve importarse con java la segunda opcion del cuadro de alternativas des importacion*/ conexion.prepareCall("{call [dbo].[sp_java_inspector] (?,?,?,?,?,?,?)}");
            conexion.setAutoCommit(false);

            if (ObjSup.getApellido_paterno() != null) {
                if (ObjSup.getApellido_paterno().length() > 0) {
                    st.setString(1, ObjSup.getApellido_paterno());

                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (ObjSup.getApellido_materno() != null) {
                if (ObjSup.getApellido_materno().length() > 0) {
                    st.setString(2, ObjSup.getApellido_materno());

                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);
            }
            //---------------------------------------

            if (ObjSup.getNombres() != null) {
                if (ObjSup.getNombres().length() > 0) {
                    st.setString(3, ObjSup.getNombres());

                } else {
                    st.setString(3, null);
                }
            } else {
                st.setString(3, null);
            }
            //---------------------------------------

            if (ObjSup.getNro_dni() != null) {
                if (ObjSup.getNro_dni().length() > 0) {
                    st.setString(4, ObjSup.getNro_dni());
                } else {
                    st.setString(4, null);
                }
            } else {
                st.setString(4, null);
            }

            //---------------------------------------   
            if (ObjSup.getDireccion() != null) {
                if (ObjSup.getDireccion().length() > 0) {
                    st.setString(5, ObjSup.getDireccion());
                } else {
                    st.setString(5, null);
                }
            } else {
                st.setString(5, null);
            }

            //--------------------------------------- 
            if (ObjSup.getTelefono() != null) {
                if (ObjSup.getTelefono().length() > 0) {
                    st.setString(6, ObjSup.getTelefono());
                } else {
                    st.setString(6, null);
                }
            } else {
                st.setString(6, null);
            }

            //--------------------------------------- 
            if (ObjSup.getCorreo() != null) {
                if (ObjSup.getCorreo().length() > 0) {
                    st.setString(7, ObjSup.getCorreo());
                } else {
                    st.setString(7, null);
                }
            } else {
                st.setString(7, null);
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

    public static ArrayList<Supervisor> getBuscarInspector(Supervisor Sup) {

        ArrayList<Supervisor> arr = null;
        ResultSet rs = null;
        Supervisor obj = null;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();
            conexion.setAutoCommit(false);
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_consultar_inspector(?)}");

            if (Sup.getNro_dni() != null) {/*Valido la informacion set*/
                if (Sup.getNro_dni().length() > 0) {
                    st.setString(1, Sup.getNro_dni());

                } else {
                    st.setString(1, null);
                }
            }

            rs = st.executeQuery();
            if (rs.next()) {
                arr = new ArrayList<Supervisor>();
                do {

                    obj = new Supervisor();

                    obj.setNro_dni(rs.getString("nro_dni"));
                    obj.setApellido_paterno(rs.getString("apellido_paterno"));
                    obj.setApellido_materno(rs.getString("apellido_materno"));
                    obj.setNombres(rs.getString("nombres"));
                    obj.setApellidos_nombres(rs.getString("apellidos_nombres"));
                    obj.setTelefono(rs.getString("telefono"));
                    obj.setCorreo(rs.getString("correo"));
                    obj.setDireccion(rs.getString("direccion"));

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

    public static boolean MoficardatosSupervisor(Supervisor obj) {
        boolean a = false;
        Connection conexion = null;

        try {
            conexion = Controlador_Sql.darConexionBD();

            conexion.setAutoCommit(false);

            CallableStatement st = conexion.prepareCall("{call sp_java_actualizar_inspector(?,?,?,?,?,?,?)}");

            if (obj.getApellido_paterno() != null) {

                if (obj.getApellido_paterno().length() > 0) {
                    st.setString(1, obj.getApellido_paterno());
                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            if (obj.getApellido_materno() != null) {

                if (obj.getApellido_materno().length() > 0) {

                    st.setString(2, obj.getApellido_materno());
                } else {
                    st.setString(2, null);
                }
            } else {
                st.setString(2, null);

            }

            if (obj.getNombres() != null) {
                if (obj.getNombres().length() > 0) {
                    st.setString(3, obj.getNombres());
                } else {
                    st.setString(3, null);
                }
            } else {
                st.setString(3, null);

            }

            if (obj.getNro_dni() != null) {

                if (obj.getNro_dni().length() > 0) {
                    st.setString(4, obj.getNro_dni());
                } else {
                    st.setString(4, null);
                }
            } else {
                st.setString(4, null);

            }

            if (obj.getDireccion() != null) {

                if (obj.getDireccion().length() > 0) {
                    st.setString(5, obj.getDireccion());
                } else {
                    st.setString(5, null);
                }
            } else {
                st.setString(5, null);
            }

            if (obj.getTelefono() != null) {

                if (obj.getTelefono().length() > 0) {
                    st.setString(6, obj.getTelefono());
                } else {
                    st.setString(6, null);
                }
            } else {
                st.setString(6, null);

            }

            if (obj.getCorreo() != null) {

                if (obj.getCorreo().length() > 0) {

                    st.setString(7, obj.getCorreo());
                } else {
                    st.setString(7, null);
                }
            } else {
                st.setString(7, null);

            }

            st.execute();
            a = true;
            st.close();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }
        return a;

    }

    public ArrayList<SelectItem> getCargarInspector() {

        ArrayList<SelectItem> arraySupervisor = new ArrayList<SelectItem>();
        Supervisor obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {

            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = conexion.prepareCall("{call dbo.sp_java_lista_inspectores()}");
            rs = st.executeQuery();

            if (rs.next()) {
                do {
                    arraySupervisor.add(new SelectItem(rs.getString("apellidos_nombres")));

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

        return arraySupervisor;
    }

}
