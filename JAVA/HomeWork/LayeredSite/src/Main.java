
import Business.Logging.DataBase;
import Business.Logging.FileLogger;
import Business.Logging.Ilogger;
import Entities.*;
import java.util.ArrayList;
import Business.*;
import DataBase.Hibernate;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<>();
        Ilogger[] iloggers = {new FileLogger(), new DataBase()};
        Product product1 = new Product(new Category("Coding"),
                new Course(1,"java",500),
                new Teacher("Hakan","kaya"));
        Product product2 = new Product(new Category("Math"),
                new Course(1,"Calculus",500),
                new Teacher("Hakan","kaya"));

        ProductManager productManager = new ProductManager(productList,
                new Hibernate(), List.of(iloggers));
        productManager.add(product1);
        productManager.add(product2);
    }
}