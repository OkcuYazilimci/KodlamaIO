# LAYERED ARCHITECTURE CODING
kodlama.io web sitesinin ana sayfasında bulunan eğitmen, kategori ve kurs bölümlerini katmanlı mimaride 
kodlamak istiyoruz.

Önceki derste yaptığımız tekniklerle hem jdbc hem de hibernate üzerinde yazmış gibi simüle ediniz.

Çoklu loglama yapısını simule ediniz.

Aşağıdaki isterleri gerçekleştiriniz.
<br />
* Kurs ismi tekrar edemez
* Kategori ismi tekrar edemez
* Bir kursun fiyatı 0 dan küçük olamaz
* Kodlarınızı github'a aktarınız

Diğer arkadaşlarınızın kodlarını inceleyip beğenirseniz yıldızlayınız.

Not: Aldığınız yıldızlar github sayfa kaliteniz için sektörde çok belirleyicidir.

## WHAT IS JDBC?
Java JDBC (Java DataBase Connectivity) MySQL, Oracle, MS SQL Server gibi veritabanlarına bağlanmak
veri çekme, listeleme, ekleme, silme, güncelleme gibi işlemleri yapmak için kullanılan pakettir.

JDBC API kullanımı için gerekli olan sınıflar java.sql paketinde yer alır.

JDBC yapısı veritabanından bağımsız olduğundan SQL destekleyen tüm ilişkisel veritabanı ile birlikte 
çalışır.

Örneğin; MySQL veritabanında yer alan öğrenci listesi Oracle veritabanına taşınıp oradan alınmak isten-
diğinde sadece bağlantı cümlesinin değiştirilmesi yeterli olacaktır.

## WHAT IS HIBERNATE?
* Hibernate, Java platformunda yazılmış bir ORM (Object/Relational Mapping) aracıdır. ORM, nesne odaklı
(object oriented) dillerdeki nesnelerin, ilişkisel veri tabanlarındaki (relational databases) kayıtlara
nasıl karşılık geldiğini yürüten bir teknolojidir. NHibernate adında .NET çatısı için yeniden yazılmış
bir türevi bulunur.


* Yazılım geliştirirken verilerimizi yazılımın içerisinde kalıcı olarak barındıramayız. İşte bunun için 
yıllardan gelen süreçte farklı sistemler gelişmiş ve veritabanları(database) ortaya çıkmış. DBMS(Database
Management System) için birçok farklı çözüm ortaya çıkmış ve bunlardan en popüleri ise ilişkisel verita-
banları(relational databases). İlişkisel veritabanlarında da firmalar ve communityler kendi veritabanı 
sistemlerini duyurmuş. Bunlardan bazıları küçük yazılım projeleri için geliştirilmişken, bazıları kurumsal
projelere çözüm sunmakta. Popüler veritabanlarından bazıları MySQL, PostgreSQL, SQL Server, Oracle ve 
diğer yüzlercesi…

## WHAT IS MULTIPLE LOG STRUCTURE?

Java'da çoklu loglama yapısı, bir Java uygulamasının birçok farklı loglama mekanizması tarafından aynı 
anda kullanılabilmesine olanak tanıyan bir yapıdır. Bu yapı, farklı loglama mekanizmalarının aynı anda 
çalıştırılmasına ve loglama verilerinin farklı kaynaklara kaydedilmesine izin verir.

Java'da çoklu loglama yapısı, genellikle loglama verilerinin farklı seviyelerde kaydedilmesi gerektiği 
durumlarda kullanılır. Örneğin, bir uygulamanın hata veya uyarıları bir dosyaya kaydedilirken, daha düşük 
seviyeli loglama verileri bir veritabanına kaydedilebilir.

Bu yapı, Java'da yerleşik olarak desteklenmez, ancak birçok loglama kütüphanesi tarafından sağlanır. Örneğin
, Log4j ve Logback gibi popüler loglama kütüphaneleri, çoklu loglama yapısını destekler ve bir uygulamanın 
aynı anda birden fazla loglama mekanizmasını kullanmasına izin verir.

```ruby
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiLoggerExample {
    private static final Logger log4jLogger = LogManager.getLogger(MultiLoggerExample.class);
    private static final org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(MultiLoggerExample.class);

    public static void main(String[] args) {
        // Loglama yapısı örnekleri
        log4jLogger.debug("Loglama yapısı örneği: Log4j");
        slf4jLogger.debug("Loglama yapısı örneği: SLF4J");
    }
}
```
Yukarıdaki örnekte, Log4j ve SLF4J loglama kütüphaneleri kullanılarak iki farklı loglama yapısı örneği
oluşturulmuştur. LogManager.getLogger yöntemi ile Log4j loglama yapısı örneği oluşturulurken, 
LoggerFactory.getLogger yöntemi ile SLF4J loglama yapısı örneği oluşturulmuştur. debug yöntemi kullanılarak
her iki loglama yapısı örneğine de bir mesaj yazılmıştır. Bu şekilde, aynı uygulama hem Log4j hem de SLF4J
loglama mekanizmalarını kullanarak aynı anda loglama yapabilir.













