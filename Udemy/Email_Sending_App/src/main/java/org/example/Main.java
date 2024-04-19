package org.example;

import jakarta.mail.MessagingException;

public class Main {
    public static void main(String[] args) throws MessagingException {
        GmailSender mailService = new GmailSender();
        String to = "aadityathakare111@gmail.com";
        String from = "aadityathakare124@gmail.com";
        String subject = "Email Sending Example!";
        String message = "This is the Sample TExt used in Java mail API";
        if(mailService.sendEmail(to,from,message,subject)){
            System.out.println("Email Sent Successffully!");
        } else {
            System.out.println("Problem Occur while Sending Email!");
        }

    }
}