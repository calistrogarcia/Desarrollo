/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
public class Constantes {
    
//Páginas        
        public final static String PAGE_LOGIN="login";        
        
        public final static String PAGE_FIN="fin";
        public final static String PAGE_ERROR="errorPag";
        public final static String PAGE_INGRESO="index";
        public final static String PAGE_INICIO_PRINCIPAL="inicioPrincipal";
        public final static String PAGE_REGISTRAR_ORDEN_TRABAJO="OrdenTrabajo";
        
              
        public final static String PAGE_LOGIN_JSF=PAGE_LOGIN+".jsf"; 
        public final static String PAGE_INGRESO_JSF=PAGE_INGRESO+".jsf";
        public final static String PAGE_FIN_JSF=PAGE_FIN+".jsf"; 
        public final static String PAGE_ERROR_JSF=PAGE_ERROR+".jsf"; 
        
        public final static String PAGE_INICIO_PRINCIPAL_JSF=PAGE_INICIO_PRINCIPAL+".jsf";
        public final static String PAGE_REGISTRAR_ORDEN_TRABAJO_JSF=PAGE_REGISTRAR_ORDEN_TRABAJO+".jsf";
        
        
        //Constantes Finales Tab Administracion de la Orden de Trabajo asignada a su tipo de msntenimiento. 
     

          public final static int TAB_BUSQUEDA=0;
          public final static int TAB_MODIFICAR=1;
          public final static int TAB_ELIMINAR=2;
          public final static int TAB_DERIVAR=3;
          
        /*
        
        public final static int TAB_PRESENTACION=0;
        public final static int TAB_REGISTRAR=1;
        public final static int TAB_ELIMINAR=2;
        public final static int TAB_VER=3;
        public final static int TAB_MODIFICAR=4;
        public final static int TAB_ELIMINAR=5;
        public final static int TAB_BUSQUEDA=6;

      */  
}
