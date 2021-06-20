package Day02;

public class Day02_2 { // c s
	
	
	public static void main(String[] args) { // m s
		
		// 변수
			// 1. 변하는수 <--> 상수 : 고정된 수
			// 2. 메모리 : 자원  [ 데이터 저장소 ]
				// 변수 형태 :
					// 사람 : 문자     int 변수명;
					// 컴퓨터 : 숫자   메모리크기 주소값;
			// 3. 자료형 : 미리 정의된 메모리 크기 [ 메모리를 효율적으로 쓰기 위해 => 속도가 빨라짐 ]
				// 1비트 : 0, 1
				// 1byte : 8비트 => 0 혹은 1 이 8자리
				// 1kbyte kb => 1024 byte  // 1024kb => mb // 1024 mb => gb
		
				// boolean : 1비트 : 논리 [ 0 (false), 1 (true) ]
				// char : 2byte : 문자 [아스키코드 ????]
					// 문자열 => String 클래스
				// byte : 1byte : 정수 [ +-120 정도]
				// short : 2byte : 정수 [+- 3만 정도]
				// int : 4byte : 정수 [+- 20억 정도]
				// long : 8byte : 정수 [ +- 20억 이상 정도]
				// float : 4byte : 실수 [ 
				// double : 8byte : 실수
		
		
		// 예제1
			// 1. 변수 선언
				// 자료형 변수명;      // 쓰레기값 [ 임의의 값 ]
				// 자료형 변수명 = 값 ;
		
		boolean 논리변수 = true; // true 혹은 false 저장할 수 있는 저장소
		System.out.println("boolean 변수 :"  + 논리변수);  // 변수 출력
		
		char 문자변수 = 'a'; System.out.println(" char 변수 :" + 문자변수 ); // char : 아스키코드 [ 문자<--> 기계어 번역표] 사용
		char 문자변수2 = 97; // 문자형 
		System.out.println("char 변수" + 문자변수2);
		
		byte 바이트변수 = 100; System.out.println("byte 변수:" + 바이트변수);
		byte 바이트변수2 = 'a'; // 정수형
		System.out.println(" byte 변수 :" + 바이트변수2);
		
		short 쇼트변수 = 300; System.out.println("short 변수:" + 쇼트변수);
		short 쇼트변수2 = 'a'; System.out.println("short 변수:" + 쇼트변수2);
		
		int 인트변수 = 3000; System.out.println(" int 변수:" + 인트변수);
		int 인트변수2 = 'a'; System.out.println(" int 변수:" + 인트변수2);
		
		System.out.println(100);
			// 정수의 기본 자료형은 : int
		
		long 롱변수 = 999999999999999999l; System.out.println(" long 변수:" + 롱변수);
			// 데이터l;
		float 실수변수 = 10.5111111111111111111111f; System.out.println(" float 변수:" + 실수변수); // 소수점 여섯자리까지
			// 데이터f;
		double 실수변수2 =10.51111111111111111111111111111; System.out.println(" double 변수:" + 실수변수2); // 소수점 15자리까지
			// 실수의 기본자료형 : double
		
		
		String 문자열객체 = "안녕하세요";
		System.out.println(" String 객체 :" + 문자열객체);
		
		
		
		
		
		
		
	} // m e

} // c e
