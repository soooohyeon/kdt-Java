package com.app.domain;

public class BookDTO {
//	CREATE TABLE tbl_book (
//	   book_number NUMBER,
//	   book_title VARCHAR2(100) NOT NULL,
//	   book_author VARCHAR2(100) NOT NULL,
//	   book_rent  VARCHAR2(100) DEFAULT 'false' NOT NULL
//	   CONSTRAINT check_rent CHECK(book_rent = 'true' OR book_rent = 'false'),
//	   CONSTRAINT pk_book PRIMARY KEY(book_number)
//	);

	//필드
	private int bookNumber;
	private String bookTitle;
	private String bookAuthor;
	private boolean bookRent;
	
	//getter/setter
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public boolean isBookRent() {
		return bookRent;
	}
	public void setBookRent(boolean bookRent) {
		this.bookRent = bookRent;
	}

	//toString 오버라이드
	@Override
	public String toString() {
		return "BookDTO [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookRent=" + bookRent + "]";
	}

}
