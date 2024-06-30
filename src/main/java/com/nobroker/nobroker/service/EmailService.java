package com.nobroker.nobroker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    private final UserService userService;


    public EmailService(JavaMailSender javaMailSender, UserService userService) {
        this.javaMailSender = javaMailSender;
        this.userService = userService;
    }
    public String generateOtp(){
        return String.format("%06d",new java.util.Random().nextInt(100000));

    }
    public String sendOtpEmail(String email){
        String otp=generateOtp();
        return otp;
    }
}
