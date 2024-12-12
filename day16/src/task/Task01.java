package task;

import java.util.InputMismatchException;
import java.util.Scanner;


class My01Exception extends RuntimeException {
//	실행 예외 클래스로 상속받음
//	외부에서 매개변수로 메세지 전달받아 부모 생성자로 메세지 전달
	public My01Exception (String msg) {
		super(msg);
	}
}

public class Task01 {
	public static void main(String[] args) {
//		1. 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 출력하는 프로그램을 만드세요. 
//		그리고 숫자가 아닌 값이 입력될 경우 "잘못된 입력입니다"라는 예외 메시지를 출력하고, 
//		프로그램을 종료하세요.
//		** 로직
//		1) Scanner 클래스 import
//		2) 정수형 변수와 결과를 담을 변수 선언 및 초기화
//		3) 출력메세지 및 입력받은 값 변수에 담기
//		4) 3번 코드 예외처리 진행
//			4-1) 숫자가 아닌 값이 입력되는 경우
//			4-2) 0 또는 음수 값이 입력되는 경우 > 예외 클래스 생성해서 강제 예외 발생시키기
//		5) 정수가 입력됐다면 for문 사용해서 총합 구하고 결과 출력
//		6) 버퍼 비우기
		
		Scanner sc = new Scanner(System.in);
		Task01 t = new Task01();	// 메소드를 위한 객체화
		int num = 0;
		
		System.out.print("정수 입력 : ");
		try {
			num = sc.nextInt();	// 해당 부분에서 정수가 아닌 숫자 입력 시 InputMismatchException으로 예외 처리
			t.printTotal(num);	// 총합 구하는 메소드 호출
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다.");
			System.out.println(e.toString());
		} 
		sc.close();		
	}
//	합계구하기 - 메소드로 분리
	void printTotal(int num) {
		int total = 0;
		if (num <= 0) {		// 양수가 아닌 정수 입력시
			try {
				throw new My01Exception("양의 정수를 입력해주세요.");	// 강제 예외 발생, 문구 직접 지정
			} catch (My01Exception e) {							// 사용자 정의 예외 클래스으로 예외 처리
				System.out.println(e.getMessage());				// 지정한 예외 문구 출력
			}
		} else {			// 양의 정수라면
			for (int i = 1; i <= num; i++) {					// 총합 구하기
				total += i;
			}
			System.out.println("1부터 " + num + "까지의 총합 : " + total);	// 결과 출력
		}
	}
}
