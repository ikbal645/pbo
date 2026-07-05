import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Key2 extends JFrame implements KeyListener {

    public Key2() {
        setTitle("Keyboard Background Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        addKeyListener(this);
        setFocusable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        char key = Character.toUpperCase(e.getKeyChar());
        if (key == 'R') {
            getContentPane().setBackground(Color.RED);
        } else if (key == 'G') {
            getContentPane().setBackground(Color.GREEN);
        } else if (key == 'B') {
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new Key2();
    }
}
