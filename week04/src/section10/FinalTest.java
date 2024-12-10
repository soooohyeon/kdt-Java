package section10;

//예제 25.
class Book2 {
//	필드
	String title;
	String author;
	
//	매개변수가 있는 생성자
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
//	final 메소드 - 오버라이딩 불가
	final void info_title() {
		System.out.println("책의 제목은 " + title + " 입니다.");
	}
	
//	일반 메소드
	void info_author() {
		System.out.println("책의 저자는 " + author + " 입니다.");
	}
}

//예제 26.
class Comic2 extends Book2 {	// Book 클래스를 상속받은 자식 클래스
//	부모 클래스와는 별개인 필드 선
	boolean isColor;
	
//	부모 클래스에서 생성자를 생성했기 때문에 자식 클래스에서도 생성자를 생성해야함
	public Comic2(String title, String author, boolean isColor) {
		super(title, author);	// 이미 생성해둔 생성자를 super() 메소드로 접근 가능함
		this.isColor = isColor;
	}

//	부모 클래스의 메소드 오버라이딩
	@Override
	void info_author() {
		System.out.println("이 만화책의 저자는 " + author + " 입니다.");
	}
	
//	자식 클래스에서 추가로 선언한 메소드
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		} else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
	
}

public class FinalTest {
	public static void main(String[] args) {
		//예제 27.
		Comic2 comicBook = new Comic2("주머니 괴물", "미상", true);	// 생성해둔 생성자에 맞춰 객체화
		comicBook.info_title();		// final 메소드는 오버라이딩 불가로 부모에 작성해둔 메소드 실행
		comicBook.info_author();	// 오버라이딩한 메소드 실행
		comicBook.info_color();		// 자식 클래스 추가 선언한 메소드 실행
	}
}
