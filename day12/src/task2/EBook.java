package task2;

public class EBook extends Book {
//	EBook 클래스 Book 클래스를 상속
//	필드
//	   sizeInMB
//
//	생성자
//	- 기본 생성자
//	   super()를 호출하여 제목과 작가를 "알수없음"으로 초기화하고 크기를 0으로 설정
//	- 매개변수 생성자 
//	   제목, 작가, 크기를 받아 초기화
//	** 로직
//	1) Book 클래스 상속받기
//	2) 필드 추가 선언
//	3) 생성자 생성
	
//	필드
	int sizeInMB;

//	생성자 1
	public EBook() {
		super();
		this.sizeInMB = 0;
	}
//	생성자 2
	public EBook(String title, String author, int sizeInMB) {
		super(title, author);
		this.sizeInMB = sizeInMB;
	}
}
