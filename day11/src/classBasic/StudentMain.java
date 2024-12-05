package classBasic;
//1-2.Student 클래스의 객체를 생성할 클래스
public class StudentMain {
	public static void main(String[] args) {
//		원래는 이름을 정할 때 한글로 명시하지 않으나 해당 객체화는 연습용!
//		객체 2개 생성 = 저장공간 2개 생성
		Student st1 = new Student();
		Student st2 = new Student();
		
//		↓↓↓↓ 각각의 출력된 참조값이 다름 : 저장공간이 각각 만들어짐
		System.out.println(st1);
		System.out.println(st2);
//		↓↓ 해당 객체의 값에는 아무것도 들어가 있지 않으므로 기본값 출력 : null
		System.out.println(st1.name);
		
		st1.name = "짱구";
		st1.kor = 100;
		
		st2.name = "맹구";
		st2.kor = 100;
		st2.eng = 50;
		st2.math = 77;
//		st2.avg = (double)(st2.kor + st2.eng + st2.math) / 3;
////		↓↓ 해당 객체의 값에는 15번째 줄에서 값을 넣어줘서 저장된 값 출력 : 짱구
//		System.out.println(st1.name);
////		↓↓ 해당 객체의 값에는 16번째 줄에서 값을 넣어줘서 저장된 값 출력 : 맹구
//		System.out.println(st2.name);
//		System.out.printf("%s님 평균 점수는 %.2f입니다", st2.name, st2.avg);
		
//		1-4. 연관성있는 저장공간과 기능을 한곳에 모아 관리
		System.out.println(st2.getTotal());	// Student 클래스에 정의되어 있는 메소드의 반환값을 출력
		
		st1.kor = 50;
		st1.eng = 30;
		st1.math = 100;
		System.out.println(st1.getTotal());
	}
}
