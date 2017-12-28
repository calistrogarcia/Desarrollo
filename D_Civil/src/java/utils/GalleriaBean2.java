/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.List;

public class GalleriaBean2 {
    
     private List<ImagenGall> imagenes;

    public GalleriaBean2() {
       imagenes = new ArrayList<ImagenGall>();  
  
       imagenes.add(new ImagenGall("Logo.jpg", "Logo"));  
      }

    public List<ImagenGall> getImagenes() {
        return imagenes;
    }
   
    
}
