package Day02;

import java.util.Scanner; // Scanner 사용하기 위한 import

public class Day02_3 { // c s
	
	public static void main(String[] args) { // m s 
		
		
		// 입력받기
			// 1. 입력받기 => 변수에 저장 => 사용
		
		Scanner 입력객체 = new Scanner(System.in); // 외우기  입력 관련 메소드 제공  (키보드에서 입력객체 scan에 저장)
			// Scanner : 입력 관련 클래스
				// scan : 객체명 vs 변수명
		 			// new : 객체의 메모리 할당 연산자
						// Scanner(System.in) : 클래스 생성자
		
		System.out.print(" 정수 입력:");
		int 입력정수 = 입력객체.nextInt();
						// nextInt() : 입력개체의 입력된 정수 가져오기  (입력객체에 입력된 정수 next를 사용하여 가져옴)
		System.out.print(" 현재 입력한 정수는 :" + 입력정수);
		
		System.out.print("문자열 입력:");
		String 입력문자열 = 입력객체.next() ;
						// next() : 입력객체의 입력된 문자열 가져오기   (입력객체에 입력된 문자열 next를 사용하여 가져옴)
		System.out.print("현재 입력한 문자열은 :" + 입력문자열);
		
		// 변수[메모리] vs 객체[메모리] 차이점 중요! 
			// 변수는 메모리 용량 정해져있음 vs 객체는 클래스의 용량을 따라감 (scanner가 차지하는 용량만큼 객체가 차지 가능) 만들어진 객체를 next를 사용하여 옮기고 또 객체 입력
				// 변수 [자료형] vs 객체 [클래스]
					// int 변수명 vs 클래스명 변수명 = new 생성자명();
					
		
		
		
		
		
		
		
	} // m e
} // c e
