package methodOverride;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("동물");
		
		System.out.println(animal);
		animal.sound();
		
		Dog dog = new Dog("가루");
		dog.sound();
		
		Cat cat = new Cat("호두");
		cat.sound();
	}
}
