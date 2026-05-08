import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Ikbal");
        nama.add("Ferdi");
        nama.add("Rizky");

        System.out.println("Isi ArrayList:");
        for (String n : nama) {
            System.out.println(n);
        }
    }
}
