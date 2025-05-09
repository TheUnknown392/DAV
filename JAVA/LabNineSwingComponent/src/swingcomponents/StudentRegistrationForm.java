package swingcomponents;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// we are extending the JFrame here with out custom class
public class StudentRegistrationForm extends JFrame{
    // constructor
    public StudentRegistrationForm(){
        setTitle("Student Registratin Form");
        // 1st param: x-axis, 2nd param: y-axis, 3rd param: width and 4th param: height
        setBounds(50,50,500,700); // cordinates & size of JFrame
        // layout of JFrame
        // method one:by creating layout manager object
        // GridLayout (int rows, int cos, int hgap, int vgap);
        GridLayout g1= new GridLayout(7,2,10,10);
        setLayout(g1);
        // creating components
        JLabel lbl_first_name = new JLabel();
        lbl_first_name.setForeground(new Color(0xAE,0xF4,0xDE));
        lbl_first_name.setText("First Name:");
        
        JLabel lbl_last_name = new JLabel();
        lbl_last_name.setText("Last Name:");
        
        JLabel lbl_email = new JLabel();
        lbl_email.setText("Email:");
        
        JLabel lbl_address = new JLabel();
        lbl_address.setText("Address:");
        
        JLabel lbl_dob = new JLabel();
        lbl_dob.setText("Date of Birth: ");
        
        JLabel lbl_gender = new JLabel();
        lbl_gender.setText("Gender: ");
        
        // JTextField
        JTextField txt_first_name = new JTextField();
        JTextField txt_last_name = new JTextField();
        JTextField txt_email = new JTextField();
        JTextField txt_address = new JTextField();
        JTextField txt_dob = new JTextField();
        JTextField txt_gender = new JTextField();
        
        // JButton
        JButton reset = new JButton();
        reset.setText("RESET");
        reset.setForeground(Color.WHITE);
        reset.setBackground(Color.RED);
        reset.setSize(200,50);
        
        JButton submit  = new JButton();
        submit.setText("SUBMIT");
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLUE);
        submit.setSize(200,50);
        
        
        
        // adding components into jframe
        add(lbl_first_name);
        add(txt_first_name);
        add(lbl_last_name);
        add(txt_last_name);
        add(lbl_email);
        add(txt_email);
        add(lbl_address);
        add(txt_address);
        add(lbl_dob);
        add(txt_dob);
        add(lbl_gender);
        add(txt_gender);
        add(submit);
        add(reset);
        
        // displaying JFrame
        setVisible(true);
        // DefaultCloseOperation: EXIT_ON_CLOSE will close the JFrame and stop the program
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new StudentRegistrationForm();
    }
}
