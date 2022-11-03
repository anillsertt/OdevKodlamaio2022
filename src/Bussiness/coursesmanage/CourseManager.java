package Bussiness.coursesmanage;

import dataAccsess.IDBService;
import entites.courses.Course;
import logger.ILoggerService;

import javax.swing.*;
import java.util.List;

public class CourseManager implements ICourseService {

    IDBService idbService;
    ILoggerService iLoggerService;

    public CourseManager(ILoggerService iLoggerService,IDBService idbService){
        this.iLoggerService =iLoggerService;
        this.idbService = idbService;
    }
    public CourseManager(){

    }


    @Override
    public void add(Course course) {
            if (!checkIfCourseNameExist(course)){
                idbService.addCourse(course);
            }
        }

        @Override
        public void delete (Course course){

        }

        @Override
        public void read (Course course){

        }
        public List<Course>getAll(){
            return idbService.getAllCourses();
        }
        public boolean checkIfCourseNameExist(Course course) {
            for (Course _course : getAll()) {
                if (course.getCourseName().equalsIgnoreCase(_course.getCourseName())) {
                    System.out.println("Kurs ismi zaten var");
                    return true;
                }
            }
            return false;
        }
    public void checkPrice(Course course){
        if (course.getPrice() < 0 ){
            System.out.println("Fiyat sıfırdan küçük olamaz");
        }

    }


}



