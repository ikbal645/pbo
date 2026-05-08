package project.model;

public class Student extends Person {
    private String nim;

    public Student(String name, String nim) {
        super(name);
        this.nim = nim;
    }

    @Override
    public void showRole() {
        System.out.println(name + " adalah seorang Mahasiswa dengan NIM " + nim);
    }
}
