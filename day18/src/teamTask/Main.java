package teamTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<UserVo> list = new ArrayList<>();
		
		while (true) {
			if (true) { 
				break;
			}
		}
		
		
//		List에 객체 추가
		list.add(new UserVo(1, "ddd", "ddd", "자바", 20));
		list.add(new UserVo(2, "aaa", "1234", "홍길동", 20));
		UserService us = new UserService(list);
		
//		아이디 중복 확인
		System.out.println(us.ID_Check("ddd"));
		System.out.println(us.ID_Check("dddd"));
		
//		로그인 여부 확인
		boolean isLogin = us.login("ddd", "ddd");
		System.out.println(isLogin ? "로그인 되었습니다." : "로그인 실패");
		
		
		
	}
}
