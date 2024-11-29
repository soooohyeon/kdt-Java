package array;
// 1번 : 배열 선언 및 생성
public class ArrayTest01 {
	public static void main(String[] args) {
//		1) 어떤 값이 들어갈지 모르나 몇 칸 만들지 알 때
//		정수형 배열 변수 number1 선언하고 크기가 5칸인 배열 생성
		int[] number1 = new int[5];
		
//		2) 어떤 값이 들어갈 지 알 때 → 크기도 알고있음
		String[] string1 = {"일", "이", "삼", "사"};
		
//		3) 어떤 값이 들어갈지 모르고 몇칸인지도 모를 때
		double[] number2 = null;
		
		System.out.println(number1);  // → 배열의 주소값이 나옴(16진수 해시코드) 
		System.out.println(string1);  // → 
		System.out.println(number2);  // → null 출력
		
//		4) 배열 변수 선언 후 배열 생성과 초기화
//		정수형 배열 number3 선언
//		number3 = 값;
		int[] number3;
		number3 = new int[] {1, 2, 3};  // number3={1, 2, 3}; 오류발생으로 왼쪽처럼 입력해야함
		System.out.println(number3);
		
	}
}
