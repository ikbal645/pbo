import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse2 extends JFrame implements MouseListener {

    Mouse2() {
        super("What is Mouse Event");
        setSize(400, 400);
        getContentPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        Mouse2 action = new Mouse2();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Mouse Clicked ");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Mouse Pressed ");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Mouse Release ");
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Mouse Exit");
    }
}
