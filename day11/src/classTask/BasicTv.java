package classTask;
//2. BasicTv 클래스를 작성하세요
public class BasicTv {
//	필드
//		boolean power : TV 전원 상태 (기본값: false)
//		int channel : TV 채널 (기본값: 1)
//		String color : TV의 색상
//		int size : TV의 크기
//		int price : TV의 가격
	boolean power;
	int channel;
	String color;
	int size;
	int price;
	
//	정보 입력을 위한 생성자 생성
	public BasicTv(String color, int size, int price) {
		this.channel = 1;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
//	메서드
//	기본 정보 출력 메소드
	void printInfo() {
		System.out.println("색상 : "+ this.color + "\n크기 : "+ this.size + "\n가격 : "
				+ this.price + "\n전원 : " + this.power + "\n현재 채널 번호 : " + this.channel);
	}
	
//		void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//		      전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
//		void channelUp() : 채널을 1씩 증가시키는 메서드
//		      채널 최대값 999
//		void channelDown() : 채널을 1씩 감소시키는 메서드
//		      채널 최소값 1
//	전원끄기
//	리턴값 x, 매개변수 x, powerOnOff()
//	1) 현재 power의 상태 확인
//		1-1) false일 때 "TV 전원이 켜졌습니다." 출력
//		1-2) true일 때 "TV 전원이 꺼졌습니다." 출력
//		** 삼항연산자 사용해서 결과를 문자열 변수에 담고 문자열 변수 출력
//	2) 현재 power의 값의 반대된 값을 다시 넣으면 됨
	void powerOnOff() {
//		아래 코드는 전원을 껐다 켰을때 번호 초기화를 위한 코드, 현재는 전원 끄고 킬때 채널 번호 유지되도록 해둠
//		this.channel = 1;→
		String powerMsg = power ? "TV 전원이 꺼졌습니다." : "TV 전원이 켜졌습니다.";
		System.out.println(powerMsg);
		this.power = ! this.power;
	}
	
//	채널 1씩 증가
//	리턴값 x, 매개변수 x, channelUp()
//	1) 전원이 true일 때,
//		1-1) 최대가 999번이기 때문에 if (채널 < 999) 일 때 채널++
//		1-2) 이미 999라면 1번으로 채널 돌아가기
//	2) 전원이 false일 때, "전원을 켜주세요" 메세지 출력
	void channelUp() {
		if (this.power) {
			if (this.channel < 999) {
				this.channel++;
			} else {
				System.out.println("현재 채널이 " + this.channel + "번 입니다.\n맨 처음으로 되돌아 갑니다.");
				this.channel = 1;
			}
			System.out.println("현재 채널: " + this.channel);
		} else {
			System.out.println("TV 전원을 먼저 켜주세요.");
		}
	}

//	채널 1씩 감소
//	리턴값 x, 매개변수 x, channelDown()
//	1) 전원이 true일 때,
//		1-1) 최소가 1번이기 때문에 if (채널 > 1) 일 때 채널--
//		1-2) 이미 1이라면 999번으로 채널 돌아가기
//	2) 전원이 false일 때, "전원을 켜주세요" 메세지 출력
	void channelDown() {
		if (this.power) {
			if (this.channel > 1) {
				this.channel--;
			} else {
				System.out.println("현재 채널이 " + this.channel + "번 입니다.\n맨 마지막으로 되돌아 갑니다.");
				this.channel = 999;
			}
			System.out.println("현재 채널: " + this.channel);
		} else {
			System.out.println("TV 전원을 먼저 켜주세요.");
		}
	}
	
	
}
