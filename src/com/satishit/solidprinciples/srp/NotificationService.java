package com.satishit.solidprinciples.srp;

public class NotificationService {

    public void sendOTP(String medium){
        if (medium.equals("email")){
            //Write email related logic use JavaMailSenderApi
        }
        if (medium.equals("mobile")){
            //write logic using twillio API
        }
    }
}
