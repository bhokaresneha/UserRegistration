package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
        // Scanner class object creation to take input from user through that object
    public static final Scanner scanner = new Scanner(System.in);

    // validFirstName() method used to validate the users First Name
          public static void validFirstName()
            {
                System.out.print("Enter the First Name (First Latter Must be Capital ): ");
                //Taking Input from the User
                String name = scanner.next();
                //Regular Expression For Validating First Name
                String regex = "^[A-Z]{1}[a-z]{2,}$";

                /* the pattern is created using the Pattern.compile() method.
                 - passing regexPassword- which pattern is being searched for and the search should be case-insensitive
                * The matcher() method is used to search for the pattern in a string.
                 -It returns a Matcher object which contains information about the search that was performed.
                * The matches() method returns true if the pattern was found in the string and false if it was not found.
                */

                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(name);
                boolean r = m.matches();
                   if (r)
                        System.out.println("First name is valid");
                   else
                        System.out.println("First name is !Invalid");
             }

    // validLastName() method used to validate the users Last Name
            public static void validLastName() {
                System.out.print("Enter the Last Name (First Latter Must be Capital): ");
                //Taking Input from the User
                String lastname = scanner.next();
                //Regular Expression For Validating Last Name
                String regexlastname = "^[A-Z]{1}[a-z]{2,}$";

                /* the pattern is created using the Pattern.compile() method.
                 - passing regexPassword- which pattern is being searched for and the search should be case-insensitive
                * The matcher() method is used to search for the pattern in a string.
                 -It returns a Matcher object which contains information about the search that was performed.
                * The matches() method returns true if the pattern was found in the string and false if it was not found.
                */
                Pattern p1 = Pattern.compile(regexlastname);
                Matcher m1 = p1.matcher(lastname);
                boolean r1 = m1.matches();
                if (r1)
                    System.out.println("Last Name is valid");
                else
                    System.out.println("Last Name is !Invalid");
            }


    // validEmail() method used to validate the users Email Address
            public static void validEmail()
            {
                System.out.print("Enter the Email : ");
                //Taking Input from the User
                String email = scanner.next();
                //Regular Expression For Validating Email Address
                String regexEmail = "^[a-zA-Z0-9._]+@[a-z0-9]+.[a-z]{2,3}+.[a-z]{2,}$";

                /* the pattern is created using the Pattern.compile() method.
                 - passing regexPassword- which pattern is being searched for and the search should be case-insensitive
                * The matcher() method is used to search for the pattern in a string.
                 -It returns a Matcher object which contains information about the search that was performed.
                * The matches() method returns true if the pattern was found in the string and false if it was not found.
                */
                Pattern p2 = Pattern.compile(regexEmail);
                Matcher m2 = p2.matcher(email);
                boolean r2 = m2.matches();
                if (r2)
                    System.out.println("Email is valid.");
                else
                    System.out.println("Email is invalid.");

            }

    // validMobileNumber() method used to validate the users Mobile Number
            public static  void validMobileNumber()
            {
                System.out.println("Enter your mobile number (eg: Country-code Mobile no - 91 1234567890 ) : ");
                //Taking Input from the User
                String phoneNo = scanner.next();
                //Regular Expression For Validating Phone Number
                String regexPhoneno = "^[0-9]{2}\\s[0-9]{10}$";

                /* the pattern is created using the Pattern.compile() method.
                 - passing regexPassword- which pattern is being searched for and the search should be case-insensitive
                * The matcher() method is used to search for the pattern in a string.
                 -It returns a Matcher object which contains information about the search that was performed.
                * The matches() method returns true if the pattern was found in the string and false if it was not found.
                */
                Pattern p3 = Pattern.compile(regexPhoneno);
                Matcher m3 = p3.matcher(phoneNo);
                boolean r3 = m3.matches();
                if (r3)
                    System.out.println("Phone number is Valid");
                else
                    System.out.println("Phone number is Invalid");

            }

    // validatePassword() method used to validate the users Password
            public static void validatePassword()
            {
               System.out.println("Enter Password ");
                //Taking Input from the User
               String password=scanner.next();

               /*Regular Expression For Validating Password        */
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
                   System.out.println("Password is Invalid ");
            }

}
