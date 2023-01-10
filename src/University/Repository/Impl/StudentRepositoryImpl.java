package University.Repository.Impl;

import University.Faculty.FizcultFaculty;
import University.Repository.StudentRepository;
import University.DTO.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    List<Student> listStudents = new ArrayList<>();

    @Override
    public List<Student> getAllStudent() {
        Student petr = new Student("Петр", "Петров", "Петрович", 112127, true, new FizcultFaculty("fizcultFaculty", "Kupalystreet", 4));
        Student alex = new Student("Алексей", "Сидоров", "Петрович", 112128, true, new FizcultFaculty("radioFizFacultet", "Kupalystreet", 2));
        Student vacy = new Student("Василий", "Иванов", "Иванович", 112126, true, new FizcultFaculty("chemestryfacultet", "Kupalystreet", 10));

        listStudents.add(petr);
        listStudents.add(alex);
        listStudents.add(vacy);
        return listStudents;
    }

    @Override
    public void addStudent(Student student) {

        listStudents.add(student);
    }
//   Сдесь должны создать текстовый файл для хранения списков студентов
    //  В каждой строчке этого файла должно быть записано:
    //  Петр Петрович Петрович 112127 fizcultFaculty Kupaly street 4
    // ...

    //
}
