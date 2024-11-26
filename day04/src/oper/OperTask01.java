package oper;

import java.util.Scanner;
// 10번 : 연산자 실습
public class OperTask01 {
	public static void main(String[] args) {
//		Scanner import
		Scanner sc = new Scanner(System.in);
		
//		=====================================================================================
		
//		1. 사용자로부터 2개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기
////			** 로직
////			1) 2개의 숫자를 입력받을 변수와 각각의 합과 곱의 결과를 담을 변수 선언 및 초기화
////			2) 출력 메세지 (정수1 입력 : )
////			3) 입력받은 정수를 변수에 담기
////			4) 2~3번 반복하여 입력받은 값을 정수2 변수에 담기
////			5) 각각의 합과 곱 계산하고 출력하기
////			6) 엔터값 소모를 위한 nextLine()
//		int num1 = 0, num2 = 0, sum = 0, multiply = 0;
//		System.out.print("2개의 정수를 띄어쓰기로 구분해서 입력 : ");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		sum = num1 + num2;
//		multiply = num1 * num2;
//		
//		System.out.printf("정수1 : %d\n정수2 : %d\n합 : %d\n곱 : %d\n", num1, num2, sum, multiply);
//		sc.nextLine();
//		
////		=====================================================================================
//		
////		1-2. 1번에서 입력받은 2개의 숫자를 사용하여 평균을 계산하고 소수점 두자리수까지 출력하기
////			** 로직
////			1) 평균 담을 변수 선언
////			2) 평균 계산하고 출력
//		double average = 0.0;
//		average = (double)sum / 2;
////		average = sum / 2.0;
//		System.out.printf("평균 : %.2f", average);
		
//		=====================================================================================

//		3. 두 자리수 정수를 입력받고 시의 자리와 일의 자리를 출력하기
//		- 입출력 결과
//			두 자리수 정수를 입력하세요
//			십의 자리는 _입니다. 일의 자리는 _입니다.
//			** 로직
//			1) 두 자리수 담을 정수 선언 및 초기화
//			2) 출력 메세지
//			3) 입력받은 두 자리 수 정수를 변수에 담기
//			4) 각각의 십의 자리와 일의 자리를 구하고 출력
//			5) 엔터값 소모를 위한 nextLine()
		int num3 = 0;
		System.out.print("두 자리수 정수 입력 : ");
		num3 = sc.nextInt();
		System.out.printf("십의 자리는 %d입니다. 일의 자리는 %d입니다.", num3/10, num3%10);
		sc.nextLine();

//		=====================================================================================
		
//		4. 코인 노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를 수 있는 곡수와 잔돈 출력하기
//		한 곡의 가격은 400원 입니다.
//			** 로직
//			1) 한 곡의 가격을 받을 상수 변수와 입력받을 금액을 담을 변수, 계산 후 담을 곡수 와 잔돈 변수 → 총 4개 선언 및 초기화
//			2) 출력 메세지	(입력받을 금액)
//			3) 입력받은 정수를 변수에 담기
//			4) 부를 수 있는 곡수와 잔돈 계산
//			5) 결과 출력
//			6) 더 이상 입력받을 일이 없기 때문에 Scanner 클래스 닫기
		final int PRICE = 400;
		int money = 0, songCount = 0, changeMoney = 0;
		System.out.printf("한 곡의 가격 : %d\n", PRICE);
		System.out.print("금액 입력 : ");
		money = sc.nextInt();
		songCount = money / PRICE;
		changeMoney = money % PRICE;
		System.out.printf("부를 수 있는 곡의 개수 : %d곡\n잔돈 : %d원", songCount, changeMoney);
		sc.close();
		
	}
}
