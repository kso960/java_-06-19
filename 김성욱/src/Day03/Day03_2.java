package Day03;

import java.util.Scanner;

public class Day03_2 { // c s 
	
		// ��� : ��쿡 ���� �Ǵܷ�
			// if [���˻� ] , switch [ �� �˻� ]
		
	
	public static void main(String[] args) { // m s
		
		// if ����
			// ���࿡ ~ �̸�
			// 1. if( T / F ) ���๮;
			// 2. if ( T / F) T���๮;
			//    else F���๮;
			// 3. if( T / F ) { ���๮ ; ���๮; }
			//	  else { ���๮; ���๮2; }
			// 4. if( T / F ) ���๮;
			// else if( T / F ) ���ܹ� [T2];
			// else if( T / F ) ���๮ [T3];
			// else if( T / F ) ���๮ [T4];
			// else
		
		Scanner �Է°�ü = new Scanner(System.in);
		
		/*
		// �� 1
		if(5 > 3) System.out.println("5�� ũ��"); // if �ڿ��� ; ������ �ȵ�! ���� ����Ǿ��־����
		if(5 > 10) System.out.println("5�� ũ��2");
		// �� 2
		if(5 > 3) System.out.println("5�� ũ��");
		else System.out.println("5�� �۴�");
		// �� 3
		if(5 > 3) {System.out.println("true"); 
					System.out.println("5�� ũ��");
		}
		else {System.out.println("false");
				System.out.println("5�� �۴�");
		}
		// �� 4
		if(5 > 10) System.out.println("5�� ũ��1");
		else if(5 > 8) System.out.println("5�� ũ��2");
		else if(5 > 6) System.out.println("5�� ũ��3");
		else if(5 > 4) System.out.println("5�� ũ��4");
		else System.out.println("5���� ���� �����Ͱ� ����");*/
		
		
		
		// ���� 1 : �ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ� �ƴϸ� ���հ� ���
		
		/* System.out.println("������ �Է��ϼ���"); short ���� = �Է°�ü.nextShort();
		if (���� >= 80) System.out.println("�հ�");
		else System.out.println("���հ�"); */
		
		
		// ���� 2 : �ϳ��� ������ �Է¹޾� 90�� �̻��̸� A 80�� �̻��̸�  B �� �� Ż��
		
		/* System.out.println("������ �Է��ϼ���"); short ����2 = �Է°�ü.nextShort();
		if (����2 >= 90) System.out.println("A");
		else if (����2 >= 80) System.out.println("B");
		else System.out.println("Ż��"); */
		
		// ���� 3 : �ϳ��� ������ ������ �Է¹޾�
			// �����̸鼭 90�� �̻��̸� A-1 Ŭ���� ���
			// �����̸鼭 90�� �̻��̸� A-2 Ŭ���� ���
				// �����̸鼭 80�� �̻��̸� B-1 Ŭ���� ���
				// �����̸鼭 80�� �̻��̸� B-2 Ŭ���� ���
					// �� �� C Ŭ����
						// ���ڴ� ��� �� ���� ������ ��� �Ұ��� => ���ڿ� �� .eq���
							// ���ڿ�.equals(���ڿ�2)
		
		/*System.out.println("����3 �Է� :"); int ����3 = �Է°�ü.nextInt();
		System.out.println("���� �Է� [��,��] :"); String ���� = �Է°�ü.next();
		
		if( ����.equals("��")) {
			
			if( ����3 >= 90) System.out.println("A - 1 Ŭ����");
			else if( ����3 >= 80) System.out.println(" B - 1 Ŭ����");
			else System.out.println(" C Ŭ����");
			
		}
		else if( ����.equals("��")) {
			
			if( ����3 >= 90) System.out.println("A - 2 Ŭ����");
			else if( ����3 >= 80) System.out.println(" B - 2 Ŭ����");
			else System.out.println(" C Ŭ����");
			
		}
		else {
			System.out.println(" CŬ���� ");
		} */
		
		
		// ���� 4 : 2�� ������ �Է¹޾� ���� ū �� ���
		
		/*System.out.println("����1�� �Է��ϼ���"); int ����1 = �Է°�ü.nextInt();
		System.out.println("����2�� �Է��ϼ���"); int ����2 = �Է°�ü.nextInt();
		
		if(����1>����2) System.out.println(����1);
		else System.out.println(����2); */
		
		// ���� 5 : 3�� ������ �Է¹޾� ���� ū �� ���
		
		/*System.out.println("����1�� �Է��ϼ���"); int ����1 = �Է°�ü.nextInt();
		System.out.println("����2�� �Է��ϼ���"); int ����2 = �Է°�ü.nextInt();
		System.out.println("����3�� �Է��ϼ���"); int ����3 = �Է°�ü.nextInt();
		
		int max = ����1;
		if(max < ����2) max = ����2;
		if(max < ����3) max = ����3;
		System.out.println("���� ū����" + max);
		
		
		if (����1>����2 && ����1>����3) System.out.println(����1);
		if (����2>����1 && ����2>����3) System.out.println(����2);
		if (����3>����1 && ����3>����2) System.out.println(����3);
		else System.out.println(" ��� ����");*/


		// ���� 6 : 4�� ������ �Է¹޾� ���� ū �� ���
		
		/*System.out.println("����1�� �Է��ϼ���"); int ����1 = �Է°�ü.nextInt();
		System.out.println("����2�� �Է��ϼ���"); int ����2 = �Է°�ü.nextInt();
		System.out.println("����3�� �Է��ϼ���"); int ����3 = �Է°�ü.nextInt();
		System.out.println("����4�� �Է��ϼ���"); int ����4 = �Է°�ü.nextInt();
		
		int max = ����1;
		if(max < ����2) max = ����2;   // if(max < ����2) max = ����2;
		if(max < ����3) max = ����3;   // else if(max < ����3) max = ����3;
		if(max < ����4) max = ����4;   // else if(max < ����4) max = ����4;
		System.out.println("���� ū����" + max);*/
		
			// if 	else if	 else if => ù��° if�� T�̸� ���� else if �˻� ���� X
			// if 	if	 if => ù��° if�� T�̴��� �ι�° if �˻� ����
		
		// ���� 7 : 3�� ������ �Է¹޾� �������� ������ ��� [ ��ü ��� ] �������� : if ( ����1 > ����2 ) �񱳴���� �� ������ ��ȯ
		
		/*System.out.println("����1�� �Է��ϼ���"); int ����1 = �Է°�ü.nextInt();
		System.out.println("����2�� �Է��ϼ���"); int ����2 = �Է°�ü.nextInt();
		System.out.println("����3�� �Է��ϼ���"); int ����3 = �Է°�ü.nextInt();
		
		int temp; // ��ü�� �ӽ� ����
		
		System.out.printf("���� ��: %d %d %d  \n", ����1, ����2, ����3);
		if( ����1 > ����2 ) {temp = ����1; ����1 = ����2; ����2 = temp;}
		if( ����1 > ����3 ) {temp = ����1; ����1 = ����3; ����3 = temp;}
		if( ����2 > ����3 ) {temp = ����2; ����2 = ����3; ����3 = temp;}
		
		System.out.printf("���� ��: %d %d %d ", ����1, ����2, ����3);*/
		
		
		
		
		// ���� 8 : 3�� ������ �Է¹޾� �������� ������ ��� [ ��ü ��� ] �������� : if ( ����1 < ����2 ) �񱳴���� �� ũ�� ��ȯ
		
		/*System.out.println("����1�� �Է��ϼ���"); int ����1 = �Է°�ü.nextInt();
		System.out.println("����2�� �Է��ϼ���"); int ����2 = �Է°�ü.nextInt();
		System.out.println("����3�� �Է��ϼ���"); int ����3 = �Է°�ü.nextInt();
		
		int temp; // ��ü�� �ӽ� ����
		System.out.printf("���� ��: %d %d %d  \n", ����1, ����2, ����3);
		if( ����1 < ����2 ) {temp = ����1; ����1 = ����2; ����2 = temp;}
		if( ����1 < ����3 ) {temp = ����1; ����1 = ����3; ����3 = temp;}
		if( ����2 < ����3 ) {temp = ����2; ����2 = ����3; ����3 = temp;}
		
		System.out.printf("���� ��: %d %d %d ", ����1, ����2, ����3); */
		
		
	} // m e
	
	

} // c e
