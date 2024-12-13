package listTest;

import java.util.Comparator;

//9. Comparator 인터페이스의 메소드 오버라이딩

class Person {
//	필드
	String name;
	int age;
	
//	생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	toString 오버라이딩
	@Override
	public String toString() {
		return "Person [ name : " + name + ", age : " + age + " ]";
	}
}

class AgeComparator implements Comparator<Person> {
//	Comparator의 추상메소드 오버라이딩 : 나이를 기준으로 구현
	@Override
	public int compare(Person o1, Person o2) {
		return Integer.compare(o1.age, o2.age);
//		나이를 오름차순으로 비교
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof AgeComparator;
	}
}

public class ComparatorTest {
	public static void main(String[] args) {
		Person p1 = new Person("짱구", 5);
		Person p2 = new Person("맹구", 15);
		Person p3 = new Person("철수", 17);
		
		AgeComparator ageCom = new AgeComparator();
		System.out.println(ageCom.compare(p1, p2));	// p2가 더 크기 때문에 -1 출력
		System.out.println(ageCom.equals(new AgeComparator()));	// 타입비교 메소드로 오버라이딩 : true 출력됨
		System.out.println(ageCom.equals(new Object()));	// 타입비교 메소드로 오버라이딩 : false 출력됨
		
	}
}
