package utils;

import entities.Login;
import entities.Password;
import exception.WrongLoginException;
import exception.WrongPasswordException;
import lombok.Getter;
import lombok.NonNull;

import java.io.Writer;

public class Authentication {
    private static final String REGEX_FOR_LOGIN = "^[a-zA-Z0-9_]{1,20}$";
    private static final String REGEX_FOR_PASSWORD = "^[a-zA-Z0-9]{1,20}$";
    @NonNull
    public static void auth(String login, String password, String confirmPassword){
        System.out.println("Authentication...");
        if(!login.matches(REGEX_FOR_LOGIN)){
            throw new WrongLoginException("Invalid login data.");
        }
        if(!password.matches(REGEX_FOR_PASSWORD)){
            throw new WrongPasswordException("Invalid password data.");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Passwords do not match.");
        }
        System.out.println("Authentication successful!!!");
    }
    @NonNull
    public static void auth(Login login, Password password, Password confirmPassword){
        System.out.println("Authentication...");
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Passwords do not match.");
        }
        System.out.println("Authentication successful!!!");
    }
}
