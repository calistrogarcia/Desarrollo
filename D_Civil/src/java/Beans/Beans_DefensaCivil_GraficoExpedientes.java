/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Modelo.Grafico;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BarChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.ItemSelectEvent;
 

/**
 *
 * @author Administrador
 */
@ManagedBean
@Named(value = "beans_DefensaCivil_GraficoExpedientes")
//@Named(value="beans_DefensaCivil_GraficoExpedientes")
//@SessionScoped
//@ViewScoped
public class Beans_DefensaCivil_GraficoExpedientes {
    
    
 
   private PieChartModel pieModel;
   private PieChartModel pieModelipse;
   
   private BarChartModel barModel;
   private Grafico objBuscarContribuye;
   private ArrayList<Grafico> arrGrafico=null;
   private ArrayList<Grafico> arrBusGrafico=null;

   
   public PieChartModel getPieModel() {
        return pieModel;
    }

    public BarChartModel getBarModel() {
        return barModel;
    }

    public void setBarModel(BarChartModel barModel) {
        this.barModel = barModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    public Grafico getObjBuscarContribuye() {
        return objBuscarContribuye;
    }

    public void setObjBuscarContribuye(Grafico objBuscarContribuye) {
        this.objBuscarContribuye = objBuscarContribuye;
    }

    public ArrayList<Grafico> getArrGrafico() {
        return arrGrafico;
    }

    public void setArrGrafico(ArrayList<Grafico> arrGrafico) {
        this.arrGrafico = arrGrafico;
    }

    public ArrayList<Grafico> getArrBusGrafico() {
        return arrBusGrafico;
    }

    public void setArrBusGrafico(ArrayList<Grafico> arrBusGrafico) {
        this.arrBusGrafico = arrBusGrafico;
    }

    public PieChartModel getPieModelipse() {
        return pieModelipse;
    }

    public void setPieModelipse(PieChartModel pieModelipse) {
        this.pieModelipse = pieModelipse;
    }

  
      
   //------------Inicializaciones--------------------------//
    
    public void doiniciarBusquedaPersonalizada(){ 
            
    this.arrBusGrafico = new ArrayList<Grafico>();
    this.objBuscarContribuye= new Grafico();
         
    }
    
     public void doiniciarObjBusPersonalizada(){
        this.objBuscarContribuye=new Grafico();
    }
    
    public ArrayList<Grafico> doBuscarPersonalizado(){ 
        
    this.arrBusGrafico = new ArrayList<Grafico>();
    //this.arrBusGrafico= Grafico.getBusquedaPersonalizada(objBuscarContribuye);
  
    return this.arrBusGrafico;    
   }
     
    
    
   ///---------Metodos-------------------------------------//
   
   
    public void listar() {
        
        Grafico dao;  List<Grafico> lista;

        try {
            dao = new Grafico();
            lista = dao.listar();
            graficar(lista);
        } catch (Exception e) {
            //Logica de excepcion y/o mensajes de error
        } finally {
            //Logica de cierre
        }
    }

    private void graficar(List<Grafico> lista) {

        pieModel = new PieChartModel();

        for (Grafico graf : lista) {
            pieModel.set(graf.getResultadoexpedientes(), graf.getTotal());
        }
        pieModel.setTitle("Expedediente");
        pieModel.setLegendPosition("e");
        pieModel.setFill(false);
        pieModel.setShowDataLabels(true);
        pieModel.setDiameter(100);
    }
    
    
    

    public void listaripse() {
        
        Grafico dao;
        List<Grafico> lista;

        try {
            dao = new Grafico();
            lista = dao.listaripse();
            graficar(lista);
        } catch (Exception e) {
            //Logica de excepcion y/o mensajes de error
        } finally {
            //Logica de cierre
        }
    }

    private void graficar1(List<Grafico> lista) {

        pieModel = new PieChartModel();

        for (Grafico graf : lista) {
            pieModel.set(graf.getResultadoexpedientes(), graf.getTotal());
        }
        pieModel.setTitle("IPSE");
        pieModel.setLegendPosition("e");
        pieModel.setFill(false);
        pieModel.setShowDataLabels(true);
        pieModel.setDiameter(170);
    }
    
  ///---------Metodos-------------------------------------//  
    
  
  
   public void personalizado() {
        Grafico per;
        List<Grafico> carga;

        try {
            per = new Grafico();
            carga = per.personalizado();
            GraficarPesonalizada(carga);
        } catch (Exception e) {
            //Logica de excepcion y/o mensajes de error
        } finally {
            //Logica de cierre
        }
    }

    private void GraficarPesonalizada(List<Grafico> carga) {

        barModel = new BarChartModel();
        
        for(int i=0; i < carga.size(); i++){ 
            ChartSeries serie= new BarChartSeries(); 
         
            serie.setLabel(carga.get(i).getEstado_resolucion());
            serie.set("Enero", carga.get(i).getEnero()); 
            serie.set("Febrero", carga.get(i).getFebrero());
            serie.set("Marzo", carga.get(i).getMarzo());
            serie.set("Abril", carga.get(i).getAbril());
            serie.set("Mayo", carga.get(i).getMayo());
            serie.set("Junio", carga.get(i).getJunio());
            serie.set("Julio", carga.get(i).getJulio());
            serie.set("Agosto", carga.get(i).getAgosto());  
            serie.set("Septiembre", carga.get(i).getSeptiembre());
            serie.set("Octubre", carga.get(i).getOctubre());
            serie.set("Noviembre", carga.get(i).getNoviembre());
            serie.set("Diciembre", carga.get(i).getDiciembre());
            
            barModel.addSeries(serie);
                 
        }

        
        barModel.setTitle("Personalizado");
        //barModel.setLegendPosition("ne");
        barModel.setAnimate(true);
        barModel.setLegendPosition("ne");
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Periodo");
         
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Cantidad");
        yAxis.setMin(0);
        yAxis.setMax(10);
    
    }
    
}
