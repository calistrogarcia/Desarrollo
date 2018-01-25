/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;


@ManagedBean
@SessionScoped

public class BeansCambioIdioma implements Serializable {


    private static final long SerialVersionUID= 1;
    private string localidad;
    private static Map <String,Object> ListaPaises;

   
    public string getLocalidad() {
        return localidad;
    }

    public void setLocalidad(string localidad) {
        this.localidad = localidad;
    }

    public  Map<String, Object> getListaPaises() {
        return ListaPaises;
    }

    public static void setListaPaises(Map<String, Object> ListaPaises) {
        BeansCambioIdioma.ListaPaises = ListaPaises;
    }
    
    static {
        
        ListaPaises= new LinkedHashMap<String,Object>();
        ListaPaises.put("English", Locale.ENGLISH);
        
        Locale espanol = new Locale("ES");
        ListaPaises.put("Español", espanol);
        
        
    }
    
    public void cambioLocalidad(ValueChangeEvent e) {
       String NuevoValorLocalidad = e.getNewValue().toString();
       for(Map.Entry<String, Object> entry : ListaPaises.entrySet()){
           if(entry.getValue().toString().equals(NuevoValorLocalidad)){
               FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale) entry.getValue());
           }
       }
    }
    
    
    public BeansCambioIdioma() {
 
    
    }
    
    
  //  Agregrar en xhtml si se desea la internacionalizacion   Inicio
    
//                    <form id="cambio_idioma"  style="margin-bottom:20px;color: #FF0000; text-align: right" >
//                        
//       
//                        <h:panelGrid columns="1">
//
//                            <h:outputText value="#{msg.LabelCambioIdioma}"  style="width: 100% "/>
//                         
//                                <p:selectOneMenu effect="fade" style=" width: 100%"  autoWidth="false"
//                                                 filter="true"  filterMatchMode="contains"
//                                                 required="true" id="SelecionarIdioma"
//                                            
//                                                 requiredMessage="#{msg.labelObli}"
//                                                 value="#{beansCambioIdioma.localidad}" onchange="submit()"
//                                                 valueChangeListener="#{beansCambioIdioma.cambioLocalidad}" >
//                                    <f:selectItem itemLabel="#{msg.labelSeleccionar}" 
//                                                  itemValue="O"/>
//                                    <f:selectItems value="#{beansCambioIdioma.listaPaises}"/>
//                                </p:selectOneMenu>
//                               
//                        </h:panelGrid>
//
//                         
//                    </form> 
//    fn 
    
    
}
