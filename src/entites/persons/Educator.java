package entites.persons;

public class Educator extends Person{
    private String profession;

    public Educator() {
    }

    public Educator(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
