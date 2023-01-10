package University.DTO;

import University.Faculty.Faculty;

public class Teacher {

    private long id;
    private String name;
    private String secondName;
    private String lastname;
    Subject[] subjects = new Subject[4];
    Faculty[] faculties = new Faculty[2];


    public Teacher(String name, String secondName, String lastname, Subject[] subjects, Faculty[] faculties) {
        this.name = name;
        this.secondName = secondName;
        this.lastname = lastname;
        this.subjects = subjects;
        this.faculties = faculties;
        this.id = Math.abs((long) Math.random());
    }



    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getSecondName() {
        return secondName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return lastname;
    }



}
