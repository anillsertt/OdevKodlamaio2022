package Bussiness.categorysmanage;


import dataAccsess.IDBService;
import entites.categorys.Category;
import entites.courses.Course;

import java.util.List;

public class CategoryManager implements ICategoryService {
    IDBService idbService;
    public List<Category> getAll(){
        return idbService.getAllCategorys();
    }

    public boolean checkIfCategoryNameExist(Course course) {

        for (Category _category: getAll()) {
            if (_category.getCategoryName().equalsIgnoreCase(_category.getCategoryName())) {
                System.out.println("Kategori ismi zaten var!!!!");
                return true;
            }


        }
        return false;
    }


    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void read() {

    }
}
