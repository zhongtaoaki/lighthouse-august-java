package registerSystem;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private JLabel titleLabel, usernameLabel, passwordLabel; // label for username and password

    private JTextField usernameField; // username field
    private JPasswordField passwordField; // password field

    private JButton loginButton; // login button
    private JButton registerButton; // register button

    private void showFrame() {

        setTitle("用户登陆系统");
        setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleLabel = new JLabel("用户登陆系统");
        titleLabel.setForeground(Color.blue);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));

        usernameLabel = new JLabel("用户名:");
        passwordLabel = new JLabel("密码:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("登陆");
        registerButton = new JButton("注册");

        titleLabel.setBounds(100, 30, 400, 30);
        usernameLabel.setBounds(80, 70, 100, 30);
        passwordLabel.setBounds(80, 110, 100, 30);
        usernameField.setBounds(200, 70, 200, 30);
        passwordField.setBounds(200, 110, 200, 30);
        loginButton.setBounds(150, 160, 100, 30);
        registerButton.setBounds(260, 160, 100, 30);

        add(titleLabel);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameField);
        add(passwordField);
        add(loginButton);
        add(registerButton);

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            new BusinessLogic().login(username, password);
        });

        registerButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            new BusinessLogic().register(username, password);
        });
    }

    public static void main(String arr[]) {
        new Main().showFrame();
    }
}
