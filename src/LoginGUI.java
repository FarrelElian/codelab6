import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI extends JFrame implements ActionListener {

    private JLabel lblUsername, lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginGUI() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Consider using JFrame.DISPOSE_ON_CLOSE for a cleaner exit

        // Improved layout using FlowLayout with appropriate spacing
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        lblUsername = new JLabel("Username:");
        add(lblUsername);

        txtUsername = new JTextField(15); // Set a reasonable width for username input
        add(txtUsername);

        lblPassword = new JLabel("Password:");
        add(lblPassword);

        txtPassword = new JPasswordField(15); // Set a reasonable width for password input
        add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
        add(btnLogin);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());

        if (username.equals("admin") && password.equals("password123")) {
            JOptionPane.showMessageDialog(null, "Login Berhasil!");

            // Pindahkan ke halaman baru (contoh)
            HalamanBaru halamanBaru = new HalamanBaru();
            halamanBaru.setVisible(true);
            dispose(); // Close the login form
        } else {
            JOptionPane.showMessageDialog(null, "Username/Password Salah!");
            // Optionally, clear the password field for security
            txtPassword.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setSize(300, 150); // Adjust size as needed
            loginGUI.setLocationRelativeTo(null);
            loginGUI.setVisible(true);
        });
    }
}

// Halaman Baru (contoh)
class HalamanBaru extends JFrame {

    public HalamanBaru() {
        setTitle("Halaman Baru");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel lblWelcome = new JLabel("Selamat Datang!");
        add(lblWelcome);
    }
}
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class LoginGUI extends JFrame implements ActionListener {

    private JLabel lblUsername, lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginGUI() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Consider using JFrame.DISPOSE_ON_CLOSE for a cleaner exit

        // Improved layout using FlowLayout with appropriate spacing
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        lblUsername = new JLabel("Username:");
        add(lblUsername);

        txtUsername = new JTextField(15); // Set a reasonable width for username input
        add(txtUsername);

        lblPassword = new JLabel("Password:");
        add(lblPassword);

        txtPassword = new JPasswordField(15); // Set a reasonable width for password input
        add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
        add(btnLogin);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());

        if (username.equals("admin") && password.equals("password123")) {
            JOptionPane.showMessageDialog(null, "Login Berhasil!");

            // Pindahkan ke halaman baru (contoh)
            HalamanBaru halamanBaru = new HalamanBaru();
            halamanBaru.setVisible(true);
            dispose(); // Close the login form
        } else {
            JOptionPane.showMessageDialog(null, "Username/Password Salah!");
            // Optionally, clear the password field for security
            txtPassword.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setSize(300, 150); // Adjust size as needed
            loginGUI.setLocationRelativeTo(null);
            loginGUI.setVisible(true);
        });
    }
}

// Halaman Baru (contoh)
class HalamanBaru extends JFrame {

    public HalamanBaru() {
        setTitle("Halaman Baru");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel lblWelcome = new JLabel("Selamat Datang!");
        add(lblWelcome);
    }
}
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class LoginGUI extends JFrame implements ActionListener {

    private JLabel lblUsername, lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginGUI() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Consider using JFrame.DISPOSE_ON_CLOSE for a cleaner exit

        // Improved layout using FlowLayout with appropriate spacing
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        lblUsername = new JLabel("Username:");
        add(lblUsername);

        txtUsername = new JTextField(15); // Set a reasonable width for username input
        add(txtUsername);

        lblPassword = new JLabel("Password:");
        add(lblPassword);

        txtPassword = new JPasswordField(15); // Set a reasonable width for password input
        add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
        add(btnLogin);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());

        if (username.equals("admin") && password.equals("password123")) {
            JOptionPane.showMessageDialog(null, "Login Berhasil!");

            // Pindahkan ke halaman baru (contoh)
            HalamanBaru halamanBaru = new HalamanBaru();
            halamanBaru.setVisible(true);
            dispose(); // Close the login form
        } else {
            JOptionPane.showMessageDialog(null, "Username/Password Salah!");
            // Optionally, clear the password field for security
            txtPassword.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setSize(300, 150); // Adjust size as needed
            loginGUI.setLocationRelativeTo(null);
            loginGUI.setVisible(true);
        });
    }
}

// Halaman Baru (contoh)
class HalamanBaru extends JFrame {

    public HalamanBaru() {
        setTitle("Halaman Baru");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel lblWelcome = new JLabel("Selamat Datang!");
        add(lblWelcome);
    }
}
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

public class LoginGUI extends JFrame implements ActionListener {

    private JLabel lblUsername, lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginGUI() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Consider using JFrame.DISPOSE_ON_CLOSE for a cleaner exit

        // Improved layout using FlowLayout with appropriate spacing
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        lblUsername = new JLabel("Username:");
        add(lblUsername);

        txtUsername = new JTextField(15); // Set a reasonable width for username input
        add(txtUsername);

        lblPassword = new JLabel("Password:");
        add(lblPassword);

        txtPassword = new JPasswordField(15); // Set a reasonable width for password input
        add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
        add(btnLogin);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());

        if (username.equals("admin") && password.equals("password123")) {
            JOptionPane.showMessageDialog(null, "Login Berhasil!");

            // Pindahkan ke halaman baru (contoh)
            HalamanBaru halamanBaru = new HalamanBaru();
            halamanBaru.setVisible(true);
            dispose(); // Close the login form
        } else {
            JOptionPane.showMessageDialog(null, "Username/Password Salah!");
            // Optionally, clear the password field for security
            txtPassword.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setSize(300, 150); // Adjust size as needed
            loginGUI.setLocationRelativeTo(null);
            loginGUI.setVisible(true);
        });
    }
}

// Halaman Baru (contoh)
class HalamanBaru extends JFrame {

    public HalamanBaru() {
        setTitle("Halaman Baru");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel lblWelcome = new JLabel("Selamat Datang!");
        add(lblWelcome);
    }
}
