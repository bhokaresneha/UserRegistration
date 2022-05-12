package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void testFor_Valid_FirstName(){
        UserRegistration userRegistration=new UserRegistration();
        boolean Firstname= userRegistration.validFirstName("Sneha");
        //Assert.assertTrue() methods checks whether the expected value is true or not.
        Assertions.assertTrue(Firstname);

    }

    @Test
    public void testFor_Valid_LastName(){
        UserRegistration userRegistration=new UserRegistration();
        boolean Lastname= userRegistration.validLastName("Bhokare");
        Assertions.assertTrue(Lastname);

    }
    @Test
    public void testFor_Valid_Email(){
        UserRegistration userRegistration=new UserRegistration();
        boolean email= userRegistration.validEmail("bhokare100@gmail.com.net");
        Assertions.assertTrue(email);

    }

    @Test
    public void testFor_Valid_Mobilenumber(){
        UserRegistration userRegistration=new UserRegistration();
        boolean phonenumber= userRegistration.validMobileNumber("91 9762689841");
        Assertions.assertTrue(phonenumber);

    }

    @Test
    public void testFor_Valid_Password(){
        UserRegistration userRegistration=new UserRegistration();
        boolean password=userRegistration.validatePassword("Sneha@12");
        Assertions.assertTrue(password);
    }
    //Tests For Invalid Output
    @Test
    public void testFor_Invalid_FirstName(){
        UserRegistration userRegistration=new UserRegistration();
        boolean Firstname= userRegistration.validFirstName("sneha");
        Assertions.assertFalse(Firstname);

    }

    @Test
    public void testFor_Invalid_LastName(){
        UserRegistration userRegistration=new UserRegistration();
        boolean Lastname= userRegistration.validLastName("bhokare");
        Assertions.assertFalse(Lastname);

    }
    @Test
    public void testFor_Invalid_Email(){
        UserRegistration userRegistration=new UserRegistration();
        boolean email= userRegistration.validEmail("bhokare100@.com.net");
        Assertions.assertFalse(email);

    }

    @Test
    public void testFor_Invalid_Mobilenumber(){
        UserRegistration userRegistration=new UserRegistration();
        boolean phonenumber= userRegistration.validMobileNumber("91 97626899841");
        Assertions.assertFalse(phonenumber);

    }

    @Test
    public void testFor_Invalid_Password(){
        UserRegistration userRegistration=new UserRegistration();
        boolean password=userRegistration.validatePassword("Sneha@1245");
        Assertions.assertFalse(password);
    }
}
