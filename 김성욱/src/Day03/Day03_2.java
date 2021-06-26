package Day03;

import java.util.Scanner;

public class Day03_2 { // c s 
	
		// 제어문 : 경우에 따른 판단력
			// if [논리검사 ] , switch [ 값 검사 ]
		
	
	public static void main(String[] args) { // m s
		
		// if 형태
			// 만약에 ~ 이면
			// 1. if( T / F ) 실행문;
			// 2. if ( T / F) T실행문;
			//    else F실행문;
			// 3. if( T / F ) { 실행문 ; 실행문; }
			//	  else { 실행문; 실행문2; }
			// 4. if( T / F ) 실행문;
			// else if( T / F ) 실햄문 [T2];
			// else if( T / F ) 실행문 [T3];
			// else if( T / F ) 실행문 [T4];
			// else
		
		Scanner 입력객체 = new Scanner(System.in);
		
		/*
		// 예 1
		if(5 > 3) System.out.println("5가 크다"); // if 뒤에는 ; 넣으면 안됨! 둘이 연결되어있어야함
		if(5 > 10) System.out.println("5가 크다2");
		// 예 2
		if(5 > 3) System.out.println("5가 크다");
		else System.out.println("5가 작다");
		// 예 3
		if(5 > 3) {System.out.println("true"); 
					System.out.println("5가 크다");
		}
		else {System.out.println("false");
				System.out.println("5가 작다");
		}
		// 예 4
		if(5 > 10) System.out.println("5가 크다1");
		else if(5 > 8) System.out.println("5가 크다2");
		else if(5 > 6) System.out.println("5가 크다3");
		else if(5 > 4) System.out.println("5가 크다4");
		else System.out.println("5보다 작은 데이터가 없다");*/
		
		
		
		// 문제 1 : 하나의 점수를 입력받아 80점 이상이면 합격 아니면 불합격 출력
		
		/* System.out.println("점수를 입력하세요"); short 점수 = 입력객체.nextShort();
		if (점수 >= 80) System.out.println("합격");
		else System.out.println("불합격"); */
		
		
		// 문제 2 : 하나의 점수를 입력받아 90점 이상이면 A 80점 이상이면  B 그 외 탈락
		
		/* System.out.println("점수를 입력하세요"); short 점수2 = 입력객체.nextShort();
		if (점수2 >= 90) System.out.println("A");
		else if (점수2 >= 80) System.out.println("B");
		else System.out.println("탈락"); */
		
		// 문제 3 : 하나의 점수와 성별을 입력받아
			// 남자이면서 90점 이상이면 A-1 클래스 출력
			// 여자이면서 90점 이상이면 A-2 클래스 출력
				// 남자이면서 80점 이상이면 B-1 클래스 출력
				// 여자이면서 80점 이상이면 B-2 클래스 출력
					// 그 외 C 클래스
						// 문자는 산술 비교 증감 연산자 사용 불가능 => 문자열 비교 .eq사용
							// 문자열.equals(문자열2)
		
		/*System.out.println("점수3 입력 :"); int 점수3 = 입력객체.nextInt();
		System.out.println("성별 입력 [남,여] :"); String 성별 = 입력객체.next();
		
		if( 성별.equals("남")) {
			
			if( 점수3 >= 90) System.out.println("A - 1 클래스");
			else if( 점수3 >= 80) System.out.println(" B - 1 클래스");
			else System.out.println(" C 클래스");
			
		}
		else if( 성별.equals("여")) {
			
			if( 점수3 >= 90) System.out.println("A - 2 클래스");
			else if( 점수3 >= 80) System.out.println(" B - 2 클래스");
			else System.out.println(" C 클래스");
			
		}
		else {
			System.out.println(" C클래스 ");
		} */
		
		
		// 문제 4 : 2개 정수를 입력받아 가장 큰 수 출력
		
		/*System.out.println("정수1을 입력하세요"); int 정수1 = 입력객체.nextInt();
		System.out.println("정수2를 입력하세요"); int 정수2 = 입력객체.nextInt();
		
		if(정수1>정수2) System.out.println(정수1);
		else System.out.println(정수2); */
		
		// 문제 5 : 3개 정수를 입력받아 가장 큰 수 출력
		
		/*System.out.println("정수1을 입력하세요"); int 정수1 = 입력객체.nextInt();
		System.out.println("정수2을 입력하세요"); int 정수2 = 입력객체.nextInt();
		System.out.println("정수3을 입력하세요"); int 정수3 = 입력객체.nextInt();
		
		int max = 정수1;
		if(max < 정수2) max = 정수2;
		if(max < 정수3) max = 정수3;
		System.out.println("가장 큰수는" + max);
		
		
		if (정수1>정수2 && 정수1>정수3) System.out.println(정수1);
		if (정수2>정수1 && 정수2>정수3) System.out.println(정수2);
		if (정수3>정수1 && 정수3>정수2) System.out.println(정수3);
		else System.out.println(" 모두 같다");*/


		// 문제 6 : 4개 정수를 입력받아 가장 큰 수 출력
		
		/*System.out.println("정수1을 입력하세요"); int 정수1 = 입력객체.nextInt();
		System.out.println("정수2을 입력하세요"); int 정수2 = 입력객체.nextInt();
		System.out.println("정수3을 입력하세요"); int 정수3 = 입력객체.nextInt();
		System.out.println("정수4을 입력하세요"); int 정수4 = 입력객체.nextInt();
		
		int max = 정수1;
		if(max < 정수2) max = 정수2;   // if(max < 정수2) max = 정수2;
		if(max < 정수3) max = 정수3;   // else if(max < 정수3) max = 정수3;
		if(max < 정수4) max = 정수4;   // else if(max < 정수4) max = 정수4;
		System.out.println("가장 큰수는" + max);*/
		
			// if 	else if	 else if => 첫번째 if에 T이면 다음 else if 검사 실행 X
			// if 	if	 if => 첫번째 if에 T이더라도 두번째 if 검사 실행
		
		// 문제 7 : 3개 정수를 입력받아 오름차순 정렬후 출력 [ 교체 방법 ] 오름차순 : if ( 정수1 > 정수2 ) 비교대상이 더 작으면 교환
		
		/*System.out.println("정수1을 입력하세요"); int 정수1 = 입력객체.nextInt();
		System.out.println("정수2을 입력하세요"); int 정수2 = 입력객체.nextInt();
		System.out.println("정수3을 입력하세요"); int 정수3 = 입력객체.nextInt();
		
		int temp; // 교체용 임시 변수
		
		System.out.printf("정렬 전: %d %d %d  \n", 정수1, 정수2, 정수3);
		if( 정수1 > 정수2 ) {temp = 정수1; 정수1 = 정수2; 정수2 = temp;}
		if( 정수1 > 정수3 ) {temp = 정수1; 정수1 = 정수3; 정수3 = temp;}
		if( 정수2 > 정수3 ) {temp = 정수2; 정수2 = 정수3; 정수3 = temp;}
		
		System.out.printf("정렬 후: %d %d %d ", 정수1, 정수2, 정수3);*/
		
		
		
		
		// 문제 8 : 3개 정수를 입력받아 내림차순 정렬후 출력 [ 교체 방법 ] 내림차순 : if ( 정수1 < 정수2 ) 비교대상이 더 크면 교환
		
		/*System.out.println("정수1을 입력하세요"); int 정수1 = 입력객체.nextInt();
		System.out.println("정수2을 입력하세요"); int 정수2 = 입력객체.nextInt();
		System.out.println("정수3을 입력하세요"); int 정수3 = 입력객체.nextInt();
		
		int temp; // 교체용 임시 변수
		System.out.printf("정렬 전: %d %d %d  \n", 정수1, 정수2, 정수3);
		if( 정수1 < 정수2 ) {temp = 정수1; 정수1 = 정수2; 정수2 = temp;}
		if( 정수1 < 정수3 ) {temp = 정수1; 정수1 = 정수3; 정수3 = temp;}
		if( 정수2 < 정수3 ) {temp = 정수2; 정수2 = 정수3; 정수3 = temp;}
		
		System.out.printf("정렬 후: %d %d %d ", 정수1, 정수2, 정수3); */
		
		
	} // m e
	
	

} // c e
