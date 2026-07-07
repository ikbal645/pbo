import java.sql.*;
import java.util.Scanner;

public class TokoRetail {
    // Konfigurasi Database (Pastikan password sesuai dengan pengaturan MySQL kamu)
    static final String DB_URL = "jdbc:mysql://localhost:3306/toko_retail";
    static final String USER = "root";
    static final String PASS = ""; 

    static Connection conn;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Membuka koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            int pilihan;
            do {
                System.out.println("\n--- MENU TOKO RETAIL ---");
                System.out.println("1. Tampil Semua Data");
                System.out.println("2. Tambah Data");
                System.out.println("3. Cari Data");
                System.out.println("4. Ubah Data");
                System.out.println("5. Hapus Data");
                System.out.println("0. Keluar");
                System.out.print("Pilihan: ");
                pilihan = Integer.parseInt(scanner.nextLine());

                switch (pilihan) {
                    case 1: tampilkanData(); break;
                    case 2: tambahData(); break;
                    case 3: cariData(); break;
                    case 4: ubahData(); break;
                    case 5: hapusData(); break;
                    case 0: System.out.println("Terima kasih!"); break;
                    default: System.out.println("Pilihan salah.");
                }
            } while (pilihan != 0);

            conn.close();
        } catch (Exception e) {
            System.out.println("Error koneksi: " + e.getMessage());
        }
    }

    // Fungsi-fungsi ditaruh di luar main
    static void tampilkanData() throws SQLException {
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM barang");
        System.out.println("\nDAFTAR BARANG:");
        while (rs.next()) {
            System.out.println(rs.getString("kode") + " | " + rs.getString("nama_barang") + 
                               " | Rp" + rs.getInt("harga") + " | Stok: " + rs.getInt("stok"));
        }
    }

    static void tambahData() throws SQLException {
        System.out.print("Kode: "); String kode = scanner.nextLine();
        System.out.print("Nama: "); String nama = scanner.nextLine();
        System.out.print("Harga: "); int harga = Integer.parseInt(scanner.nextLine());
        System.out.print("Stok: "); int stok = Integer.parseInt(scanner.nextLine());
        
        PreparedStatement ps = conn.prepareStatement("INSERT INTO barang VALUES (?,?,?,?)");
        ps.setString(1, kode); ps.setString(2, nama); ps.setInt(3, harga); ps.setInt(4, stok);
        ps.executeUpdate();
        System.out.println("Data berhasil ditambah!");
    }

    static void cariData() throws SQLException {
        System.out.print("Masukkan Kode Barang: "); String kode = scanner.nextLine();
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM barang WHERE kode = ?");
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println("Ditemukan: " + rs.getString("nama_barang") + " - Harga: " + rs.getInt("harga"));
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void ubahData() throws SQLException {
        System.out.print("Kode barang yang akan diubah: "); String kode = scanner.nextLine();
        System.out.print("Nama baru: "); String nama = scanner.nextLine();
        PreparedStatement ps = conn.prepareStatement("UPDATE barang SET nama_barang = ? WHERE kode = ?");
        ps.setString(1, nama); ps.setString(2, kode);
        ps.executeUpdate();
        System.out.println("Data berhasil diupdate!");
    }

    static void hapusData() throws SQLException {
        System.out.print("Kode barang yang akan dihapus: "); String kode = scanner.nextLine();
        PreparedStatement ps = conn.prepareStatement("DELETE FROM barang WHERE kode = ?");
        ps.setString(1, kode);
        ps.executeUpdate();
        System.out.println("Data berhasil dihapus!");
    }
}