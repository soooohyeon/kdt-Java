package ex05_박수현;

public class Main {
	public static void main(String[] args) {
//		(4) Main 클래스
//		    Zoo 객체를 생성하여(3마리) printAllAnimals() 메소드를 호출하여 모든 동물의 행동을 출력
		
//		1. Pet 객체 4개 생성
//		2. Animal 클래스를 배열 타입으로 생성하여 1번에 생성한 Pet 담기
//		3. Zoo 객체 생성 후 메소드 사용하여 배열 담기
//		4. Zoo 클래스의 printAllAnimals() 메소드 호출
		
		Pet p1 = new Pet("가루");
		Pet p2 = new Pet("호두");
		Pet p3 = new Pet("두부");
		Animal[] animals = {p1, p2, p3};
		
		Zoo zoo = new Zoo(3);
		zoo.addAnimal(animals);
		
		zoo.printAllAnimals();
		
	}
}
