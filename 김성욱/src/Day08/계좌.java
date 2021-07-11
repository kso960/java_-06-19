package Day08;

// 슈퍼클래스

public class 계좌 {
	
	//필드
	
	private String 계좌번호; // 데이터 보호 : private 사용
	private int 비밀번호;
	private String 계좌주;
	private int 금액;
	
	
	// 생성자
	
	public 계좌() {} // 깡통도 만드는게 좋음

	public 계좌(String 계좌번호, int 비밀번호, String 계좌주, int 금액) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.금액 = 금액;
	}
	
	public 계좌(String 계좌번호, int 비밀번호, String 계좌주) {
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.금액 = 0;
	}
	
	// 메소드
	
	// 0. get , set 메소드  => private때문에 써야함
	public String get계좌번호() {
		return this.계좌번호;
	}
	public int get비밀번호() {
		return this.비밀번호;
	}
	public void 입금처리(int 입금액) {
		this.금액 += 입금액;
		System.err.println("\n[[[ [완료] 입금처리가 되었습니다");
	}
	public void 출금처리(int 출금액) {
		
		if( this.금액 < 출금액) {
			System.err.println(" \n[[[ [실패] 예금액이 부족합니다");
			return;
		}
		
		this.금액 -= 출금액;
		System.err.println("\n[[[ [완료] 출금처리가 되었습니다");
	}
	
	
	
	// 1. 계좌등록 메소드
	public void 계좌등록( ) {
		System.out.println("[[[ 계좌 등록 화면 ]]]");
		System.out.println(" [[[계좌번호 : "); String 계좌번호 = Day08_7.scanner.next();
		System.out.println(" [[[비밀번호 : "); int 비밀번호 = Day08_7.scanner.nextInt();
		System.out.println(" [[[계좌주 : "); String 계좌주 = Day08_7.scanner.next();
		
		
		// 객체생성
		계좌 계좌 = new 계좌(계좌번호,비밀번호,계좌주);
		//리스트 담기
		Day08_7.계좌목록.add(계좌);
	}
	
	// 2. 입금 메소드
	public void 입금() {
		System.out.println("[[[ 입금 등록 화면 ]]]");
		System.out.println(" [[[계좌번호 : "); String 계좌번호 = Day08_7.scanner.next();
		System.out.println(" [[[비밀번호 : "); int 비밀번호 = Day08_7.scanner.nextInt();
		System.out.println(" [[[입금액 : "); int 입금액 = Day08_7.scanner.nextInt();
		
		for( 계좌 temp : Day08_7.계좌목록) {
			if( temp.get계좌번호().equals(계좌번호) && temp.get비밀번호() == 비밀번호) {
				
			temp.입금처리(입금액);
				return;
			}
		}
		System.err.println("\n[[[ [실패] 동일한 계좌번호 혹은 비밀번호가 다릅니다");
	}

	// 3. 출금 메소드
	
	public void 출금() {
		System.out.println("[[[ 출금 등록 화면 ]]]");
		System.out.println(" [[[계좌번호 : "); String 계좌번호 = Day08_7.scanner.next();
		System.out.println(" [[[비밀번호 : "); int 비밀번호 = Day08_7.scanner.nextInt();
		System.out.println(" [[[출금액 : "); int 출금액 = Day08_7.scanner.nextInt();
		
		for( 계좌 temp : Day08_7.계좌목록) {
			if( temp.get계좌번호().equals(계좌번호) && temp.get비밀번호() == 비밀번호) {
				
			temp.출금처리(출금액);
			return;
				
			}
		}
		System.err.println("\n[[[ [실패] 동일한 계좌번호 혹은 비밀번호가 다릅니다");
	}
	
	// 4. 이체 메소드
	
	public void 이체() {
		System.out.println("[[[ 이체 화면 ]]]");
		System.out.println(" [[[계좌번호 : "); String 계좌번호 = Day08_7.scanner.next();
		System.out.println(" [[[비밀번호 : "); int 비밀번호 = Day08_7.scanner.nextInt();
		
		for( 계좌 temp : Day08_7.계좌목록) {
			if( temp.get계좌번호().equals(계좌번호) && temp.get비밀번호() == 비밀번호) {
		
				System.out.println(" [[[이체금액 : "); 
					int 이체금액 = Day08_7.scanner.nextInt();
		
					if( temp.금액 < 이체금액) {
						System.err.println("\n[[[ [실패] 예금액이 부족합니다]]]");
						return;
				}
					System.out.println("[[[받는사람 계좌번호]]]");
					String 계좌번호2 = Day08_7.scanner.next();
			//
					for(계좌 temp2 : Day08_7.계좌목록) {
						if(temp2.계좌번호.equals(계좌번호2)) {
							System.out.println("[[[ [확인] : 받는사람명 : ]]] :" + temp2.계좌주);
							temp2.금액 += 이체금액;
							System.out.println("\n[[[ [이체] 이체처리가 되었습니다 ]]]");
				}	
			}
					System.err.println("\n[[ [실패] 받는사람 계좌번호가 없습니다]]");
	}
		}
		}
}
