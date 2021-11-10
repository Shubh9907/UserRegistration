package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailValidationTest {
    @Test
    public void given_1_Email_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc@yahoo.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void given_2_Email_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc-100@yahoo.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void given_3_Email_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc.100@yahoo.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void given_4_Email_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc111@abc.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void given_5_Email_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc-100@abc.net");
        Assertions.assertTrue(result);
    }

    @Test
    public void given_6_Email_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc.100@abc.com.au");
        Assertions.assertTrue(result);
    }

    @Test
    public void given_7_Email_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc@one.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void given_8_Email_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc@gmail.com.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void given_9_Email_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc+100@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void given_10_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_11_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc@.com.my");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_12_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc123@gmail.a");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_13_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc123@.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_14_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc123@.com.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_15_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail(".abc@abc.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_16_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc()*@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_17_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc@%*.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_18_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc..2000@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_19_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc.@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_20_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc@abc@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_21_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc@gmail.com.1a");
        Assertions.assertFalse(result);
    }

    @Test
    public void given_22_Email_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidator validator = new UserRegistrationValidator();
        boolean result = validator.validateEmail("abc@gmail.com.aa.au");
        Assertions.assertFalse(result);
    }
}
