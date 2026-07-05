import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Mouse4 extends JFrame implements MouseListener {

    ArrayList<Point> titik = new ArrayList<>();

    public Mouse4() {
        setTitle("Mouse Drawing Dot");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        addMouseListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        for (Point p : titik) {
            g.fillOval(p.x, p.y, 10, 10);
        }
    }

    public void mouseClicked(MouseEvent e) {
        titik.add(e.getPoint());
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new Mouse4();
    }
}
