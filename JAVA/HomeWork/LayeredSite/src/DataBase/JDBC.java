package DataBase;
import Entities.Category;
import Entities.Product;

public class JDBC implements ProductDao{
    @Override
    public void add(Product product) {
        System.out.println("Added to data base by using JDBC");
    }

    public void add(Category category) {System.out.println("Added " +
            "to data base by using JDBC");
    }
}
