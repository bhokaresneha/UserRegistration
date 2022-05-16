package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    public static final Scanner scanner = new Scanner(System.in);
    static boolean r;

    public static boolean validFirstName(String fname)
    {
            /*    System.out.print("Enter the First Name (First Latter Must be Capital ): ");
                    String name = scanner.next();
                */
        String regex = "^[A-Z]{1}[a-z]{2,}$";
                 /* the pattern is created using the Pattern.compile() method.
                 - passing regexPassword- which pattern is being searched for and the search should be case-insensitive
                * The matcher() method is used to search for the pattern in a string.
                 -It returns a Matcher object which contains information about the search that was performed.
                * The matches() method returns true if the pattern was found in the string and false if it was not found.
                */
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fname);
        r = m.matches();
        if (r)
            System.out.println("First name is valid");
        else
            throw new InvalidUserDataException(fname + "Invalid input");

        return r;

    }

    public static boolean validLastName(String lastname)
    {
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
    }

    public static boolean validEmail(String email)
    {
                /*System.out.print("Enter the Email : ");
                String email = scanner.next();
                */
        //sneha_90@hotmail.com.in
        String regexEmail =("^[a-zA-Z0-9._]*@[a-z0-9]{1,}+.[a-z]{2,3}+.[a-z]{2,}$" );
        Pattern p2 = Pattern.compile(regexEmail);
        Matcher m2 = p2.matcher(email);
        boolean r2 = m2.matches();
        if (r2)
            System.out.println("Email is valid.");
        else
            throw new InvalidUserDataException(email + "Invalid input");
        return r2;
    }

    public static boolean validMobileNumber(String phoneNo)
    {
                /*System.out.println("Enter your mobile number (eg: Country-code Mobile no - 91 1234567890 ) : ");
                String phoneNo = scanner.next();*/

        String regexPhoneno = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern p3 = Pattern.compile(regexPhoneno);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3)
            System.out.println("Phone number is Valid");
        else
            throw new InvalidUserDataException(phoneNo + "Invalid input");
        return r3;
    }
    public static boolean validatePassword(String password)
    {
              /* System.out.println("Enter Password ");
               String password=scanner.next();*/
        //Regular Expression For Validating Password
        String regexPassword="^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8}$";

        /*       *    (?=.*[0-9]) represents a digit must occur at least once.
         *    (?=.*[a-z]) represents a lower case alphabet must occur at least once.
         *    (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
         *    (?=.*[@#$%^&-+=()]) represents a special character that must occur at least once.
         *    {8} represents at least 8 characters.
         */
        Pattern p4=Pattern.compile(regexPassword);
        Matcher m4=p4.matcher(password);
        boolean r4=m4.matches();
        if(r4)
            System.out.println("Password is valid");
        else
            throw new InvalidUserDataException(password + "Invalid input");
        return r4;
    }

}