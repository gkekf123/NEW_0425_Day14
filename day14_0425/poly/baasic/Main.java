package day14_0425.poly.baasic;

public class Main {

	public static void main(String[] args) {
		
		// 자식 클래스는 부모의 메서드 다 사용가능(자기 자신메서드 포함)
		Child c = new Child();
		c.method01();	// 상속받은
		c.method02();	// 오버라이드 된
		c.method03();	// 자식 클래스
		
		System.out.println("========== 다형성 적용(형변환)==========");
		
		// Parent처럼 사용 됨 단, 자식의 오바리읃 된 메서드가 실행 된다
		Parent p = c;
		p.method01();	
		p.method02();
		// p.method03();
		
		// 주소값이 같다
		System.out.println(p);	// parent 타임
		System.out.println(c);	// child 타입
		System.out.println(p == c);	//child로 생성 된 자식은 원래의 객체를 유지함
	
		System.out.println("========== 클래스 강제 형변환 ==========");
		
		//원본이 child로 생성되었다면, 강제 형변환이 가능함
		Parent pp = new Child();	// child로 생성해서 Parent에 
		System.out.println(pp);		// child 원본
		
		Child cc  = (Child)pp;	// -> 강제 형변환
		System.out.println(cc);
		cc.method01();
		cc.method02();
		cc.method03();
		
		// 주의 할점 -> 다형성이 적용 되었던 객체만 강제 형변환이 가능함
		Object obj = new Object();
		//Child ccc = (Child)obj;		//runtime exception
		
		System.out.println("========== 다형성의 또 다른 에시 ==========");
		
		String str = "홍길동";
		Object o = str;
		System.out.println(o);
		
		String result = (String)o; // 가능
		
		
	}	
	
}
