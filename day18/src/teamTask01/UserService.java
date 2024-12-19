package teamTask01;

import java.util.ArrayList;
import java.util.List;

public class UserService {
//	UserService 클래스
//	- 회원정보를 저장할 List를 private으로 선언한다
//	- 아이디 중복검사 메소드
//	- 회원가입 메소드
//	- 로그인 메소드
	
//	필드 - List는 메모리에 공간을 만들어줘야 아이디 체크 가능
	private List<UserVO> li = new ArrayList<UserVO>();
	
//	메소드
//	- 아이디 중복검사 메소드 (메소드 안에서 중복 검사)
//	리턴타입 : boolean
//	메소드명 : checkId
//	매개변수 : String id
//		필드 수만큼 반복
//			객체의 아이디에 입력받은 아이디와 일치하는게 있다면 true 리턴
//		아니라면 fasle 리턴
	boolean checkId(String id) {
		for (UserVO user : li) {
			return user.getId().equals(id);
		}
		return false;
	}


//	- 회원가입 메소드 (메소드 안에서 중복 검사)
//	리턴타입 : boolean
//	메소드명 : join
//	매개변수 : String id, String pw, String name, int age
//		아이디 중복검사 메소드 호출하고 ture 라면
//			입력받은 정보 저장하고 true 리턴
//		아니라면 fasle 리턴
	void join (UserVO joinUser) {
		if (!checkId(joinUser.getId())) {
			li.add(joinUser);
			System.out.println("회원가입 완료");
		} else {
			System.out.println("아이디 중복");
		}
	}
//	- 회원가입 메소드2 (메인에서 중복 검사)
	void join2 (UserVO joinUser) {
		li.add(joinUser);
		System.out.println("회원가입 완료");
	}
	
//	- 로그인 메소드
//	리턴타입 : boolean
//	메소드명 : login
//	매개변수 : String id, String pw
//		for(list.size만큼 반복돌리기) {
//			list의 담긴 User 객체의 id와 비밀번호 일치하면 유저
//			아니라면 false }
	boolean login(String id, String pw) {
		for (int i = 0; i < li.size(); i++) {
			UserVO user = li.get(i);
			if ((user.getId()).equals(id) && (user.getPw()).equals(pw)) {
				return true;
			}
		}
		return false;
	}
}