/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.tostadora.controler.services;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author SENA
 */
public class email {
     private Properties prop;
    private Session session;
    private MimeMessage mimeMessage;

    public email() {
        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.user", "ainfante086@gmail.com");
        prop.put("mail.smtp.password", "vbiyhwcuacecrqxc");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.port", "587");
        session = Session.getDefaultInstance(prop);
        mimeMessage = new MimeMessage(session);
    }
    
    public void sendMessage(String message, String sendTo) throws AddressException, MessagingException {
        if(mimeMessage != null) {
            //el correo desde donde lo mandamos
            mimeMessage.setFrom(new InternetAddress(prop.getProperty("mail.smtp.user")));
            //el correo a quien lo enviamos
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(sendTo));
            mimeMessage.setSubject("Mensaje de prueba no responder!");
            MimeBodyPart body = new MimeBodyPart();
            //mensaje y tipo de mensaje
            body.setContent(message, "text/html; charset=utf-8");
            Multipart multiPart = new MimeMultipart();
            //cargamos el cuerpo del mensaje
            multiPart.addBodyPart(body);
            mimeMessage.setContent(multiPart);
            //enviamos el correo
            Transport.send(mimeMessage, prop.getProperty("mail.smtp.user"), prop.getProperty("mail.smtp.password"));
        }
    }
}
