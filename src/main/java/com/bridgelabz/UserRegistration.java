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
                String lastname = scanner.next();

                if (lastname.length() >= 3 )
                {
                    String regexlastname = "^[A-Z]{1}[a-z]{2,}$";
                    Pattern p1 = Pattern.compile(regexlastname);
                    Matcher m1 = p1.matcher(lastname);
                    boolean r1 = m1.matches();
                    if (r1)
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
                String regexEmail = "^[a-zA-Z0-9._]+@[a-z0-9]+.[a-z]{2,3}+.[a-z]{2,}$";
                Pattern p2 = Pattern.compile(regexEmail);
                Matcher m2 = p2.matcher(email);
                boolean r2 = m2.matches();
                if (r2)
                    System.out.println("Email is valid.");
                else
                    System.out.println("Email is invalid.");
                return r2;
            }

            public static boolean validMobileNumber()
            {
                System.out.println("Enter your mobile number (eg: Country-code Mobile no - 91 1234567890 ) : ");
                String phoneNo = scanner.next();
                String regexPhoneno = "^[0-9]{2}\\s[0-9]{10}$";
                Pattern p3 = Pattern.compile(regexPhoneno);
                Matcher m3 = p3.matcher(phoneNo);
                boolean r3 = m3.matches();
                if (r3)
                    System.out.println("Phone number is Valid");
                else
                    System.out.println("Phone number is Invalid");
                return r3;
            }
            public static boolean validatePassword()
            {
               System.out.println("Enter Password ");
               String password=scanner.next();
               String regexPassword="^[a-zA-Z]{8}$";
               Pattern p4=Pattern.compile(regexPassword);
               Matcher m4=p4.matcher(password);
               boolean r4=m4.matches();
               if(r4)
                   System.out.println("Password is valid");
               else
                   System.out.println("Password is Invalid ");
               return r4;
            }

}