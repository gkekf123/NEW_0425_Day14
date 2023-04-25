package day14_0425;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		
		System.out.println("========== 문제3 ==========");
		Scanner sc = new Scanner(System.in);
		User[] uArr = new User[5];
		
		//User user = new User();	// 반복문 밖에서 1개만 만들어짐
		
		int i = 0;
		while(i < uArr.length) {
			
			System.out.println(">");
			String name = sc.next();
			System.out.println(">");
			int age = sc.nextInt();
			System.out.println(">");
			int rrn = sc.nextInt();
			
			User user = new User(name, age, rrn);	// 1개 x 5
	
			uArr[i] = user;
			
			i++;
			System.out.println(Arrays.toString(uArr));
		}
		
	}

}
