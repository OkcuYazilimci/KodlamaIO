package DataBase;

import Entities.Category;
import Entities.Product;

public interface ProductDao {
    void add(Product product);
    void add(Category category);
}
