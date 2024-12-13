package objectTest;
//3. Object 클래스 - equals 출력
public class EqualsTest {
	public static void main(String[] args) {
		Person p1 = new Person("짱구", 25);
		Person p2 = new Person("맹구", 20);
		Person p3 = new Person("철수", 20);
		
		System.out.println(p1);
		System.out.println(p2);
		
		// equals가 오버라이딩 되어있지 않을 때는 객체의 번지수로 비교한다
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}
}
