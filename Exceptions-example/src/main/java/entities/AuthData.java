package entities;

import lombok.NonNull;

import java.util.Objects;

public abstract class AuthData {
    protected final String REGEX = "^[a-zA-Z0-9_]{1,20}$";
    protected String data;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthData authData = (AuthData) o;
        return Objects.equals(data, authData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
