package methodTest;
//15. 메소드 호출방법 연습
public class MethodTest03 {
	
	public static void main(String[] args) {
		MethodTest03 mt = new MethodTest03();
		
//		매개변수 x, 리턴값 x 메소드 printHello ⇒ 메소드명();
		mt.printHello();
		
//		매개변수 o, 리턴값 x 메소드 printName ⇒ 메소드명(인수);
		mt.printName("홍길동");
		
//		매개변수 x, 리턴값 o 메소드 printTotal ⇒ sysout(메소드명());
		System.out.println("1부터 10까지의 합 : " + mt.printTotal());
		
//		매개변수 o, 리턴값 o 메소드 printNum ⇒ sysout(메소드명(인수)); or 변수 = printNum(인수);
		System.out.println("합 : " + mt.printNum(5));
		System.out.println("합 : " + mt.printNum(3));
	}
	 
//	매개변수 x, 리턴값 x 메소드
//	메소드명 : printHello → 안녕하세요를 5번 출력하는 메소드
	void printHello () {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}
	
//	매개변수 o, 리턴값 x 메소드
//	메소드명 : printName (매개변수) → 본인이름님 환영합니다 출력하는 메소드
	void printName (String name) {
		System.out.println(name + "님 환영합니다.");
	}
	
//	매개변수 x, 리턴값 o 메소드
//	메소드명 : printTotal () → 1 ~ 10까지의 합 출력하는 메소드
	int printTotal () {
//		1) 총합 값을 넣을 변수
//		2) for (1부터 10까지 → int i = 1; i <= 10; i++) {
//		3)	총합 변수 += i; }
//		4) 	return 총합변수;
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		return total;
		
	}

	
//	매개변수 o, 리턴값 o 메소드
//	메소드명 : printNum (매개변수) → 정수 1개를 넘겨받아 1 ~ 넘겨받은 정수까지의 합을 반환하는 메소드
//	매개변수로 전달된 값(몇까지인지) 출력
//	최종 합 반환
	 int printNum (int num) {
		 System.out.println(num);
		 int total = 0;
		 for (int i = 1; i <= num; i++) {
			 total += i;
		 }
		 return total;
	 }
	


}
