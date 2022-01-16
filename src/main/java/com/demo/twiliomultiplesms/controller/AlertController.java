package com.demo.twiliomultiplesms.controller;

import com.demo.twiliomultiplesms.data.User;
import com.demo.twiliomultiplesms.dto.SmsAlertBody;
import com.demo.twiliomultiplesms.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alerts")
public class AlertController {
    private final AlertService alertService;

    @Autowired
    public AlertController(AlertService smsService) {
        this.alertService = smsService;
    }

    @PostMapping("sms")
    public void sendSms(@RequestBody SmsAlertBody smsAlertBody) {
        // retrieving all users to be notified

        // ...

        List<User> users = List.of(
                new User("John", "Williams", "+155599001"),
                new User("Maria", "Brown", "+1555999002"),
                new User("Gustavo", "Lopez", "+1555999003")
        );

        alertService.sendAlertSms(
                smsAlertBody.getMessage(),
                users
        );
    }
}

