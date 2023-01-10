package University.Faculty;

public class ChemicalsFaculty extends Faculty {

   private int chemicals;

    public ChemicalsFaculty(String name, String address, int chemicals) {
        super(name, address);
        this.chemicals = 10;
    }

    public void setChemicals(int chemicals) { this.chemicals = chemicals; }
    public int getChemicals() { return chemicals; }


}
