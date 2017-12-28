/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Judith
 */
public class Recurrente implements Serializable{
    
    private int nroexpe;
    private Date anioexp;
    private String ccontri;
    private String cnombre;
    private String dtipdoc;
    private String drecurre;

    public int getNroexpe() {
        return nroexpe;
    }

    public void setNroexpe(int nroexpe) {
        this.nroexpe = nroexpe;
    }

    public Date getAnioexp() {
        return anioexp;
    }

    public void setAnioexp(Date anioexp) {
        this.anioexp = anioexp;
    }

    public String getCcontri() {
        return ccontri;
    }

    public void setCcontri(String ccontri) {
        this.ccontri = ccontri;
    }

    public String getCnombre() {
        return cnombre;
    }

    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }

    public String getDtipdoc() {
        return dtipdoc;
    }

    public void setDtipdoc(String dtipdoc) {
        this.dtipdoc = dtipdoc;
    }

    public String getDrecurre() {
        return drecurre;
    }

    public void setDrecurre(String drecurre) {
        this.drecurre = drecurre;
    }
    
    
    
}
