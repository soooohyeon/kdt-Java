package oper;

import java.util.Scanner;
// 8번 예제
public class IfTest03 {
	public static void main(String[] args) {
//		삼항연산자로 작성했던 두 수를 입력받아 큰 수 출력하기
//		⇒ if - else if - else 문으로 변경
//		로직
//		1) Scanner 클래스 import
//		2) 변수 선언 int 2개
//		3) 입력메세지 출력하고 입력받은 변수 저장
//		4) 조건문 if 사용
//		4-1) if (변수1 > 변수2) { 변수1이 변수2보다 큽니다 }
//		4-2) else if (변수1 == 변수2) { 변수1과 변수2가 같습니다 }
//		4-3) else { 변수2가 변수1보다 큽니다 }
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.print("정수1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수1 입력 : ");
		num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.printf("%d가 %d보다 %d 큽니다.", num1, num2, (num1-num2));
		} else if (num1 == num2) {
			System.out.printf("%d와 %d가 같습니다.", num1, num2);
		} else { 
			System.out.printf("%d가 %d보다 %d 큽니다.", num2, num1, (num2-num1));
		}
		sc.close();
	}
}
