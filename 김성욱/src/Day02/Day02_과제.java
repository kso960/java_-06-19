package Day02;

import java.util.Scanner;

public class Day02_���� { // c s
	
	public static void main(String[] args) { // m s 
		
		Scanner �Է°�ü = new Scanner(System.in);
		
		/*
		  ����1 : 1���� ȸ������ ǥ �����
		  ����) ���̵� [S] , ��й�ȣ[short] , ����[S] , �̸��� [S]  �Է¹޾� ����ϱ�
		  ���)
				// >>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>>>
				// ���̵�		��й�ȣ		����		�̸���
				// qwe 		1234		���缮	itdanja@kakao.com
		 
		 */
		/* ���� 1 �ڵ�
		System.out.print("���̵� :"); String ���̵� = �Է°�ü.next();
		System.out.print("��й�ȣ :"); short ��й�ȣ = �Է°�ü.nextShort();
		System.out.print("���� :"); String ���� = �Է°�ü.next();
		System.out.println("�̸��� :"); String �̸��� = �Է°�ü.next();
		
		System.out.println(">>>>>>>>>>>ȸ������ �Ϸ�  �Ʒ� ������ Ȯ���� �ּ���.>>>>>>>>>>>>");
		System.out.println(" ���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println(���̵�+ "\t"+��й�ȣ+"\t" +����+ "\t" +�̸���+ "\t");
				// ���� ��½� ����ó�� " " x   ����ڴ� " " o */
		
	
		/*
		 ���� 2: �޿� ����
		 [����] �Է¹ޱ� : �⺻��, ����
		 [���] �Ǽ��ɾ� = �⺻�� + ���� - ���� [ �⺻�� 10% ]
		 */
		
		/*
		 * ���� 2 �ڵ�
	 	System.out.println(">>>>>>> >�޿����� >>>>>>>");
		System.out.println("�⺻�� �Է� :"); int �⺻�� = �Է°�ü.nextInt();
		System.out.println("���� �Է� : "); int ���� = �Է°�ü. nextInt();
		System.out.println(">>>>>>>>>>> �Ǽ��ɾ� >>>>>>>>>"); double ���� = �⺻�� *0.1; // 0.1 => 10%   1=> 100%   0.5 => 50%  0.05 => 5%
		System.out.println("�Ǽ��ɾ� :" + (�⺻��+����-����)); */
		

		
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� Ȯ�� => T Ȥ�� F ��� 
		
		/*
		 * ���� 3 �ڵ�
		 System.out.println("���ڸ� �Է��ϼ���"); short ���� = �Է°�ü.nextShort();
		System.out.println("�Է��� ���ڰ� 7�� ����̸� True �ƴϸ� False:" + (����%7==0));  */
		
		
		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� 
		
		/* ���� 4 �ڵ�
		System.out.println("������ �Է��ϼ���"); short ���� = �Է°�ü.nextShort();
		System.out.println("�Է��� ������ Ȧ���̸� True �ƴϸ� False:\n" + (����%2==1));
		 */
		
		
		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� 
		
		/* ���� 5 �ڵ�
		System.out.println("������ �Է��ϼ���"); short ���� = �Է°�ü.nextShort();
		System.out.println("�Է��� ������ 7�� ����̸鼭 ¦���̸� True �ƴϸ� False:\n" + (����%7==0 && ����%2==0));
		 */
		
		
		//����6 : �ΰ��� ������ �Է¹޾� �� ū�� Ȯ�� 
		
		/* ���� 6 �ڵ�
		 * System.out.println("ù��° ������ �Է��ϼ���"); short ����1 = �Է°�ü.nextShort();
		System.out.println("�ι�° ������ �Է��ϼ���"); short ����2 = �Է°�ü.nextShort();
		System.out.println("ù��° �Է��� ������ �ι�° �Է��� �������� ũ�� True �ƴϸ� False:\n" +(����1>����2));
		 */
		
			//����7 : �������� �Է¹޾� �� ���� ����ϱ�
			// �� ���� ���� => ������ * ������ * ������[3.14]
		
		/*
		 System.out.println("���� �������� �Է��ϼ���"); float ���� = �Է°�ü.nextFloat();
		System.out.println("���� ����:"+ (����*����*3.14));
		 */
		
		
		//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
			// ��) 54.5   84.3 �̸�    64.285714%
		
		/* ���� 8 �ڵ�
		sysstem.out.println("�Ǽ�1�� �Է��ϼ���"); float ����1 = �Է°�ü.nextFloat();
		System.out.println("�Ǽ�2�� �Է��ϼ���"); float ����2 = �Է°�ü.nextFloat();
		System.out.println("�Ǽ�1�� �Ǽ�2�� % �Դϴ�\n"+ ((����1/����2)*100)+"%");
		 */
		
		
		//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�	
			// ��ٸ��� ���� = > (���� * �غ�) * ���� / 2
		
		/*
		System.out.println("��ٸ����� ������ ���̸� �Է��ϼ���"); float ���� = �Է°�ü.nextFloat();
		System.out.println("��ٸ����� �غ��� ���̸� �Է��ϼ���"); float �غ� = �Է°�ü.nextFloat();
		System.out.println("��ٸ����� ������ ���̸� �Է��ϼ���"); float ���� = �Է°�ü.nextFloat();
		System.out.println("��ٸ����� ���̴�:\n" + ((����+�غ�)*����)/2);
		 */
		
		
		//����10 : Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
			// ǥ��ü�� ���� = > (Ű - 100) * 0.9
		/*
		System.out.println("Ű�� �Է��ϼ���"); short Ű = �Է°�ü.nextShort();
		System.out.println("ǥ��ü����:\n" + (Ű-100)*0.9);
		 */
		
		//����11 :  Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
		//	//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
		
		/*
		System.out.println("Ű�� �Է��ϼ���"); float Ű = �Է°�ü.nextFloat();
		System.out.println("�����Ը� �Է��ϼ���"); float ������ = �Է°�ü.nextFloat();
		System.out.println("BMI��:\n"+ ������/((Ű/100)*(Ű/100)));
		 */
		
		
		//����11 : inch �� �Է¹޾� cm �� ��ȯ�ϱ�
		
		/*
		System.out.println("Ű�� �Է��ϼ���"); float Ű = �Է°�ü.nextFloat();
		System.out.println("�����Ը� �Է��ϼ���"); float ������ = �Է°�ü.nextFloat();
		System.out.println("BMI��:\n"+ ������/((Ű/100)*(Ű/100)));
		System.out.println("cm�� inch�� ��ȯ�ϸ�:\n"+(������/((Ű/100)*(Ű/100)))/2.54);
		 */
		
	
		//����12 : �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����Ͽ�
			// �Ҽ� ��° �ڸ� ���� ���� ����ϱ�
			// �߰���� �ݿ����� => 30 %
			// �⸻��� �ݿ����� => 30 %
			// ������ �ݿ����� => 40 %
		
		/*
		System.out.println("�߰���� ������ �Է��ϼ���"); float ����1 = �Է°�ü.nextFloat();
		System.out.println("�⸻��� ������ �Է��ϼ���"); float ����2 = �Է°�ü.nextFloat();
		System.out.println("������ ������ �Է��ϼ���"); float ����3 = �Է°�ü.nextFloat();
		System.out.println("���� ������:\n" + Math.round(((����1*0.3)+(����2*0.3)+(����3*0.4))*100)/100);
		 */
		
		
	
		//����13: ���� ���� ���� �ϰ� x�� y�� �����ϱ�
			// int x = 10;
			// int y = x-- + 5 + --x;
			// printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
		
		
		
		
	} // m e

} // c e
