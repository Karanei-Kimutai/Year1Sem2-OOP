package GUI;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener{
    private JLabel lblUser, lblPassword;
    private JTextField textUser, textPassword;
    private JButton btnLogin;

    public LoginFrame() {
        super("Welcome");
        this.setLayout(new FlowLayout());

        lblUser = new JLabel("User:");
        this.add(lblUser);

        textUser = new JTextField(15);
        add(textUser);

        lblPassword=new JLabel("Password:");
        add(lblPassword);

        textPassword = new JTextField(15);
        add(textPassword);

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
        add(btnLogin);
//Approach one of event handling-requires you to create event handlers for each GUI component
       /* btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Login button clicked");
                String name=textUser.getText();
                JOptionPane.showMessageDialog(null,"Welcome "+name);
            }
        }); */
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnLogin){
            System.out.println("Button clicked");
            String name=textUser.getText();
            JOptionPane.showMessageDialog(null,"Welcome "+name);
        }
    }


}