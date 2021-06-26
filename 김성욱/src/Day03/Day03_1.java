package Day03;

import java.util.Scanner;


public class Day03_1 { // c s

	
	public static void main(String[] args) { // m s
		
		
		// 1. 출력
					// print, printf, println
					// 제어문자 : \n \t \r
					// 형식문자 : %d %c %f %s
				
				// 2. 연산자 [기호]
					// 산술연산자 : + - * / %
					// 비교연산자 : > < >= <= == !=
					// 논리연산자 : && || !
					// 대입연산자 : = += /+ *= %=
					// 증감연산자 : 변수 ++ 변수--
				
				// 3. 변수 [메모리]
					// 자료형 : 미리 정해진 메모리 크기
						// boolean, char, byte, short, int, double 등
					// 변수 주소값 : 컴퓨터가 변수를 찾는 위치 값 [ 16진수 ]
				
				// 4. 입력받기 [ 입력객체 ]
					// Scanner 클래스 -> import 
						// Scanner 객체명 = new Scanner(System.in);
					// 입력객체에서 데이터 가져오기 => .next()
		
		Scanner 입력객체 = new Scanner(System.in);
		
		
		// Day02 과제
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 확인 => T 혹은 F 출력 
		/*System.out.println("정수입력:"); int 정수 = 입력객체.nextInt();
		System.out.println("입력된 정수는 :"+ (정수%7==0));*/
		
		
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 
		/*System.out.println("정수입력:"); int 정수2 = 입력객체.nextInt();
		System.out.println("입력된 정수는 :" + (정수2%2==0));*/
		
		
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인
		/*System.out.println("정수3입력 :"); int 정수3 = 입력객체.nextInt();
		System.out.println("입력값이 7배수이면서 짝수 :"+ (정수3%7==0 && 정수3%2==0));*/
		
		
		
	} // m e
	
	
} // c e
