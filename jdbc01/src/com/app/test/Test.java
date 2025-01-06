package com.app.test;

import java.util.List;

import com.app.dao.UserDAO;
import com.app.domain.UserDTO;

public class Test {
	public static void main(String[] args) {
//		연결 테스트
//		try {
//			Connection conn = DBConnector.getConnection();
//			System.out.println("연결 성공");
//			conn.close();
//		} catch (SQLException e) {
//			System.out.println("연결 실패");
//		}
		
		UserDTO userDTO = new UserDTO();
		UserDAO userDAO = new UserDAO();
		
//		userDTO.setUserId("bbb");
//		userDTO.setUserPw("1234");
//		userDTO.setUserName("홍길동");
//		userDTO.setUserAge(5);
//		userDTO.setUserGender("M");
////		DB에서 DATE타입이라 날짜 형식과 자리수가 다르다면 오류 발생
//		userDTO.setUserBirth("20001010");
		
//		아이디 중복 체크
		System.out.println(userDAO.checkId(userDTO.getUserId()));
		
//		회원가입
//		userDAO.join(userDTO);
		
//		로그인
		System.out.println(userDAO.login("ABC", "1234"));
		
//		이름과 생일로 아이디 찾기
		List<String>userId = userDAO.findId("신짱구", "20000101");
//		List<String>userId = userDAO.findId("신형만", "20000101");
		if (userId.size() == 0) {
			System.out.println("일치하는 아이디가 없습니다.");
		} else {
//			출력방법 (1)
//			for (String id : userId) {
//				System.out.println("아이디 : " + id);
//			}
			
//			출력방법 (2)
			userId.forEach(System.out::println);
		}
		

//		회원 1명 전체 정보 조회
		UserDTO user = userDAO.findUser(1);
		System.out.println(user);
		
//		회원정보 전체 정보 수정
//		user.setUserId("updateTest");
//		user.setUserPw("update1");
//		user.setUserName("test");
//		user.setUserAge(10);
//		user.setUserGender("W");
//		user.setUserBirth("2025-01-06");
//		userDAO.update(user);
//		System.out.println(user);
		
//		 회원탈퇴
		if (userDAO.delete(1)) {
		   System.out.println("회원 탈퇴 완료");
		} else {
		   System.out.println("회원 탈퇴 실패");
		}

	}
}
