package Day08;

// super class

public class 회원 {

	String 아이디;
	String 비밀번호;
	
	public 회원() { }
	
	public 회원(String 아이디, String 비밀번호) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
	}

	public void 회원정보() {
		System.out.println("[[회원아이디: " + this. 아이디);
		System.out.println("[[회원비밀번호: "+ this. 비밀번호);
		//System.out.println("sds" + this.관리자직급); 역으로 호출하는건 불가능!
	}
	
	
	
}
