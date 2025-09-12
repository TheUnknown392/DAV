package mouse;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author user
 */
public class MouseMotionEventExample extends JFrame implements MouseMotionListener{
    JLabel lbl_result;
    @Override
    public void mouseDragged(MouseEvent e) {
        lbl_result.setText("Value Dragged of X: " + e.getX() + " Value Dragged of Y: " + e.getY());
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        lbl_result.setText("Value of X: " + e.getX() + " Value of Y: " + e.getY());
    }
    
    public MouseMotionEventExample(){
        setTitle("MouseMotionEventExample");
        setBounds(50,50,500,500);
        lbl_result = new JLabel();
        add(lbl_result);
        addMouseMotionListener(this);
        setVisible(true);
    }
    public static void main(String args[]){
        new MouseMotionEventExample();
    }
}
