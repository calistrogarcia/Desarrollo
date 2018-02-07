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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Administrador
 */
public class Asunto implements Serializable {

    private String codigo_asunto;
    private String nombre_asunto;
    private int numero_dias;
    private String estado;
    private String base_legal;

    Area ObjAreas = new Area();
    Grupo ObjGrupo = new Grupo();

    public String getCodigo_asunto() {
        return codigo_asunto;
    }

    public void setCodigo_asunto(String codigo_asunto) {
        this.codigo_asunto = codigo_asunto;
    }

    public String getNombre_asunto() {
        return nombre_asunto;
    }

    public void setNombre_asunto(String nombre_asunto) {
        this.nombre_asunto = nombre_asunto;
    }

    public int getNumero_dias() {
        return numero_dias;
    }

    public void setNumero_dias(int numero_dias) {
        this.numero_dias = numero_dias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBase_legal() {
        return base_legal;
    }

    public void setBase_legal(String base_legal) {
        this.base_legal = base_legal;
    }

    public Area getObjAreas() {
        return ObjAreas;
    }

    public void setObjAreas(Area ObjAreas) {
        this.ObjAreas = ObjAreas;
    }

    public Grupo getObjGrupo() {
        return ObjGrupo;
    }

    public void setObjGrupo(Grupo ObjGrupo) {
        this.ObjGrupo = ObjGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.codigo_asunto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asunto other = (Asunto) obj;
        if (!Objects.equals(this.codigo_asunto, other.codigo_asunto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre_asunto;
    }

    public ArrayList<Asunto> CargarAsunto_Expediente(String codigo_asunto) throws SQLException {

        ArrayList<Asunto> arrayAsunto_Expediente = new ArrayList<>();
        Asunto obj = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {
            conexion = Controlador_Sql.darConexionBD();
            CallableStatement st = null;
            st = conexion.prepareCall("{call sp_java_asuntos_expedientes(?)}");

            if (codigo_asunto != null) {
                if (codigo_asunto.length() > 0) {
                    st.setString(1, codigo_asunto);

                } else {
                    st.setString(1, null);
                }
            } else {
                st.setString(1, null);
            }

            rs = st.executeQuery();
            if (rs.next()) {

                do {
                    obj = new Asunto();

                    obj.setCodigo_asunto(rs.getString("codigo_asunto"));
                    obj.setNombre_asunto(rs.getString("nombre_asunto"));

                    arrayAsunto_Expediente.add(obj);

                } while (rs.next());
            }

            rs.close();
            st.close();
            conexion.close();
        } catch (Exception error) {
            System.out.println("Error en el metodo por: " + error.getMessage());
            error.printStackTrace();
        }

        return arrayAsunto_Expediente;
    }

}
