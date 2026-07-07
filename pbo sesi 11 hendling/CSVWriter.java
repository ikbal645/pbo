import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        // Jalur file diubah ke file lokal agar tidak eror "The system cannot find the path"
        String csvFile = "Student.csv";
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Input Data Mahasiswa Baru ---");
        
        System.out.print("Masukkan NIM   : ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Nama  : ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Umur  : ");
        String umur = scanner.nextLine();
        
        System.out.print("Masukkan Prodi : ");
        String prodi = scanner.nextLine();

        // Menggabungkan input menjadi format CSV (dipisah koma)
        String dataBaru = nim + ", " + nama + ", " + umur + ", " + prodi;

        // Menggunakan parameter 'true' pada FileWriter agar data baru ditambahkan ke baris paling bawah (tidak menimpa data lama)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
            bw.write(dataBaru);
            bw.newLine();
            System.out.println("Data berhasil disimpan ke " + csvFile);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data.");
            e.printStackTrace();
        } finally {
            scanner.close(); 
        }
    }
}