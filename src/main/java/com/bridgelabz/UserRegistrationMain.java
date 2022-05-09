package com.bridgelabz;
import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Choice \n1.Validate First Name  \n2.Validate Last Name");
        int Option = scanner.nextInt();
        switch (Option) {
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
            default:
                System.out.println("Enter Valid Choice");

        }
    }
}