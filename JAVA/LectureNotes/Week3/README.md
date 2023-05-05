# WEEK 3 
* **13.00** Hepsi buradaya girdi ve urunlerin ***datalarinin database***'de saklandigini
anlatti. Gelen data kullaniciya ozel bir sekilde gelmektedir buna ***is gelistirme***
deniyor.

    * DATA ACCESS
    * BUSINESS
    * API (Yardimci katman) **Spring'e gecildiginde bahsedilcek** 
    * UI


* Bu yapiyi farkli alanlara parcalamamizin sebebi surdurebilirlilik ve yonetim kolayligii
amaciyla yapilmaktadir.


* **JPA'nedir arastir??**
<br />
  JPA (Java Persistence API), Java platformunda nesne ilişkisel eşleme (ORM) işlevselliğini 
sağlamak için kullanılan bir API'dir. JPA, veritabanı kaynaklarına erişimi yönetmek ve Java 
nesnelerini bu kaynaklara kaydetmek, güncellemek ve silmek için bir çerçeve sağlar. JPA, veritabanı 
tablolarının oluşturulması, sorgulanması ve yönetilmesi için kullanılan SQL kodlarını otomatik olarak 
üretir.


* **Entities veri tabani nesneleridir.**
  * Products
  * Customer 
  * vb.


* **JDBC Nedir?**
<br />
Java Database Connectivity (JDBC), Java programlama dilinde veritabanlarına erişim sağlamak için 
kullanılan bir API'dir. JDBC, JDBC sürücüsü kullanarak Java uygulamalarının veritabanlarına erişmesini 
ve veri okumasını, yazmasını ve güncellemesini sağlar. JDBC, veritabanı türünden bağımsızdır ve farklı 
veritabanı sistemleri için kullanılabilen standart bir API'dir.


* **Hibernate nedir?**
<br />
  Hibernate, Java programlama dili için bir ORM (Object-Relational Mapping) çerçevesidir. Hibernate, Java
nesnelerini ilişkisel veritabanı tablolarıyla eşleştirmek ve nesne yönelimli programlama (OOP) prensiplerini
koruyarak veritabanı işlemleri yapmak için kullanılır. Hibernate, veritabanı işlemlerini gerçekleştirmek
için JDBC (Java Database Connectivity) yerine kendi bağımsız API'sini kullanır.


* **Hibernate ve JDBC arasindaki farklar?**
<br />
  Hibernate ve JDBC, Java programlama dili için veritabanı işlemleri yapmak için kullanılan farklı yaklaşımlardır.
<br />
JDBC (Java Database Connectivity), Java uygulamalarının veritabanlarına erişmek için kullanabilecekleri bir API (Application Programming Interface) sağlar. JDBC, veritabanı işlemlerini gerçekleştirmek için JDBC sürücüsü kullanır. JDBC sürücüsü, belirli bir veritabanı yönetim sistemi (DBMS) için özelleştirilmiş bir yazılım parçasıdır. JDBC, SQL sorgularını doğrudan veritabanına gönderir ve sonuçları işler.


* **Constructor Method nedir?**
<br />
  Java'da bir sınıfın nesnesi oluşturulduğunda ilk çağrılan metoda constructor (yapıcı metod) denir. Constructor metodu, nesnenin ilk durumunu ve özelliklerini belirlemek için kullanılır.


* **Dependency Injection nedir?**
<br />
  
## INTERFACE
  ***Bir katman baska bir katmanin class'ini kullaniyorsa sadece interfacesinden erisim saglanmalidir.***
  
