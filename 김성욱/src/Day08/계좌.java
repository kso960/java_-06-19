package Day08;

// ����Ŭ����

public class ���� {
	
	//�ʵ�
	
	private String ���¹�ȣ; // ������ ��ȣ : private ���
	private int ��й�ȣ;
	private String ������;
	private int �ݾ�;
	
	
	// ������
	
	public ����() {} // ���뵵 ����°� ����

	public ����(String ���¹�ȣ, int ��й�ȣ, String ������, int �ݾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.�ݾ� = �ݾ�;
	}
	
	public ����(String ���¹�ȣ, int ��й�ȣ, String ������) {
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.�ݾ� = 0;
	}
	
	// �޼ҵ�
	
	// 0. get , set �޼ҵ�  => private������ �����
	public String get���¹�ȣ() {
		return this.���¹�ȣ;
	}
	public int get��й�ȣ() {
		return this.��й�ȣ;
	}
	public void �Ա�ó��(int �Աݾ�) {
		this.�ݾ� += �Աݾ�;
		System.err.println("\n[[[ [�Ϸ�] �Ա�ó���� �Ǿ����ϴ�");
	}
	public void ���ó��(int ��ݾ�) {
		
		if( this.�ݾ� < ��ݾ�) {
			System.err.println(" \n[[[ [����] ���ݾ��� �����մϴ�");
			return;
		}
		
		this.�ݾ� -= ��ݾ�;
		System.err.println("\n[[[ [�Ϸ�] ���ó���� �Ǿ����ϴ�");
	}
	
	
	
	// 1. ���µ�� �޼ҵ�
	public void ���µ��( ) {
		System.out.println("[[[ ���� ��� ȭ�� ]]]");
		System.out.println(" [[[���¹�ȣ : "); String ���¹�ȣ = Day08_7.scanner.next();
		System.out.println(" [[[��й�ȣ : "); int ��й�ȣ = Day08_7.scanner.nextInt();
		System.out.println(" [[[������ : "); String ������ = Day08_7.scanner.next();
		
		
		// ��ü����
		���� ���� = new ����(���¹�ȣ,��й�ȣ,������);
		//����Ʈ ���
		Day08_7.���¸��.add(����);
	}
	
	// 2. �Ա� �޼ҵ�
	public void �Ա�() {
		System.out.println("[[[ �Ա� ��� ȭ�� ]]]");
		System.out.println(" [[[���¹�ȣ : "); String ���¹�ȣ = Day08_7.scanner.next();
		System.out.println(" [[[��й�ȣ : "); int ��й�ȣ = Day08_7.scanner.nextInt();
		System.out.println(" [[[�Աݾ� : "); int �Աݾ� = Day08_7.scanner.nextInt();
		
		for( ���� temp : Day08_7.���¸��) {
			if( temp.get���¹�ȣ().equals(���¹�ȣ) && temp.get��й�ȣ() == ��й�ȣ) {
				
			temp.�Ա�ó��(�Աݾ�);
				return;
			}
		}
		System.err.println("\n[[[ [����] ������ ���¹�ȣ Ȥ�� ��й�ȣ�� �ٸ��ϴ�");
	}

	// 3. ��� �޼ҵ�
	
	public void ���() {
		System.out.println("[[[ ��� ��� ȭ�� ]]]");
		System.out.println(" [[[���¹�ȣ : "); String ���¹�ȣ = Day08_7.scanner.next();
		System.out.println(" [[[��й�ȣ : "); int ��й�ȣ = Day08_7.scanner.nextInt();
		System.out.println(" [[[��ݾ� : "); int ��ݾ� = Day08_7.scanner.nextInt();
		
		for( ���� temp : Day08_7.���¸��) {
			if( temp.get���¹�ȣ().equals(���¹�ȣ) && temp.get��й�ȣ() == ��й�ȣ) {
				
			temp.���ó��(��ݾ�);
			return;
				
			}
		}
		System.err.println("\n[[[ [����] ������ ���¹�ȣ Ȥ�� ��й�ȣ�� �ٸ��ϴ�");
	}
	
	// 4. ��ü �޼ҵ�
	
	public void ��ü() {
		System.out.println("[[[ ��ü ȭ�� ]]]");
		System.out.println(" [[[���¹�ȣ : "); String ���¹�ȣ = Day08_7.scanner.next();
		System.out.println(" [[[��й�ȣ : "); int ��й�ȣ = Day08_7.scanner.nextInt();
		
		for( ���� temp : Day08_7.���¸��) {
			if( temp.get���¹�ȣ().equals(���¹�ȣ) && temp.get��й�ȣ() == ��й�ȣ) {
		
				System.out.println(" [[[��ü�ݾ� : "); 
					int ��ü�ݾ� = Day08_7.scanner.nextInt();
		
					if( temp.�ݾ� < ��ü�ݾ�) {
						System.err.println("\n[[[ [����] ���ݾ��� �����մϴ�]]]");
						return;
				}
					System.out.println("[[[�޴»�� ���¹�ȣ]]]");
					String ���¹�ȣ2 = Day08_7.scanner.next();
			//
					for(���� temp2 : Day08_7.���¸��) {
						if(temp2.���¹�ȣ.equals(���¹�ȣ2)) {
							System.out.println("[[[ [Ȯ��] : �޴»���� : ]]] :" + temp2.������);
							temp2.�ݾ� += ��ü�ݾ�;
							System.out.println("\n[[[ [��ü] ��üó���� �Ǿ����ϴ� ]]]");
				}	
			}
					System.err.println("\n[[ [����] �޴»�� ���¹�ȣ�� �����ϴ�]]");
	}
		}
		}
}
