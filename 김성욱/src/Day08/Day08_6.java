package Day08;
/*
 * 1.회원클래스
 		1. 아이디, 비밀번호
 		2. 생성자
 		3. 회원정보 메소드
   2. vip 클래스
   		1. 회원등급
   		2. 생성자: super 사용
   		3. 회원정보 메소드 @Override
   3. 관리자 클래스
   		1. 관리자 직급;
   		2. 생성자: super 사용
   		3. 회원정보 메소드 @Override
 */

import java.util.ArrayList;

// 서브클래스는 슈퍼클래스로부터 호출가능 but 슈퍼클래스는 서브클래스로부터 호출 불가능

public class Day08_6 { // c s

	public static void main(String[] args) { // m s
		
		회원 유저1 = new 회원("qwe", "qwe");
		Vip클래스 유저2 = new Vip클래스("asd","asd","골드");
		관리자클래스 유저3 = new 관리자클래스("zxc","zxc","대리");
		
		유저1.회원정보();
		System.out.println("-------------------------");
		유저2.회원정보();
		System.out.println("-------------------------");
		유저3.회원정보();
		System.out.println("-------------------------");
		
		// 리스트
		ArrayList<회원> 회원목록 = new ArrayList<>(); // 슈퍼클래스 리스트
		ArrayList<Vip클래스> vip목록 = new ArrayList<>(); // 서브클래스 리스트
		ArrayList<관리자클래스> 관리자목록 = new ArrayList<>(); // 서브클래스 리스트
		
		회원목록.add(유저1);
		회원목록.add(유저2);
		회원목록.add(유저3);
			회원목록.get(0).회원정보();
			회원목록.get(1).회원정보();
			회원목록.get(2).회원정보();
		System.out.println("------------------");
		//vip목록.add(유저1); 슈퍼클래스는 담을수가 없다
		vip목록.add(유저2); 
		//vip목록.add(유저3); 다른 서브클래스도 담을수 없다
		System.out.println("-------------------------");
		//관리자목록.add(유저1); 슈퍼클래스는 담을수가 없다
		//관리자목록.add(유저2); 다른 서브클래스도 담을수 없다
		관리자목록.add(유저3);
		
		// * 상속 받았을때 리스트
			// 1. 리스트를 사용시 슈퍼클래스로 선언된 리스트는 하위클래스로 담을수 있다.
			// 2. 하위클래스로 선언된 리스트는 상위클래스를 담을수 없다
		
		
		
		
		
		
	} // m e
	

	
	
	
	
	
	
} //  c e
