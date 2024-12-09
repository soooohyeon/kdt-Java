package review02;

public class Main {
	public static void main(String[] args) {
//		2) 도서 프로그램
//		Book 클래스 
//		필드
//			title, author
//		생성자
//			기본 생성자 : 제목과 작가를 "알수없음"으로 초기화
//			매개변수 생성자 : 제목만 받아 작가를 "알수없음"으로 초기화
//			매개변수 생성자 : 제목과 작가를 모두 받아 초기화
//	
//		EBook 클래스 Book 클래스를 상속
//		필드
//		   sizeInMB
//	
//		생성자
//		기본 생성자
//		   super()를 호출하여 제목과 작가를 "알수없음"으로 초기화하고 크기를 0으로 설정
//		매개변수 생성자 
//		   제목, 작가, 크기를 받아 초기화
		
		Book b1 = new Book();
		System.out.println(b1.title);	// 알수없음 출력됨
		
		Book b2 = new Book("자바");
		System.out.println(b2.title);	// 자바 출력됨
		System.out.println(b2.author);	// 알수없음 출력됨
		
		Book b3 = new Book("JAVA", "오라클");
		System.out.println(b3.title + "의 저자" + b3.author);
		
	    EBook ebook = new EBook();
	    System.out.println(ebook.sizeInMB);
	}
}
