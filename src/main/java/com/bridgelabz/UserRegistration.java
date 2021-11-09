package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    /*
    Method to get user's first name
     */
    public static void firstName(){
        System.out.println("Enter first name");
        String firstName = sc.nextLine();
        String regex="^[A-Z][a-z]{2,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("Valid");
        }else {
            System.out.println("Your input is Invalid");
            firstName(); // Recursively calling firstName() if the user input is invalid
        }
    }
    /*
    Method to get user's last name
     */
    public static void lastName(){
        System.out.println("Enter last name");
        String lastName = sc.nextLine();
        String regex="^[A-Z][a-z]{3,}$";
        boolean b = Pattern.matches(regex,lastName); // If these strings matches it returns true
        if (b==true){
            System.out.println("Valid");
        }else {
            System.out.println("Your input is invalid");
            lastName(); // Recursively calling lastName() if the user input is invalid
        }
    }
    /*
    Method to validate user's email id
     */
    public static void validEmail(){
        System.out.println("Enter Email Id");
        String emailId = sc.nextLine();
        String regex = "^[a-zA-Z0-9]+([_+-.][a-zA-Z0-9]+)?[@][a-z]{2,}[.][a-z]{2,4}([.][a-z]{2,3})?$";
        boolean b = Pattern.matches(regex, emailId); // if matches then return true
        if (b==true){
            System.out.println("Valid");
        }else {
            System.out.println("Your input is invalid");
            validEmail(); // Recursively calling validEmail() if the user input is invalid
        }
    }
    /*
    Method to validate Phone Number
     */
    public static void phoneNumber(){
        System.out.println("Enter Mobile Number (eg. 91 1234567890)");
        String phoneNumber = sc.nextLine();
        String regex = "^[0-9]{2}[\\s][1-9][0-9]{9}";
        boolean b = Pattern.matches(regex,phoneNumber); // if matches then return true else false
        if (b==true){
            System.out.println("Valid");
        }else {
            System.out.println("Your input is invalid");
            phoneNumber(); // recursively calling phoneNumber() if the user input is invalid
        }
    }
    /*
    Method to validate password entered by user
     */
    public static void validatePassword(){
        System.out.println("Enter password (contains minimum 8 characters, combination of lower, upper case, numbers and special characters )");
        String pass = sc.nextLine();
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$&*])[A-Za-z0-9@#$&*]{8,}$";
        boolean b = Pattern.matches(regex, pass); // if matches then return true
        if (b==true){
            System.out.println("Valid");
        }else {
            System.out.println("Your input is invalid");
            validatePassword(); // Recursively calling validatePassword() if the user input is invalid
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        firstName();
        lastName();
        validEmail();
        phoneNumber();
        validatePassword();
    }
}
