/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Administrador
 */
public class Controlador_Correo {
    
   
   public boolean enviarCorreo(Correo Objcorreo){
       
   try {
      
       Properties p = new Properties();
       p.put("mail.smtp.host", "smtp.gmail.com");
       p.setProperty("mail.smtp.starttls.enable", "true");
       p.setProperty("mail.smtp.port", "587");
       p.setProperty("mail.smtp.user", Objcorreo.getUsuario_correo());
       p.setProperty("mail.smtp.auth", "true");
       
       Session s = Session.getDefaultInstance(p, null);
       BodyPart texto= new MimeBodyPart();
       texto.setText(Objcorreo.getMensaje());
       BodyPart adjunto= new MimeBodyPart();
       
       if(Objcorreo.getRuta_archivo().equals("")){
           adjunto.setDataHandler(new DataHandler(new FileDataSource(Objcorreo.getRuta_archivo())));
           adjunto.setFileName(Objcorreo.getNombre_archivo());
        
       }
     
     MimeMultipart m= new MimeMultipart();
     m.addBodyPart(texto);
     
     if(!Objcorreo.getRuta_archivo().equals("")){
          m.addBodyPart(adjunto);}
          
          MimeMessage mensaje = new MimeMessage(s);
          mensaje.setFrom(new InternetAddress(Objcorreo.getUsuario_correo()));
          mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(Objcorreo.getDestino()));
          mensaje.setSubject(Objcorreo.getAsunto());
          mensaje.setContent(m);
          
          Transport t=s.getTransport("smtp");
          t.connect(Objcorreo.getUsuario_correo(), Objcorreo.getContrasenia());
          t.sendMessage(mensaje, mensaje.getAllRecipients());
          t.close();
         
         return true;
     
         

   }catch(Exception e){
       
      System.out.println("error" +e );
   }
   
   return false;
   }
}
   
