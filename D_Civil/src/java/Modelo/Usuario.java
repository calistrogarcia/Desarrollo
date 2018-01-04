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


        public class Usuario implements Serializable {


        private int id_usuario;
        private String nombre_usuario;
        private String usuario;
        private String contrasenia;
        private int id_tipo_usuario;
        private String descripcion;

      

        public int getId_usuario() {
                return id_usuario;
            }

            public void setId_usuario(int id_usuario) {
                this.id_usuario = id_usuario;
            }

            public String getNombre_usuario() {
                return nombre_usuario;
            }

            public void setNombre_usuario(String nombre_usuario) {
                this.nombre_usuario = nombre_usuario;
            }

            public String getUsuario() {
                return usuario;
            }

            public void setUsuario(String usuario) {
                this.usuario = usuario;
            }

            public String getContrasenia() {
                return contrasenia;
            }

            public void setContrasenia(String contrasenia) {
                this.contrasenia = contrasenia;
            }

            public int getId_tipo_usuario() {
                return id_tipo_usuario;
            }

            public void setId_tipo_usuario(int id_tipo_usuario) {
                this.id_tipo_usuario = id_tipo_usuario;
            }

            public String getDescripcion() {
                return descripcion;
            }

            public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
            }
            
            


        }
