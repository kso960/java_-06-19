package Day08;

public class �л� extends ��� {

	// �ʵ�
	int �г�;

	// ������
	// ������ ���콺 source => construct from superclass
	
	public �л�() {
		super();
		// TODO Auto-generated constructor stub
	}

	public �л�(String �̸�, int ����, int �г�) {
		super(�̸�, ����);
		this.�г� = �г�;
	}
	
	// �������̵� : �̸� �ۼ��� �޼ҵ带 �ٽ� ����
	@Override
	public void ����() {
		super.����();
		System.out.println("�л��� �̸� : " + this.�̸�);
	}
	
	
	
	
	
	
	
	
	
	
}
