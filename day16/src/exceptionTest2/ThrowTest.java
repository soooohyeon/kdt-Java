package exceptionTest2;

import java.util.Scanner;

//8. 사용자 정의 예외 클래스 이용
public class ThrowTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		System.out.print("양의 정수만 입력 : ");
		number = sc.nextInt();
		
		if (number <= 0) {
//			System.out.println("음수 입력 불가");	// 해당 출력문은 제어는 되나 프로그램은 정상적으로 작동함
			try {							// 2. 해당 블록을 예외 처리함
				throw new MyException();	// 1. 강제로 예외를 발생 시킴
//				해당 MyException 클래스는 일반예외인 Exception 클래스를 상속 받은 상태
//				일반 예외는 컴파일러가 캐치하기 때문에 실행전부터 오류 확인 가능
			} catch (MyException e) {	// 업캐스팅 → 메소드가 오버라이딩 되어 있음
				e.printStackTrace();
			}
		} else {
			System.out.println("입력한 숫자는 " + number + "입니다.");
		}
		System.out.println("프로그램 종료");
		
	}
}
