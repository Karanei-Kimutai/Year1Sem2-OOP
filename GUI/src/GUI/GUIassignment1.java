package GUI;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIassignment1 extends JFrame{
    //Attributes
    private JLabel firstnamelabel,lastnamelabel,genderlabel,yearofbirthlabel;
    private JTextField firstname,lastname,yearofbirth;
    private JButton registerbutton;
    private JRadioButton genderoption1,genderoption2;


    //Constructor
    public GUIassignment1(){
        super("Registration Form");
        setLayout(new FlowLayout());

        //Create and add elements to the frame
        //first name label and textfield4
        firstnamelabel=new JLabel("First Name:");
        add(firstnamelabel);
        firstname=new JTextField(20);
        add(firstname);
        //last name label and textfield
        lastnamelabel=new JLabel("\nLast Name:");
        add(lastnamelabel);
        lastname=new JTextField(20);
        add(lastname);
        //gender label and radio button
        genderlabel=new JLabel("\nGender:");
        add(genderlabel);
        genderoption1=new JRadioButton("Male");
        add(genderoption1);
        genderoption2=new JRadioButton("Female\n");
        add(genderoption2);
        //Group the radio buttons so that only one option can be selected
        ButtonGroup group1=new ButtonGroup();
        group1.add(genderoption1);
        group1.add(genderoption2);
        //year of birth label and textfield
        yearofbirthlabel=new JLabel("\nYear of Birth");
        add(yearofbirthlabel);
        yearofbirth=new JTextField(20);
        add(yearofbirth);
        //Register button
        registerbutton=new JButton("Register");
        add(registerbutton);

        //Add an action listener to the button so that when the button is clicked the user's input is stored in variables
        registerbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //Store the values
                String fname=firstname.getText(),lname=lastname.getText();
                String gender=genderoption1.isSelected() ? "Male" : "Female";
                String yob=yearofbirth.getText();
                int YOB=Integer.parseInt(yob);
                int age=2024-YOB;

                //Display the data
                JOptionPane.showMessageDialog(null,fname+lname+"\nYou are "+gender+"\nYou are "+age+" years old.");



            }
        });



    }
}
