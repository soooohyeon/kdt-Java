package anonymousTest2;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal cat = new Animal() {				
//			익명클래스, 업캐스팅, 오버라이딩, 상속
			@Override
			public void speak() {
				System.out.println("야~옹~");
			}
		};
		
		Animal dog = new Animal() {
			@Override
			public void speak() {
				System.out.println("왈! 왈!!");
			}
		};
		
		System.out.println(cat); // $ 뒤 숫자가 나와있다 → 익명클래스
		System.out.println(dog);
		
//		cat.speak();
//		dog.speak();
	}
}
