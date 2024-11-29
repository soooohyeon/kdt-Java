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
//		1) for (초기 = 1; 조건 <= 100; 증감+=10){
//		2)	for (초기 = 0; 조건 < 10; 증감++ {
//		3)		출력((바깥 for문 변수 + 안쪽 for문 변수) + "\t") }
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
//			반복 돌릴 때 a + 1
//		2) 정수 이므로 문자열로 강제형변환 해주면 됨
		
//		for (int i = 0; i < 6; i++) {
//			System.out.print((char)(a + i) + " ");
//		}
		
//		3. aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
		int num = 0;
//		** 로직
//		1) 소문자는 97 ~ 122, 대문자는 65 ~ 90
//		2) for (초기 = 0; 조건 < 26; 증감++) {
//		3) if (for문 변수 % 2 == 0) {	→ 문자가 한칸씩 건너띄니 맨처음 0 % 2 = 0을 맨앞자리로 지정
//		4)		엔터 없이 형변환 후 출력 ((char)(num + i + 97)) → 소문자를 한칸씩 건너띄어 출력→
//		5) } else {
//		6)		엔터 없이 형변환 후 출력 ((char)(num + i + 65)) → 소문자를 한칸씩 건너띄어 출력 }
			
//		for (int i = 0; i < 26; i++) {
//			if (i % 2 == 0) {
//				System.out.print((char)(num + i + 97));
//			} else {
//				System.out.print((char)(num + i + 65));
//			}
//		}
		
//		(4번 미완료)
//		4-1. 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 출력 한줄에 5개씩 띄어쓰기로 구분되도록 출력
//		** 로직
//		1) for (초기 = 1; 조건 <= 100; 증감++) {
//		2) for (초기= 1; 조건 <= 100; 증감++) {
//		3)	if (변수 % 3 == 0 && 변수 % 5 == 0) { 변수 출력 }
//		4)	else if (변수 % 3 == 0) { 변수 출력 }
//		5)	else if (변수 % 5 == 0) { 변수 출력 } }
		
		for (int i = 1; i <= 100; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.print(i + " ");
				} else if (i % 3 == 0) {
					System.out.print(i + " ");
				} else if (i % 5 == 0) {
					System.out.print(i + " ");
				}
		}
		
//		4-2. 최종적으로 3의 배수 또는 5의 배수 숫자들의 합 구하기
//		** 로직
//		1) 총합을 담을 변수 선언 및 초기화
//		2) for (초기= 1; 조건 <= 100; 증감++) {
//		3)	if (변수 % 3 == 0 && 변수 % 5 == 0) { sum += 변수 }
//		4)	else if (변수 % 3 == 0) { sum += 변수 }
//		5)	else if (변수 % 5 == 0) { sum += 변수 } }
//		6) 총합 출력
		
//		int total = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i % 3 == 0 && i % 5 == 0) {
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
