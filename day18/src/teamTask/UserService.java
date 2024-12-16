package teamTask;

import java.util.List;

public class UserService {
//	UserService 클래스
//	- 회원정보를 저장할 List를 private으로 선언한다
//	- 아이디 중복검사 메소드
//	- 회원가입 메소드
//	- 로그인 메소드
	
//	필드
	private List<UserVo> li;
	
	public UserService(List<UserVo> li) {
		this.li = li;
	}

//	메소드
	//아이디 중복여부를 List의 저장된 name들과 비교하여 
	//겹치면 false 아니면 true
	boolean ID_Check(String ID) {
		while(true)
		{
			for(int i =0; i < li.size(); i++)   
			{
				if((li.get(i).getId()).equals(ID)) 
				{
					return true; 
				}
			}
			return false;
		}
	}

//	- 회원가입 메소드 (메소드 안에서 중복 검사)
//	리턴타입 : boolean
//	메소드명 : join
//	매개변수 : String id, String pw, String name, int age
//		아이디 중복검사 메소드 호출하고 ture 라면
//			입력받은 정보 저장하고 true 리턴
//		아니라면 fasle 리턴
	boolean join (UserVo joinUser) {
		if (ID_Check(joinUser.getId())) {
			UserVo user = new UserVo();
			return true;
		}
		return false;
	}
//	- 회원가입 메소드2 (메인에서 중복 검사)
	void join2 (UserVo joinUser) {
		UserVo user = new UserVo();
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
			UserVo user = li.get(i);
			if ((user.getId()).equals(id) && (user.getPw()).equals(pw)) {
				return true;
			}
		}
		return false;
	}
	
}