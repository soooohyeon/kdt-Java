package constatntTest;
//5. 클래스 상수와 인스턴스 상수
public class ConstantTest {
//	클래스 내부에서 상수 선언
	static final int MAX_LENGTH = 100;	// 클래스 상수
//	static 정적 상수	- method 영역, 클래스 로드시 초기화, 모든 객체가 공유하는 공통적인 상수
	final double PI = 3.14159265359;	// 인스턴스 상수
//	인스턴스 상수		- heap 영역, 객체 생성시 초기화, 객체마다 독립적 (값이 같아도 독립적), 특정 객체마다 고유한 상수를 정의할 때 사용
//	위 두가지는 클래스 기준이냐 객체 기준으로 사용되냐 차이
	
	public static void main(String[] args) {
		System.out.println(MAX_LENGTH);	// static 정적 상수이고 같은 클래스 내여서 사용 가능
		System.out.println(ConstantTest.MAX_LENGTH);	// static 정적 상수
		
		System.out.println(new ConstantTest().PI);	// 인스턴스 상수이고 가능은 하나, 재사용을 못해 잘 사용하지 않음
		ConstantTest ct = new ConstantTest();
		System.out.println(ct.PI);	// 인스턴스 상수
	}
}
