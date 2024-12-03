package method;
//4. 메소드 사용이유 1 : 중복된 코드 제거
public class MethodBasic01 {
	public static void main(String[] args) {
//		동일한 작업을 수행하는 코드를 여러번 작성하는 대신 메소드로 정의하면
//		코드의 가독성과 효율성 증가
		
//		1) 동일한 로직 여러번 작성
		System.out.println("총 합 : " + (5 + 10));
		System.out.println("총 합 : " + (10 + 200));
		System.out.println("총 합 : " + (20 + 30));
		
//		2) 호출만 해주면 됨
		printSum(5, 10);
		printSum(10, 200);
		printSum(20, 30);
	}
//	2) 메소드를 사용한 경우
	static void printSum (int num1, int num2) {
		System.out.println("총 합 : " + (num1 + num2));
	}
}
