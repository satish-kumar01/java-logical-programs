package com.satishit.solidprinciples.ocp;

public class EmailNotificationService implements NotificationService{

    @Override
    public void sendOTP(String medium) {
        //write logic to integrate with email API
    }

    @Override
    public void sendTransactionReport(String medium) {
        //write logic to integrate with email API
    }
}
