public class Exception {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100; // Memicu error karena indeks maksimal adalah 4
        } catch (java.lang.Exception e) {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}