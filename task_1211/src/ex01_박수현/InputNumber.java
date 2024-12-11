package ex01_박수현;

import java.util.Scanner;

public class InputNumber {
	public static void main(String[] args) {
//		1. 사용자로부터 3개의 정수를 입력받아 아래 요구사항대로 구현하라
//		- 클래스명 : InputNumber
//		- 배열은 사용하면 안된다
//		1) 최소값과 최대값 출력
//		2) 3개 숫자의 평균을 소수점 2자리까지 출력
		
//		1-1)
//		1. Sanncer 클래스 import
//		2. 입력받을 3개의 정수형 변수, 최대/최소를 담을 변수 선언 및 초기화
//		3. 출력메세지 및 입력받은 값 변수에 담기
//		4. 최대와 최소 변수에 각각 1번째 변수 담기
//		5. 최대 < 변수2 && 변수2 > 변수3이라면 최대에 변수2담기, 변수 3도 마찬가지로 비교
//		6. 최소 > 변수2 && 변수2 < 변수3이라면 최소에 변수2담기, 변수 3도 마찬가지로 비교
//		7. 결과 출력
//		8. 버퍼비우기
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, max = 0, min = 0;
		System.out.print("정수 3개를 입력하세요 (띄어쓰기로 구분) :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		max = num1;
		min = num1;
		max = max < num2 && num2 > num3 ? num2 : max < num3 && num2 < num3 ? num3 : max;
		min = min > num2 && num2 < num3 ? num2 : min > num3 && num2 > num3 ? num3 : min;
		
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		sc.close();
		
//		1-2)
//		1. 평균, 총합 변수 선언 및 초기화
//		2. 총합에 입력한 숫자 3개 전부 담기
//		3. 평균 = 총합 / 3;
//		4. printf로 결과 출력
		double total = 0.0, avg = 0.0;
		
		total = num1 + num2 + num3;
		avg = total / 3;
		System.out.printf("평균 : %.2f", avg);
	}
}
