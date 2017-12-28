/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.faces.context.FacesContext;
import static javax.servlet.SessionTrackingMode.URL;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.poi.util.StringUtil;
import Beans.Beans_DefensaCivil_Certificado;
import Modelo.Certificado;

// *
// * @author Judith 06/04/2017
// */
public class Reporte {
      public void getReporte(String ruta) throws  ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Connection conexion;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        conexion = DriverManager.getConnection("jdbc:sqlserver://192.168.0.202;databaseName=integralsmp", "sa","mdsmp*2017");

      //   Se definen los parametros si es que el reporte necesita para reporte 
        Map   parameter = new HashMap ();
      //   HashMap parameter = new HashMap();
      //   parameter.put("expediente", "");
      
      //HashMap<String, Object> parameters = new HashMap<String, Object>();
        parameter.put("expediente","75737-01-2016" ) ;
      
          
        try {
            File file = new File(ruta);

            HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();

            httpServletResponse.setContentType("application/pdf");
            httpServletResponse.addHeader("Content-Type", "application/pdf");

            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conexion);
            //JasperExportManager.exportReportToPdfFile( jasperPrint, "Z:/DCivil/D_Civil/reportes_Temporales/reporte.pdf");
            

            JRExporter jrExporter = null;                      
            jrExporter = new JRPdfExporter();
            jrExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            jrExporter.setParameter(JRExporterParameter.OUTPUT_STREAM, httpServletResponse.getOutputStream());

            if (jrExporter != null) {
                try {
                    jrExporter.exportReport();
                } catch (JRException e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    
}
