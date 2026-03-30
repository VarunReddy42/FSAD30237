package com.example.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @Transactional
    public Student updateStudent(Long id, Student newStudent) {
        Student student = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        student.setName(newStudent.getName());
        student.setEmail(newStudent.getEmail());
        student.setCourse(newStudent.getCourse());

        return repo.save(student);
    }

    public void deleteStudent(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Student not found with id: " + id);
        }
        repo.deleteById(id);
    }
}