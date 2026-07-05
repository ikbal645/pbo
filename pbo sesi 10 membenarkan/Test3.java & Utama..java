import java.io.*;

class Test3 {
    public void methodA() {
        System.out.println("Method A");
    }
    
    // Method ini mengumumkan bahwa dia berpotensi melempar IOException
    public void methodB() throws IOException {
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args) {
        Test3 o = new Test3();
        o.methodA();
        try {
            o.methodB();
        } catch (java.lang.Exception e) {
            System.out.println("Error di Method B");
        } finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}