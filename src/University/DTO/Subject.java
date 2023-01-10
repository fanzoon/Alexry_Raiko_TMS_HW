package University.DTO;


import java.util.Random;

public class Subject {

    private String name;
    private long id;


    public Subject(String name){
        this.name = name;
        this.id = Math.abs((long) Math.random());
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public long getId() { return id; }

}
