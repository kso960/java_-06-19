package Day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day07_2_start { // c s

	// 1. 다른 클래스서 공통적인 메모리 => static
		// 1. scanner
	public static Scanner scanner = new Scanner(System.in);
		// 2. 리스트나 배열
	public static ArrayList<Member> members = new ArrayList<>();
		// Arraylist : 리스트 클래스
			// < 제네릭 > : 리스트 객체에 담을 객체의 클래스
				// 리스트명.add(객체명) : 리스트에 객체 담기
				// 리스트명.size() : 리스트내 객체수 
				// 리스트명.get(인덱스번호) : 리스트내 인덱스번호에 해당하는 객체 호출
	public static void main(String[] args) { //  m s
		
		프로그램시작();
		
		
		
		
		
		
		
		
	} //  m e 
	
	// 프로그램 동작 메소드
	public static void 프로그램시작() { // while start
		
		// 파일에 존재하는 모든 회원을 리스트로 저장
		try {
			FileInputStream fileInputStream = new FileInputStream("c:/java/memberlist.txt");
			byte[] 바이트 = new byte[10000]; // 객체 하나당 100바이트정도
			
			fileInputStream.read(바이트);
			String 모든회원 = new String(바이트); // 바이트=> 문자열
			// 회원별 구분
			String[] 회원 = 모든회원.split("\n");
					// 문자열.split("기호") : 해당 기호 기준으로 분리
			// 회원마다 회원정보별 구분
			for( int i= 0; i<회원.length-1 ; i++){
				String[] 정보 =회원[i].split(",");
				Member member = new Member(정보[0], 정보[1], 정보[2], Integer.parseInt(정보[3]), 정보[4], Integer.parseInt(정보[5]), Integer.parseInt(정보[6]), 정보 [7]);
					//문자열 String => 정수형 int
						// Integer.parseInt(문자열)
				members.add(member); // 해당 멤버를 리스트에 담기
				
			} // split 하면 회원수보다 1개 크개 개수가 생김 그러므로 1 뺴줌
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		// static : 정적 변수 : 프로그램 시작시 메모리가 할당되고 모든 프로그램 종료시 메모리 초기화
			// 단점 : 메모리의 효율 감소 [ 모든 클래스에 사용되는 메모리 선언에는 static 활용 ]
		
		while(true) { // 무한루프 [ 5번 입력시 종료 ]
			System.out.println("[[[[ 회원제 커뮤니티 ]]]]");
			System.out.println("[[[1.로그인 2.회원가입 3. 아이디찾기 4.비밀번호찾기 5.프로그램종료]]]");
			System.out.println("[[[선택 : ]]]"); int 선택 = scanner.nextInt();
			
			// 멤버 임시 객체
			Member member =  new Member();
			
			if( 선택 == 1 ) {}
			else if ( 선택 == 2 ) {
				member.회원가입();
				
			}
			else if ( 선택 == 3 ) {}
			else if ( 선택 == 4 ) {}
			else if ( 선택 == 5 ) {
				System.err.println("\n[종료] 이용해주셔서 감사합니다");
				break;
			}
			else {
				System.err.println("\n[경고] 알수없는 행동입니다");
			}
		} // while end
	}
	
	
	
	
	
} //  c e
