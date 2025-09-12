package key;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author user
 */
public class KeyEventExample extends JFrame implements KeyListener {
    JTextField txt_A;
    JLabel lbl_A,lbl_result;
    @Override
    public void keyTyped(KeyEvent e) {
//        lbl_result.setText("Someone is Typing...");
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("Press");
        System.out.println("Key Pressed: "+e.getKeyChar());
        System.out.println("Key location: "+e.getKeyLocation());
        System.out.println("Key Code: "+e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        lbl_result.setText("");
//        System.out.println("Release");
        System.out.println("Key Released: "+e.getKeyChar());
        System.out.println("Key location: "+e.getKeyLocation());
        System.out.println("Key Code: "+e.getKeyCode());
    }
    public KeyEventExample(){
        setTitle("KeyEventExamples");
        setBounds(50, 50, 150, 500);
        setLayout(new GridLayout(3,1,10,15));
        // making labels
        lbl_A = new JLabel("Enter Message");
        lbl_result = new JLabel();
        txt_A = new JTextField();
        txt_A.addKeyListener(this);
        add(lbl_A);
        add(txt_A);
        add(lbl_result);
        setVisible(true);
        setDefaultCloseOperation(2);
    }
    public static void main(String arg[]){
        new KeyEventExample();
    }
}
