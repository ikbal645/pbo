package project;

import project.model.Student;
import project.model.Lecturer;
import project.service.Course;
import project.service.Registration;
import project.util.DataStore;

public class MainApp {
    public static void main(String[] args) {
        Student s1 = new Student("Ferdi", "1102020");
        Lecturer l1 = new Lecturer("Pak Yulhan", "123456");

        s1.showRole();
        l1.showRole();

        Course c1 = new Course("Pemrograman Berorientasi Objek");
        Registration reg = new Registration();
        reg.register(s1, c1);

        DataStore<String> notes = new DataStore<>();
        notes.add("Belajar Inheritance");
        notes.add("Belajar Polimorfisme");
        notes.showAll();
    }
}
