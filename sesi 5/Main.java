import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa mhs = new Mahasiswa();
        Dosen dosen = new Dosen();
        Matakuliah mk = new Matakuliah();

        // input mahasiswa
        System.out.print("Nama Mahasiswa: ");
        mhs.setNama(input.nextLine());

        System.out.print("NIM: ");
        mhs.setNim(input.nextLine());

        // input dosen
        System.out.print("Nama Dosen: ");
        dosen.setNama(input.nextLine());

        System.out.print("NIDN: ");
        dosen.setNidn(input.nextLine());

        // input matkul
        System.out.print("Nama Mata Kuliah: ");
        mk.setNamaMK(input.nextLine());

        System.out.print("SKS: ");
        mk.setSks(input.nextInt());

        // output
        System.out.println("\n=== DATA ===");
        System.out.println("Mahasiswa : " + mhs.getNama() + " (" + mhs.getNim() + ")");
        System.out.println("Dosen     : " + dosen.getNama() + " (" + dosen.getNidn() + ")");
        System.out.println("Matkul    : " + mk.getNamaMK() + " - " + mk.getSks() + " SKS");

        input.close();
    }
}