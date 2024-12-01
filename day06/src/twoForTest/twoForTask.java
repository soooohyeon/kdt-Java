package twoForTest;

public class twoForTask {
	public static void main(String[] args) {
//		**** 과제
//			1|
//		   12|1
//		  123|21
//		 1234|321
//		12345|4321
//			← →
//		** 로직
//		1) 행 출력 (5줄 = 5번 반복)
//			1-1) 삼각형을 맨위 1 기준으로 나눠서 맨 위 1포함 왼쪽 출력
//				* for () { 빈칸 5개, 4개, ... 출력 / 빈칸이 점점 줄어들기때문에 -- }
//				* for () { 숫자 1, 1 2, ... 출력 / 숫자가 점점 늘어나기때문에 ++ }
//			1-2) 삼각형을 맨위 1 기준으로 나눠서 오른쪽 출력
//				* for () { l = 1(출력 x), l = 2 (2 1 출력) ,l = 3 (3 2 1 출력), ... / 숫자가 점점 늘어나기때문에 ++
//				* 큰 수부터 거꾸로 출력 & 맨위는 출력x 이기때문에 줄수 - 1 - 열 반복 수 }
//			1-3) 줄바꿈
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i+2 ; k++) {
				System.out.print(k);
			}
			for (int l = 1; l < i + 1; l++) {
				System.out.print(i+1-l); 
			}
			System.out.println();
		}
		
	}
}
