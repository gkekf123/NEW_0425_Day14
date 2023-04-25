package day14_0425.basic2;

public class MainClass {

	public static void main(String[] args) {

		// 객체 생성
		Person p = new Person("이순신", 20);
		
		Student s1 = new Student("홍길동", 20, "123123");
		Student s2 = new Student("홍길순", 30, "345345");
		
		Teacher t1 = new Teacher("박찬호", 40, "야구");
		Teacher t2 = new Teacher("손흥민", 30, "축구");
		
		Employee e1 = new Employee("강감찬", 50, "역사부");
		
		//Student [] arr = {s1, s2};	//Student를 담을 수 있는 배열
		//Teacher [] terr= {t1, t2};
		
		// 부모타입을 활용한 배열의 다형성
		Person [] arr = {p, s1, s2, t1, t2, e1};	//부모타임의 배열에 답으면 위 코드처럼 배열을 나누지 않고 담을 수 있다.
		
		for(Person person : arr) {
			System.out.println(person.info()); //person 객체 뺸 나머지는 오버라이딩 되었다
		}
		
		System.out.println("===========================");
		
		//House객체의 inHouse메서드를 실행
		House h = new House();
		h.inHouse(p);
		h.inHouse(s1);
		h.inHouse(s2);
		h.inHouse(t1);
		h.inHouse(t2);
		h.inHouse(e1);
		
//		// 추가(instanceof)
		// h.printHouse();
		h.whoAreYou(p);
		h.whoAreYou(s1);
		h.whoAreYou(t1);
		h.whoAreYou(e1);
		
	}
}
