package day14_0425.poly.baasic;

/* 
 * 하나의 자바 파일에는 여러 클래스 선언이 된다
 * 단, 파일명과 동일한 클래스가 있어야하고, 해당 클래스만 piblic이면 된다
 */
class A{}	// 상속 관계 : A-B-D/A-C-E
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {

	// 멤버변수
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	// 선언 문장	// a = new A(); 값을 넣는 문법안 틀린문법
	A a1 = b;	// b = class B extends A{}
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	// 위 문법 줄여서 쓰면
	A a5 = new B();	// B -> A 변환
	
	// 기본타입변수
	int x = 1;
	double y = x; // int -> double로 변환
	
	// Object타입 모든 클래스가 저장 할 수 있다
	Object o1 = a;
	Object o2 = "믄자얄";
	Object o3 = 1;
	Object o4= new B();
	
	}
