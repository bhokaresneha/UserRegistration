package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();

    @Test
    public void testFor_Valid_FirstName(){
      try
      {
          Assertions.assertTrue(userRegistration.validFirstName("Sneha"));
          //Assert.assertTrue() methods checks whether the expected value is true or not.
      } catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    @Test
    public void testFor_Valid_LastName(){
        try
        {
            Assertions.assertTrue(userRegistration.validLastName("Bhokare"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void testFor_Valid_Email(){
        try
        {
            Assertions.assertTrue(userRegistration.validEmail("bhokare100@gmail.com.net"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    @Test
    public void testFor_Valid_Mobilenumber(){
        try
        {
            Assertions.assertTrue(userRegistration.validMobileNumber("91 9762689841"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    @Test
    public void testFor_Valid_Password(){
        try
        {
            Assertions.assertTrue(userRegistration.validatePassword("Sneha@12"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    //Tests For Invalid Output
    @Test
    public void testFor_Invalid_FirstName(){
        try
        {
            Assertions.assertFalse(userRegistration.validFirstName("sneha"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    @Test
    public void testFor_Invalid_LastName(){
        try
        {
            Assertions.assertFalse(userRegistration.validLastName("bhokare"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void testFor_Invalid_Email(){
        try
        {
            Assertions.assertFalse(userRegistration.validEmail("bhokare100@.com.net"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    @Test
    public void testFor_Invalid_Mobilenumber(){
        try
        {
            Assertions.assertFalse(userRegistration.validMobileNumber("91 97626899841"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    @Test
    public void testFor_Invalid_Password(){
        try
        {
            Assertions.assertFalse(userRegistration.validatePassword("Sneha@1245"));
        }
        catch (InvalidUserDataException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }


}

