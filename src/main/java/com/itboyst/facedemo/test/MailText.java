package com.itboyst.facedemo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class MailText {
@Resource
    private JavaMailSender javaMailSender;
@Test
    public void textSendMail(){
    SimpleMailMessage mailMessage = new SimpleMailMessage();
    mailMessage.setFrom("652459753@qq.com");
    mailMessage.setTo("ycs652459@163.com");
    mailMessage.setSubject("小杨小杨，数你最强");
    mailMessage.setText("小杨小杨，数你最强");
    this.javaMailSender.send(mailMessage);
}
}
