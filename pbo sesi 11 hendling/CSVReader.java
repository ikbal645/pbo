import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "Student.csv";
        String line;
        String csvSplitBy = ",";
        int indeks = 0;

        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("----------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                indeks++;
                
                // Melewati baris pertama (header) agar tidak ikut tercetak
                if (indeks > 1) {
                    String[] student = line.split(csvSplitBy);
                    
                    // Memastikan data memiliki minimal 4 kolom (NIM, Nama, Umur, Prodi)
                    if (student.length >= 4) {
                        // Menggunakan println terpisah agar datanya berjejer ke bawah
                        System.out.println("NIM   : " + student[0].trim());
                        System.out.println("Nama  : " + student[1].trim());
                        System.out.println("Umur  : " + student[2].trim());
                        System.out.println("Prodi : " + student[3].trim());
                        // Memberi batas pembatas antar mahasiswa
                        System.out.println("----------------------");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}