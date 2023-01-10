package University;

import University.DTO.Student;
import University.Faculty.FizcultFaculty;
import University.Services.Impl.StudentServiceImpl;
import University.Services.StudentServices;

public class Main {

    public static void main(String[] args) {

        StudentServices studentServices = new StudentServiceImpl();
//     Меню:
//        0. Нажми 0, чтобы Вернуться в главное меню
//        1. Нажми 1, чтобы получить всех студентов
//        System.out.println(studentServices.getAllStudents());

        studentServices.getAllStudents().forEach(System.out::println);

//        2. Нажми 2, чтобы добавить студента
        Student student = new Student("Саша", "Петров", "Прокопович", 112127,
                true, new FizcultFaculty("fizcultFaculty", "Kupalystreet", 4));  // все параметры ввести с консоли
        studentServices.addStudent(student);

//        3. Нажми 3, чтобы удатлить студента
        studentServices.deleteStudent(2);

//        4. Нажми 9, чтобы выйти из приложения

//        University university = new University();
//        Faculty fizcultFaculty = new FizcultFacultet("fizcultFaculty", "Kupalystreet", 4);
//        Faculty radioFizFacultet = new RadioFizFacultet("radioFizFacultet", "Kupalystreet", 2);
//        Faculty chemestryfacultet = new ChemestryFacultet("chemestryfacultet", "Kupalystreet", 10);


//        university.addStudent(
//                "Иванов",
//                "Иван",
//                "Иванович",
//                112127,
//                true,
//                fizcultFaculty
//        );
//
//        university.addStudent(
//                "Петров",
//                "Петр",
//                "Петрович",
//                115128,
//                false,
//                radioFizFacultet
//        );
//
//        university.addStudent(
//                "Сидоров",
//                "Николай",
//                "Петрович",
//                111122,
//                false,
//                chemestryfacultet
//        );


    }
}
