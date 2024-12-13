package objectTest;
//1. Object 클래스
public class User {
//	필드
	int userNumber;
	String userName;
	
//	생성자
	public User() {
		super();
	}	
	
//	생성자 오버로딩
	public User(int userNumber, String userName) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
	}
	
//	toString() 오버라이딩
	@Override
	public String toString() {
//		return super.toString();	// objectTest.User@48cf768c로 나온 이유
		return "User [userNumber : "  + userNumber + ", userName : " + userName + " ]" ;
	}

//	hashCode() 오버라이딩
	@Override
	public int hashCode() {
//		return super.hashCode();	// 객체의 주소값 출력
		return this.userNumber;
	}
	
//	equals() 오버라이딩 : 객체의 동등성 비교할 때는 재정의해줘야함
	@Override
	public boolean equals(Object obj) {	// Up Casting해서 매개변수로 받아옴
//		자기자신과 비교하는 경우
		if (this == obj) {
			return true;
		}
//		유저번호가 일치하는지 비교하는 경우
		if (obj instanceof User) {
			User user = (User)obj;	// User 필드와 비교를 해야하니 다운 캐스팅 해줌
			if (user.userNumber == this.userNumber) {
				return true;
			}
		}
		return false;
	}
	
}
