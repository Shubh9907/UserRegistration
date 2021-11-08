package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    public static void firstName(){
        System.out.println("Enter first name");
        String firstName = sc.next();
        String regex="^[a-zA-Z]{2,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Your input is Invalid");
            firstName();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        firstName();
    }
}
