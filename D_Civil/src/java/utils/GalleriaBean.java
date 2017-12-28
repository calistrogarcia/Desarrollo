/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class GalleriaBean {
     private List<ImagenGall> imagenes;

    public GalleriaBean() {
    imagenes = new ArrayList<ImagenGall>();  
  
            imagenes.add(new ImagenGall("smp.png", "SMP"));  
            /*imagenes.add(new ImagenGall("logo_defensa_civil.png", "Civil")); */ 
            
    }
    
    public List<ImagenGall> getImagenes() {
        return imagenes;
    }
   
}
