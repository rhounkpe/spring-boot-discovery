package be.digitcom.discoversb.repository;

import be.digitcom.discoversb.models.Student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    public List<Student> studentFactory() {
        Student student = new Student();
        student.setMatr("001");
        student.setDob(LocalDate.now());
        student.setFirstName("Eliot");
        student.setLastName("Fagnon");

        Student student1 = new Student();
        student1.setMatr("002");
        student1.setDob(LocalDate.now());
        student1.setFirstName("Rufin");
        student1.setLastName("Hounkpe");

        Student student2 = new Student();
        student2.setMatr("003");
        student2.setDob(LocalDate.now());
        student2.setFirstName("Choupo");
        student2.setLastName("Fagnon");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        return studentList;
    }
}
