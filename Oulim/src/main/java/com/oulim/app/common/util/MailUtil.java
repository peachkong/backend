package com.oulim.app.common.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MailUtil {

    private static final String FROM_EMAIL = "yjs030678@gmail.com";
    private static final String PASSWORD = "euox yqmw aqhn xtor";

    public static void sendMail(String toEmail, String authCode) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM_EMAIL, PASSWORD);
            }
        });

        try {
            System.out.println("FROM_EMAIL: " + FROM_EMAIL);
            System.out.println("TO_EMAIL: " + toEmail);

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FROM_EMAIL, "어울림"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject("[어울림] 이메일 인증번호");
            message.setText("인증번호는 [" + authCode + "] 입니다.");

            Transport.send(message);
            System.out.println("Transport.send 성공");

        } catch (Exception e) {
            System.out.println("MailUtil 예외 발생");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    public static String sendMail(String toEmail, String mailTitle, String mailMain, HttpSession reqSession) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM_EMAIL, PASSWORD);
            }
        });

        try {
        	if(!IsEmailSendAble(toEmail, reqSession)) {
        		System.out.println("메일 발송 대기시간이 지나지 않았습니다.");
        		return "cooldown";
        	}
            System.out.println("FROM_EMAIL: " + FROM_EMAIL);
            System.out.println("TO_EMAIL: " + toEmail);

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FROM_EMAIL, "어울림"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(mailTitle);
            message.setText(mailMain);

            Transport.send(message);
            System.out.println("Transport.send 성공");

            storeEmailSession(toEmail, reqSession);
        } catch (Exception e) {
            System.out.println("MailUtil 예외 발생");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        
        return "success";
    }
    
    private static void storeEmailSession(String email, HttpSession session) {
    	session.setAttribute("sendMailEmail", email);
    	long now = System.currentTimeMillis();
    	session.setAttribute("sendTime", now);
    }
    
    private static boolean IsEmailSendAble(String email, HttpSession session) {
    	boolean result = true;
    	if(session == null) {
    		return result;
    	}

    	String sendEmail = (String)session.getAttribute("sendMailEmail");
    	Long lastSendTime = (Long)session.getAttribute("sendTime");
    	long now = System.currentTimeMillis();
    	if(lastSendTime != null) {
    		if(now - lastSendTime < DefineType.COOLTIME) {
    			result = false;
    		}
    	}
    	
    	return result;
    }
}