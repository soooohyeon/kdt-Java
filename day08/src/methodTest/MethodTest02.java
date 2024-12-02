package methodTest;
//14. 
public class MethodTest02 {
//	2개의 값을 더하는 기능의 메소드 add
//	리턴타입 → void
//	메소드명 → add
//	매개변수 → int num1, int num2
//	실행할 문장 → num1 출력, num2 출력, num1 + num2 출력
//	리턴 값
	void add (int num1, int num2) {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
	}
	public static void main(String[] args) {
//		메소드 호출 방법 2가지
//		1) 메소드 정의하는 부분에 static 키워드를 붙임 (지금은 사용 x, 추후 static 배울때 사용)
//			→ main 메소드가 메모리에 할당될 때 add 메소드도 같이 메모리에 할당시킴
//		2) 메인 메소드에 add 메소드가 있는 클래스를 알려줌
//			→ 클래스명 변수 = new 클래스명();
		
		MethodTest02 mt = new MethodTest02();	// 해당 메소드가 어디에 위치해있는지 알려줌
		System.out.println(mt);
//		methodTest.MethodTest02@65ae6ba4 > 패키지와 메소드명 출력됨
		
//		System.out.println(mt.add(10, 20));	// 리턴값이 없으므로 출력메소드 사용 불가 (오류 발생)
		mt.add(10, 20);
		mt.add(5, 5);
		
		MethodTest02 mt1 = new MethodTest02();
//		mt와 mt1의 주소값이 다름
//		왜? heap 메모리에 각각 할당된 것이기 때문
		System.out.println(mt);
		System.out.println(mt1);
		
	}
}
