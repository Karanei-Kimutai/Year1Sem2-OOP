package GUI;
import javax.swing.*;
import java.awt.FlowLayout;
//Ctrl+Q: used to get documentation

public class SwingGUI {
    //1.Popup
    //Use Dialogs: input the name of the user and display
    public static void main(String[] args){
        String input;
       input=JOptionPane.showInputDialog("Please enter your name");
       JOptionPane.showMessageDialog(null,"Welcome "+input);

    }



    }

