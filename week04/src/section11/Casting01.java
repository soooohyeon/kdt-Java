package section11;

//예제 01.
class Parent {}
class Child extends Parent {}

public class Casting01 {
	public static void main(String[] args) {
		Parent p1 = new Parent();	// Parent 객체 생성
		Child c1 = new Child();		// Child 객체 생성
		
		Parent p2 = new Child();	// Child의 참조값을 업캐스팅하여 Parent 참조변수에 담기
		Parent p3 = c1;				// Child의 참조값을 업캐스팅하여 Parent 참조변수에 담기
//		Child c2 = p1;				// 부모 클래스를 자식 클래스 타입으로 변환은 불가능
		
		if (p3 == c1) {	// 주소값이 같다면
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다.");
		}
	}
}
