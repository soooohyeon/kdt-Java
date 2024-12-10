package interfaceTest2;
//8. review 패키지 예제 → interface로 변경
public class Rock implements Music {
//	락 클래스
//	"락 모드" 출력하는 mode메소드 만들기
//	"onlyRock 실행" 출력하는 onlyRock메소드 만들기
	@Override
	public void mode() {
		System.out.println("락 모드");
	}
	
	void onlyRock() {
		System.out.println("Only Rock 실행");
	}
}
