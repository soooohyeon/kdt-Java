package constructorThis02;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("신짱구", 5);
		Person p3 = new Person("김철수");
		
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
		
		p1.printInfo();
		p2.printInfo();
		p3.printInfo();
		
	}
}
