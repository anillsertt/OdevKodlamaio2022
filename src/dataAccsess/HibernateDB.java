package dataAccsess;

import entites.categorys.Category;
import entites.courses.Course;
import entites.persons.Educator;
import entites.persons.Person;
import entites.persons.Student;

import java.util.ArrayList;
import java.util.List;

public class HibernateDB implements IDBService {

    private List<Course> courses;
    private List<Category> categories;
    private List<Person> personList;

    public HibernateDB() {
     courses = new ArrayList<>();
     courses.add(new Course(1,"Java Geliştme Kampı",0.0,79,1));
     categories = new ArrayList<>();
     categories.add(new Category(1,"Proramming"));
        Student student = new Student();
        student.setId(1);
        student.setName("Anıl Sert");
        student.setEmailAdress("anillsertt@gmail.com");
        student.setUniversity("Ege Üni.");

        personList = new ArrayList<>();
        personList.add(student);
        Educator educator = new Educator();
        educator.setId(1);
        educator.setName("Engin Demiroğ");
        educator.setProfession("Programming");
        educator.setEmailAdress("engindemirog@gmail.com");
        personList.add(educator);
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Hibernate");
    }

    @Override
    public void addCategory(Category category) {
        categories.add(category);
        System.out.println("Hibernate");
    }

    @Override
    public void addPerson(Person person) {
        personList.add(person);
        System.out.println("Hibernate");
    }

    @Override
    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }

    @Override
    public List<Category> getAllCategorys() {
        return new ArrayList<>(categories);
    }
}
