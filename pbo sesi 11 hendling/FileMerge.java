import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerge {
    public static void main(String[] args) {
        String[] files = {"file1.txt", "file2.txt"};
        String mergedFile = "merge.txt";

        System.out.println("=== Memulai Penggabungan File ===");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {
            for (String file : files) {
                // Mengecek apakah file benar-benar ada di folder sebelum dibaca
                File cekFile = new File(file);
                if (!cekFile.exists()) {
                    System.out.println("❌ ERROR: Sistem tidak menemukan file ini!");
                    System.out.println("   Mencari di jalur : " + cekFile.getAbsolutePath());
                    System.out.println("   (Saran: Coba ganti nama filenya di VS Code menjadi 'file1' saja tanpa '.txt')\n");
                    continue; // Melewati file yang eror dan lanjut ke file berikutnya
                }

                // Proses baca dan tulis jika file ditemukan
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }
                    System.out.println("✅ Berhasil membaca dan menggabungkan isi: " + file);
                } catch (IOException e) {
                    System.out.println("Gagal membaca file: " + file);
                    e.printStackTrace();
                }
            }
            System.out.println("---------------------------------");
            System.out.println("🎉 File gabungan berhasil dibuat dengan nama: " + mergedFile);
            
        } catch (IOException e) {
            System.out.println("Gagal menulis file gabungan.");
            e.printStackTrace();
        }
    }
}