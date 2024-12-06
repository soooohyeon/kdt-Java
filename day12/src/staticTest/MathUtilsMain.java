package staticTest;
//1. 정적메소드 : 유틸리티 메소드 호출 
public class MathUtilsMain {
	public static void main(String[] args) {
//		get max ()호출 > 매개변수o, 리턴값o
		System.out.println(MathUtils.getMax(10, 20));
		
//		round() 호출
		System.out.println(MathUtils.round(17.71123));
//		Math 클래스는 자바 표준 라이브러리에 있는 수학 관련 클래스
	}
}
