package inherianceConstructor;
//9. 상속관계 - 생성자 확인
//부모클래스(슈퍼클래스)
public class Parents {
//	필드
	int number;
	
//	생성자
	public Parents() {
		super();	// 
		System.out.println("Parents 생성자 호출");
	}
	
//	메소드
	void printStr (String str) {
		System.out.println(str);
	}
	
}
