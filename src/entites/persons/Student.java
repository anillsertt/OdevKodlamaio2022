package entites.persons;

public class Student extends Person{
    private String university;

    public Student() {

    }

    public Student(String university) {
        super();
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
