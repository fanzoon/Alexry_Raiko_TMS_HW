package University.Services;

import University.DTO.Student;

import java.util.List;

public interface StudentServices {

    public void addStudent(Student student);

    public void deleteStudent(long id);

    public List<Student> getAllStudents();
}


