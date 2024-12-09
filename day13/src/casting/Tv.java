package casting;
//3. 클래스 Up / Down Casting
public class Tv {
//	필드
	int power;
	int ch;
	int vol;
	
//	메소드
	void powerOnOff() {
		System.out.println("tv 전원을 키거나 끕니다.");
	}
	void chUp() {
		System.out.println("채널을 올립니다.");
	}
	void chDown() {
		System.out.println("채널을 내립니다.");
	}
}
