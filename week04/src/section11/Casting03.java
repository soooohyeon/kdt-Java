package section11;

//예제 03.
class Calendar {
//	필드
	String color;
	int months;
	
//	생성자
	public Calendar(String color, int months) {
		this.color = color;
		this.months = months;
	}
	
//	메소드
	void info() {
		System.out.println(color + " 달력은 " + months + "월 까지 있습니다.");
	}
	
	void hanging() {
		System.out.println(color + " 달력을 벽에 걸 수 있습니다.");
	}
}

//예제 04.
class DeskCalendar extends Calendar {	// Calendar 클래스를 상속 받는 자식 클래스
//	부모 클래스에 매개변수를 받는 생성자를 생성했기 때문에 자식 클래스에도 똑같이 생성자를 생성해줌
	public DeskCalendar(String color, int months) {
		super(color, months);	// super() 는 부모 생성자
	}

//	메소드 오버라이딩
	@Override
	void hanging() {
		System.out.println(color + " 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
//	자식 객체에 별개로 추가해둔 메소드
	void onTheDesk() {
		System.out.println(color + " 달력을 책상에 세울 수 있습니다.");
	}
}
public class Casting03 {
	public static void main(String[] args) {
//		예제 05.
		DeskCalendar dc = new DeskCalendar("보라색", 6);	// 객체화 및 생성자 안에 값들로 필드 초기화
		dc.info();			// 부모 타입도 가지고 있으므로 부모 메소드 사용 가능
		dc.hanging();		// 오버라이딩 해둔 메소드로 사용됨
		dc.onTheDesk();		// 자식 클래스에 선언해둔 메소드이기 때문에 사용 가능
		
		System.out.println();
		
		Calendar c = new Calendar("검은색", 12);	// 객체화 및 생성자 안에 값들로 필드 초기화
		c.info();			// 부모 클래스에 선언해둔 메소드 호출
		c.hanging();		// 부모 클래스에 선언해둔 메소드 호출
//		c.onTheDesk();	//	자식 클래스에만 선언해둔 메소드로 오류 발생
	}
}
