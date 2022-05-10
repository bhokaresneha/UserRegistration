package com.bridgelabz;
import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Enter Your Choice \n1.Validate First Name  \n2.Validate Last Name \n3.Validate Email");
            int Option = scanner.nextInt();
            switch (Option) {
                case 1:
                    UserRegistration.validFirstName();
                    break;
                case 2:
                    UserRegistration.validLastName();
                    break;
                case 3:
                    UserRegistration.validEmail();
                    break;
                default:
                    System.out.println("Enter Valid Choice");
            }
            System.out.println("If you want to perform more validations then press 1");
            choice = UserRegistration.scanner.nextInt();
        } while (choice == 1);       
    }
}