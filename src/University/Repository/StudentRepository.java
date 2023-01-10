package University.Repository;

import University.DTO.Student;

import java.util.List;

public interface StudentRepository {

    public List<Student> getAllStudent();

    void addStudent(Student student);


}
