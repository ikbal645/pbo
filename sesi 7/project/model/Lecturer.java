package project.model;

public class Lecturer extends Person {
    private String nidn;

    public Lecturer(String name, String nidn) {
        super(name);
        this.nidn = nidn;
    }

    @Override
    public void showRole() {
        System.out.println(name + " adalah seorang Dosen dengan NIDN " + nidn);
    }
}
