package com.demo.twiliomultiplesms.service;

import com.demo.twiliomultiplesms.data.User;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertService {
    public void sendAlertSms(
            String message,
            List<User> users
    ) {
        // sending all the SMS in parallel
        users.stream()
                .parallel()
                .forEach(user -> Message.creator(
                        new PhoneNumber("+1555999000"), // your Twilio number (sender phone number)
                        new PhoneNumber(user.getPhoneNumber()), // receiver phone number
                        message
                ).create());
    }
}
