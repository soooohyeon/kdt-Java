package section12;

//예제 05.
abstract class Phone {
	abstract void openingLogo();
	void powerOn() {
		openingLogo();
		System.out.println("핸드폰이 켜집니다.");
	}
	void powerOff() {
		System.out.println("핸드폰이 꺼집니다.");
	}
}

//예제 06.
class PineapllePhone extends Phone {
	@Override
	void openingLogo() {
		System.out.println("@@@");
	}
}

//예제 07.
class ThreeStarPhone extends Phone {
	@Override
	void openingLogo() {
		System.out.println("★☆★");
	}
}

public abstract class AbstractClass02 {
	public static void main(String[] args) {
//		예제 08.
//		Phone p = new Phone();	// 에러 발생
		
		PineapllePhone pp = new PineapllePhone();
		pp.powerOn();
		pp.powerOff();
		
		ThreeStarPhone tp = new ThreeStarPhone();
		tp.powerOn();
		tp.powerOff();
		
		
	}
}
