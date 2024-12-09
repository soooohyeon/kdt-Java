package task01;

public class Task3 {
	public static void main(String[] args) {
//		3) 크리스마스를 맞아 크리스마스 트리 찍어보기
//	   	   크리스마스을 맞이하여 당신의 터미널에 트리를 장식하세요.
//			- *과 * 사이에는 공백 출력
//			      ★
//			      *
//			    * * *
//			  * * * * * 
//			      *
//			    * * *
//			  * * * * *
//			* * * * * * *
//			      ■
//			      ■
//			      ■
//		** 로직
//		큰 삼각형 2개를 기준으로 반으로 나눠서 반복문으로 코드 작성
//		1) for (4번 반복) {
//			for (3번 반복) { // 2칸씩 줄어드는 공백 출력
//				if (i == 0 && j == 1) { ★ 출력
//				} else { 공백 2칸 출력 }
//			}
//			for (3번 반복) { // 홀수로 늘어나는 * 출력
//				* 출력 } }
//		2)  for (7번 반복) {	// 총 7 줄
//				for (4번 반복) { // 2칸씩 줄어드는 공백 출력
//					공백 2칸 출력 }
//				for (4번 반복) { // 홀수로 늘어나는 * 출력
//					if (4 <= i <= 6 이고 j == 3일 때) {
//						■ 출력
//					} else if (4 <= i <= 6) {
//						공백 출력
//					} else {
//					* 출력 } }
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				if (i == 0 && j == 1) {
					System.out.print("★");
				} else {
					System.out.print("  ");
				}
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 4; j > i * 2 - 2; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				if (j == 3 & (i >= 4 && i <= 6)) {
					System.out.print("■");
				} else if (i >= 4 && i <= 6) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				} 
			}
			System.out.println();
		}
		
	}
}
