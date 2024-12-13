package objectTest;
//2. Object 클래스 - 기본 메소드 오버라이딩
public class UserMain {
	public static void main(String[] args) {
		User user1 = new User(1, "짱구");
		User user2 = new User(1, "짱구");
		
		System.out.println(user1);				// 객체1의 참조값 출력
//		↑↑ objectTest.User@48cf768c	> 48cf768c : 주소값 1221555852를 16진수로 변환한 값
		System.out.println(user2.toString());	// 객체2의 참조값 출력
		System.out.println(user1.hashCode());	// 주소값 : 1221555852
		System.out.println(user2.hashCode());
		
		System.out.println(user1 == user2);		// 참조값이 다르기 때문에 false
		System.out.println(user1.equals(user2));
//		equals()의 매개변수 타입은 Object 클래스임
//		모든 클래스의 부모클래스는 Object이기 때문에 Up Casting
		
//		자기 자신과 비교하는 경우 무조건 true
		System.out.println("유저 번호가 일치 : " + user1.equals(user1));
//		객체와 null을 비교하는 경우
		System.out.println("null 비교 : " + user1.equals(null));
//		유저 번호가 일치하는지 비교하는 경우
		System.out.println("equals 비교 : " + user1.equals(user2));
		
		System.out.println("== 비교 : " + (user1 == user2));	// 두 객체의 주소값 비교이므로 false
	}
}
