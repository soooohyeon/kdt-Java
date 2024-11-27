package whileTest;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
//		사용자가 0을 입력하면 종료되는 프로그램
//		1) Scanner 클래스 import
//		2) 변수 사용자가 입력한 변수 저장
//		3) 출력 메세지 (숫자 입력 : )
//		4) 변수 = sc.nextInt();
//		5) while (조건식) { ⇒ 변수 == 0
//		3) 출력 메세지 (숫자 입력 : )
//		4) 변수 = sc.nextInt(); } 입력을 다시 받지 않으면 반복실행이 아니라 종료하게 됨
//		6) sysout(입력한 값 출력);
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.print("숫자 입력 : ");
		choice = sc.nextInt();
		while (choice != 0) {
			System.out.println(choice);
			System.out.print("숫자 입력 : ");
			choice = sc.nextInt();
		}
		sc.close();
	}
}
