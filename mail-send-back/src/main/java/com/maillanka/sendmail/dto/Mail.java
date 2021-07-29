package com.maillanka.sendmail.dto;

public class Mail {
    private String fromMail;
    private String toMail;
    private String body;
    private String subject;

    public Mail(String fromMail, String toMail, String body, String subject) {
        this.fromMail = fromMail;
        this.toMail = toMail;
        this.body = body;
        this.subject = subject;
    }

    public Mail() {
    }

    public String getToMail() {
        return toMail;
    }

    public void setToMail(String toMail) {
        this.toMail = toMail;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFromMail() {
        return fromMail;
    }

    public void setFromMail(String fromMail) {
        this.fromMail = fromMail;
    }
}
