
import oopWithN.business.ProductManager;
import oopWithN.core.logging.DataBase;
import oopWithN.core.logging.FileLogger;
import oopWithN.core.logging.ILogger;
import oopWithNLayeredApp.dataAccess.HiberNateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oppWithN.entities.Product;

import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone 14 Pro", 30000);

        ILogger[] loggers = { new FileLogger(), new DataBase()};
        ProductManager productManager = new ProductManager(new HiberNateProductDao(), List.of(loggers));

        productManager.add(product1);
    }
}