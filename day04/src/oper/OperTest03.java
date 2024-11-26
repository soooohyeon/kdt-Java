package oper;

import java.util.Scanner;

// 11번 : 관계연산자, 논리연산자
public class OperTest03 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;
//		** 사용자가 입력한 값 2개를 서로 비교하기
//		1) Scanner 클래스 import
//		2) 2개의 변수 선언 및 초기화
//		3) 출력 메세지 (변수 2개 입력)
//		4) 입력받은 값 변수에 저장
//		5) 아래 출력 메소드 실행
//		6) 버퍼 비우기
//		int num1 = 0, num2 = 2;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 2개 입력 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		sc.nextLine();
		
		System.out.println("num1 > num2 : num1이 num2보다 크니? " + (num1 > num2));
		System.out.println("num1 < num2 : num1이 num2보다 작니? " + (num1 < num2));
		System.out.println("num1 >= num2 : num1이 num2보다 크거나 같니? " + (num1 >= num2));
		System.out.println("num1 <= num2 : num1이 num2보다 작거나 같니? " + (num1 <= num2));
		System.out.println("num1 == num2 : num1과 num2가 같니? " + (num1 == num2));
		System.out.println("num1 != num2 : num1과 num2가 같지 않니? " + (num1 != num2));
		
		System.out.println("======== 논리연산자(AND &&) ========");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("======== 논리연산자(OR ||) ========");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("======== 논리연산자(NOT !) ========");
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
