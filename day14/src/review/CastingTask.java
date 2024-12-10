package review;
//1. Casting 실습 (복습)
public class CastingTask {
	public static void main(String[] args) {
//		음악재생 프로그램
//		부모는 Music클래스
//		구현하지 않은 mode메소드 만들기
			
//		자식은 Ballad, HipHop, Rock 클래스
			
//		발라드 클래스 
//		"발라드 모드" 출력하는 mode메소드 만들기
//		"onlyBallad 실행" 출력하는 onlyBallad메소드 만들기
		
//		힙합 클래스 
//		"힙합 모드" 출력하는 mode메소드 만들기
//		"onlyHipHop 실행" 출력하는 onlyHipHop메소드 만들기
		
//		락 클래스
//		"락 모드" 출력하는 mode메소드 만들기
//		"onlyRock 실행" 출력하는 onlyRock메소드 만들기
		
//		CastingTask에서 참조변수를 따로 만들지 않고 
//		매개변수의 다형성을 활용하여 모든 클래스타입의 메소드를 호출하기
		printMethod(new Ballad());
		printMethod(new Rock());
		printMethod(new HipHop());
	}

	static void printMethod (Music music) {
		music.mode();
		if (music instanceof Ballad) {
			((Ballad)music).onlyBallad();
		} else if (music instanceof HipHop) {
			((HipHop)music).onlyHipHop();
		} else if (music instanceof Rock) {
			((Rock)music).onlyRock();
		}
		System.out.println();
	}
}