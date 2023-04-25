package day14_0425.Quiz;

public class MainClass {

	public static void main(String[] args) {

		//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
		KeyBoard keyboard = new KeyBoard();
		Monitor monitor = new Monitor();
		Mouse mouse = new Mouse();
		
		Computer com = new Computer(keyboard, monitor, mouse);
		
		com.computerInfo();
		
		//get메서드
		Monitor m = com.getMonitor();	//변수명은 다르게 해줘야 됨
		m.info();
		
	}

}
