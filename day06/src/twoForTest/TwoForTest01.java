package twoForTest;

import java.util.Iterator;

// 2번 : 반복문 (이중 for문) - 기본
public class TwoForTest01 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
		}
//		1. 바깥 for문 시작
//			처음 i = 1로 초기화, i < 3 조건 true로 반복문 내부 실행
//		2. 안쪽 for문 시작
//			처음 j = 1로 초기화, j < 3 조건 true로 반복문 내부 실행
//			System.out.println("i = " + i + ", j = " + j); ⇒ 출력 결과 : i = 1, j = 1
//		3. 안쪽 for문 진행
//			j가 증감식(j++)으로 1 증가하여 j = 2
//			j < 3 조건 true로 내부 코드 실행
//			System.out.println("i = " + i + ", j = " + j); ⇒ 출력 결과 : i = 1, j = 2
//			다시 j++ 진행으로 j = 3이 됨
//			j < 3 조건 false로 안쪽 for문 종료
//		4. 바깥 for문 진행
//			i가 증감식(i++)으로 1 증가하여 i = 2
//			i < 3 조건 true로 내부 코드 실행
//		5. 안쪽 for문 진행
//			j = 1로 초기화
//			이전과 동일한 방식으로 반복 진행
//		6. 바깥 for문 종료
//			i가 증감식(i++)으로 i = 3이됨
//			i < 3 조건 false로 바깥 for문 종료
			
//		바깥 for문이 1번 반복할 때 안쪽 for문은 매번 처음부터 끝까지(조건이 false) 실행
//	    바깥 for문의 조건이 false가 될 때까지 반복

			
		
	}
}
