package University.DTO;

import University.Faculty.Faculty;

import java.util.ArrayList;
import java.util.List;

public class University {



    private static final String NAME_UNIVERSITY = "BNTU";
    private List<Student> students = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

//    public University(String name, Student[] students, Faculty[] faculties, Teachers[] teachers) {
//        this.name = name;
//        this.students = students;
//        this.faculties = faculties;
//        this.teachers = teachers;
//    }

//    public void setName(String name) { this.name = name; }
//    public String getName() { return name; }
//
//    public void setStudents(Student[] students) { this.students = students; }
//    public Student[] getStudents() { return students; }
//
//    public void setFaculties(Faculty[] faculties) { this.faculties = faculties; }
//    public Faculty[] getFaculties() { return faculties; }
//
//    public void setTeachers(Teachers[] teachers) { this.teachers = teachers; }
//    public Teachers[] getTeachers() { return teachers; }
//
//    public void addStudent(String name,
//                           String secondName,
//                           String lastName,
//                           int groupNumber,
//                           boolean payable,
//                           Faculty faculty) {
//        Student student = new Student(name, secondName, lastName, groupNumber, payable, faculty);
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] == null) {
//                students[i] = student;
//                break;
//            }
//        }
//    }
//
//    public void deleteStudent(String name,
//                           String secondName,
//                           String lastName,
//                           int groupNumber,
//                           boolean payable,
//                           Faculty faculty) {
//
//    }



}


