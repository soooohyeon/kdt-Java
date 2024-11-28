package twoForTest;

import java.util.Iterator;

// 5번 : 이중 for문 실습과제
public class TwoForTask01 {
	public static void main(String[] args) {
//		1번 : 역삼각형
//		*****
//		****
//		***
//		**
//		*
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		2번 : 피라미드와 유사하지만 좌측 정렬
//		* 
//		* * *
//		* * * * *
//		* * * * * * *
		
//		for (int i = 0; i <= 3; i++) {
//			for (int j = 1; j <= i+1; j++) {
//				System.out.print("*");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		3번 : 피라미드 (for문이 총 3개 → 어떻게 사용될지 먼저 생각)
//		  *
//		 * *
//		* * *
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
