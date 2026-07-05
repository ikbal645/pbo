import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse1 extends JFrame implements MouseMotionListener {

    Mouse1() {
        super("What is Mouse Event");
        setSize(400, 400);
        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        addMouseMotionListener(this);
    }

    public static void main(String[] args) {
        Mouse1 action = new Mouse1();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        System.out.println("Mouse Drag");
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        System.out.println("x:" + x + " -y:" + y);
    }
}
