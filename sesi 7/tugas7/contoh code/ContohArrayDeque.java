import java.util.ArrayDeque;

public class ContohArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<String> antrian = new ArrayDeque<>();

        antrian.add("User1");
        antrian.add("User2");
        antrian.addFirst("VIP");

        System.out.println("Antrian:");
        for (String a : antrian) {
            System.out.println(a);
        }

        System.out.println("Diproses: " + antrian.poll());
    }
}