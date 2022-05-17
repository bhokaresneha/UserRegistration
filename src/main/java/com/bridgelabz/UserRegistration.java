package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface Validation{
  boolean validate(String name) throws InvalidUserDataException ;

}

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);
    static boolean r;

          static Validation checkFname= fname->{

            /*
              System.out.print("Enter the First Name (First Latter Must be Capital ): ");
                    String name = scanner.next();
                */
            if (fname == null) {
                throw new InvalidUserDataException("Null Pointer Exception");
            } else if (fname.length() == 0) {
                throw new InvalidUserDataException("Empty Exception ");
            }

            String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fname);
        r = m.matches();
        if (r)
            System.out.println("First name is valid");
        else
            throw new InvalidUserDataException(fname + "Invalid input");

        return r;

    };

     Validation checkLname= lastname->{

          if (lastname == null) {
            throw new InvalidUserDataException("Null Pointer Exception");
        } else if (lastname.length() == 0) {
            throw new InvalidUserDataException("Empty Exception ");
        }
             /*   System.out.print("Enter the Last Name (First Latter Must be Capital): ");
                String lastname = scanner.next();
            */
        String regexlastname = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p1 = Pattern.compile(regexlastname);
        Matcher m1 = p1.matcher(lastname);
        boolean r1 = m1.matches();
        if (r1)
            System.out.println("Last Name is valid");
        else
            throw new InvalidUserDataException(lastname + "Invalid input");
        return r1;
    };

         Validation checkEmail= email->{

                /*System.out.print("Enter the Email : ");
                String email = scanner.next();
                */
             //sneha_90@hotmail.com.in

        if (email == null) {
            throw new InvalidUserDataException("Null Pointer Exception");
        } else if (email.length() == 0) {
            throw new InvalidUserDataException("Empty Exception ");
        }
        String regexEmail = "^[a-zA-Z0-9._]+@[a-z0-9]+.[a-z]{2,3}+.[a-z]{2,}$";
        Pattern p2 = Pattern.compile(regexEmail);
        Matcher m2 = p2.matcher(email);
        boolean r2 = m2.matches();
        if (r2)
            System.out.println("Email is valid.");
        else
            throw new InvalidUserDataException(email + "Invalid input");
        return r2;
    };

    Validation checkMobileNumber= phoneNo->{

    /* static boolean validMobileNumber(String phoneNo)throws InvalidUserDataException {
                System.out.println("Enter your mobile number (eg: Country-code Mobile no - 91 1234567890 ) : ");
                String phoneNo = scanner.next();*/
        if (phoneNo == null) {
            throw new InvalidUserDataException("Null Pointer Exception");
        } else if (phoneNo.length() == 0) {
            throw new InvalidUserDataException("Empty Exception ");
        }
        String regexPhoneno = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern p3 = Pattern.compile(regexPhoneno);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3)
            System.out.println("Phone number is Valid");
        else
            throw new InvalidUserDataException(phoneNo + "Invalid input");
        return r3;
    };

    Validation checkPassword= password->{

        /*public static boolean validatePassword(String password)throws InvalidUserDataException {
               System.out.println("Enter Password ");
               String password=scanner.next();*/
        //Regular Expression For Validating Password
        if (password == null) {
            throw new InvalidUserDataException("Null Pointer Exception");
        } else if (password.length() == 0) {
            throw new InvalidUserDataException("Empty Exception ");
        }
        String regexPassword = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8}$";

        /*       *    (?=.*[0-9]) represents a digit must occur at least once.
         *    (?=.*[a-z]) represents a lower case alphabet must occur at least once.
         *    (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
         *    (?=.*[@#$%^&-+=()]) represents a special character that must occur at least once.
         *    {8} represents at least 8 characters.
         */
        Pattern p4 = Pattern.compile(regexPassword);
        Matcher m4 = p4.matcher(password);
        boolean r4 = m4.matches();
        if (r4)
            System.out.println("Password is valid");
        else
            throw new InvalidUserDataException(password + "Invalid input");
        return r4;
    };

}

