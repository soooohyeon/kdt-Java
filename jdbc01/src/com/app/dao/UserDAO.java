package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;	// ⇢ 보안이 강한 인터페이스
	public ResultSet resultSet;
	
//	아이디 중복 검사
//	자바에는 *이 아닌 컬럼명을 전부 작성해주어야 함
	public boolean checkId(String userId) {
		try {
//			수행할 쿼리문을 문자열 변수에 담기
			String query = "SELECT user_number FROM tbl_user WHERE user_id = ?";
//			DBConnector에서 커넥션 객체를 얻어옴(DB 연결완료)
			connection = DBConnector.getConnection();
//			쿼리를 보내기 위해 preparedStatement 객체를 커넥션 객체에서 가져옴
			preparedStatement = connection.prepareStatement(query);
			
//			우리가 문자열로 작성한 쿼리가 preparedStatement에 들어가서 SQL 명령어로 사용됨
//			쿼리에 ?가 있음(⇒ 미완성 상태) ⇢ ?를 매개변수로 받은 userId로 바꿔야함
//			preparedStatement의 기능으로 완성시켜줌
//			set자료형(물음표의 순서, 넣을 값);
			preparedStatement.setString(1, userId);
			
//			완성된 쿼리를 실행시키는 방법
//			1. executeQuery()
//			   select할 때 반환되는 결과 값을 받기 위해 사용
//			2. executeUpdate()
//			   select를 제외한 반환되는 값이 없을 때 사용
//			   쿼리가 반영된 행이 몇개인지 리턴
			
//			executeQuery()의 반환값은 ResultSet 타입
			resultSet = preparedStatement.executeQuery();
				
//			resultSet은 쿼리의 결과(테이블)을 저장
//			각 데이터에 접근하는 방식은 Iterator와 동일하게 커서 사용
//			next() : 현재 커서 다음에 데이터가 존재하는지를 true / false로 반환
//			get자료형(컬럼번호) :  커서를 다음행으로 옮기고 해당 컬럼의 값을 자료형에 맞게 가져옴
			 if(resultSet.next()) {
//				 System.out.println(resultSet.getString("userId"));
			    return false;
			 }
		} catch (SQLException e) {
			System.out.println("checkId() 메소드 SQL 오류");
		} finally {
//			JDBC에서 제공하는 객체들을 사용 후 닫아줘야함
//			오류 여부와 상관없이 반드시 닫아야하므로 finally에 작성
//			닫을 때는 여는 순서와 반대로 닫음
	         try {
	             if (resultSet != null) {
	                resultSet.close();
	             }
	             if (preparedStatement != null) {
	            	 preparedStatement.close();
	             }
	             if (connection != null) {
	                connection.close();
	             }
	          } catch (SQLException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	          }
		}
		return true;

	}
}
