package day14_0425.quiz12;

public class Product {

	private String name;
	private int price;
	
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	//getter / setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
