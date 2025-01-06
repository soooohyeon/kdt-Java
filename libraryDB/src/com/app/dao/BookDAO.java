package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.domain.BookDTO;

public class BookDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;
	
//	도서등록
	public void registerBook(BookDTO bookDTO) {
		String query = "INSERT INTO tbl_book "
				+ "VALUES (SEQ_BOOK.NEXTVAL, ?, ?, ?)";
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bookDTO.getBookTitle());
			preparedStatement.setString(2, bookDTO.getBookAuthor());
			preparedStatement.setString(3, bookDTO.isBookRent()+"");
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("registerBook() SQL 오류");
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
	}
	
	// 도서 목록 조회
	public List<BookDTO> selectAllBook() {
		String query = "SELECT book_number, book_title, book_author, book_rent "
				+ "FROM tbl_book";
		List<BookDTO> books = new ArrayList<BookDTO>();
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				BookDTO book = new BookDTO();
				book.setBookNumber(resultSet.getInt("book_number"));
				book.setBookTitle(resultSet.getString("book_title"));
				book.setBookAuthor(resultSet.getString("book_author"));
				book.setBookRent(Boolean.parseBoolean(resultSet.getString("book_rent")));
				books.add(book);
			}
		} catch (SQLException e) {
			System.out.println("selectAllBook() SQL 오류");
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
		return books;
	}
	
	// 도서 검색
	public List<BookDTO> searchBooks(String keyword) {
		String query = "SELECT book_number, book_title, book_author, book_rent "
				+ "FROM tbl_book "
				+ "WHERE book_title LIKE(?) OR book_author LIKE(?)";

		List<BookDTO> books = new ArrayList<>();
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			keyword = "%" + keyword + "%";
			preparedStatement.setString(1, keyword);
			preparedStatement.setString(2, keyword);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				BookDTO book = new BookDTO();
				book.setBookNumber(resultSet.getInt("book_number"));
				book.setBookNumber(resultSet.getInt("book_number"));
				book.setBookTitle(resultSet.getString("book_title"));
				book.setBookAuthor(resultSet.getString("book_author"));
				book.setBookRent(Boolean.parseBoolean(resultSet.getString("book_rent")));
				books.add(book);
			}
		} catch (SQLException e) {
			System.out.println("searchBooks() SQL 오류");
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
		return books;
	}
	
//	도서 대여
	public void bookRent(int bookNumber) {
		String query = "UPDATE tbl_book SET book_rent = 'true' WHERE book_number = ? AND book_rent= 'false'";
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,bookNumber);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("bookRent() SQL오류");
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
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	          }
		}
	}

//	책 대여 확인하기
	public Boolean bookRantalStatus(String book_title) {
		String query = "SELECT BOOK_NUMBER, BOOK_TITLE, BOOK_AUTHOR, BOOK_RENT FROM TBL_BOOK WHERE BOOK_TITLE = ?";
		Boolean bookRent = false; //기본값을 false로
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, book_title);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
//				System.out.println("데베 값 : "+Boolean.valueOf(resultSet.getString(4));
				bookRent = Boolean.valueOf(resultSet.getString(4)); //resultSet.getString(4)이 문자열이라 이를 Boolean으로 변환해서 참/거짓으로 변환
			}
		} catch (SQLException e) {
			e.printStackTrace();
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
		return bookRent;
	}
	
}
