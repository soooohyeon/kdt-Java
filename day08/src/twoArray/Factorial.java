package twoArray;
//9. 재귀함수 : 자기자신을 호출하는 프로그램 기법
public class Factorial {
	public static void main(String[] args) {
//		기본 조건 : 재귀 호출을 종료시키는 조건
//		재귀 호출 : 자기 자신을 호출하는 부분으로 문제를 더 작은 크기로 분할하여 해결
		
//		팩토리얼
		int number = 5;	// 5! 계산
		System.out.println(number + "! = " + factorial(number));
		
	}
	
	public static int factorial (int n) {	// 메소드
		if (n == 1) {	// 기본조건
			return 1;
		}
		return n * factorial(n - 1);	// 재귀 호출	: 메소드가 자기자신을 호출
	}
	
}
