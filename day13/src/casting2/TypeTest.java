package casting2;
//6. 자식객체의 타입 여러개인지 확인 - 메인 클래스
public class TypeTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println(p);
		System.out.println(c);
		
//		해당 클래스 타입이 맞는 확인하는 연산자 : 객체 instanceof 클래스명 → boolean 타입으로 나옴
//		instanceof : 객체가 특정 클래스나 해당 클래스의 자식 클래스인지 확인할 때 사용
//		상속 관계가 아니라면 사용 불가
		System.out.println(p instanceof Parent);	// true → p는 Parent의 객체
		System.out.println(p instanceof Child);		// fale	→ p는 Child의 객체 x
		System.out.println(c instanceof Child);		// true	→ c는 Child의 객체
		System.out.println(c instanceof Parent);	// true	→ c는 Child 이면서 Parent의 객체
//		자식 클래스 타입의 객체는 부모 클래스 타입도 동시에 갖음
		
		Child cc = new Child();
//		→ Child 클래스의 참조변수에 Child 타입의 참조값을 담음
//		  그러나 Parent 클래스를 상속뱓았기 때문에 Parent 클래스 타입도 가지고 있음
	}
}
