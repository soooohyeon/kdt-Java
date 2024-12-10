package abstractTest2;
//5. 추상클래스와 강제성 (출력)
public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Cat();		// 추상클래스를 상속받은 Cat 클래스를 업캐스팅
		Animal animal2 = new Dog();		// 추상클래스를 상속받은 Dog 클래스를 업캐스팅
		
		System.out.println(animal);
		System.out.println(animal2);
		
		animal.crying();		// 오버라이딩된 메소드 실행
		animal2.crying();		// 오버라이딩된 메소드 실행 
	}
}
