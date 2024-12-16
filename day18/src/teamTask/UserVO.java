package teamTask;

public class UserVO {
	
	//필드
	private int userNum;
	private String id;
	private String pw;
	private String name;
	private int age;
	
	//생성자
	public UserVO(int userNum, String id, String pw, String name, int age) {
		this.userNum = userNum;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
		
	//getter 생성
	public int getUserNum() {
		return userNum;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	//toString 오버라이드
	@Override
	public String toString() {
		return "유저번호 : " + this.userNum +"\nID : " + this.id + "\nPW : " + this.pw 
				+ "\n이름 : " + this.name + "나이 : " + this.age;
	}

	@Override
	public int hashCode() {
		return userNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof UserVO) {
			return this.userNum == ((UserVO)obj).userNum;
		}
		return false;
	}

	
	
	
	
	
	
	
	
	

}
