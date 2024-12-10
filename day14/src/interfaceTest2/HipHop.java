package interfaceTest2;

public class HipHop implements Music {
//	힙합 클래스 
//	"힙합 모드" 출력하는 mode메소드 만들기
//	"onlyHipHop 실행" 출력하는 onlyHipHop메소드 만들기
	
//	인터페이스의 추상메소드 오버라이딩함
//	부모의 접근제한자보다 더 범위가 좁은 접근제한자 사용 불가
	@Override
	public void mode() {
		System.out.println("힙합 모드");
	}
	
	void onlyHipHop() {
		System.out.println("Only HipHop 실행");
	}
}
