package Day03;

import java.util.Scanner;


public class Day03_1 { // c s

	
	public static void main(String[] args) { // m s
		
		
		// 1. ���
					// print, printf, println
					// ����� : \n \t \r
					// ���Ĺ��� : %d %c %f %s
				
				// 2. ������ [��ȣ]
					// ��������� : + - * / %
					// �񱳿����� : > < >= <= == !=
					// �������� : && || !
					// ���Կ����� : = += /+ *= %=
					// ���������� : ���� ++ ����--
				
				// 3. ���� [�޸�]
					// �ڷ��� : �̸� ������ �޸� ũ��
						// boolean, char, byte, short, int, double ��
					// ���� �ּҰ� : ��ǻ�Ͱ� ������ ã�� ��ġ �� [ 16���� ]
				
				// 4. �Է¹ޱ� [ �Է°�ü ]
					// Scanner Ŭ���� -> import 
						// Scanner ��ü�� = new Scanner(System.in);
					// �Է°�ü���� ������ �������� => .next()
		
		Scanner �Է°�ü = new Scanner(System.in);
		
		
		// Day02 ����
		
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� Ȯ�� => T Ȥ�� F ��� 
		/*System.out.println("�����Է�:"); int ���� = �Է°�ü.nextInt();
		System.out.println("�Էµ� ������ :"+ (����%7==0));*/
		
		
		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� 
		/*System.out.println("�����Է�:"); int ����2 = �Է°�ü.nextInt();
		System.out.println("�Էµ� ������ :" + (����2%2==0));*/
		
		
		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ��
		/*System.out.println("����3�Է� :"); int ����3 = �Է°�ü.nextInt();
		System.out.println("�Է°��� 7����̸鼭 ¦�� :"+ (����3%7==0 && ����3%2==0));*/
		
		
		
	} // m e
	
	
} // c e
