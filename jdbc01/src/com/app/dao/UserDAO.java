package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.domain.UserDTO;

public class UserDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;	// ⇢ 보안이 강한 인터페이스
	public ResultSet resultSet;
	
//	아이디 중복 검사
//	자바에는 *이 아닌 컬럼명을 전부 작성해주어야 함
	public boolean checkId(String userId) {
//		수행할 쿼리문을 문자열 변수에 담기
		String query = "SELECT user_number FROM tbl_user WHERE user_id = ?";
		
		try {
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
	
//	JDBC 2일차 - 회원가입 메소드 (Create → Insert)
	public void join (UserDTO userDTO) {
//		첫번째 줄 마지막 띄어쓰기 무조건 넣기 !!
		String query = "INSERT INTO tbl_user(user_number, user_id, user_pw, user_name, user_age, user_gender, user_birth) "
				+ "VALUES (seq_user.nextval, ?, ?, ?, ?, ?, ?)";
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userDTO.getUserId());
			preparedStatement.setString(2, userDTO.getUserPw());
			preparedStatement.setString(3, userDTO.getUserName());
			preparedStatement.setInt(4, userDTO.getUserAge());
			preparedStatement.setString(5, userDTO.getUserGender());
			preparedStatement.setString(6, userDTO.getUserBirth());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("join() SQL 오류");
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
// 로그인 메소드
	public int login (String userId, String userPw) {
		String query = "SELECT user_number "
				+ "FROM tbl_user "
				+ "WHERE user_id = ? AND user_pw = ?";
		
//		로그인이 안된다면 리턴할 기본값
		int userNumber = -1;
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPw);
//		조회한 결과를 담기위해 resultSet 객체에 조회한 결과 저장
			resultSet = preparedStatement.executeQuery();
			
//			resultSet의 결과는 항상 테이블로 반환
//			⇢ resultSet의 초기 상태는 첫번째 행 이전에 커서가 위치함
//			next() : 현재 커서를 다음 행으로 넘기는 역할 / 행이 있다면 true 반환
//					 더 이상 행이 없다면 false 반환
			if (resultSet.next()) {
//				resultSet.getInt(int columnIndex)
//				결과 집합에서 현재 커서가 위치한 행의 특정 열값을 정수로 가져오는 메소드
//				⇢ 1은 첫번째 열(컬럼)을 의미 열번호는 1부터 시작!
				userNumber = resultSet.getInt(1);
			}
//			⇒ 즉, 조회한 결과에 행이 있다면 해당 행의 userNumber의 값이 들어가고
//				  행이 없다면 기본값으로 설정해둔 -1이 들어가게 됨
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
				e.printStackTrace();
			}
		}
		return userNumber;
	}
	
//	이름과 생일로 아이디 찾기
//	리턴타입이 List인 이유 결과가 2개 이상일 수 있음
	public List<String> findId(String userName, String userBirth) {
		String query = "SELECT user_id "
				+ "FROM tbl_user "
				+ "WHERE user_name = ? AND user_birth = ?";
		
		List<String> userId = new ArrayList<>();
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, userBirth);
			
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				userId.add(resultSet.getString(1));
			}
		} catch (SQLException e) {
			System.out.println("findId() SQL 오류");
		} finally {
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
				e.printStackTrace();
			}
		}
		return userId;
	}
	
//	회원 전체정보 수정
	public void update(UserDTO userDTO) {
		String query = "UPDATE tbl_user "
				+ "SET user_id = ?, user_pw = ?, user_name = ?, "
				+ "user_age = ?, user_gender = ?, user_birth = ?"
				+ "WHERE user_number = ?";
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userDTO.getUserId());
			preparedStatement.setString(2, userDTO.getUserPw());
			preparedStatement.setString(3, userDTO.getUserName());
			preparedStatement.setInt(4, userDTO.getUserAge());
			preparedStatement.setString(5, userDTO.getUserGender());
			preparedStatement.setString(6, userDTO.getUserBirth());
			preparedStatement.setInt(7, userDTO.getUserNumber());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update() SQL 오류");
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
//	회원 1명 전체 정보 조회
//	단, 쿼리문 사용시 *은 가능하면 사용 X, 속도 ↓;
	public UserDTO findUser (int userNumber) {
		String query = "SELECT user_id, user_pw, user_name, user_age, "
				+ "user_gender, user_birth "
				+ "FROM tbl_user "
				+ "WHERE user_number = ?";
		
		UserDTO userDTO = new UserDTO();
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userNumber);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				userDTO.setUserNumber(userNumber);
				userDTO.setUserId(resultSet.getString("user_id"));
				userDTO.setUserPw(resultSet.getString("user_pw"));
				userDTO.setUserName(resultSet.getString("user_name"));
				userDTO.setUserAge(resultSet.getInt("user_age"));
				userDTO.setUserGender(resultSet.getString("user_gender"));
				userDTO.setUserBirth(resultSet.getString("user_birth"));
			}
		} catch (SQLException e) {
			System.out.println("findUser() SQL 오류");
		} finally {
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
				e.printStackTrace();
			}
		}
		return userDTO;
	}
	
//	회원탈퇴
	public boolean delete(int userNumber) {
	   String query = "DELETE FROM TBL_USER "
	         + "WHERE USER_NUMBER = ?";
	   int result = 0;
	   
	   try {
	      connection = DBConnector.getConnection();
	      preparedStatement = connection.prepareStatement(query);
	      preparedStatement.setInt(1,userNumber);
	      result = preparedStatement.executeUpdate();
	   } catch (SQLException e) {
	      System.out.println("delete() SQL오류!!");
	   } finally {
	      try {
	         if(preparedStatement != null) {
	            preparedStatement.close();
	         }
	         if(connection != null) {
	            connection.close();
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	   }
	   
	   return result > 0;
	}

	
	
}
