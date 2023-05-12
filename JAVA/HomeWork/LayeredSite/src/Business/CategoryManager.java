package Business;

import Entities.*;
import java.util.ArrayList;
public class CategoryManager {
    private ArrayList<Category> categories;
    public CategoryManager() {
        this.categories = new ArrayList<>();
    }
    public void add(Category category) {
        try {
            for (Category category1 : categories) {
                if (category1.getName().equals(category.getName())) {
                    throw new Exception("Category name is already exists!");
                }
            }
            categories.add(category);
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
