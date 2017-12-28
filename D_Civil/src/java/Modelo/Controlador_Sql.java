/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Calistro
 */


public class Controlador_Sql {

    
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
    
  
    
    public static void main(String[] argumentos){
       
    
         Connection conexion = null;
        try{

            System.out.println("Cadena de Conexion" + Controlador_Sql.getURLBD());
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


     /*
    // Create a variable for the connection string.  
      String connectionUrl = "jdbc:sqlserver://MDSMPHY00:1433;databaseName=integralsmp;user=sa;password=mdsmp*2017";  ;  
  
      // Declare the JDBC objects.  
      Connection con = null;  
      Statement stmt = null;  
      ResultSet rs = null;  
  
      try {  
         // Establish the connection.  
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
         con = DriverManager.getConnection(connectionUrl);  
  
         // Create and execute an SQL statement that returns some data.  
         String SQL = "SELECT TOP 10 * FROM swpag";  
         stmt = con.createStatement();  
         rs = stmt.executeQuery(SQL);  
  
         // Iterate through the data in the result set and display it.  
         while (rs.next()) {  
            System.out.println(rs.getString(4) + " " + rs.getString(6));  
         }  
      }  
  
      // Handle any errors that may have occurred.  
      catch (Exception e) {  
         e.printStackTrace();  
      }  
      finally {  
         if (rs != null) try { rs.close(); } catch(Exception e) {}  
         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
         if (con != null) try { con.close(); } catch(Exception e) {}  
      }  
    }
}

*/