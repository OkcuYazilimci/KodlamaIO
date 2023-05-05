package oopWithNLayeredApp.dataAccess;

import oppWithN.entities.Product;
/* Bir paketten baska bir paketteki class'i cagirmak istiyorsak o paketi import etmemiz
gerekir
Bu katmanda sadece DataBase erisim kodlari yazilir ve SQL bilgisi gerekir*/

public class JdbcProductDao implements ProductDao{
    public void add(Product product) {
    System.out.println("JDBC ile Veri tabanina eklendi");}
}
