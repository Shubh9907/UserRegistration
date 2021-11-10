package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserRegistrationValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateFirstName("Shubham");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateLastName("Verma");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validatePhoneNumber("91 1234567890");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validatePassword("Abcd@123");
        Assertions.assertTrue(result);
    }
}
