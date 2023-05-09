package com.satishit.logical.tenthset;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddressOfGivenWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website url:"); // www.flipkart.com
        String wesite = sc.nextLine();
        //Logic for finding the ip-address of the given website url
        try{
            InetAddress ip = InetAddress.getByName(wesite);
            System.out.println("Ip address of the given website URL is: "+ip);
        }catch (UnknownHostException e){
            e.printStackTrace();
            System.out.println("User has inputted an invalid website URL address");

        }

    }
}
