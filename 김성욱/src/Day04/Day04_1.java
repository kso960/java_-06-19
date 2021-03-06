package Day04;

public class Day04_1 {  // c s

	// 제어문 = if
	
	// 반복문 = for, while, do~while
		// 어디서부터 어디까지 반복
	// for 형태
		// for( 초기값 ; 조건문 ; 증감식 ){ 실행문 ; }
		// for( 어디서부터 ; 어디까지 ; 이동단위 ){ 실행코드; }
			// 초기값 : 반복의 시작값 [ for 시작할때 1번 검사 ]
			// 조건문 : 반복실행의 조건 [ 비교연산자 , 실행코드 실행전 검사 ]
			// 증감식 : 실행코드 실행후 초기값 증감단위
		
	
	public static void main(String[] args) { // m s
		
		// 예 1
		/*for( int 변수 = 0 ; 변수<10 ;  변수 ++) 
			// 변수는 0부터 10미만까지 1씩 증가하면서 반복
			{System.out.println(변수);
				// 반복문 실행순서
				// 변수 = 0 => 변수 < 10 => T => 코드실행
				// 변수 ++ => 변수 = 1 => 변수 < 10 => T => 코드실행
				// 변수 ++ => 변수 = 2 => 변수 < 10 => T => 코드실행
				// 변수 ++ => 변수 = 3 => 변수 < 10 => T => 코드실행
				// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
				// 변수 ++ => 변수 = 10 => 변수 <10 => F => 반복문 종료
			}*/
		
		// 예 2 : 1~50까지의 출력
		/*for( int i = 1 ; i <=50 ; i++ ) System.out.println(i);*/
		
		// 예 3 : 1~50까지의 3배수 출력
		/*for ( int i =3 ; i <= 50 ; i += 3) System.out.println(i);
			// i 는 3부터 50까지 i+3씩 증가하면서 반복
		
		for ( int i = 1 ; i <= 50 ; i ++ ) {
			if ( i % 3 == 0) System.out.println(i);
		}*/
		
		// 예 4 : 1~50까지의 누적 합계
		/*int 누적합계 = 0 ; // for 문 밖에 만들어야함
		for ( int i = 1; i <= 50 ; i ++ ) {
			누적합계 += i;
		
		} // 반복문 끝
		System.out.println("1부터50까지의 누적합계 :" + 누적합계);*/
		
		// 예 5 : 1~50까지의 3배수들의 누적 합계
		/*int 누적합계2 = 0;
		for ( int i = 1; i <= 50 ; i ++) {
			if( i % 3 == 0 ) 누적합계2 += i ;
		}
		System.out.println("1~50까지의 3배수들의 누적합계 :" + 누적합계2);*/
		
		// 예 6 : 2단 구구단 출력 [ 단 : 2(상수) 곱:1~9(변수) ]
		/*for( int 곱 = 1 ; 곱 <= 9 ; 곱 ++) {
			System.out.println(" 2 X " +곱+ "=" + (2*곱));
		}*/
	
		// 예 7 : 구구단 출력 [ 단 : 2~9(변수) 곱: 1~9(변수) ]
							// 8번 실행		// 8*9번 실행 (단*곱) 72번 실행
			// 단 2일 경우 곱 9번 실행
			// 단 3일 경우 곱 9번 실행
			// 단 4일 경우 곱 9번 실행
			// 단 5일 경우 곱 9번 실행
			// ~~~~~~~~~~~~~~~~~~~
				// for 중첩
					 // for(){ for2(){ for3() } }
						// for 1번실행시 for2 모두 실행
							// for2 1번실행시 for3 모두 실행
								// for3 실행횟수 : for1 * for2 * for3
		for( int 단 = 2; 단 <= 9 ; 단 ++ ) {
			
			System.out.println("----->" + 단 + " 단 -----");
			for ( int 곱 = 1 ; 곱 <= 9 ; 곱 ++ ) {
				System.out.println(단 +" X "+ 곱+ " = " + (단*곱));
				
			}
			
			
		}
		
		
		
		
		
		
		
		
	} // m e
	
	
	
	
} // c e
