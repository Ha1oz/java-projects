package entities;

import exception.WrongLoginException;
import lombok.NonNull;

public class Login extends AuthData {
    @NonNull
    public Login(String login) {
        if (!login.matches(REGEX)) {
            throw new WrongLoginException("Invalid login.");
        }
        data = login;
    }
}
