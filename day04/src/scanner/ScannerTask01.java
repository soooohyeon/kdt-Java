package scanner;

import java.util.Scanner;

// 5번 : 입력 메소드 실습
public class ScannerTask01 {
	public static void main(String[] args) {
//		두 정수를 입력받고 합을 출력하기
//		next 메소드 사용할 것
//		[ 입출력 결과 ]
//		정수1 입력 : 10
//		정수2 입력 : 20
//		두 정수의 합은 30입니다.
		
////		로직구성 (1)
////		1. 입력 클래스 import
//		Scanner sc = new Scanner(System.in);
////		2. 출력 메세지 (무엇을 입력받을지)
//		System.out.print("정수1 입력 : ");
////		3. 정수1 입력받아 변수에 저장
//		int num1 = Integer.parseInt(sc.next());
////		4. 2-3번 반복해서 변수2 입력받고 변수에 저장
//		System.out.print("정수2 입력 : ");
//		int num2 = Integer.parseInt(sc.next());		
////		5. 결과 변수에 입력받은 두 변수 합계 저장
//		int sum = num1 + num2;
////		6. 결과 출력
//		System.out.printf("두 정수의 합은 %d입니다.", sum);
		
//		로직구성 (2)
//		1. 입력받을 변수 2개 선언
		String num1 = "", num2 = "";
		int sum = 0;
//		2. 입력 클래스 import
		Scanner sc = new Scanner(System.in);
//		3. 출력메세지(정수1 입력)
		System.out.print("정수1 입력 : ");
//		4. 정수1 입력받아 변수에 저장(입력 메소드)
		num1 = sc.next();
//		5. 3-4번 반복하여 정수2 입력받고 변수에 저장
		System.out.print("정수2 입력 : ");
		num2 = sc.next();
//		6-1. 결과 출력(형변환)
		System.out.println("두 정수의 합은 " + (Integer.parseInt(num1) + Integer.parseInt(num2)) + "입니다.");
//		6-2. 결과 출력(형변환)
		sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.println("두 정수의 합은 " + sum + "입니다.");
	}
}
