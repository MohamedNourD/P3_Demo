package Users;

import java.util.regex.*;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userType;
    public User(String firstName, String lastName, String email, String password, String userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public User() {}

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean createAccount(String firstName, String lastName, String email, String password1, String password2) {
        try {
            if (firstName.isEmpty())
                throw new EmptyString();

            else
                this.firstName=firstName;
        }
        catch (EmptyString e) {
            System.out.println("The first name is empty!");
            return false;
        }
        try {
            if (lastName.isEmpty())
                throw new EmptyString();
            else
                this.lastName=lastName;
        }
        catch (EmptyString e) {
            System.out.println("The last name is empty!");
            return false;
        }
        try {
            if (email.isEmpty())
                throw new EmptyString();
            else {
                if (isValidEmail(email))
                    this.email = email;
                else
                    throw new NotValidEmail();
            }
        }
        catch (EmptyString e) {
            System.out.println("The email is empty!");
            return false;
        }
        catch (NotValidEmail e) {
            System.out.println("The email is Invalid!");
            return false;
        }
        try {
            if (password1.isEmpty())
                throw new EmptyString();
            else {
                if (password1 == password2)
                    this.password = password1;
                else
                    throw new PasswordMismatching();
            }
        }
        catch (EmptyString e) {
            System.out.println("The password is empty!");
            return false;
        }
        catch (PasswordMismatching e) {
            System.out.println("Password mismatching!");
            return false;
        }
        return true;
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
    public String toString() {
        return firstName + "," + lastName + "," + email + "," + password + "," + userType;
    }
    public static User fromCSV(String line) {
        String[] parts = line.split(",");
        return new User(parts[0], parts[1], parts[2], parts[3], parts[4]);
    }

}