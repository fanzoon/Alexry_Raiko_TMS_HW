package University.Faculty;

import University.DTO.Subject;
import University.DTO.Teacher;

public abstract class Faculty {

    private String name;
    private long id;
    private String address;
    Teacher[] teachers = new Teacher[10];
    Subject[] subjects = new Subject[10];


    public Faculty(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public long getId() { return id; }


    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}

