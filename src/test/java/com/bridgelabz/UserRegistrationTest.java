package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();

    @Test
    public void testFor_Valid_FirstName(){
        boolean Firstname= userRegistration.validFirstName("Sneha");
        //Assert.assertTrue() methods checks whether the expected value is true or not.
        Assertions.assertTrue(Firstname);

    }

    @Test
    public void testFor_Valid_LastName(){
        boolean Lastname= userRegistration.validLastName("Bhokare");
        Assertions.assertTrue(Lastname);

    }
    @Test
    public void testFor_Valid_Email(){

        boolean email= userRegistration.validEmail("abc@yahoo.com.net");
        Assertions.assertTrue(email);

    }

    @Test
    public void testFor_Valid_Mobilenumber(){

        boolean phonenumber= userRegistration.validMobileNumber("91 9762689841");
        Assertions.assertTrue(phonenumber);

    }

    @Test
    public void testFor_Valid_Password(){

        boolean password=userRegistration.validatePassword("Sneha@12");
        Assertions.assertTrue(password);
    }
    //Tests For Invalid Output
    @Test
    public void testFor_Invalid_FirstName(){

        boolean Firstname= userRegistration.validFirstName("sneha");
        Assertions.assertFalse(Firstname);

    }

    @Test
    public void testFor_Invalid_LastName(){
        boolean Lastname= userRegistration.validLastName("bhokare");
        Assertions.assertFalse(Lastname);

    }
    @Test
    public void testFor_Invalid_Email(){

        boolean email= userRegistration.validEmail("bhokare100@.com.net");
        Assertions.assertFalse(email);

    }

    @Test
    public void testFor_Invalid_Mobilenumber(){
        boolean phonenumber= userRegistration.validMobileNumber("91 97626899841");
        Assertions.assertFalse(phonenumber);

    }

    @Test
    public void testFor_Invalid_Password(){
        boolean password=userRegistration.validatePassword("Sneha@1245");
        Assertions.assertFalse(password);
    }
    @Test
    public void testFor_valid_MultipleEmail(){
        ArrayList<String> emails =new ArrayList<>(Arrays.asList("abc@yahoo.com.net","abc100@yahoo.com.in","abc.100@yahoo.com.in","abc111@abc.com.edu","abc0@abc.net.com"));
        for(int i = 0;i< emails.size();i++) {
            boolean password = userRegistration.validEmail(emails.get(i));
            Assertions.assertTrue(password);
        }
        }
        @Test
        public void testFor_Invalid_MultipleEmail(){
            ArrayList<String> emails =new ArrayList<>(Arrays.asList("abc@.com.my","abc","abc@abc.com","abc@gmail.com.1a","abc0@abc.n"));
            for(int i = 0;i< emails.size();i++){
                boolean password=userRegistration.validEmail(emails.get(i));
                Assertions.assertFalse(password);

            }



        }

}

