package entities;

import exception.WrongLoginException;
import lombok.NonNull;

public class Password extends AuthData {
    @NonNull
    public Password(String password) {
        if (!password.matches(REGEX)) {
            throw new WrongLoginException("Invalid password.");
        }
        data = password;
    }
}
