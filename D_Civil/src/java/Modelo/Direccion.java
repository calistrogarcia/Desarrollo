/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Administrador
 */
public class Direccion implements Serializable {
    
    private String codigo_postal;
    private String codigo_via;
    private String tipo_via;
    private String nombre_via;
    private String habilitacion;
    private String tipo_habilitacion;
    private String codigo_habilitacion;
    private String zona;
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
    private String cuadra;

    
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

    public String getHabilitacion() {
        return habilitacion;
    }

    public void setHabilitacion(String habilitacion) {
        this.habilitacion = habilitacion;
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

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
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
    
  
    
  
    
}
