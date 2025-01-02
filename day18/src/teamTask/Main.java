package teamTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		UserService us = new UserService();
//		회원가입 메소드1 사용 (메소드에서 중복검사)
		us.join(new UserVO(1, "abc", "4321", "자바", 20));
		us.join(new UserVO(2, "abc", "5555", "짱구", 25));
		System.out.println();
		
//		회원가입 메소드2 사용 (메인에서 중복검사)
		String id = "aaa";
		if (us.checkId(id)) {
			System.out.println("아이디 중복");
		} else {
			us.join2(new UserVO(3, "aaa", "1234", "홍길동", 20));
		}
		System.out.println();
		
//		로그인 여부 확인
		boolean isLogin = us.login("ddd", "ddd");
		boolean isLogin2 = us.login("aaa", "1234");
		System.out.println(isLogin ? "로그인 되었습니다." : "로그인 실패");
		System.out.println(isLogin2 ? "로그인 되었습니다." : "로그인 실패");
	}
}
