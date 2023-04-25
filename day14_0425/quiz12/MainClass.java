package day14_0425.quiz12;

public class MainClass {

	public static void main(String[] args) {

//		Radio r = new Radio();	//300, 소니
//		
//		r.setPrice(10000);	//값 변경
//		System.out.println(r.getPrice());
//		System.out.println();
		
		
		MyCart cart1 = new MyCart(1);
		cart1.buy(new Radio());
		
		MyCart cart2 = new MyCart(50000);
		cart2.buy(new Radio());
		cart2.buy(new Tv());
		cart2.buy(new Computer());
		cart2.buy(new Radio());
	}

}
