package Day09_Board;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class Member {
	
	// 필드 = 상태[ 변수 , 객체 등 = 메모리 ]
	private String id;			// 아이디
	private String password;	// 패스워드 
	private String name;		// 이름
	private String email;		// 이메일
	private int point;			// 점수 
		// private : 현재 클래스에서만 호출 가능 
	Scanner scanner = new Scanner(System.in);
	
	// 생성자 = 객체생성시 초기값
	public Member() {}
	public Member(String id, String password, String name, String email, int point) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.point = point;
	}
	// 메소드 = 행동
	// 1. 회원가입
	public void signup() {
		System.out.println("[[[ 회원가입 ]]]");
		// 1.중복체크 2. 5~10자리만 가능 
		System.out.print("[[ id (5~10이내) : ");	String id = scanner.next();
			// 1. 중복체크 
			int result = idcheck(id);
			if( result == -1 ) {System.out.println("[[확인]] 사용 가능한 아이디 입니다 ");}
			else { System.err.println("[[경고]] 동일한 아이디가 존재합니다"); return; }
			// 2. 아이디 길이 체크 
			if( id.length() < 5 || id.length() > 10 ) {
				 System.err.println("[[경고]] 아이디는 5~10이내로 가능합니다"); return;
			}
		// 1.패스워드 동일 1. 4자리만 가능  
		System.out.print("[[ password : ");			String password = scanner.next();
		System.out.print("[[ password confirm : ");	String passwordconfirm = scanner.next();
			// 1. 
			if( !password.equals(passwordconfirm) ) {
				// ! : not : true => false
				System.err.println("[[경고]] 패스워드가 다릅니다"); return;
			}
			if( password.length() !=4 ) { System.err.println("[[경고]] 패스워드는 4글자만 가능합니다"); return;  }
		
		System.out.print("[[ name: ");	String name = scanner.next();
		// 1.@ 포함 여부 [ contains ] 
		System.out.print("[[ email ");	String email = scanner.next();
		if( !email.contains("@") ) { System.err.println("[[경고]] 아이디@도메인주소 형식으로 입력해주세요"); return;   }
		
		// 회원가입 성공 
		List.members.add( new Member(id, passwordconfirm, name, email, 0) );

		// 2. 파일에 저장
		int result2 =  FileUtil.filesave( 1 );
		if( result2 != 1) {
			System.err.println("[[회원가입 실패]] 관리자에게 문의 ");
		}
		
		System.out.println("[[회원가입 성공]]");
		
		// 1. 가입한 회원에게 축하메일 
		mailsend( email  , 1 , null );

	}
	// 2. 메일보내기  [ 메일라이브러리 ]
	public void mailsend( String recipientmail , int type , String contents ) {
								// 받는사람메일		// 메일내용 유형
		// SMTP : 메일 전송 프로토콜 
		// 1. 설정 
		String host ="smtp.naver.com"; // 도메인회사의 host명 
			// 네이버 : smtp.naver.com // 구글 :  smtp.gmail.com 
		String email = "";	// 본인 아이디@도메인주소 
		String password = "";	// 본인패스워드 
		
		Properties properties = new Properties();
			// Properties : 설정 클래스 
		properties.put( "mail.smtp.host" , host );
		properties.put( "mail.smtp.port" , 587 );	// stmtp 접근 번호 // 네이버 587
		properties.put( "mail.smtp.auth" , "true" );
		// 2. 인증 
		Session session = Session.getDefaultInstance( properties , new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(email, password);
			}
		} );
		// 3. 메일 작성 
		try { // 예외[오류] 발생시 catch 이동
			
			MimeMessage message = new MimeMessage( session ); // 메시지에 인증 넣기 
			message.setFrom( new InternetAddress(email) ); // 보내는사람의 인터넷 주소 얻기 
			message.addRecipient( Message.RecipientType.TO , new InternetAddress( recipientmail ) ); // 받는사람 
			
			if( type == 1 ) { //회원가입 
				message.setSubject(" ~~ 홈페이지 가입 환영합니다 ");	// 메일 제목 
				message.setText(" 다양한 이벤트 제공 합니다 ");	// 메일 내용 
			}
			if( type == 2 ) { // 비밀번호찾기 
				
				message.setSubject(" ~~ 홈페이지 회원님의 비밀번호 ");	// 메일 제목 
				message.setText("회원님의 비밀번호 : " + contents );	// 메일 내용 
				
			}
			// 전송
			Transport.send(message);

		}catch (Exception e) {
			System.err.println("[[경고]] 메일 전송 실패 ");
		}

	}
	// 3. 로그인 
	public Member login() {
		System.out.print("[[ id (5~10이내) : ");	String id = scanner.next();
		System.out.print("[[ password : ");		String password = scanner.next();
		for( Member member : List.members ) {
			if( member.getId().equals(id) && member.getPassword().equals(password) ) {
				System.out.println("[[[ 로그인 성공 ]]] : " + member.getId()+"님 안녕하세요");
				return member ;
			}
		}
		System.err.println("[[[동일한 회원정보가 없습니다]]]");
		return null;
	}
	// 4. 아이디찾기 
	public void findid() {
		System.out.print("[[ name: ");	String name = scanner.next();
		System.out.print("[[ email ");	String email = scanner.next();
	
		for( Member member : List.members ) {
			if( member.getName().equals(name) && member.getEmail().equals(email) ) {
				System.out.println("[[[ 회원님의 아이디 : "+ member.getId() + "]]]");
				return;
			}
		}
		System.err.println("[[[동일한 회원정보가 없습니다]]]");
	}
	// 5. 패스워드찾기
	public void findpassword() {
		System.out.print("[[ id (5~10이내) : ");	String id = scanner.next();
		System.out.print("[[ email ");	String email = scanner.next();
		for( Member member : List.members ) {
			if( member.getId().equals(id) && member.getEmail().equals(email) ) {
				System.out.println("[[[ 회원님의 비밀번호를 해당 메일로 전송했습니다 ]]]");
					// 메일전송
					mailsend( email , 2 , member.getPassword() );
				return;
			}
		}
		System.err.println("[[[동일한 회원정보가 없습니다]]]");

	}

	// 7. 아이디체크
	public int idcheck( String checkid ) {
		// int : retrun 했을때 반환 되는 타입
						// 인수 : String checkid : 메소드 안으로 들어오는 id
		for( int i = 0 ; i<List.members.size(); i++ ) {
			if( List.members.get(i).getId().equals(checkid) ) {
				// 리스트내[기본회원] 아이디와 체크할 아이디가 동일하면
				return i;
			}
		}
		return -1; // id체크 없다 
	}
	// 8. 회원정보 메뉴
	public int infomember() {
		
		System.out.println(" [[[아이디 : " + this.id );
		System.out.println(" [[[이름 : " + this.name );
		System.out.println(" [[[이메일 : " + this.email );
		System.out.println(" [[[포인트 : " + this.point );
		
		System.out.println("1.회원수정[이름,이메일수정] 2.회원탈퇴");
		int 선택1 = scanner.nextInt();
		if( 선택1 == 1 ) { updatemember(); return 1;  }
		if( 선택1 == 2 ) { deletemember(); return 2;  }
		return 3;
	}
	// 9. 회원탈퇴
	public void deletemember() {
	
		System.out.println("[[[확인]]] 정말 탈퇴하시겠습니까? 예[1] 아니요[0] ");
		int 선택2 = scanner.nextInt();
		if( 선택2 == 1 ) { 
			for( int i = 0 ;i<List.members.size() ;i++ ) {
				if( List.members.get(i).getId().equals(id) ) {
					List.members.remove(i);
					System.out.println("[[[완료]]] : 탈퇴가 되었습니다 [ 로그아웃 ]");
					FileUtil.filesave( 1 );
					return;
				}
			}
		}

		
	}
	// 9. 회원수정
	public void updatemember() {
		
		System.out.println("[[알림]] 수정하실 정보를 입력해주세요");
		System.out.print("[[ name: ");	 	this.name = scanner.next();
		System.out.print("[[ email ");		this.email = scanner.next();
		
		System.out.println("[[[완료]]] : 수정이 되었습니다");
		FileUtil.filesave( 1 );
	
	}

	// get , set  메소드 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

}