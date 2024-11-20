package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame2 {
    private JTextField passwordtextfield1;
    private JTextField passwordtextField2;
    private JButton loginButton;

    public LoginFrame2() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });
    }
}
