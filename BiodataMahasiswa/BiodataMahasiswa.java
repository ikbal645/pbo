import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BiodataMahasiswa extends JFrame {
    // Deklarasi komponen form
    private JTextField txtNim, txtNama, txtProdi;
    private JTextArea txtOutput;
    private JButton btnTampilkan, btnReset;

    public BiodataMahasiswa() {
        // Pengaturan dasar Jendela Aplikasi (Frame)
        setTitle("Aplikasi Biodata Mahasiswa");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setLocationRelativeTo(null); // Agar aplikasi muncul di tengah layar

        // ================= PANEL INPUT =================
        JPanel panelInput = new JPanel(new GridLayout(4, 2, 10, 10));
        panelInput.setBorder(BorderFactory.createTitledBorder("Input Data"));

        // Baris 1: NIM
        panelInput.add(new JLabel("NIM"));
        txtNim = new JTextField();
        panelInput.add(txtNim);

        // Baris 2: Nama
        panelInput.add(new JLabel("Nama"));
        txtNama = new JTextField();
        panelInput.add(txtNama);

        // Baris 3: Program Studi
        panelInput.add(new JLabel("Program Studi"));
        txtProdi = new JTextField();
        panelInput.add(txtProdi);

        // Baris 4: Tombol Tampilkan & Reset
        JPanel panelTombol = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnTampilkan = new JButton("Tampilkan");
        btnReset = new JButton("Reset");
        panelTombol.add(btnTampilkan);
        panelTombol.add(btnReset);

        panelInput.add(new JLabel("")); // Kosong sebagai penyeimbang layout
        panelInput.add(panelTombol);

        // ================= PANEL OUTPUT =================
        JPanel panelOutput = new JPanel(new BorderLayout());
        panelOutput.setBorder(BorderFactory.createTitledBorder("Output"));
        
        txtOutput = new JTextArea();
        txtOutput.setEditable(false); // Agar output tidak bisa diketik manual
        txtOutput.setFont(new Font("Monospaced", Font.PLAIN, 12));
        
        JScrollPane scrollPane = new JScrollPane(txtOutput);
        panelOutput.add(scrollPane, BorderLayout.CENTER);

        // Menambahkan panel ke dalam Frame utama
        add(panelInput, BorderLayout.NORTH);
        add(panelOutput, BorderLayout.CENTER);

        // ================= FUNGSI TOMBOL =================
        
        // 1. Fungsi Tombol Tampilkan
        btnTampilkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengambil data dari text field
                String nim = txtNim.getText();
                String nama = txtNama.getText();
                String prodi = txtProdi.getText();

                // Menyusun format output
                String hasil = "========== BIODATA MAHASISWA ==========\n\n" +
                               "NIM             : " + nim + "\n" +
                               "Nama            : " + nama + "\n" +
                               "Program Studi   : " + prodi + "\n";
                               
                // Menampilkan ke layar output
                txtOutput.setText(hasil);
            }
        });

        // 2. Fungsi Tombol Reset
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengosongkan semua isian form dan output
                txtNim.setText("");
                txtNama.setText("");
                txtProdi.setText("");
                txtOutput.setText("");
                
                // Mengembalikan kursor ke kolom NIM
                txtNim.requestFocus(); 
            }
        });
    }

    public static void main(String[] args) {
        // Menjalankan aplikasi
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BiodataMahasiswa().setVisible(true);
            }
        });
    }
}