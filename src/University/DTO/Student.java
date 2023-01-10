package University.DTO;

import University.Faculty.Faculty;

import java.util.*;

public class Student {

    private UUID id;
    private String name;
    private String secondName;
    private String lastName;
    private int groupNumber;
    private boolean payable;
    private Faculty faculty;
    private List<Subject> subjects = new ArrayList<>();
    private Map<String, Integer> marks = new HashMap<>();

//    private Set<Subject> subjects = new HashSet<>();
//    private Map<Subject, ArrayList<Integer>> marks = new HashMap<>();
//    private Map<Subject, Integer> avgMarks = new HashMap<>();

//    private int[][] marks = new int[7][10];

    public Student(String name,
                   String secondName,
                   String lastName,
                   int groupNumber,
                   boolean payable,
                   Faculty faculty) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.payable = payable;
        this.faculty = faculty;
        this.id = UUID.randomUUID();

    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setSecondName(String secondName) { this.secondName = secondName; }
    public String getSecondName() { return secondName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }

    public void setGroupNumber(int groupNumber) { this.groupNumber = groupNumber; }
    public int getGroupNumber() { return groupNumber; }

    public void setPayable(boolean payable) { this.payable = payable; }
    public boolean isPayable() { return payable; }

    public void setFaculty(Faculty faculty) { this.faculty = faculty; }
    public Faculty getFaculty() { return  faculty; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupNumber=" + groupNumber +
                ", payable=" + payable +
                ", faculty=" + faculty +
                ", subjects=" + subjects +
                ", marks=" + marks +
                '}';
    }


//    public void setSubjects(Subject[] subjects) { this.subjects = subjects; }
//    public Subject[] getSubjects() { return  subjects; }
//
//    public void setMarks(int[][] marks) { this.marks = marks; }



}
