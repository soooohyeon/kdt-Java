package task;

public class AnimalMain {
   public static void main(String[] args) {

//   Animal 클래스
//   부모클래스
//   필드: 없음
//   메소드: cry() (소리를 출력)
//   
//   Cat 클래스
//   부모클래스를 상속받는 자식클래스
//   필드: 없음
//   메소드: cry() 오버라이딩 (고양이 소리를 출력)
//      play() 스크래치 놀이를 합니다 출력
//      
//   Dog 클래스
//   부모클래스를 상속받는 자식클래스
//   필드: 없음
//   메소드: cry() 오버라이딩 (개 소리를 출력)
//      walk() 산책을 갑니다 출력
//   
//   Mouse 클래스
//   부모클래스를 상속받는 자식클래스
//   필드: 없음
//   메소드: cry() 오버라이딩 (쥐 소리를 출력)
//      sleep() 고양이를 피해 잠을 잡니다 출력
//      
//   AnimalMain 클래스
//   Animal 클래스의 객체 생성
//   각 클래스의 객체 생성
//   메소드 : main메소드
//   printCrying(Animal animal)메소드   
//      (조건문으로 instanceof 사용해서 해당 하는 것에 맞는 객체의 메소드가 사용되도록 진행-다운캐스팅 이용)
//   
//   (각 객체를 넣었을 때 결과 출력-어떤과정이 진행되었는지 주석달아 작성)
	   
//	   메소드에 static을 붙이지 않았기때문에 메소드를 사용하기 위해 객체화 시켜줌
	   AnimalMain am = new AnimalMain();
	   
	   Animal ani = new Animal();
	   Animal cat = new Cat();		// 업캐스팅
	   Animal dog = new Dog();		// 업캐스팅
	   Animal mouse = new Mouse();	// 업캐스팅

	   Cat cat2 = new Cat();
	   am.printCrying(cat2);
	   am.printCrying(new Dog());
	   
	   am.printCrying(ani);		// Animal 타입 그대로 이기 때문에 else로 넘어가서 "소리를 냅니다" 출력
	   am.printCrying(cat);		// Cat 타입 검사에서 true가 나옴 / "야---옹" 출력
	   am.printCrying(dog);		// Cat 타입 검사에서 false, Dog 타입에서 True가 나옴 / "멍! 멍!" 출력
	   am.printCrying(mouse);	// Cat, Dog 타입 검사에서 false, Mouse 타입에서 true가 나옴 / "찍.. 찍.." 출력
	   
	   System.out.println("\n2번째 출력방법");
//	   클래스를 배열화
	   Animal[] animal = {new Animal(), new Cat(), new Dog(), new Mouse()};
	   for (Animal anim2 : animal) {
		   am.printCrying(anim2);
	   }
   }
   
//   같은 부모클래스로 상속을 받았기 때문에 부모클래스인 Animal을 매개변수로 넣어줌
//   업캐스팅된 객체더라도 오버라이딩된 메소드로 호출이 되지만 casting 연습으로 다운캐스팅으로 변환해서 호출시켜줌
   void printCrying (Animal animal) {
	   if (animal instanceof Cat) {				// Cat 타입으로 된 객체일 경우
		   ((Cat)animal).cry();					// 다운캐스팅 - 야---옹 출력
		   ((Cat)animal).play();
	   } else if (animal instanceof Dog) {		// Dog 타입으로 된 객체일 경우
		   ((Dog)animal).cry();					// 다운캐스팅 - 멍! 멍! 출력
		   ((Dog)animal).walk();
	   } else if (animal instanceof Mouse) {	// Mouse 타입으로 된 객체일 경우
		   ((Mouse)animal).cry();				// 다운캐스팅 - 찍.. 찍.. 출력
		   ((Mouse)animal).sleep();
	   } else {									// 그 외 부모타입인 Animal 타입이거나 오버라이딩된 메소드가 없을 경우
		   animal.cry();						// 소리를 냅니다 출력됨
	   }
   }
}