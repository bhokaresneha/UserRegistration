package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();

    // test for Null Input
    @Test
    public void testFor_NULL(){
        try
        {
            Assertions.assertTrue(UserRegistration.checkFname.validate(" "));
            //Assert.assertTrue() methods checks whether the expected value is true or not.
        } catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    // Test Case For Valid FirstName
    @Test
    public void testFor_Valid_FirstName(){
      try
      {
          Assertions.assertTrue(UserRegistration.checkFname.validate("Sneha"));
          //Assert.assertTrue() methods checks whether the expected value is true or not.
      } catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    // Test Case For Valid LastName
    @Test
    public void testFor_Valid_LastName(){
        try
        {
            Assertions.assertTrue(userRegistration.checkLname.validate("Bhokare"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    // Test Case For Valid Email
    @Test
    public void testFor_Valid_Email(){
        try
        {
            Assertions.assertTrue(userRegistration.checkEmail.validate("bhokare100@gmail.com.net"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    // Test Case For Valid Mobile Number
    @Test
    public void testFor_Valid_Mobilenumber(){
        try
        {
            Assertions.assertTrue(userRegistration.checkMobileNumber.validate("91 9762689841"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    // Test Case For Valid Password
    @Test
    public void testFor_Valid_Password(){
        try
        {
            Assertions.assertTrue(userRegistration.checkPassword.validate("Sneha@12"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    //Test cases For Invalid Output

    // Test Case For Invalid First Name
    @Test
    public void testFor_Invalid_FirstName(){
        try
        {
            Assertions.assertFalse(UserRegistration.checkFname.validate("sneha"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    // Test Case For Invalid Last Name
    @Test
    public void testFor_Invalid_LastName(){
        try
        {
            Assertions.assertFalse(userRegistration.checkLname.validate("bhokare"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    // Test Case For Invalid Email
    @Test
    public void testFor_Invalid_Email(){
        try
        {
            Assertions.assertFalse(userRegistration.checkEmail.validate("bhokare100@.com.net"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    // Test Case For Invalid Mobile Number
    @Test
    public void testFor_Invalid_Mobilenumber(){
        try
        {
            Assertions.assertFalse(userRegistration.checkMobileNumber.validate("91 97626899841"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    // Test Case For Invalid Password
    @Test
    public void testFor_Invalid_Password(){
        try
        {
            Assertions.assertFalse(userRegistration.checkPassword.validate("Sneha@1245"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }


}

