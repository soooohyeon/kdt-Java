package oper;

import java.util.Scanner;

// 1번 : 삼항연산자
public class OperTask01 {
	public static void main(String[] args) {
//		정수 2개를 입력받아서 큰 수 출력하기 (삼항연산자 이용)
//		1) Scanner 클래스 import
//		2) 입력받을 정수 2개, 비교할 결과 변수 선언 및 초기화
//		3) 출력 메세지 & 입력받은 정수 변수에 담기
//		4) 비교
//		5) 결과 출력
//		6) 버퍼 비우기
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String result = "";
		System.out.print("2개의 정수 입력 (띄어쓰기로 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = num1 > num2 ? "큰 수 : " + num1 : num1 == num2 ? "두 정수는 같음" : "큰 수 : " + num2;
		System.out.println(result);
	}
}
