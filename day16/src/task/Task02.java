package task;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
//		2. 문자열을 입력받아, 입력받은 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 
//		만약 입력받은 문자열이 숫자가 아닐 경우, NumberFormatException 예외가 발생하게 되며, 
//		"숫자가 아닌 문자열이 입력되었습니다"라는 메시지를 출력하세요.
		
//		1) Scanner 클래스 import
//		2) 입력받을 문자열 변수 선언 및 초기화
//		3) 예외 처리 -> 입력 값이 정수가 아닐 경우
//			* 실수가 입력되거나 빈칸 또는 빈칸을 포함한 값이 입력되어도 NumberFormatException이 발생
//		4) 정수 입력시 Integer.parseInt() 통해 정수로 변환
//		5) 버퍼 비우기

		Scanner sc = new Scanner(System.in);
		String number = "3.4";
		int resultNum = 0;
		
		System.out.print("정수 입력 : ");
		try {
			number = sc.nextLine();
			System.out.println("변환한 결과 : " + Integer.parseInt(number));
		} catch (NumberFormatException e) {	// 문자, 공백, 실수를 포함한 예외
			System.out.println("숫자가 아닌 문자열이 입력되었습니다.");
		}
		sc.close();
	}
}
