package twoArray;

//2. 2차원 배열 : 이중 for문 이용해서 출력
public class TwoArrayTest02 {
	public static void main(String[] args) {
		int[][] ar1 = {{1, 2}, {3, 4}, {5, 6}};
		System.out.println(ar1);
		System.out.println(ar1[0]);
		System.out.println(ar1[0][0]);
		System.out.println(ar1[0][1]);
		System.out.println(ar1[1][0]);
		System.out.println(ar1[1][1]);
		System.out.println("2차원 배열 행 크기 : " + ar1.length);	// 2차원 배열의 행
		System.out.println("2차월 배열 열 크기 : " + ar1[0].length);	// 2차원 배열의 열 : 행의 인덱스 번호를 지정해줘야 가능
		
		for (int i = 0; i < ar1.length; i++) {	// 행 반복
//			System.out.println("ar1의 각 행의 시작주소값 : " + ar1[i]);		// 각 행의 시작 주소값 출력
			for (int j = 0; j < ar1[i].length; j++) {	// 열 반복
//				System.out.println(ar1[i][j]);	// 2차원 배열의 모든 값 출력	
				System.out.println(i + "행 : " + ar1[i] + ", " + j + "열, ar1[i][j]의 값 : " + ar1[i][j]);
			}
		}
		
		int ar2[][] = {{1, 2, 3}, {4, 5, 6}};	// 2행 3열
		
//		for (int[] data : ar2) {	// for-each문 각 행의 시작주소 값 출력
//			System.out.println(data);
//		}
		
		for (int[] data : ar2) {	// 각 행을 하나의 배열로 취급 (행 반복)
			for (int data2 : data) {	// 위에서 반복한 배열의 값 출력 (열 반복)
				System.out.println(data2);
			}
		}
	
	}
}
