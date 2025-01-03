package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
//	Connection 클래스 import
	public static Connection getConnection() {
		Connection connection = null;

//		연결에 필요한 정보
//		url은 정해져있는 것 (= DB 연결할 주소 , 어떤 DBMS 인지, Port번호가 무엇인지, ...), 정확하게 작성해야함
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "test";
		String password = "1234";

//			드라이버를 메모리에 할당하는 부분
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) { // Class.forName()
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) { // DriverManager.getConnection()
			System.out.println("연결 실패 (로그인)");
		}
		return connection;
	}
}
