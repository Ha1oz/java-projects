package entities;

import exception.WrongLoginException;
import exception.WrongPasswordException;
import lombok.NonNull;

public class Password extends AuthData {
    @NonNull
    public Password(String password) {
        if (!password.matches(REGEX)) {
            throw new WrongPasswordException("Invalid password.");
        }
        data = password;
    }
}
