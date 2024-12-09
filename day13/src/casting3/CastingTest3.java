package casting3;
//7. 캐스팅 특징 - 메인 클래스
public class CastingTest3 {
	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Animal animal2 = new Dog();		// 업캐스팅
//		animal.crying();
		
//		1. 같은 메소드가 부모에도 있고 자식에도 있는 경우 (오버라이딩)
//		업캐스팅 하여도 오버라이딩 된 메소드가 실행됨
//		animal2.crying();
		
//		2. 메소드가 부모에는 없고 자식에서 추가된 경우
//		부모에 존재하지 않는 멤버에 접근하려는 경우
//		animal2.walk();
//		자식 클래스에서 추가한 멤버는 부모 타입의 참조변수로는 접근 불가
		
//		(Dog)animal2.walk();
//			→ ()와 .의 연산순위가 같기 때문에 형변환이 제대로 적용되지 않음 ()를 사용해서 제대로 명시해줘야함
//		((Dog)animal2).walk();
		
//		***생성자 추가 후 객체 생성
		Animal animal = new Animal("동물");
		Dog dog = new Dog("가루");
		Cat cat = new Cat("별이");
		
		printText(dog);	// 업캐스팅 된 객체 인수로 전달
		printText(cat);	// 업캐스팅 된 객체 인수로 전달
		
		tryWalk(dog);	// 업캐스팅 된 객체 인수로 전달
		
		printText(new Dog("두부"));	// 업캐스팅 된 객체 인수로 전달
	}
	
//	1. 메소드의 매개변수로 여러 타입의 값을 받는 경우
//	   일반적으로는 각각의 타입을 처리하는 메소드를 별도 생성해야함
//	   그러나 매개변수에 업캐스팅을 하게되면 1개의 타입으로 자식클래스의 값들을 전달 가능
	
//	캐스팅을 이용하지 않는다면 매개변수를 각각 넣음으로써 코드가 늘어나게 됨
//	static void printText(Dog dog) {
//		System.out.println(dog.name + "이가 운다.");
//		dog.crying();
//	}
//	static void printText(Cat cat) {
//		System.out.println(cat.name + "이가 운다.");
//		cat.crying();
//	}
	
//	2. 그래서 같은 부모 클래스가 존재한다면 매개변수를 부모타입으로 받음
//	하나의 메소드에서 매개변수를 부모타입으로 만들면 여러 자식타입을 받아서 사용이 가능함 → 매개변수의 다형성
	static void printText(Animal ani) {		// → 매개변수의 다형성이라고 부름
		System.out.println(ani.name + "이/가 운다.");
		ani.crying();	// 업캐스팅 된 객체가 들어와도 오버라이딩된 메소드가 호출됨
	}

//	3. 만약 부모클래스에서 존재하지 않는 멤버에 접근하기 위해서는 Down Casting을 해줘야 함
	static void tryWalk(Animal animal) {
//		매개변수로 받아온 객체의 주소가 Cat 타입인지, Dog 타입인지 확인
		if (animal instanceof Dog) {	// Dog 타입이라면 다운캐스팅함
			((Dog)animal).walk();
		} else {
			System.out.println("산책 안갈래");
		}
	}
	
	
	
}
