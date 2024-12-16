package teamTask;

public class UserVo {
	
	//필드
	private int UserNum;
	private String id;
	private String pw;
	private String name;
	private int age;
	
	//생성자
	public UserVo(int userNum, String id, String pw, String name, int age) {
		super();
		this.UserNum = userNum;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
		
	//getter 생성
	public int getUserNum() {
		return UserNum;
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
		// TODO Auto-generated method stub
		return "유저번호 : " + this.UserNum +"\nID : " + this.id + "\n비밀번호 : " + this.pw 
				+ "\n이름 : " + this.name + "나이 : " + this.age;
	}

	
	
	
	
	
	
	
	
	

}
