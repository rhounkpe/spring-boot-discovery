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


    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public Student findById(Integer id) {
        return studentRepository.findById(id).orElseThrow();
    }


    public Optional<Student> findStudentByMatr(String matr) {
        return studentRepository.findAll()
                .stream()
                .filter(student -> student.getMatr().equals(matr))
                .findFirst();
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
