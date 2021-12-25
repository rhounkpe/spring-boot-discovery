package be.digitcom.discoversb.controllers;

import be.digitcom.discoversb.models.Student;
import be.digitcom.discoversb.services.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    final private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping({"", "/"})
    public List<Student> getAll() {
        return this.studentService.studentFactory();
    }

    @GetMapping("/{matr}")
    public ResponseEntity<?> getById(@PathVariable String matr) {
        Optional<Student> optional = this.studentService.findStudentByMatr(matr);

        return optional.isPresent() ?
                ResponseEntity.ok(optional.get())
                : ResponseEntity.notFound().build();
    }
}
