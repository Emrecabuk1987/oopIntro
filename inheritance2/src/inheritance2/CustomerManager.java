package inheritance2;

public class CustomerManager {
	  public void add(Logger logger) {
		  System.out.println("Müşteri eklendi");
		  logger.log();
	  }
}
//iş yapan sınıf başka bir iş yapan sınıfı kullanıcaksa
//asla ve asla somut sınıftan gidilmez (işyapan sınıf somut sınıf))
