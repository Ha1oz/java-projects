import entities.Login;
import entities.Password;
import exception.WrongLoginException;
import exception.WrongPasswordException;
import utils.Authentication;

public class Main {
    public static void main(String[] args) {
        try {
            Authentication.Auth("null", "11111", "11111");
        } catch (WrongLoginException e) {
            System.out.println("Error in login: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Error in password: " + e.getMessage());
        }
        System.out.println();
        try {
            Authentication.Auth(new Login("qqqq"), new Password("1245"), new Password("12345"));
        } catch (WrongLoginException e) {
            System.out.println("Error in login: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Error in password: " + e.getMessage());
        }
    }
}
