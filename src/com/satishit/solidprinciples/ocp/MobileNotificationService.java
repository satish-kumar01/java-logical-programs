package com.satishit.solidprinciples.ocp;

public class MobileNotificationService implements NotificationService{

    @Override
    public void sendOTP(String medium) {
        //write the logic to send otp to mobile
    }

    @Override
    public void sendTransactionReport(String medium) {
        //write the logic to send otp to mobile twillo api
    }
}
