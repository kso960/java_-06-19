package Day04;

import java.util.Scanner;

public class Day04_2 { // c s

	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in); // 입력객체
		
		
		// 반복문을 이용한 별 출력
		// 문제 1 : 입력한 개수만큼 별 [*] 출력
		/*System.out.print(" 문제 1 정수 입력 : ");int 문제1 = scanner.nextInt(); // 입력객체에서 데이터 받아오기
		for ( int i = 1; i <= 문제1 ; i ++ ) System.out.print("*");
			// i는 1부터 입력받은 수까지 i는 1씩 증가하면서 반복*/
		
		// 문제 2 : 입력한 개수만큼 별[*} 출력 / 단 5개마다 줄바꿈
		/*System.out.print(" 문제 2 정수 입력 : "); int 문제2 = scanner.nextInt();
		for ( int i = 1 ; i <= 문제2 ; i++) {
			System.out.print("*");
			if( i % 5 == 0) System.out.println(); // 5의 배수마다 줄바꿈
		}*/
		
		// 문제 3 : 입력한 줄 만큼 별삼각형 출력
			/* 예 ) 6    i = 줄    s = 별
			 *             1        1
			 **            2        1 2
			 ***           3        1 2 3
			 ****          4        1 2 3 4
			 *****         5        1 2 3 4 5
			 ******        6        1 2 3 4 5 6
			             i<=입력값    s <= i [현재줄]
			 */
		/*System.out.print("문제 3 정수 입력 :"); int 문제3 = scanner.nextInt();
		for ( int i = 1; i <= 문제3 ; i ++) {
			// 별 찍기
			for( int s = 1 ; s <= i ; s++) {System.out.print("*");}
			System.out.println();
			
		}*/
		
		// 문제 4 : 입력한 줄 만큼 별삼각형 출력
			/* 예 ) 6
			 ******              s= 최대줄[입력값] - 현재줄[i] + 1
			 *****
			 ****
			 ***
			 **
			 *
			 */
		/*System.out.print("문제 4 정수 입력 :"); int 문제4 = scanner.nextInt();
		for ( int i = 1; i <= 문제4 ; i ++) {
			
			// 별찍기
			for ( int s = 1; s <= 문제4 -i +1 ; s++)
			{System.out.print("*");
			}
			// 줄바꿈
			System.out.println();
			
		}*/
		
		
		// 문제 5 : 입력한 줄 만큼 별삼각형 출력
		/* 예 ) 6          i = 줄       b = 공백      s = 별
		       *            1		      1234         1
		     ***            2             123          12
		    ****            3             12           123
		   *****            4             1            1234
		  ******            5                          12345
		                  i<=입력값       최대줄-i       s<=i
		 */
		/*System.out.print("문제 5 정수 입력 :"); int 문제5 = scanner.nextInt();
		for ( int i = 1; i <= 문제5 ; i ++) {
			// 공백찍기
			for ( int b = 1 ; b<=문제5-i ; b++ ) {System.out.print(" ");}
			// 별 찍기
			for( int s = 1 ;  s<=i ; s++) {System.out.print("*");}
			// 줄바꿈
			System.out.println();
			
			
		}*/
			
			
		// 문제 6 : 입력한 줄 만큼 별삼각형 출력
			/* 예 ) 6
			 ******
			  *****
			   ****
			    ***
			     **
			      * 
			 */
		/*System.out.print("문제 6 정수 입력 :"); int 문제6 = scanner.nextInt();
		for ( int i = 1; i <= 문제6 ; i ++) {
			for( int b = 1 ; b<=i-1 ; b++ ) {System.out.print(" ");}
			
			for( int s = 1 ; s <= 문제6 -i + 1 ; s++) {System.out.print("*");}
			System.out.println();
			
		
		}*/
							
		
		
		// 문제 7 : 입력한 줄 만틈 별삼각형 출력
			/*
			     * 
			    ***
			   *****
			  *******
			 *********
			 */
		/*System.out.print("문제 7 정수 입력 :"); int 문제7 = scanner.nextInt();
		for ( int i = 1; i <= 문제7 ; i ++) {
			for( int b = 1; b<=문제7-i; b++) {System.out.print(" ");}
			for( int s = 1; s <= ((i*2)- 1 ); s++) {System.out.print("*");}
				System.out.println();
				
		}*/
			
		
		// 문제 8 : 입력한 줄 만틈 별삼각형 출력
			/* 예) 5
			      1
			     222
			    33333
			   4444444
			  555555555
			 */
		/*System.out.print("문제 8 정수 입력 :"); int 문제8 = scanner.nextInt();
		for ( int i = 1; i <= 문제8 ; i ++) {
			for( int b = 1; b<=문제8-i; b++) {System.out.print(" ");}
			for( int s = 1; s <= ((i*2)- 1 ); s++) {System.out.print(i);}
				System.out.println();
				
		}*/
	
		// 문제 9 : 입력한 줄 만틈 별 삼각형 출력
		/*System.out.print("문제 9 정수 입력 :"); int 문제9 = scanner.nextInt();
		for ( int i = 1; i <= 문제9 ; i ++) {
			for( int b = 1; b<=i-1; b++) {System.out.print(" ");}
			for( int s = 1; s <= ((문제9*2)- i*2 +1); s++) {System.out.print("*");}
				System.out.println();
		
		}*/
		
		// 문제 10 : 입력한 줄 만틈 별삼각형 출력
			/* 예 ) 5
			    
                 *   *
                  * * 
                   * 
                  * *
                 *   *
                        			  
			 */ // i 행  j 열
		
           /*( for ( int i = 1; i <= 5 ; i ++){
			
			for(int j = 1; j <= 5 ; j++) {
				
				if ( i==j ) System.out.print("*");// 행 = 열 동일한 경우 별찍기
				else if( (i+j)==6) System.out.print("*");
				else System.out.print(" ");
				
			}
		// 줄바꿈
		System.out.println();
		}*/
		
		// 스캐너 사용해서 한 결과
		/*System.out.print("문제 10 정수 입력 :"); int 문제10 = scanner.nextInt(); // 홀수로 입력
            for ( int i = 1; i <= 문제10 ; i ++){
			
			for(int j = 1; j <= 문제10 ; j++) {
				
				if ( i==j ) System.out.print("*");// 행 = 열 동일한 경우 별찍기
				else if( (i+j)== (문제10+1)) System.out.print("*");
				else System.out.print(" ");
				
			}
		// 줄바꿈
		System.out.println();
		}*/
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	} //  m e
	
	
	
	
} // c e
