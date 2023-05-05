package oopWithN.business;

import oopWithNLayeredApp.dataAccess.ProductDao;
import oppWithN.entities.Product;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithN.core.logging.ILogger;
import java.util.logging.Logger;
import java.util.List;
public class ProductManager {
    private ProductDao productDao;
    private List<ILogger> loggers;
// List<ILogger> bir collectiondir ve bu sekilde yazilabilir ama farklidirlar ILogger[] loggers;
    public ProductManager(ProductDao productDao, List<ILogger> loggers) {

        this.productDao = productDao;
        this.loggers = loggers;
    }
    public void add(Product product) throws Exception {

        //is kurallari yaziliyor buraya
        boolean isTrue = false;
        while(!isTrue) {
            if (product.getUnitPrice() >= 10) {
               /* JdbcProductDao productDao = new JdbcProductDao();
                HiberNateProductDao productDao = new HiberNateProductDao();
                ProductDao productDao = new JdbcProductDao();
                Interface referanslarini tutabilir
                 */
                for (ILogger loggers : loggers)
                {
                    loggers.log(product.getName());
                }
                productDao.add(product);
                isTrue = true;
            }
            else {
            throw new Exception("Urun fiyati 10'dan buyuk olmali");
            /* hata firlatilirsa program durur bunun olmasini istemiyoruz */
            }
        }
    }
}
