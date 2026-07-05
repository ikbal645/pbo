import java.io.FileReader;
import java.io.IOException;

public class ThrowsSederhana {

    public static void bacaFile() throws IOException {

        FileReader file = new FileReader("data.txt");
        System.out.println("File berhasil dibuka");

    }

    public static void main(String[] args) {

        try {
            bacaFile();
        } catch (IOException e) {
            System.out.println("File tidak ditemukan");
        }

        System.out.println("Program selesai");

    }
}