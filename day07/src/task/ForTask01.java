//	박수현
package task;

import java.util.Iterator;

public class ForTask01 {
	public static void main(String[] args) {
//		1. 1 ~ 100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈
//			1	2	3	4	5	6	7	8	9	10
//			11	12	13 ...						20
//			...
//			91 ...								100
//		** 로직
//		1) for (int i = 1; i <= 100; i+=10){  // 행 10줄 이고 줄 바로 아래 숫자가 + 10이므로
//		2)	for (int j = 0; j < 10; j++ {  // 열 10줄 이므로 
//		3)		출력((i + j) + "\t") }
//		4)	줄바꿈 출력 }
		
//		for (int i = 1; i <= 100; i+=10) {
//			for (int j = 0; j < 10; j++) {
//				System.out.print((i + j) + "\t");
//			}
//			System.out.println();
//		}
		
//		2. A ~ F 출력
		int a = 'A';
//		** 로직
//		1) A는 65일때 이고, F는 70이므로 6번 반복 돌려주면 됨
//			반복 돌릴 때 변수a + i 반복 출력
//		2) 정수 이므로 문자열로 강제형변환 해주면 됨
		
//		for (int i = 0; i < 6; i++) {
//			System.out.print((char)(a + i) + " ");
//		}
		
//		3. aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
		int num = 0;
//		** 로직
//		1) 소문자는 97 ~ 122, 대문자는 65 ~ 90
//		2) for (num = 0; num < 26; i++) {
//		3) if (num % 2 == 0) { → i가 0부터 시작되고 2로 나눴을때 나머지가 0이기 떄문에 짝수칸마다 출력
//		4)		엔터 없이 출력 ((char)(num + 97)) → 소문자라 시작 숫자인 97 더하고 그 값을 문자형으로 형변환해서 출력
//		5) } else {
//		6)		엔터 없이 출력 ((char)(num + 65)) → 대문자라 시작 숫자인 65 더하고 그 값을 문자형으로 형변환해서 출력}
			
//		for (num = 0; num < 26; num++) {
//			if (num % 2 == 0) {
//				System.out.print((char)(num + 97));
//			} else {
//				System.out.print((char)(num + 65));
//			}
//		}
		
//		(4번 미완료)
//		4-1. 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 출력 한줄에 5개씩 띄어쓰기로 구분되도록 출력
//		** 로직
//		1) 줄 바꿈을 위한 출력 누적변수 선언 및 초기화
//		2) for (int i = 1; i <= 100; i++) {
//		3) 	if (출력누적 5일 때) { 줄바꿈; 출력누적 변수 초기화; }
//		4)	if (i를 15의 배수로 나누었을 때 나머지가 없다면) { 변수 출력, 출력누적++ }
//		5)	else if (i를 3으로 나누었을 때 나머지가 없다면) { 변수 출력, 출력누적++ }
//		6)	else if (i를 5으로 나누었을 때 나머지가 없다면) { 변수 출력, 출력누적++ } 
		
//		int count = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (count == 5 ) {		// 이미 5개 출력을 했다면 줄바꿈하고 아래 조건 검사 후 출력
//				System.out.println();
//				count = 0;
//			}
//			if (i % 15 == 0) {
//				System.out.print(i + "\t");
//				count++;
//			} else if (i % 3 == 0) {
//				System.out.print(i + "\t");
//				count++;
//			} else if (i % 5 == 0) {
//				System.out.print(i + "\t");
//				count++;
//			}
//		}
		
//		4-2. 최종적으로 3의 배수 또는 5의 배수 숫자들의 합 구하기
//		** 로직
//		1) 총합을 담을 변수 선언 및 초기화
//		2) for (int i = 1; i <= 100; i++) {
//		3)	if (i를 15로 나누었을 때 나머지가 없다면) { 합계 변수 누적 }
//		4)	else if (i를 3으로 나누었을 때 나머지가 없다면) { 합계 변수 누적 }
//		5)	else if (i를 5로 나누었을 때 나머지가 없다면) { 합계 변수 누적 } }
//		6) 총합 출력
		
//		int total = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i % 15 == 0) {
//				total += i;
//			} else if (i % 3 == 0) {
//				total += i;
//			} else if (i % 5 == 0) {
//				total += i;
//			}
//		}
//		System.out.println("3의 배수 또는 5의 배수의 합 : " + total);
		
	}
}
