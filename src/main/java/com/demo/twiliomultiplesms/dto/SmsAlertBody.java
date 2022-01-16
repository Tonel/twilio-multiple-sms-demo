package com.demo.twiliomultiplesms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsAlertBody {
    @JsonProperty("message")
    private String message;

    public SmsAlertBody() {}

    public SmsAlertBody(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
