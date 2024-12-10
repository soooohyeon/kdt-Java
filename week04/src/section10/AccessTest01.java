package section10;

//예제 11.
//예제 12. 실행은 access01 패키지 AccessTest02 파일 확인
public class AccessTest01 {
//	접근제한자 public인 필드 선언
	public int a;
	
//	생성자
	public AccessTest01(int a) {
		this.a = a;
	}
	
//	접근제한자 public인 메소드 선언
	public void printA() {
		System.out.println("접근제한자 public 테스트");
	}
}
