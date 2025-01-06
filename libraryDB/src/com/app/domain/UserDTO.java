package com.app.domain;

public class UserDTO {
	
//	CREATE TABLE tbl_user (
//			   user_number NUMBER,
//			   user_id VARCHAR2(100) NOT NULL,
//			   user_pw VARCHAR2(100) NOT NULL,
//			   user_name VARCHAR2(100) NOT NULL,
//			   user_phone VARCHAR2(100) UNIQUE NOT NULL,
//			   CONSTRAINT pk_user PRIMARY KEY(user_number)
//			);
	
//	위의 데이터를 여기로 가져올 땐 카멜표기법으로 바꾼다
	
	//필드
	private int userNumber;
	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;
	
	//getter/setter
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	//toString 오버라이드
	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userId=" + userId + ", userPw=" + userPw + ", userName="
				+ userName + ", userPhone=" + userPhone + "]";
	}
	
}
