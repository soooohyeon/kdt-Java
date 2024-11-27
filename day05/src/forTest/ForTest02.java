package forTest;

import java.util.Iterator;

// 11번 : 반복문 (for문)
public class ForTest02 {
	public static void main(String[] args) {
//		p130 1부터 10까지으 총합구하기
//		로직구성
//		1) 정수혀ㅑㅇ 변수 (총 합구할 변수)
//		2) for 반복문 (초기식 = 0, 조건식 <= 10, 증감식++)
//		3) 총합구할 변수 += 총합;
//		4) 총합 출력 sum
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("총 합 : " + sum);
		
	}
}
