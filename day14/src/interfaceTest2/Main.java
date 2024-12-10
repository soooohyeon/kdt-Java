package interfaceTest2;

public class Main {
	public static void main(String[] args) {
//		Music 클래스를 인터페이스로 수정하고 각 메소드 호출
		
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
		printMethod(new Ballad());	// 업캐스팅
		printMethod(new HipHop());	// 업캐스팅
		printMethod(new Rock());	// 업캐스팅
		
//		+) 위 방법은 객체화를 진행하지 않고 바로 메소드를 호출 한 것
//		   객체화시 아래처럼 풀어서 사용됨 (상속과 사용 방법 동일함)
		Music ballad = new Ballad();	// 업캐스팅
		printMethod(ballad);
	}
	static void printMethod(Music music) {
		music.mode();
		if (music instanceof Ballad) {
			((Ballad)music).onlyBallad();	// 다운캐스팅
		} else if (music instanceof HipHop) {
			((HipHop)music).onlyHipHop();	// 다운캐스팅
		} else if (music instanceof Rock) {
			((Rock)music).onlyRock();		// 다운캐스팅
		}
	}
}
