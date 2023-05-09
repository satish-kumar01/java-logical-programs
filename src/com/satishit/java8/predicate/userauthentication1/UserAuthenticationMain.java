package com.satishit.java8.predicate.userauthentication1;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthenticationMain {
    public static void main(String[] args) {
        Predicate<User> p = user -> user.userName.equals("satish") && user.pwd.equals("java");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = sc.next();

        System.out.println("Enter Pasword: ");
        String pwd = sc.next();

        User user = new User(username,pwd);
        if (p.test(user)){
            System.out.println("Valid user,you can get all services");
        }else {
            System.out.println("Invalid user, Please login again..");
        }
    }
}
