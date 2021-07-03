package Day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_4_로또 { // c s

			// 1. 6개 숫자 입력받아 배열 저장
			// 2. 6개 숫자를 난수 생성해서 배열 저장
			// 3. 두 배열을 비교해서 동일한 숫자 개수
	public static void main(String[] args) { // m s
		Scanner scanner = new Scanner(System.in);
		Random random =new Random(); 
		// 1. 로또 번호 배열
		int[] 로또 = new int[6]; // int 형 6개를 저장할 수 있는 배열
		int[] 추첨번호 = new int[6];
		
			// 6개를 입력받아 배열에 저장
			for( int i = 0; i<6 ; i++ ) {
				System.out.println( (i+1) + " 번째 숫자 입력 :");
				int 번호 = scanner.nextInt();
				if( 번호 <= 0 || 번호 >45) {
					System.out.println("[경고] 1~45 사이만 입력가능 : ");
					i--; // 입력을 정상적으로 못받았을 경우 i에 1 차감
				}else {
					// 중복제거 = 배열에 있는 모든 요소를 하나씩 비교
					int 중복체크 = 0;
					
					for( int j = 0; j<6 ; j++) { // 중복체크 위한 for문
						if( 로또[j] == 번호) {
							// 기존요소 == 새로 입력된 숫자
							System.out.println("[경고] 이미 입력된 수 입니다");
							i--; // 입력을 정상적으로 못받았을 경우 i에 1 차감
							중복체크 =1; // 중복 있을경우 1
							
						}
					}
					// for문 종료시에도 중복체크가 0이면 번호를 배열에 저장
					if( 중복체크 == 0 ) 로또[i] = 번호;
					
				}
				
			}
		
			// 배열 출력
			for( int i = 0 ; i<6 ; i++) {
				System.out.print((i+1)+ "번째 번호 :" + 로또[i]+"\t");
			}
		
			System.out.println();
			
			// 추첨번호 생헝
			for( int i = 0 ; i<6 ; i++ ) {
				// 중복제거
				int 번호 =  random.nextInt(45)+1; // 1~45 난수 생성
				int 중복체크 = 0;
				for( int j = 0; j<6 ; j++) {
					if( 추첨번호[j] == 번호) {
						중복체크 = 1; i--;
					}
				}
				if( 중복체크 == 0 ) 추첨번호[i] = 번호 ;	
			}
			
			// 배열 출력
						for( int i = 0 ; i<6 ; i++) {
							System.out.print((i+1)+ "추첨번호 :" + 추첨번호[i]+"\t");
						}
		
						
			// 두 배열의 동일한 수 세기 => for 중첩
			int 당첨개수 = 0;
			for( int i =0 ; i<6 ;i++) {
				for( int j = 0; j<6 ; j++) {
					if( 추첨번호[i] == 로또[j] ) 당첨개수++;{
						}	
					}	
			}
						// 출력:
			System.out.println();
			System.out.println("당첨개수 : " + 당첨개수);
		
		// 과제 : 2차원리스트 => 게임횟수 입력받아 입력받은 게임수만큼 로또
		
		
		
	} // m e
	
	
	
} // c e
