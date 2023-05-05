package oopWithNLayeredApp.dataAccess;

import oppWithN.entities.Product;

public class HiberNateProductDao implements ProductDao {
    public  void add(Product product)
    {
        System.out.println("Hibernate olarak Data Base'ye eklendi");
    }
}
