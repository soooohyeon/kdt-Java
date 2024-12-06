package staticTest;
//1. 정적 메소드(유틸리티 메소드)
public class MathUtils {
//	메소드
	static int getMax(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}
	
	static double round(double num) {
		return Math.round(num);
//		Math 클래스는 자바 표준 라이브러리에 있는 수학 관련 클래스
//		round() : 소수점 값을 가장 가까운 정수로 반환하는 메소드
	}
}
