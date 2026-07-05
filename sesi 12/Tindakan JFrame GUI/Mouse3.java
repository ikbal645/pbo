import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse3 extends JFrame implements MouseListener, MouseMotionListener {

    JLabel label;

    Mouse3() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Arahkan atau klik mouse di sini.");
        add(label);

        addMouseListener(this);
        addMouseMotionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered window");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited window");
    }

    public void mouseDragged(MouseEvent e) {
        label.setText("Dragging at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("Moving at (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new Mouse3();
    }
}
