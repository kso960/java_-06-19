package Day07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Member {

	// �ʵ� [����]
	String ���̵�;
	String ��й�ȣ;
	String �̸�;
	int ����;
	String �̸���;
	int �޴���ȭ;
	int ����Ʈ;
	String ���;
	
	// ������
	// 1. �������
	public Member() {// crtl + space �� ���� �ϳ� ����� ����
	}
	// 2. ��ü �ʵ带 ���� ������
		// �����ʸ��콺 Ŭ�� => source => generate constructor using fields ( ������ Ȥ�� �޼ҵ� �ڵ��ϼ� )
	public Member(String ���̵�, String ��й�ȣ, String �̸�, int ����, String �̸���, int �޴���ȭ, int ����Ʈ, String ���) {
		this.���̵� = ���̵�;
		this.��й�ȣ = ��й�ȣ;
		this.�̸� = �̸�;
		this.���� = ����;
		this.�̸��� = �̸���;
		this.�޴���ȭ = �޴���ȭ;
		this.����Ʈ = ����Ʈ;
		this.��� = ���;
	}
	// 3. ȸ�����Խ� �ʼ��� ���� ������
	public Member(String ���̵�, String ��й�ȣ, String �̸�, int ����, int �޴���ȭ) {
		super();
		this.���̵� = ���̵�;
		this.��й�ȣ = ��й�ȣ;
		this.�̸� = �̸�;
		this.���� = ����;
		this.�޴���ȭ = �޴���ȭ;
		this.����Ʈ = 0;
		this.��� = "�Ϲ�";
	}
	
	// �޼ҵ� [ �ൿ ]
	// 1. ȸ������ �޼ҵ�
	public void ȸ������() {
		// �Է¹ޱ�
		System.out.println("[[[ ȸ������ ȭ�� ]]]");
		System.out.print(" ���̵� : "); String ���̵� = Day07_2_start.scanner.next();
			// ���̵� �ߺ�üũ
			for( int i = 0 ;  i<Day07_2_start.members.size() ; i++) {
				
				Member temp = Day07_2_start.members.get(i);
					// i ��° ȸ���� temp�� �ӽ� ����
				if(temp.���̵�.equals(���̵�)) {
					System.err.println("[���] ������ ���̵� �����մϴ�[�ڷΰ���]");
					return; // �޼ҵ����� : �޼ҵ� ��ȯ : ��ȯ ������ ���� (void ��)
				}
				
			}
		
		System.out.print(" ��й�ȣ : ");  String ��й�ȣ = Day07_2_start.scanner.next();
		System.out.print(" �̸� : ");  String �̸� = Day07_2_start.scanner.next();
		System.out.print(" ���� ����:1 ����:2 �̼���:0 "); int ���� = Day07_2_start.scanner.nextInt();
		System.out.print(" �޴���ȭ [-����] : ");  int �޴���ȭ = Day07_2_start.scanner.nextInt();
		
		// ��ü �����
		Member member = new Member(���̵�, ��й�ȣ, �̸�, ����, �޴���ȭ);
		// ����Ʈ Ȥ�� �迭 ����
		Day07_2_start.members.add(member);
		// ȸ������ ����
		System.out.println("[ȸ�����Լ���] : �������ּż� �����մϴ�");
		// ����ó��
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("c:/java/memberlist.txt");
			// ����Ʈ�� ��� ȸ���� ���Ͽ� ����
			// ����Ʈ�� for�� Ȱ��
			for( Member temp : Day07_2_start.members) { // 53��° ���� �ڵ�� ����
				// for(�ӽ� ��ü��: ����Ʈ�� ) : ����Ʈ�� ��� ��ü�� �ӽð�ü�� �ϳ��� ����
				// ȸ�������� �ϳ��� ���ڿ� ��ȯ [ �ʵ屸��, // ȸ��[��ü]���� \n ]
				String ȸ������ = temp.���̵�+","+temp.��й�ȣ+","+temp.�̸�+
						","+temp.����+","+temp.�̸���+","+temp.����Ʈ+
						","+temp.�޴���ȭ+","+temp.���+"\n";
				
				fileOutputStream.write(ȸ������.getBytes());
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	// 2. �α��� �޼ҵ�
	public void �α���() {
		
	}
	
	// 3. ���̵� ã�� �޼ҵ�
	public void ���̵�ã��() {
		
	}
	
	// 4. ��й�ȣ ã�� �޼ҵ�
	public void ��й�ȣã��() {
		
	}
	
	// 5. ����Ʈ ���� �޼ҵ�
	public void ����Ʈ����() {
		
	}
	
	// 6. ��� ���� �޼ҵ�
	public void �������() {
		
	}
	
	// 7. ȸ�� Ż�� �޼ҵ�
	public void ȸ��Ż��() {
		
	}
	
	// 8. ȸ�� ���� �޼ҵ�
	public void ȸ������() {
		
	}
	
	
	
	
	
	
	
}
