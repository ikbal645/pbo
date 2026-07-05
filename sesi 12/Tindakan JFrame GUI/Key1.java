import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Key1 extends JFrame implements KeyListener {

    JLabel label;

    Key1() {
        setTitle("Keyboard Event Demo");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Tekan tombol pada keyboard");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        add(label);

        addKeyListener(this);
        setFocusable(true);  // penting untuk menerima input keyboard
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new Key1();
    }
}
