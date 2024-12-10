package section10;

// 예제 01.
class Book {	// 부모 클래스 선언
//	필드
	String title;
	int price;
	
//	메소드
	void info() {
		System.out.println("책의 제목은 " + title + "이고, 가격은 " + price + "원 입니다.");
	}
}

// 예제 02.
class Comic extends Book {	// 자식 클래스 선언하고 부모 클래스 상속
	
}

public class InheritanceTest01 {
	public static void main(String[] args) {
//		예제 03.
		Comic comicBook = new Comic();	// 자식 클래스인 Comic을 객체화
		comicBook.title = "포켓몬";		// 필드 중 title 초기화
		comicBook.price = 4500;			// 필드 중 price 초기화
		comicBook.info();				// 메소드 사용
//		자식 클래스 멤버에는 아무것도 작성하지 않았더라도 부모 클래스 상속으로 부모 클래스 내부의 필드나 메소드 사용이 가능함
		
	}
}
