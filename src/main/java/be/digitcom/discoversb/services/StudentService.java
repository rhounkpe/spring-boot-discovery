package be.digitcom.discoversb.services;

import be.digitcom.discoversb.models.Student;
import be.digitcom.discoversb.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Optional<Student> findStudentByMatr(String matr) {
        return studentFactory()
                .stream()
                .filter(student -> student.getMatr().equals(matr))
                .findFirst();
    }

    public List<Student> studentFactory() {
        return studentRepository.studentFactory();
    }
}
