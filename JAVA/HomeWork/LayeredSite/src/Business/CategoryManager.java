package Business;

import DataBase.ProductDao;
import Entities.*;
import java.util.ArrayList;
public class CategoryManager {
    private ProductDao productDao;
    private ArrayList<Category> categories;
    public CategoryManager() {
    this.categories = new ArrayList<>(); }
    public CategoryManager(ProductDao productDao) {
        this.categories = new ArrayList<>();
        this.productDao = productDao;
        }

    public void create(Category category) {
        try {
            for (Category category1 : categories) {
                if (category1.getName().equals(category.getName())) {
                    throw new Exception("Category name is already exists!");
                }
            }
            categories.add(category);
            productDao.add(category);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
