import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class LoginSystem {

    public static void login(String username, String password)
            throws InvalidUsernameException, WeakPasswordException {

        if (username == null || username.trim().isEmpty()) {
            throw new InvalidUsernameException("Invalid Username");
        }

        if (password.length() < 6) {
            throw new WeakPasswordException("Weak Password");
        }

        System.out.println("Login Successful");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            login(username, password);

        } catch (InvalidUsernameException | WeakPasswordException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
