import javax.swing.*;
import java.awt.event.*;

public class ContohEvent extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    ContohEvent() {
        button = new JButton("OK");
        button.setBounds(50, 50, 95, 30);
        button.addActionListener(this);

        textField = new JTextField();
        textField.setBounds(50, 100, 200, 30);

        add(button);
        add(textField);

        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        textField.setText("Tombol telah diklik");
        JOptionPane.showMessageDialog(this, "Tombol telah diklik!");
    }

    public static void main(String[] args) {
        new ContohEvent();
    }
}
