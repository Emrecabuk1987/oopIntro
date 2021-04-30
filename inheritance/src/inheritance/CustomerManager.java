package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " Kaydedildi");
	}
	//bulk insert toplu müşteri işleme
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}
//S(O)LID-Open closed principle - sisteme yeni özellik eklendiğinde
// mevcutta bulunan hiç bir kodu değiştiremezsin