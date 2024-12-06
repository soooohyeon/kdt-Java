package staticTest;
//4. 정적 블록 : DB 연동시 초기화 될때 사용
public class StaticBlock {
	public static void main(String[] args) {	// 메인 메소드 - (2번째 실행)
		System.out.println("메인메소드 실행");
		
	}
	
	static {	// 정적 블록 - (1번째 실행) : 클래스가 로드될때 제일 먼저 1번만 실행!!!!!!!!!!!
		System.out.println("클래스가 로드될 때 이 블록이 실행됨");
	}
}
