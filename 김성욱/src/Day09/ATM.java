package Day09;


public interface ATM {
	
	// �ʵ�
	
	// �߻�޼ҵ�
	public void �޴�(); // void -> ��ȯŸ�� ����
	public void ���µ��();
	public void ����();
	public void ���();
	public void ��ü();
	public void �ܰ�();
	
	// ����Ʈ�޼ҵ�
	public default void ����() {
		System.out.println(" [����] ATM �����մϴ�");
	}
	
}
