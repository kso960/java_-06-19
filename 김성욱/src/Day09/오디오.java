package Day09;

public class ����� implements ������{ // c s

	// �ʵ�
	int ���� = 0;
	
	@Override
	public void ����() {
		System.out.println("����� ����");
		
	}
	@Override
	public void ����() {
		System.out.println("����� ����");
		
	}
	@Override
	public void ��������(int ����) {

		if(���� > ������.�ִ����) {
			���� = ������.�ִ����;
		}else if(���� < ������.�ּҼ���) {
			���� = ������.�ּҼ���;
		}else {
			this.���� = ����;
		}
		System.out.println("���� ���� : " + ����);
	}
	
	
	
} // c e
