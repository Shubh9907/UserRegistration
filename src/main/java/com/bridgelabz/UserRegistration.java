package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface ValidateUserEntry {
    boolean validate(String x, String y);
}

public class UserRegistration {

    public static final String NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([_+-.][a-zA-Z0-9]+)?[@][a-z]{2,}[.][a-z]{2,4}([.][a-z]{2,3})?$";
    public static final String PHONE_NUMBER_PATTERN = "^[0-9]{2}[\\s][1-9][0-9]{9}";
    public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$&*])[A-Za-z0-9@#$&*]{8,}$";

    static ValidateUserEntry isValid = (x,y) -> Pattern.matches(x,y);

    static Scanner sc = new Scanner(System.in);

    public static void isValid() {
        validateFirstName();
        validateLastName();
        validateEmailId();
        validatePhoneNumber();
        validatePassword();
    }

    /*
    Method to get user's first name
     */
    public static void validateFirstName() {
        System.out.println("Enter First Name");
        String firstName = sc.nextLine();
        if (isValid.validate(NAME_PATTERN,firstName)) System.out.println("valid");
        else {
            System.out.println("Invalid");
            validateFirstName(); // Recursively calling validateFirstName() if the user input is invalid
        }
    }

    /*
    Method to get user's last name
     */
    public static void validateLastName() {
        System.out.println("Enter Last Name");
        String lastName = sc.nextLine();
        if (isValid.validate(NAME_PATTERN,lastName)) System.out.println("valid");
        else {
            System.out.println("Invalid");
            validateLastName(); // Recursively calling validateLastName() if the user input is invalid
        }
    }

    /*
    Method to validate user's email id
     */
    public static void validateEmailId() {
        System.out.println("Enter Email Id");
        String emailId = sc.nextLine();
        if (isValid.validate(EMAIL_PATTERN,emailId)) System.out.println("valid");
        else {
            System.out.println("Invalid");
            validateEmailId(); // Recursively calling validateEmailId() if the user input is invalid
        }
    }

    /*
    Method to validate Phone Number
     */
    public static void validatePhoneNumber() {
        System.out.println("Enter Mobile Number (eg. 91 1234567890)");
        String phoneNumber = sc.nextLine();
        if (isValid.validate(PHONE_NUMBER_PATTERN,phoneNumber)) System.out.println("valid");
        else {
            System.out.println("Invalid");
            validatePhoneNumber(); // Recursively calling validatePhoneNumber() if the user input is invalid
        }
    }

    /*
    Method to validate password entered by user
     */
    public static void validatePassword() {
        System.out.println("Enter password (contains minimum 8 characters, combination of lower, upper case, numbers and special characters )");
        String password = sc.nextLine();
        if (isValid.validate(PASSWORD_PATTERN,password)) System.out.println("valid");
        else {
            System.out.println("Invalid");
            validatePassword(); // Recursively calling validatePassword() if the user input is invalid
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        isValid();
    }
}
