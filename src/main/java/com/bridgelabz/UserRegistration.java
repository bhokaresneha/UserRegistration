package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    public static final Scanner scanner = new Scanner(System.in);
    static boolean r;

          public static boolean validFirstName()
            {
                System.out.print("Enter the First Name (First Latter Must be Capital ): ");
                String name = scanner.next();
                if (name.length() >= 3 )
                {
                    String regex = "^[A-Z]{1}[a-z]{2,}$";
                    Pattern p = Pattern.compile(regex);
                    Matcher m = p.matcher(name);
                    r = m.matches();

                    if (r)
                        System.out.println("First name is valid");
                    else
                        System.out.println("First name is !Invalid");
                } else
                {
                    System.out.print(" Minimum 3 Character Required");
                }
                return r;

            }

            public static boolean validLastName()
            {
                System.out.print("Enter the Last Name (First Latter Must be Capital): ");
                String name = scanner.next();

                if (name.length() >= 3 )
                {
                    String regex = "^[A-Z]{1}[a-z]{2,}$";
                    Pattern p = Pattern.compile(regex);
                    Matcher m = p.matcher(name);
                    r = m.matches();
                    if (r)
                        System.out.println("Last Name is valid");
                    else
                        System.out.println("Last Name is !Invalid");
                } else
                {
                    System.out.print(" Minimum 3 Character Required");
                }
                return r;
            }

            public static boolean validEmail()
            {
                System.out.print("Enter the Email : ");
                String email = scanner.next();
                //sneha_90@hotmail.com.in
                String regex = "^[a-zA-Z0-9._]+@[a-z0-9]+.[a-z]{2,3}+.[a-z]{2,}$";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(email);
                boolean r = m.matches();

                if (r)
                    System.out.println("Email is valid.");
                else
                    System.out.println("Email is invalid.");
                return r;
            }

            public static boolean validMobileNumber()
            {
                System.out.println("Enter your mobile number (eg: Country-code Mobile no - 91 1234567890 ) : ");
                String phoneNo = scanner.next();
                String regex3 = "^[0-9]{2}\\s[0-9]{10}$";
                Pattern p3 = Pattern.compile(regex3);
                Matcher m3 = p3.matcher(phoneNo);
                boolean r3 = m3.matches();
                if (r3)
                    System.out.println("Phone number is Valid");
                else
                    System.out.println("Phone number is Invalid");
                return r3;
            }

}