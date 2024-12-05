package classTask;
//실습 01. 동물 클래스를 작성 결과 출력해보기
public class AnimalMain {
	public static void main(String[] args) {
		Animal dog = new Animal("가루", 3, "개");
		Animal cat = new Animal("나비", 8, "고양이");
		Animal rabbit = new Animal("초원이", 2, "토끼");
		
//		입력한 객체의 모든 정보 출력
		dog.printInfo();
		cat.printInfo();
		rabbit.printInfo();
		
		System.out.println();	// 출력 화면 정리
		
		dog.eat();
		dog.play();
		cat.sleep();
		rabbit.birthday();
	}
}
