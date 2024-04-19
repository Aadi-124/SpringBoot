package org.example;
import jakarta.mail.*;
import javax.net.*;

import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
public class GmailSender {

    public boolean sendEmail(String to, String from, String msg, String subject) throws MessagingException {
        boolean result = false;
        Properties props = new Properties();
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp,starttls.enable", true);
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.transport.protocol","smtp");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//        props.setProperty("mail.transport.protocol", "smtp");
//        props.setProperty("mail.host", "smtp.gmail.com");
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.port", "465");
//        props.put("mail.debug", "true");
//        props.put("mail.smtp.socketFactory.fallback", "false");

        String user = "Aaditya Thakare";
        String password = "lnwk tsau aulo zdok";

        PassworAuthentication auth = new PassworAuthentication("aadityathakare124@gmail.com", "wxin ugvk sthc rhmw");
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(auth.getUsername(), auth.getPassword());
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setFrom(new InternetAddress(from));
            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);
            result = true;
        } catch (Exception E) {
            E.printStackTrace();
        }

        return result;

    }

//        final  String password ="lnwk tsau aulo zdok";
//
//
//        Properties props = new Properties();
//        props.setProperty("mail.transport.protocol", "smtp");
//        props.setProperty("mail.host", "smtp.gmail.com");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.port", "465");
//        props.put("mail.debug", "true");
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.socketFactory.fallback", "false");
//        Session session = Session.getDefaultInstance(props,
//                new jakarta.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(from,password);
//                    }
//                });
//
//        //session.setDebug(true);
//        Transport transport = session.getTransport();
//        InternetAddress addressFrom = new InternetAddress(from);
//
//        MimeMessage message = new MimeMessage(session);
//        message.setSender(addressFrom);
//        message.setSubject(subject);
//        message.setContent(msg, "text/plain");
//        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//        transport.connect();
//        Transport.send(message);
//        transport.close();
//        return true;
//    }



}



