package University.Faculty;

public class FizcultFaculty extends Faculty {

    private int footballStadiumCount;

    public FizcultFaculty(String name, String address, int footballStadiumCount) {
        super(name, address);
        this.footballStadiumCount = 4;
    }

    public void setFootballStadiumCount(int footballStadiumCount) { this.footballStadiumCount = footballStadiumCount; }
    public int getFootballStadiumCount() { return footballStadiumCount; }
}
