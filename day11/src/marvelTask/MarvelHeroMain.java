package marvelTask;
//12. 실습 연습
public class MarvelHeroMain {
	public static void main(String[] args) {
//		아이언맨(ironMan)과 헐크(hulk) 객체를 만들고 정보 출력
		
//		각 아이언맨과 헐크 객체 생성
//		작성한 생성자의 매개변수에 맞게 정보 입력
		MarvelHero ironMan = new MarvelHero("아이언맨", "강력한 슈트", 50);
		MarvelHero hulk = new MarvelHero("헐크", "엄청난 힘", 55);
		
//		생성한 객체의 각각의 정보 출력
		ironMan.printInfo();
		hulk.printInfo();
		
//		이름과 액션 출력 메소드 1) 리턴 타입 없을 때
//		ironMan.performAction();
//		hulk.performAction();
		
//		이름과 액션 출력 메소드 2) 리턴 타입 있을 때
		System.out.println(ironMan.performAction());
		System.out.println(hulk.performAction());
	}
}
