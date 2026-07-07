import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVCopy {
    public static void main(String[] args) {
        // Jalur diubah ke file lokal dan namanya disesuaikan dengan file yang sudah kita isi data
        String fileAsal = "Student.csv";
        String fileTujuan = "Student_backup.csv";

        System.out.println("=== Memulai proses penyalinan file ===");

        try (BufferedReader br = new BufferedReader(new FileReader(fileAsal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileTujuan))) {
            
            String line;
            // Membaca baris demi baris dari file asal dan langsung menulisnya ke file tujuan
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("✅ Penyalinan selesai! File berhasil diduplikasi menjadi: " + fileTujuan);

        } catch (IOException e) {
            System.out.println("❌ Terjadi kesalahan saat menyalin file.");
            e.printStackTrace();
        }
    }
}