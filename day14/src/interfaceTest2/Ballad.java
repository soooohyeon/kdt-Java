package interfaceTest2;

public class Ballad implements Music {
//	발라드 클래스 
//	"발라드 모드" 출력하는 mode메소드 만들기
//	"onlyBallad 실행" 출력하는 onlyBallad메소드 만들기
	@Override
	public void mode() {
		System.out.println("발라드 모드");
	}
	
	void onlyBallad() {
		System.out.println("Only Ballad 실행");
	}
	
}
