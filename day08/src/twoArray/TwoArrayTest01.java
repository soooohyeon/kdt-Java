package twoArray;
//1. 2차원 배열
// 행과 열로 구성된 데이터를 저장하는 배열의 형태
public class TwoArrayTest01 {
	public static void main(String[] args) {
		int[][] ar1;	// 2차원 배열 선언 (stack)
		ar1 = new int[3][2];	// 3행 2열 크기의 배열 생성 (heap)
		
		System.out.println(ar1);	// heap메모리에 저장된 참조값(주소값) 출력, 출력시 대괄호 2개 출력 → 2차원 배열의 전체 참조값
//		[[I@65ae6ba4	→ 2차원 배열의 전체 참조값 (JVM에 의해 제공)
//		[[0, 0, 0][0, 0, 0]]
		System.out.println(ar1[0]);	// 1차원 배열의 시작 주소값 출력 (1번째 줄의 참조값)
//		[I@7960847b		→ 1차원 배열의 참조값 (1번째 줄의 시작 주소 값)
		System.out.println(ar1[0][0]);	// 값 출력
//		0  → 1번째 줄 1번째 칸 값 (초기화된 기본값)
		
		int[] ar2 = new int[3];
		System.out.println(ar2);	// heap메모리에 저장된 참조값(주소값) 출력, 출력시 대괄호 1개 출력 → 1차원 배열
//		I@6a6824be  → 1차원 배열의 참조값
//		[0, 0, 0]
		System.out.println(ar2[0]);
//		1차원 배열의 1번째 값 (초기화된 기본값)
		
	}
}
