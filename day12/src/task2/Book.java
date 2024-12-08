package task2;

public class Book {
//	2) 도서 프로그램
//	Book 클래스 
//	필드
//	   title, author
//
//	생성자
//	- 기본 생성자 : 제목과 작가를 "알수없음"으로 초기화
//	- 매개변수 생성자 : 제목만 받아 작가를 "알수없음"으로 초기화
//	- 매개변수 생성자 : 제목과 작가를 모두 받아 초기화
//
//	EBook 클래스 Book 클래스를 상속
//	필드
//	   sizeInMB
//
//	생성자
//	- 기본 생성자
//	   super()를 호출하여 제목과 작가를 "알수없음"으로 초기화하고 크기를 0으로 설정
//	- 매개변수 생성자 
//	   제목, 작가, 크기를 받아 초기화
	
//	필드
	String title;
	String author;
	
//	생성자 - 오버로딩
//	생성자 1
	public Book() {
		super();
		this.title = "알 수 없음";
		this.author = "알 수 없음";
	}
//	생성자 2
	public Book(String title) {
		super();
		this.title = title;
		this.author = "알 수 없음";
	}
//	생성자 3
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
//	메인 메소드
	public static void main(String[] args) {
//		** 로직
//		1) Book과 EBook 클래스의 각 객체 생성 및 초기화
//		2) 결과 출력
		Book b1 = new Book();
		Book b2 = new Book("자바 - 클래스 상속");
		Book b3 = new Book("월요일이 좋아", "스폰지밥");
		
		System.out.println("Book1\n제목 : " + b1.title + ", 작가 : " + b1.author);
		System.out.println("Book2\n제목 : " + b2.title + ", 작가 : " + b2.author);
		System.out.println("Book3\n제목 : " + b3.title + ", 작가 : " + b3.author);
		
		EBook eb1 = new EBook();
		EBook eb2 = new EBook("과제하자", "JAVA", 100);

		System.out.println("E-Book1\n제목 : " + eb1.title + ", 작가 : " + eb1.author + ", 용량 : " + eb1.sizeInMB + "MB");
		System.out.println("E-Book2\n제목 : " + eb2.title + ", 작가 : " + eb2.author + ", 용량 : " + eb2.sizeInMB + "MB");
	}
}
