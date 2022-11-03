import Bussiness.coursesmanage.CourseManager;
import dataAccsess.HibernateDB;
import entites.courses.Course;
import logger.DataBaseLogger;

public class Main {
    public static void main(String[] args) {

        CourseManager courseManager = new CourseManager(new DataBaseLogger(),new HibernateDB());
        courseManager.add(new Course(1,"Javasdf Geliştme Kampı",-5,79,1));
        for (Course _course : courseManager.getAll()){
            System.out.println(_course.getCourseName());
        }
    }
}