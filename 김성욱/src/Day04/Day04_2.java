package Day04;

import java.util.Scanner;

public class Day04_2 { // c s

	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		
		// �ݺ����� �̿��� �� ���
		// ���� 1 : �Է��� ������ŭ �� [*] ���
		/*System.out.print(" ���� 1 ���� �Է� : ");int ����1 = scanner.nextInt(); // �Է°�ü���� ������ �޾ƿ���
		for ( int i = 1; i <= ����1 ; i ++ ) System.out.print("*");
			// i�� 1���� �Է¹��� ������ i�� 1�� �����ϸ鼭 �ݺ�*/
		
		// ���� 2 : �Է��� ������ŭ ��[*} ��� / �� 5������ �ٹٲ�
		/*System.out.print(" ���� 2 ���� �Է� : "); int ����2 = scanner.nextInt();
		for ( int i = 1 ; i <= ����2 ; i++) {
			System.out.print("*");
			if( i % 5 == 0) System.out.println(); // 5�� ������� �ٹٲ�
		}*/
		
		// ���� 3 : �Է��� �� ��ŭ ���ﰢ�� ���
			/* �� ) 6    i = ��    s = ��
			 *             1        1
			 **            2        1 2
			 ***           3        1 2 3
			 ****          4        1 2 3 4
			 *****         5        1 2 3 4 5
			 ******        6        1 2 3 4 5 6
			             i<=�Է°�    s <= i [������]
			 */
		/*System.out.print("���� 3 ���� �Է� :"); int ����3 = scanner.nextInt();
		for ( int i = 1; i <= ����3 ; i ++) {
			// �� ���
			for( int s = 1 ; s <= i ; s++) {System.out.print("*");}
			System.out.println();
			
		}*/
		
		// ���� 4 : �Է��� �� ��ŭ ���ﰢ�� ���
			/* �� ) 6
			 ******              s= �ִ���[�Է°�] - ������[i] + 1
			 *****
			 ****
			 ***
			 **
			 *
			 */
		/*System.out.print("���� 4 ���� �Է� :"); int ����4 = scanner.nextInt();
		for ( int i = 1; i <= ����4 ; i ++) {
			
			// �����
			for ( int s = 1; s <= ����4 -i +1 ; s++)
			{System.out.print("*");
			}
			// �ٹٲ�
			System.out.println();
			
		}*/
		
		
		// ���� 5 : �Է��� �� ��ŭ ���ﰢ�� ���
		/* �� ) 6          i = ��       b = ����      s = ��
		       *            1		      1234         1
		     ***            2             123          12
		    ****            3             12           123
		   *****            4             1            1234
		  ******            5                          12345
		                  i<=�Է°�       �ִ���-i       s<=i
		 */
		/*System.out.print("���� 5 ���� �Է� :"); int ����5 = scanner.nextInt();
		for ( int i = 1; i <= ����5 ; i ++) {
			// �������
			for ( int b = 1 ; b<=����5-i ; b++ ) {System.out.print(" ");}
			// �� ���
			for( int s = 1 ;  s<=i ; s++) {System.out.print("*");}
			// �ٹٲ�
			System.out.println();
			
			
		}*/
			
			
		// ���� 6 : �Է��� �� ��ŭ ���ﰢ�� ���
			/* �� ) 6
			 ******
			  *****
			   ****
			    ***
			     **
			      * 
			 */
		/*System.out.print("���� 6 ���� �Է� :"); int ����6 = scanner.nextInt();
		for ( int i = 1; i <= ����6 ; i ++) {
			for( int b = 1 ; b<=i-1 ; b++ ) {System.out.print(" ");}
			
			for( int s = 1 ; s <= ����6 -i + 1 ; s++) {System.out.print("*");}
			System.out.println();
			
		
		}*/
							
		
		
		// ���� 7 : �Է��� �� ��ƴ ���ﰢ�� ���
			/*
			     * 
			    ***
			   *****
			  *******
			 *********
			 */
		/*System.out.print("���� 7 ���� �Է� :"); int ����7 = scanner.nextInt();
		for ( int i = 1; i <= ����7 ; i ++) {
			for( int b = 1; b<=����7-i; b++) {System.out.print(" ");}
			for( int s = 1; s <= ((i*2)- 1 ); s++) {System.out.print("*");}
				System.out.println();
				
		}*/
			
		
		// ���� 8 : �Է��� �� ��ƴ ���ﰢ�� ���
			/* ��) 5
			      1
			     222
			    33333
			   4444444
			  555555555
			 */
		/*System.out.print("���� 8 ���� �Է� :"); int ����8 = scanner.nextInt();
		for ( int i = 1; i <= ����8 ; i ++) {
			for( int b = 1; b<=����8-i; b++) {System.out.print(" ");}
			for( int s = 1; s <= ((i*2)- 1 ); s++) {System.out.print(i);}
				System.out.println();
				
		}*/
	
		// ���� 9 : �Է��� �� ��ƴ �� �ﰢ�� ���
		/*System.out.print("���� 9 ���� �Է� :"); int ����9 = scanner.nextInt();
		for ( int i = 1; i <= ����9 ; i ++) {
			for( int b = 1; b<=i-1; b++) {System.out.print(" ");}
			for( int s = 1; s <= ((����9*2)- i*2 +1); s++) {System.out.print("*");}
				System.out.println();
		
		}*/
		
		// ���� 10 : �Է��� �� ��ƴ ���ﰢ�� ���
			/* �� ) 5
			    
                 *   *
                  * * 
                   * 
                  * *
                 *   *
                        			  
			 */ // i ��  j ��
		
           /*( for ( int i = 1; i <= 5 ; i ++){
			
			for(int j = 1; j <= 5 ; j++) {
				
				if ( i==j ) System.out.print("*");// �� = �� ������ ��� �����
				else if( (i+j)==6) System.out.print("*");
				else System.out.print(" ");
				
			}
		// �ٹٲ�
		System.out.println();
		}*/
		
		// ��ĳ�� ����ؼ� �� ���
		/*System.out.print("���� 10 ���� �Է� :"); int ����10 = scanner.nextInt(); // Ȧ���� �Է�
            for ( int i = 1; i <= ����10 ; i ++){
			
			for(int j = 1; j <= ����10 ; j++) {
				
				if ( i==j ) System.out.print("*");// �� = �� ������ ��� �����
				else if( (i+j)== (����10+1)) System.out.print("*");
				else System.out.print(" ");
				
			}
		// �ٹٲ�
		System.out.println();
		}*/
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	} //  m e
	
	
	
	
} // c e
