package inheritance2;

public class Main {

	public static void main(String[] args) {
		//birbirini alternatifi olan kodlar için if yazılmaz!!!
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new FileLogger());
		

	}

}
