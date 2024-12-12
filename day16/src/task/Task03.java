package task;

import java.util.InputMismatchException;
import java.util.Scanner;

class My03Exception extends Exception {
//	일반예외 클래스로 상속받기 -> 해당 예외 강제 발생시 오류 발생
//	매개변수로 전달받은 메세지, 부모 생성자로 값 전달
	public My03Exception (String msg){
		super(msg);
	}
}

public class Task03 {
	public static void main(String[] args) {
//		3. 사용자로부터 정수를 입력받아, 입력받은 정수가 0에서 100 사이의 값인 경우, 
//		입력받은 정수를 2배한 값을 출력하고, 그 외의 값이 입력될 경우 
//		"잘못된 입력입니다"라는 예외 메시지를 출력하세요.
//		** 로직
//		1) Scanner 클래스 import
//		2) 입력받을 정수형 변수 선언 및 초기화
//		3) 예외 처리
//			3-1) 정수 외 값이 입력된 경우 -> InputMismatchException
//			3-2) 범위 밖 정수가 입력된 경우 -> 사용자 정의 예외 클래스 생성
//		4) 버퍼 비우기
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		System.out.print("정수 입력 : ");
		try {
			number = sc.nextInt();
			if (number >= 0 && number <= 100) {	// 범위 내 입력시 결과 출력
				System.out.println("결과 : " + (number * 2));
			} else {	// 범위 밖일 때 강제 예외 발생시키고 예외 처리하기
				try {
					throw new My03Exception("범위 밖의 정수입니다.");	// 일반예외 상속으로 오류 발생됨 → 바로 예외 처리해주면 해결
				} catch (My03Exception e) {
					System.out.println(e.getMessage());	// 지정한 문구로 예외메세지 출력
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("정수 외의 값 입력시 발생하는 예외 : " + e.toString());
			System.out.println("잘못된 입력입니다.");
		}
		sc.close();
	}
}
