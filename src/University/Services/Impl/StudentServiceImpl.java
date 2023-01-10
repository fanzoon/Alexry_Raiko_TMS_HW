package University.Services.Impl;

import University.Repository.Impl.StudentRepositoryImpl;
import University.Repository.StudentRepository;
import University.Services.StudentServices;
import University.DTO.Student;

import java.util.List;

public class StudentServiceImpl implements StudentServices {

    StudentRepository studentRepository = new StudentRepositoryImpl();

    @Override
    public void addStudent(Student student) {

        studentRepository.addStudent(student);

    }

    @Override
    public void deleteStudent(long id) {

    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudent();

    }
}
