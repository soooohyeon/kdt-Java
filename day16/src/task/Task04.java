package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
//		4. 사용자로부터 숫자를 입력받아, 입력받은 숫자가 3의 배수인 경우 "Fizz", 
//		5의 배수인 경우 "Buzz", 3과 5의 공배수인 경우 "FizzBuzz", 
//		그 외의 경우에는 입력받은 숫자를 출력하는 프로그램을 작성하세요. 
//		사용자가 문자열을 입력할 경우, "숫자가 아닌 문자열이 입력되었습니다"라는 예외 메시지를 출력하세요.
//		** 로직
//		1) Scanner 클래스 import
//		2) 입력받을 변수 선언 및 초기화
//		3) 메세지 출력 및 입력받은 값 변수에 저장
//		4) 예외 발생 - 정수 외 값 입력했을 경우
//		5) 조건에 맞는 결과 출력
//		6) 버퍼 비우기
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("3 또는 5의 배수를 입력 : ");
		try {
			number = sc.nextInt();
			if (number % 3 == 0 || number % 5 == 0) {	// 3 또는 5의 배수라면
				String result = number % 3 == 0 && number % 5 == 0 ? "FizzBuzz" : number % 3 == 0 ? "Fizz" : "Buzz";
				System.out.println(result);
			} else {
				System.out.println("입력하신 숫자는 " + number + "입니다");
			}
		} catch (InputMismatchException e) {	// 정수 외의 값을 입력한 경우
			System.out.println("숫자 외의 값이 입력되었습니다.");
		}
		sc.close();
	}
}
