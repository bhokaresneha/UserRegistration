package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of email you want to validate");
        int n=UserRegistration.scanner.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println("\nEnter email address: ");
            String mail = scanner.next();
            boolean result=checkMails(mail);
            System.out.print("Result=>"+result);

        }
    }
    static boolean checkMails(String mail) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._]*@[a-z0-9]{1,}+.[a-z]{2,3}+.[a-z]{2,}$");
        return pattern.matcher(mail).matches();
    }
}