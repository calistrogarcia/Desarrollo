/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrador
 */
public class PoolConexion {

   
    
    SQLServerDataSource ds = new SQLServerDataSource();
    
    
    private static String driverJDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String ipBD = "192.168.0.11";
    private static int puertoTCP =1433;
    private static String nombreBD = "integralsmp";
    private static String usuarioBD = "sa";
    private static String claveBD = "mdsmp*2017";

  
    private static String getURLBD(){
        return "jdbc:sqlserver://" + ipBD + ":" + puertoTCP + ";databaseName=" + nombreBD + ";user="+ usuarioBD + ";password=" + claveBD ;
      
    }
    
    
     public static Connection darConexionBD(){
        
        Connection conexion = null;
        
        try{
            Class.forName(driverJDBC);
            conexion = DriverManager.getConnection(getURLBD());

        }catch(Exception error) {
            System.out.println("Hay un error por: " + error.getMessage());
            error.printStackTrace();
        }
        return conexion;
    }
    
    public static void main(String[] args) {
        Connection conexion = null;
         
        try{

            System.out.println("Cadena de Conexion" + PoolConexion.getURLBD());
            conexion = Controlador_Sql.darConexionBD();
            System.out.println(conexion);
            System.out.println(conexion.getCatalog());
            
            conexion.close();
        }catch(Exception error){
            System.out.println("Error por: " + error.getMessage());
            error.printStackTrace();
        }
    }
    
}
