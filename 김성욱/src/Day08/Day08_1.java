package Day08;

public class Day08_1 { // c s

	// ����������
		// 1. ������ ��ȣ [ �ʵ� ��ȣ ]
		// 2. private �ʵ忡 ������ ��� => �޼ҵ� ���
			// get�޼ҵ�, set�޼ҵ�
	
	public int ���� = 10;
	protected int ����2 = 20;
	int ����3 = 30; // default
	private int ����4 = 40; // �Ϲ������� �ʵ�� ���Ȼ� private ���
	
	
	
	public static void main(String[] args) { // m s
		
		// public		: ������Ʈ�� �������� ���� ����
		// protected	: ������ ��Ű���������� ���� ����
						// ����Ŭ������ �ٸ���Ű���� �θ�Ŭ������ ������� ����
		// default[����]	: ������ ��Ű���������� ���� ����
		// private		: ���� Ŭ���������� ���� ����
		
		
		Day08_1 day08_1 = new Day08_1();
		
		System.out.println(day08_1.����);
		System.out.println(day08_1.����2);
		System.out.println(day08_1.����3);
		System.out.println(day08_1.����4);
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // m e
	
	
} // c e
