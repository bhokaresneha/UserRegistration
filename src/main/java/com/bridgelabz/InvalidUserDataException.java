package com.bridgelabz;

public class InvalidUserDataException extends Exception {
        String message;
        public InvalidUserDataException(String message){
            super(message);
        }
    }

