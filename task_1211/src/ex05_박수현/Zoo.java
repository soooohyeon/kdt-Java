package ex05_박수현;

public class Zoo {
//	(3) Zoo 클래스
//	필드
//	    Animal[] animals : 동물 객체 배열
//	    int animalCount : 현재 동물 수
//	생성자
//	    배열 크기를 매개변수로 받아 초기화
//	메소드
//	    void addAnimal : 동물을 배열에 추가, 매개변수는 참조변수의 다형성 이용할 것
//	        배열 크기를 초과하면 "더 이상 동물을 추가할 수 없습니다"를 출력
//	    void printAllAnimals() : 모든 동물의 이름과 행동을 출력
//	필드
	Animal[] animals;
	int animalCount;

//	생성자
	public Zoo(int animalCount) {
		this.animalCount = animalCount;
	}
	
//	메소드 1. 동물을 배열에 추가, 매개변수는 참조변수의 다형성 이용할 것
//	1. 매개변수 Animal 클래스 배열 타입 - Animal[] ani
//	2. 필드 animals에 필드 animalCount로 칸 생성해줌
//	3. 반복 돌려서 매개변수의 값을 필드 배열의 값으로 담기
//	4. if (i == animals.length-1 && animals.length < ani.length) {
//		 "더 이상 동물을 추가할 수 없습니다" 출력 }
	void addAnimal (Animal[] ani) {
		animals = new Animal[animalCount];
		for (int i = 0; i < animals.length; i++) {
			animals[i] = ani[i];
			if (i == animals.length-1 && animals.length < ani.length) {
				 System.out.println("더 이상 동물을 추가할 수 없습니다");
			}
		}
	}
	
//	메소드 2. 모든 동물의 이름과 행동을 출력
//	1. for (Animal ani : animals) {
//	2.		ani.name 출력 - Animal 클래스의 getName() 메소드 호출
//	3.		다운캐스팅으로 자식메소드에 정의해둔 performActions() 메소드 호출 }
	void printAllAnimals() {
		for (Animal ani : animals) {
			System.out.println("이름 : " + ani.getName());
			((Pet)ani).performActions();
			System.out.println();
		}
	}
}
