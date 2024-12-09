package review02;

public class EBook extends Book {
//	필드
	double sizeInMB;
	
//	생성자
	public EBook() {
	   this("알수없음", "알수없음", 0);
	}

	public EBook(String title, String author, double sizeInMB) {
	   super(title, author);
	   this.sizeInMB = sizeInMB;
	}
}
