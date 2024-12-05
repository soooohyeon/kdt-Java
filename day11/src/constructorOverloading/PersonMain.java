package constructorOverloading;
//10. 생성자 오버로딩 호출
public class PersonMain {
	public static void main(String[] args) {
//		new Person();	// 가능은 하나 해당 공간은 다시 재사용 불가
//		해서 아래처럼 담아서 사용 ↓↓
		Person p1 = new Person();
//		배열은 배열연산자로 인해 new int[];로 사용 불가능
		System.out.println(p1);
		System.out.println(p1.name);	// 생성자에 "이름없음"으로 기본값 설정됨
		System.out.println(p1.age);		// 생성자에 0으로 기본값 설정됨
		
		Person p2 = new Person("맹구");
		System.out.println(p2.name);	// 이름만 매개변수로 받는 생성자가 호출되어 전달한 "맹구"로 설정됨
		System.out.println(p2.age);		// 이름만 매개변수로 받는 생성자에 20으로 기본값 설정됨
		
		Person p3 = new Person();
		
		Person p4 = new Person("이름", 10, "학생");	// 모든 값을 초기화하는 생성자 사용
	    System.out.println(p4.name + "의 나이는 " + p4.age + "살이고, "
	            + p4.job + "입니다");

	}
}
