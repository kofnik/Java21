package ex;

import javax.swing.*;

public class Password2 extends JFrame{
    PasswordFrame pass = new PasswordFrame();

    public Password2() {
        super("Ask password");
        setSize(500, 70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pass.setVisible(true);
    }

    public static void main(String[] args) {
        Password2 ask = new Password2();
    }

}

class PassFrame extends JFrame {
    public PassFrame() {
        super("Password");
        setSize(210, 130);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel  = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        JTextField username = new JTextField(8);
        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField  password = new JPasswordField(8);
        panel.add(usernameLabel);
        panel.add(username);
        panel.add(passwordLabel);
        panel.add(password);
        setContentPane(panel);
        setVisible(false);

    }
}


