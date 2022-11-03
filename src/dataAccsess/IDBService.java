package dataAccsess;

import entites.categorys.Category;
import entites.courses.Course;
import entites.persons.Person;

import java.util.List;

public interface IDBService {
        void addCourse(Course course);
        void addCategory(Category category);
        void addPerson(Person person);
        List<Course> getAllCourses();
        List<Category> getAllCategorys();
}
