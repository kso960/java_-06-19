package Day08;

import java.util.ArrayList;
import java.util.Scanner;

/*
 ���� Ŭ�������� ��ӹ޾� 2���� ����Ŭ���� ����
 
 *Ŭ����
 		���� [ ����Ŭ���� ]
 			�ʵ�: ���¹�ȣ, ��й�ȣ, ������, �ݾ�
 			������:
 			�޼ҵ� : ���»��� �Ա� ��� ��ü ����ã��
 		�������� [ ����Ŭ���� ]
 			�����ڵ�[ final ]
 		�������� [ ����Ŭ���� ]
 			�����ڵ�[ final ]
 			
 * ��� ������ ���¸� �����ϴ� ����Ʈ
 				
 ATM��
 1. �޴�
 			1. ���»���
 				���༱��, ���¹�ȣ, ��й�ȣ, ������ �Է¹ޱ�
 			2. �Ա�
 				���¹�ȣ, ��й�ȣ, �Աݾ�
 			3. ���
 				���¹�ȣ, ��й�ȣ, �Աݾ�
 			4. ������ü
 				���¹�ȣ, ��й�ȣ, ��ü�ݾ�, ������� ���¹�ȣ
 			5. ����ã��
 				������
 			6. ����
 */

// ����ó������ �غ���

public class Day08_7 { // c s
	
	// main �ۿ� �ۼ��� ���� : main �ܿ����� ���[ȣ��] �ϱ� ����
	public static Scanner scanner = new Scanner(System.in);
		// static : main �޸� �켱�Ҵ� : ��������
	public static ArrayList<����> ���¸�� = new ArrayList<>();
	
	
	public static void main(String[] args) { // m s
		start();
		
		
	} // m e
	
	
	public static void start() {
		
		while(true) {
			System.out.println("[[[ ATM ]]]");
			System.out.println("[[[ 1.���»��� 2.�Ա� 3.��� 4.��ü 5.����ã�� 6.����");
			int ���� = scanner.nextInt();
			if( ���� == 1 ) {
				
				System.out.println("[[1.�������� 2.�������� ]] :");
				int ����2 = scanner.nextInt();
				if( ����2 == 1 ) {
					�������� �������� = new ��������();
					��������.���µ��();
					
					
				}
				
			}
			else if( ���� == 2) {
				
			
				System.out.println("[[1.�������� 2.�������� ]] :");
				int ����2 = scanner.nextInt();
				if( ����2 == 1 ) {
					�������� �������� = new ��������();
					��������.�Ա�();
				}	
				
			}
			else if( ���� == 3) {
				System.out.println("[[1.�������� 2.�������� ]] :");
				int ����2 = scanner.nextInt();
				if( ����2 == 1 ) {
					�������� �������� = new ��������();
					��������.���();
				}	
			}
			else if( ���� == 4) {}
			else if( ���� == 5) {}
			else if( ���� == 6) {
				System.err.println("[[[ [����] �̿����ּż� �����մϴ� ");
				break;
			}
			else {
				System.out.println("[[[ [���] �˼����� ��ȣ�Դϴ�. ");
			}
			
		}
		
		
		
	}

} // c e
