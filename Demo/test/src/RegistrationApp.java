import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationApp {
    public static void main(String[] args) {
        // Set up the frame
        JFrame frame = new JFrame("User Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create GUI components
        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField(20);

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        JLabel authLabel = new JLabel("Authentication Code:");
        JTextField authField = new JTextField(20);

        JButton submitButton = new JButton("Submit");
        JLabel statusLabel = new JLabel(" ");

        // Layout
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(authLabel);
        panel.add(authField);
        panel.add(submitButton);
        panel.add(statusLabel);

        frame.add(panel);
        frame.setVisible(true);

        // Link to backend logic
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get inputs from GUI
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String authCode = authField.getText();

                // Process inputs with backend logic
                boolean isSuccessful = BackendLogic.validateAndRegister(firstName, lastName, email, password, authCode);

                // Update the GUI based on the result
                if (isSuccessful) {
                    statusLabel.setText("Registration Successful!");
                    statusLabel.setForeground(Color.GREEN);
                } else {
                    statusLabel.setText("Registration Failed. Check inputs.");
                    statusLabel.setForeground(Color.RED);
                }
            }
        });
    }
}

// Backend Logic
class BackendLogic {
    public static boolean validateAndRegister(String firstName, String lastName, String email, String password, String authCode) {
        // Example validation logic
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || authCode.isEmpty()) {
            return false; // Fail if any field is empty
        }

        if (!email.contains("@") || !email.contains(".")) {
            return false; // Fail if email format is invalid
        }

        if (password.length() < 6) {
            return false; // Fail if password is too short
        }

        if (!authCode.equals("123456")) { // Example: Authentication code must be "123456"
            return false;
        }

        // If everything is valid, simulate storing user data
        System.out.println("User Registered Successfully:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);

        return true; // Success
    }
}
