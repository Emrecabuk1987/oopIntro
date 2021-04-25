package oopIntro;

public class Product {
	
	public Product () {
		System.out.println("ben çalıştım");
	}//constructor yapıcı blok
	
	public Product(int id,String name,double unitPrice,String detail) {
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	};//override , aşırı yükleme
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
