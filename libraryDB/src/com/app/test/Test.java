package com.app.test;

import java.util.List;

import com.app.dao.BookDAO;
import com.app.dao.UserDAO;
import com.app.domain.BookDTO;
import com.app.domain.UserDTO;

public class Test {
	public static void main(String[] args) {
//		정리해둔 노션
//		https://www.notion.so/01-06-b617633c1cf942088748a2f315eb0d40
		
////		연결 테스트
//		try {
//			Connection conn = DBConnector.getConnection();
//			System.out.println("연결 성공");
//			conn.close();
//		} catch (SQLException e) {
//			System.out.println("연결 실패");
//		}

		BookDAO bookDAO = new BookDAO();
		UserDTO userDTO = new UserDTO();
		UserDAO userDAO = new UserDAO();

//		//사용자 등록 테스트1
//		userDTO.setUserId("GOD");
//		userDTO.setUserPw("1234");
//		userDTO.setUserName("놀부");
//		userDTO.setUserPhone("010-1234-5678");
//	    //사용자 등록 메소드1
//		userDAO.addUser(userDTO);

//		//사용자 등록 테스트2
//		userDTO.setUserId("HOT_");
//		userDTO.setUserPw("9876");
//		userDTO.setUserName("흥부");
//		userDTO.setUserPhone("010-9876-5432");
//	    //사용자 등록 메소드2
//		userDAO.addUser(userDTO);

//		//사용자 등록 테스트3
//		userDTO.setUserId("AAA");
//		userDTO.setUserPw("1234");
//		userDTO.setUserName("제비");
//		userDTO.setUserPhone("010-7777-7777");
//	    //사용자 등록 메소드3
//		userDAO.addUser(userDTO);

//	  	로그인
//	  	System.out.println(userDAO.login("GOD","1234"));

//		도서 목록 조회
		List<BookDTO> books = bookDAO.selectAllBook();
		for(BookDTO book : books) {
			System.out.println(book);
		}

//		도서 검색
//		List<BookDTO> searchBooks = bookDAO.searchBooks("편의점");
//		for(BookDTO book : searchBooks) {
//			System.out.println(book);
//		}

//	    도서 대여
//	    bookDAO.bookRent(2);

//		대여 여부 확인
//		if(bookDAO.bookRantalStatus("도둑맞은 집중력")) { //true
////		if (bookDAO.bookRantalStatus("불편한 편의점2")) { // false
//			System.out.println("대여중 입니다");
//		} else {
//			System.out.println("대여중이 아닙니다");
//		}

	}
}
