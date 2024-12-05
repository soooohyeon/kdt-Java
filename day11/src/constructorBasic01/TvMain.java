package constructorBasic01;
//6. 생성자
class Tv {
//	class 키워드 명 앞에 public 키워드가 모든 파일에 명시되어 있음
//	public 키워드가 붙어있는 클래스가 대표 클래스
//	해서 이전처럼 Car 클래스 파일과 CarMain 파일을 따로 만들지 않고 같이 만들 수 있음
//	그때는 같은 방식으로 클래스를 하나 더 만들어주고 public을 지워주면 됨
//	클래스 명은 달라야함
	
//	 필드
	boolean power;	// boolean 형 기본값이 false이므로 현재 전원은 꺼져 있음
	int ch;
	int vol;
	String color;
	String brand;

//	생성자 오버로딩
//	생성자는 heap 메모리에 할당됨
//	기본 생성자 → 개발자가 직접 생성하지 않으면 컴파일러가 자동으로 생성해줌
	public Tv() {
		
	}

//	매개변수 2개 있는 생성자
	public Tv(boolean power, int ch) {
		super();
		this.power = power;
		this.ch = ch;
}
	
//	매개변수 5개 있는 생성자
//	↓↓↓ Alt + Shift + s > o : 생성자 생성 단축키
	public Tv(boolean power, int ch, int vol, String color, String brand) {
//		this : 자기 자신의 객체를 구별하는 키워드
//		ex) 
		this.power = power;
		this.ch = ch;
		this.vol = vol;
		this.color = color;
		this.brand = brand;
	}

	//	메소드
//	전원 키고 끌 수 있는 메소드
//	메소드명 : powerOnOff()
//	리턴 값 x, 매개변수 x
//	1) 코드
//		power = !power; → 실행할 때마다 현재 들어있는 값을 !연산자 사용해서 반대로 넣어주면 됨
//		전원상태 출력
	void powerOnOff() {
		power = !power;
		System.out.println("전원 상태 : " + (power? "켜짐" : "꺼짐"));
	}

//	볼륨 올리고 내릴 수 있는 메소드
//	메소드명 : increaseVolume(), decreaseVolume()
//	리턴 값 x, 매개변수 x
//	* 볼륨 올릴 때
//	1) 코드
//		전원 true일 때, 
//			vol은 최대 100까지만 올릴 수 있을 때, vol ++; (증감 사용)
//		전원 false일 때, 전원 메세지 출력
	void increaseVolume () {
		if (power) {
			System.out.println("현재 볼륨 : " + vol);
			if (vol < 100) {
				vol++;
				System.out.println("올린 후 현재 볼륨 : " + vol);
			}
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
//	* 볼륨 내릴 때
//	1) 코드
//		전원 true일 때, vol --; (증감 사용)
//			vol은 최소 0까지만 내릴 수 있을 때, vol --; (증감 사용)
//		전원 false일 때, 전원 메세지 출력
	void decreaseVolume () {
		if (power) {
			System.out.println("현재 볼륨 : " + vol);
			if (vol > 0) {
				vol--;
				System.out.println("내린 후 현재 볼륨 : " + vol);
			}
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
//	채널 올리고 내릴 수 있는 메소드
//	메소드명 : nextChannel(), previousChannel()
//	리턴 값 x, 매개변수 x
//	* 채널 올릴 때
//	1) 코드
//		전원 true일 때,
//			채널은 최대 999까지일 때, ch++; (증감 사용)
//		전원 false일 때, 전원 메세지 출력
	void nextChannel() {
		if (power) {
			System.out.println("현재 채널 : " + ch);
			if (ch < 1000) {
				ch++;
			} else {
				ch = 1;
			}
			System.out.println("올린 후 현재 채널 : " + ch);
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
//	* 채널 내릴 때
//	1) 코드
//		전원 true일 때, ch --; (증감 사용)
//			채널은 최소 1까지일 때, ch--; (증감 사용)
//		전원 false일 때, 전원 메세지 출력
	void previousChannel () {
		if (power) {
			if (ch > 1) {
				ch--;
			} else {
				ch = 999;
			}
			System.out.println("내린 후 현재 채널 : " + ch);
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
}

public class TvMain {
	public static void main(String[] args) {
//		↓↓ new 다음 Tv()가 생성자임 (설정한대로 사용)
		Tv myTv = new Tv();			// 생성한 생성자의 매개변수의 순서나 값에 따라 사용
		Tv tv = new Tv(true, 1);	// 생성자를 오버로딩했다면 다양하게 초기화 가능
		Tv myTv1 = new Tv(true, 14, 8, "LG", "black");
		Tv myTv2 = new Tv(false, 25, 13, "SAMSUNG", "black");
		
//		필드 초기화 대신 ↑↑ 생성자 생성하고 위 처럼 1줄로 정리 가능
//		myTv1.brand = "LG";
//		myTv1.color = "black";
//		myTv1.ch = 14;	// 초기 채널
//		myTv1.vol = 8;	// 초기 볼륨
//		
//		myTv2.brand = "SAMSUNG";
//		myTv2.color = "black";
//		myTv2.ch = 25;	// 초기 채널
//		myTv2.vol = 13;	// 초기 볼륨
		
		System.out.println(myTv1 + " TV를 조작합니다.");
		System.out.println(myTv2 + " TV를 조작합니다.");
		System.out.println("전원 상태 : " + myTv1.power);
//		myTv1.powerOnOff();
		
	}
}
