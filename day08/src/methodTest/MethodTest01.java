package methodTest;
//13. 메소드 정의
public class MethodTest01 {
//	10을 더해주는 메소드 정의
//	1) 기능 → 값 + 10
//	2) 리턴타입 → 모르겠으면 void
//		void
//	3) 메소드명
//		void addTen
//	4) 매개변수 생각
//		void addTen (int num) { }
//	5) 실행할 문장 생각
//		int result = num + 10;
//	6) 반환값 생각
//		return result;
	
//	결과
	int addTen (int num) {
		int result = num + 10;
		return result;
	}
	
	public static void main(String[] args) {
//		메소드 호출
		MethodTest01 mt = new MethodTest01();
		
		System.out.println(mt.addTen(10));
		System.out.println(mt.addTen(5));
	}
//	static 키워드는 메모리에 제일 먼저 할당 시킴 (추후 다시 배울예정)
//		⇒ main 메소드가 제일 먼저 실행되는 이유
}
