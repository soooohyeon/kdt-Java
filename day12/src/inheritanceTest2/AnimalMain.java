package inheritanceTest2;

public class AnimalMain {
	public static void main(String[] args) {
//		동물 클래스의 객체 생성
		Animal ani = new Animal();
//		Animal 클래스에 있는 필드와 메소드만 사용 가능
		ani.name = "사자";
		System.out.println(ani.name);
		
//		새 클래스 객체 생성
//		새 클래스는 Animal 클래스를 상속받고 있기 때문에 Animal 클래스에 있는 필드와 메소드 사용 가능
//		새 클래스에 추가로 작성해 놓은 멤버도 같이 사용 가능
		Bird bird = new Bird();
		bird.name = "꾸륵";
		bird.age = 3;
		bird.type = "갈매기";
		System.out.println(bird.name);
		bird.eat("새우깡");
		
//		강아지 클래스 객체 생성
		Dog dog = new Dog();
		dog.name = "가루";
		dog.age = 3;
		dog.type = "개";
		
		System.out.println(dog);
		dog.birthday();
		
//		고양이 클래스 객체 생성
		Cat cat = new Cat();
		cat.name = "나비";
		cat.age = 4;
		cat.type = "고양이";
		
		cat.meow();
	}
}
