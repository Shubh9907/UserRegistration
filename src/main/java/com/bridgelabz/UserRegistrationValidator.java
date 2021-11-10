package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationValidator {

    public static final String NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([_+-.][a-zA-Z0-9]+)?[@][a-z]{2,}[.][a-z]{2,4}([.][a-z]{2,3})?$";
    public static final String PHONE_NUMBER_PATTERN = "^[0-9]{2}[\\s][1-9][0-9]{9}";
    public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$&*])[A-Za-z0-9@#$&*]{8,}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(NAME_PATTERN,firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(NAME_PATTERN,lastName);
    }

    public boolean validateEmail(String emailId) {
        return Pattern.matches(EMAIL_PATTERN, emailId);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        return Pattern.matches(PHONE_NUMBER_PATTERN, phoneNumber);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches(PASSWORD_PATTERN, password);
    }
}
