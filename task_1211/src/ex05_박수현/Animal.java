package ex05_박수현;

public abstract class Animal {
//	(1) 추상 클래스 Animal
//	필드
//	    String name : 동물 이름 (protected)
//	생성자
//	    이름을 매개변수로 받아 초기화
//	메소드
//	    String getName() : 동물의 이름을 반환
//	    void performActions() : 추상 메소드, 동물의 행동을 출력
//	필드
	protected String name;
	
//	생성자
	public Animal(String name) {
		this.name = name;
	}
	
//	메소드
	String getName() {
		return this.name;
	}
	
//	추상메소드
	abstract void performActions();
}
