package Day02;

import java.util.Scanner;

public class Day02_과제 { // c s
	
	public static void main(String[] args) { // m s 
		
		Scanner 입력객체 = new Scanner(System.in);
		
		/*
		  문제1 : 1명의 회원가입 표 만들기
		  변수) 아이디 [S] , 비밀번호[short] , 성명[S] , 이메일 [S]  입력받아 출력하기
		  출력)
				// >>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>
				// 아이디		비밀번호		성명		이메일
				// qwe 		1234		유재석	itdanja@kakao.com
		 
		 */
		/* 문제 1 코드
		System.out.print("아이디 :"); String 아이디 = 입력객체.next();
		System.out.print("비밀번호 :"); short 비밀번호 = 입력객체.nextShort();
		System.out.print("성명 :"); String 성명 = 입력객체.next();
		System.out.println("이메일 :"); String 이메일 = 입력객체.next();
		
		System.out.println(">>>>>>>>>>>회원가입 완료  아래 정보를 확인해 주세요.>>>>>>>>>>>>");
		System.out.println(" 아이디\t비밀번호\t성명\t이메일");
		System.out.println(아이디+ "\t"+비밀번호+"\t" +성명+ "\t" +이메일+ "\t");
				// 변수 출력시 문자처리 " " x   제어문자는 " " o */
		
	
		/*
		 문제 2: 급여 명세서
		 [조건] 입력받기 : 기본급, 수당
		 [출력] 실수령액 = 기본급 + 수당 - 세금 [ 기본급 10% ]
		 */
		
		/*
		 * 문제 2 코드
	 	System.out.println(">>>>>>> >급여명세서 >>>>>>>");
		System.out.println("기본급 입력 :"); int 기본급 = 입력객체.nextInt();
		System.out.println("수당 입력 : "); int 수당 = 입력객체. nextInt();
		System.out.println(">>>>>>>>>>> 실수령액 >>>>>>>>>"); double 세금 = 기본급 *0.1; // 0.1 => 10%   1=> 100%   0.5 => 50%  0.05 => 5%
		System.out.println("실수령액 :" + (기본급+수당-세금)); */
		

		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 확인 => T 혹은 F 출력 
		
		/*
		 * 문제 3 코드
		 System.out.println("숫자를 입력하세요"); short 숫자 = 입력객체.nextShort();
		System.out.println("입력한 숫자가 7의 배수이면 True 아니면 False:" + (숫자%7==0));  */
		
		
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 
		
		/* 문제 4 코드
		System.out.println("정수를 입력하세요"); short 숫자 = 입력객체.nextShort();
		System.out.println("입력한 정수가 홀수이면 True 아니면 False:\n" + (숫자%2==1));
		 */
		
		
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 
		
		/* 문제 5 코드
		System.out.println("정수를 입력하세요"); short 숫자 = 입력객체.nextShort();
		System.out.println("입력한 정수가 7의 배수이면서 짝수이면 True 아니면 False:\n" + (숫자%7==0 && 숫자%2==0));
		 */
		
		
		//문제6 : 두개의 정수를 입력받아 더 큰수 확인 
		
		/* 문제 6 코드
		 * System.out.println("첫번째 정수를 입력하세요"); short 숫자1 = 입력객체.nextShort();
		System.out.println("두번째 정수를 입력하세요"); short 숫자2 = 입력객체.nextShort();
		System.out.println("첫번째 입력한 정수가 두번째 입력한 정수보다 크면 True 아니면 False:\n" +(숫자1>숫자2));
		 */
		
			//문제7 : 반지름을 입력받아 원 넓이 출력하기
			// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		
		/*
		 System.out.println("원의 반지름을 입력하세요"); float 숫자 = 입력객체.nextFloat();
		System.out.println("원의 넓이:"+ (숫자*숫자*3.14));
		 */
		
		
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
			// 예) 54.5   84.3 이면    64.285714%
		
		/* 문제 8 코드
		sysstem.out.println("실수1를 입력하세요"); float 숫자1 = 입력객체.nextFloat();
		System.out.println("실수2를 입력하세요"); float 숫자2 = 입력객체.nextFloat();
		System.out.println("실수1은 실수2의 % 입니다\n"+ ((숫자1/숫자2)*100)+"%");
		 */
		
		
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기	
			// 사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		
		/*
		System.out.println("사다리꼴의 윗변의 길이를 입력하세요"); float 윗변 = 입력객체.nextFloat();
		System.out.println("사다리꼴의 밑변의 길이를 입력하세요"); float 밑변 = 입력객체.nextFloat();
		System.out.println("사다리꼴의 높이의 길이를 입력하세요"); float 높이 = 입력객체.nextFloat();
		System.out.println("사다리꼴의 넓이는:\n" + ((윗변+밑변)*높이)/2);
		 */
		
		
		//문제10 : 키를 정수를 입력받아 표준체중 출력하기
			// 표준체중 계산식 = > (키 - 100) * 0.9
		/*
		System.out.println("키를 입력하세요"); short 키 = 입력객체.nextShort();
		System.out.println("표준체중은:\n" + (키-100)*0.9);
		 */
		
		//문제11 :  키와 몸무게를 입력받아 BMI 출력하기
		//	//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		
		/*
		System.out.println("키를 입력하세요"); float 키 = 입력객체.nextFloat();
		System.out.println("몸무게를 입력하세요"); float 몸무게 = 입력객체.nextFloat();
		System.out.println("BMI는:\n"+ 몸무게/((키/100)*(키/100)));
		 */
		
		
		//문제11 : inch 를 입력받아 cm 로 변환하기
		
		/*
		System.out.println("키를 입력하세요"); float 키 = 입력객체.nextFloat();
		System.out.println("몸무게를 입력하세요"); float 몸무게 = 입력객체.nextFloat();
		System.out.println("BMI는:\n"+ 몸무게/((키/100)*(키/100)));
		System.out.println("cm를 inch로 변환하면:\n"+(몸무게/((키/100)*(키/100)))/2.54);
		 */
		
	
		//문제12 : 중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여
			// 소수 둘째 자리 까지 점수 출력하기
			// 중간고사 반영비율 => 30 %
			// 기말고사 반영비율 => 30 %
			// 수행평가 반영비율 => 40 %
		
		/*
		System.out.println("중간고사 점수를 입력하세요"); float 숫자1 = 입력객체.nextFloat();
		System.out.println("기말고사 점수를 입력하세요"); float 숫자2 = 입력객체.nextFloat();
		System.out.println("수행평가 점수를 입력하세요"); float 숫자3 = 입력객체.nextFloat();
		System.out.println("최종 성적은:\n" + Math.round(((숫자1*0.3)+(숫자2*0.3)+(숫자3*0.4))*100)/100);
		 */
		
		
	
		//예제13: 연산 순서 나열 하고 x와 y값 예측하기
			// int x = 10;
			// int y = x-- + 5 + --x;
			// printf(" x의 값 : %d , y의값 :  %d ", x, y)
		
		
		
		
	} // m e

} // c e
