package section10;

//예제 19.
//예제 20. 은 AccessTest10 파일 확인
public class AccessTest09 {
	public int a;

//	생성자의 접근제한자가 private으로 같은 클래스 내라면 생성자 사용 가능
	private AccessTest09(int a) {
		this.a = a;
	}
	
	public void printA() {
		System.out.println("public 클래스의 printA 메소드");
	}
}
