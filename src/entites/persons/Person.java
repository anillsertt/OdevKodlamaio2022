package entites.persons;

public class Person {
    private int id;
    private String name;
    private String emailAdress;



    public Person(int id, String name, String emailAdress) {
        this.id = id;
        this.name = name;
        this.emailAdress = emailAdress;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
