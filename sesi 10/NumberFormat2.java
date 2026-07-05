public class NumberFormat2 {

    public static void main(String[] args) {

        try {

            String data = "abc";
            int angka = Integer.parseInt(data);
            System.out.println(angka);

        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka");
        }

        System.out.println("Program selesai");

    }
}