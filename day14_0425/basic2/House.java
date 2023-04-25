package day14_0425.basic2;

public class House {

//	private Student [] student = new Student [100];
//	private Employee []	employee = new Employee[100];
//	private Teacher []	teacher = new Teacher[100];
//	private int index1;
//	private int index2;
//	private int index3;
	
	
//	public void inhouse(Student s) {
//		student[index1] = s;
//		index1++;
//	}
//	public void inhouse(Teacher t) {
//		teacher[index2] = s;
//		index1++;
//	}
//	public void inhouse(Employee e) {
//		employee[index3] = s;
//		index1++;
//	}
	
	Person [] person = new Person[100];
		
	private int index;
	
	public void inHouse(Person p) {
		person[index] = p;
		index++;
	}
	// 추가 -> 배열안에 ㄷㄹ어있는 객체의 타입에 맞추어 출력
//	public void printHouse() {
		
//		for(int i = 0; i < index; i++) {
//			if(person[i] instanceof Student) {
//				System.out.println("Student");
//			} else if(person[i] instanceof Teacher) {
//				System.out.println("Teacher");
//			} else if(person[i] instanceof Employee) {
//				System.out.println("Employee");
//			}else {
//				System.out.println("Person");
//			}
//		}	
//	}
	
	// instanceof
	public void whoAreYou(Person p) {
		if(p instanceof Student) {
			System.out.println("넌 학생이야");
			Student s = (Student)p;
		}else if(p instanceof Teacher) {
			System.out.println("넌 선생이야");
		}else if(p instanceof Employee) {
			System.out.println("넌 직원이야");
		}else {
			System.out.println("넌 그냥 직원이야");
		}
	}

}
