package array;

import java.util.Iterator;

// 4번 : 배열
public class ArrayTest04 {
	public static void main(String[] args) {
////		1. 1 ~ 10까지의 값을 배열에 넣고 출력
////		1) 배열 선언 및 생성 → 값을 알 때
//		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
////		배열명.length : 배열의 길이, 길이에서 -1이 인덱스 번호
////		2) 배열 출력
//		for (int i = 0; i < number.length; i++) {
//			System.out.println(number[i]);
//		}
		
//		1-2. 1 ~ 10까지의 값을 배열에 넣고 출력
//		1) 배열 선언 및 생성 → 값을 모를 때
		int[] number2 = new int[10];	// 10칸짜리 배열 생성시 인덱스 번호는 0 ~ 9
		
//		2) for문 (	초기식 int i = 0; → 인덱스는 0부터 시작
//					조건식 i < 배열명.length; → 배열의 길이보다 작을 동안 반복 (배열의 크기가 10일때 마지막 인덱스 번호는 9)
//					증감식 i++){
//		3)		갑 대입 배열명[i] = i + 1;
//		4)		출력 배열명[i]}
		
		for (int i = 0; i < number2.length; i++) {	// number2 배열에 값 넣기
			number2[i] = i + 1;
		}
//		for (int i = 0; i < number2.length; i++) {	// number2 배열의 값 출력
//			System.out.println(number2[i]);
//		}
		
//		5 ~ 1까지의 값을 배열에 담고 출력하기
//		조건 1) 칸수를 알 때로 선언한다
//		조건 2) 값을 대입하는 반복문, 값을 출력하는 반복문을 따로 작성한다
//		** 로직
//		1) 배열 선언 및 생성
//		2-1) for 문 (초기 = 0; 조건 < 배열 길이; 증감++) {
//		2-2) for 문 (초기 = 5; 조건식; 증감식) {
//			배열명[i] = 배열길이 - i; }
//		3-1 ) for 문 (초기 = 0; 조건 < 배열 길이; 증감++) {
//		3-2 ) for 문 (초기 = 5; 조건식; 증감식) {
//			출력 배열명[i]; }
		
		int[] number3 = new int[5];
//		2-1) 초기식을 0으로 시작 (대입)
		for (int i = 0; i < number3.length; i++) {
			number3[i] = number3.length - i;
		}
		
//		2-2) 초기식을 5로 시작 (대입)
		for (int i = 5; i > (5 - number3.length); i--) {
			number3[5 - i] = i;
		}

////		3-1) 초기식을 0으로 시작 (출력)
//		for (int i = 0; i < number3.length; i++) {
//			System.out.println(number3[i]);
//		}
//		
////		3-2) 초기식을 5로 시작 (출력)
//		for (int i = 5; i > (5 - number3.length); i--) {
//			System.out.println(number3[number3.length-i]);
//		}
		
//		3-3) for-each문(빠른 for문) → 인덱스 0 ~ 끝까지 순회할때까지 반복 실행
		for (int data : number3) {
			System.out.println(data);
		}
		
//		** 배열의 총합 구하는 것도 사용 가능
		int sum = 0;
		for (int data : number3) {
			sum += data;
		}
		System.out.println(sum);	// 출력결과 : 15
	}
}
