package project.service;

import project.model.Student;
import project.service.Course;

public class Registration {
    public void register(Student s, Course c) {
        System.out.println("Mahasiswa " + s.getName() + " berhasil mendaftar ke mata kuliah " + c.getCourseName());
    }
}
