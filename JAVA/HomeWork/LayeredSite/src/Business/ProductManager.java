package Business;

import Business.Logging.Ilogger;
import DataBase.ProductDao;
import Entities.Category;
import Entities.Course;
import Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private CategoryManager categoryManager;
    private CourseManager courseManager;
    private ProductDao productDao;
    private List<Ilogger> iloggers;
    private ArrayList<Product> products;

    public ProductManager(ArrayList<Product> products, ProductDao productDao,
                          List<Ilogger> iloggers) {
        this.productDao = productDao;
        this.iloggers = iloggers;
        this.products = products;
        this.categoryManager = new CategoryManager();
        this.courseManager = new CourseManager();

    }
    public void add(Product product) {
        for (Ilogger ilogger : iloggers) {
            ilogger.log(product.getCourse().getName(), product.getTeacher().getName(),
                    product.getCategory().getName());
        }
        productDao.add(product);
        System.out.println("============================================");
    }

    public CategoryManager getCategoryManager() {
        return categoryManager;
    }

    public void setCategoryManager(CategoryManager categoryManager) {
        this.categoryManager = categoryManager;
    }

    public CourseManager getCourseManager() {
        return courseManager;
    }

    public void setCourseManager(CourseManager courseManager) {
        this.courseManager = courseManager;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<Ilogger> getIloggers() {
        return iloggers;
    }

    public void setIloggers(List<Ilogger> iloggers) {
        this.iloggers = iloggers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
