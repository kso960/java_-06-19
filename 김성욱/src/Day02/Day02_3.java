package Day02;

import java.util.Scanner; // Scanner ����ϱ� ���� import

public class Day02_3 { // c s
	
	public static void main(String[] args) { // m s 
		
		
		// �Է¹ޱ�
			// 1. �Է¹ޱ� => ������ ���� => ���
		
		Scanner �Է°�ü = new Scanner(System.in); // �ܿ��  �Է� ���� �޼ҵ� ����  (Ű���忡�� �Է°�ü scan�� ����)
			// Scanner : �Է� ���� Ŭ����
				// scan : ��ü�� vs ������
		 			// new : ��ü�� �޸� �Ҵ� ������
						// Scanner(System.in) : Ŭ���� ������
		
		System.out.print(" ���� �Է�:");
		int �Է����� = �Է°�ü.nextInt();
						// nextInt() : �Է°�ü�� �Էµ� ���� ��������  (�Է°�ü�� �Էµ� ���� next�� ����Ͽ� ������)
		System.out.print(" ���� �Է��� ������ :" + �Է�����);
		
		System.out.print("���ڿ� �Է�:");
		String �Է¹��ڿ� = �Է°�ü.next() ;
						// next() : �Է°�ü�� �Էµ� ���ڿ� ��������   (�Է°�ü�� �Էµ� ���ڿ� next�� ����Ͽ� ������)
		System.out.print("���� �Է��� ���ڿ��� :" + �Է¹��ڿ�);
		
		// ����[�޸�] vs ��ü[�޸�] ������ �߿�! 
			// ������ �޸� �뷮 ���������� vs ��ü�� Ŭ������ �뷮�� ���� (scanner�� �����ϴ� �뷮��ŭ ��ü�� ���� ����) ������� ��ü�� next�� ����Ͽ� �ű�� �� ��ü �Է�
				// ���� [�ڷ���] vs ��ü [Ŭ����]
					// int ������ vs Ŭ������ ������ = new �����ڸ�();
					
		
		
		
		
		
		
		
	} // m e
} // c e
