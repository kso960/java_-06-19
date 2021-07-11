package Day08;

import java.util.ArrayList;
import java.util.Scanner;

/*
 계좌 클래스에게 상속받아 2개의 은행클래스 생성
 
 *클래스
 		계좌 [ 슈퍼클래스 ]
 			필드: 계좌번호, 비밀번호, 계좌주, 금액
 			생성자:
 			메소드 : 계좌생성 입금 출금 이체 계좌찾기
 		신한은행 [ 서브클래스 ]
 			은행코드[ final ]
 		국민은행 [ 서브클래스 ]
 			은행코드[ final ]
 			
 * 모든 은행의 계좌를 관리하는 리스트
 				
 ATM기
 1. 메뉴
 			1. 계좌생성
 				은행선택, 계좌번호, 비밀번호, 계좌주 입력받기
 			2. 입금
 				계좌번호, 비밀번호, 입금액
 			3. 출금
 				계좌번호, 비밀번호, 입금액
 			4. 계좌이체
 				계좌번호, 비밀번호, 이체금액, 받은사람 계좌번호
 			5. 계좌찾기
 				계좌주
 			6. 종료
 */

// 파일처리까지 해보기

public class Day08_7 { // c s
	
	// main 밖에 작성한 이유 : main 외에서도 사용[호출] 하기 위해
	public static Scanner scanner = new Scanner(System.in);
		// static : main 메모리 우선할당 : 정적변수
	public static ArrayList<계좌> 계좌목록 = new ArrayList<>();
	
	
	public static void main(String[] args) { // m s
		start();
		
		
	} // m e
	
	
	public static void start() {
		
		while(true) {
			System.out.println("[[[ ATM ]]]");
			System.out.println("[[[ 1.계좌생성 2.입금 3.출금 4.이체 5.계좌찾기 6.종료");
			int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				
				System.out.println("[[1.신한은행 2.국민은행 ]] :");
				int 선택2 = scanner.nextInt();
				if( 선택2 == 1 ) {
					신한은행 신한은행 = new 신한은행();
					신한은행.계좌등록();
					
					
				}
				
			}
			else if( 선택 == 2) {
				
			
				System.out.println("[[1.신한은행 2.국민은행 ]] :");
				int 선택2 = scanner.nextInt();
				if( 선택2 == 1 ) {
					신한은행 신한은행 = new 신한은행();
					신한은행.입금();
				}	
				
			}
			else if( 선택 == 3) {
				System.out.println("[[1.신한은행 2.국민은행 ]] :");
				int 선택2 = scanner.nextInt();
				if( 선택2 == 1 ) {
					신한은행 신한은행 = new 신한은행();
					신한은행.출금();
				}	
			}
			else if( 선택 == 4) {}
			else if( 선택 == 5) {}
			else if( 선택 == 6) {
				System.err.println("[[[ [종료] 이용해주셔서 감사합니다 ");
				break;
			}
			else {
				System.out.println("[[[ [경고] 알수없는 번호입니다. ");
			}
			
		}
		
		
		
	}

} // c e
