package twoArray;

import java.util.Arrays;
import java.util.Scanner;

//12. 2차원 배열 실습
public class Task {
	public static void main(String[] args) {
//		1. 3x3 크기의 2차원 배열을 생성하고 사용자가 입력한 값을 넣은 뒤
//			1-1. 각 행의 합계와 평균  출력
//			1-2. 전체 배열의 합계와 평균 출력
//		** 로직
//		0) Scanner 클래스 import
//		1-1) 입력받을 크기만 행 3, 열 3인 2차원 배열을 생성 및 선언하고
//		1-2) 평균과 합계를 구할 배열 생성 및 선언 
//				→ 각 1-1번에서 3행에 대한 결과와 1-2번에 대한 결과해서 총 4칸의 배열 생성
//		2) for (배열의 전체 길이만큼 반복) {
//		3) 		정수 입력받고 배열에 값 저장; }
		Scanner sc = new Scanner(System.in);
		
//		new : heap 메모리의 int[3][3]의 배열을 생성하고 시작 주소값을 가져옴
		int[][] ar1 = new int[3][3];
		int[] sum = new int[4];
		double[] avg = new double[4];
		int count = 1;
		
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				System.out.print(count++ + "번째 정수 입력 : ");
				ar1[i][j] = sc.nextInt();
			}
		}
		
//		1-1.
//		4) for (배열의 행 길이만큼 반복) {
//		5) 		for (배열의 열 길이만큼 반복) {
//		6) 			합계 배열[i] += 입력받은 배열[i][j];}
//		7) 		}
//		8) 평균 배열[i] = 합계 배열[i] / 배열의 열 길이}
//		9) 결과 출력
		
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				sum[i] += ar1[i][j];
			}
			avg[i] = (double)sum[i] / ar1[i].length;
		}
		
		for (int i = 0; i < avg.length-1; i++) {
			System.out.printf("%d열의 합계 : %d, 평균 : %.2f\n" ,(i + 1), sum[i], avg[i]);
		}
		
//		1-2
//		4) for (배열의 행 길이만큼 반복) {
//		5) 		for (배열의 열 길이만큼 반복) {
//		6) 			합계 배열[3] += 입력받은 배열[i][j];}
//		7) 		} }
//		8) 평균 배열[3] = 합계 배열[3] / (배열의 열 길이 * 배열의 행 길이)
//		9) 결과 출력
		
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				sum[3] += ar1[i][j];
			}
		}
		avg[3] = (double)sum[3] / (ar1.length * ar1[0].length);
		System.out.printf("전체 합계 : %d, 평균 : %.2f\n" , sum[3], avg[3]);
		
		
//		2. 2x2 크기의 2차원 배열을 생성하고 초기값을 아래와 같이 설정
//			1	2
//			3	4
//			1) 얕은 복사로 복사하고 1행 1열의 값을 40으로 변경한 뒤 원본배열과 변경된 배열 출력
//			2) 깊은 복사로 복사하고 0행 1열의 값을 20으로 변경한 뒤 원본 배열과 변경된 배열 출력
//		** 로직
//		1) 2x2 2차원 배열 선언 및 생성
//		2) 차례대로 1, 2, 3, 4 갑 넣기 (for문 사용)
		int[][] ar2 = new int[2][2];
		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				ar2[i][j] = i * j + 1;
			}
		}
		
//		2-1. 얕은 복사로 복사
//		3) 새로운 2차원 배열 선언 = 복사할 배열 명
//		4) 복사 배열[1][1] = 40으로 수정
//		5) 원본 배열과 복사 배열 Arrays.toString으로 결과 출력
		int[][] shallowAr = ar2;
		shallowAr[1][1] = 40;
		System.out.println("원본 배열 : " + Arrays.toString(ar2));
		System.out.println("얕은 복사 배열 : " + Arrays.toString(shallowAr));
		
//		2-2.
//		3) 깊은 복사로 복사
//		4) 복사 배열[0][1] = 20으로 수정
//		5) 원본 배열과 복사 배열 Arrays.toString으로 결과 출력
		
//		3-1. 복사방법
//		int[][] deepAr = new int[ar2.length][];
//		for (int i = 0; i < ar2.length; i++) {
//			deepAr[i] = Arrays.copyOf(ar2[i], ar2[i].length);
//			
////			원본 ar2[i]와는 독립된 새로운 메모리 공간 할당
//			System.out.println(deepAr[i]);
//		}
		
//		3-2. 복사방법
		int[][] deepAr2 = new int[ar2.length][];	// 깊은 복사할 2차원 배열 선언하고 배열 하나만 생성
		for (int i = 0; i < ar2.length; i++) {		// 행 길이만큼 반복
			deepAr2[i] = new int[ar2[i].length];	// 배열 안에 배열 추가로 생성 = 2차원 배열
			for (int j = 0; j < ar2.length; j++) {	// 열 길이만큼 반복
				deepAr2[i][j] = ar2[i][j];			// 각각의 행과 열에 값 복사해옴
			}
		}
		
		shallowAr[1][1] = 40;
		System.out.println("원본 배열 : " + Arrays.deepToString(ar2));
		System.out.println("얕은 복사 배열 : " + Arrays.deepToString(shallowAr));
		
		
	}
}
