package easyJava_0815;
//������ǰ ����� �������̽�
public interface Controllerable {
	
	//default�޼���� �������̽��� ��������� ���� �޼���� 'default ��ȯŸ�� ����Ʈ�޼����̸�' �̷��� �����Ѵ�.
	default void repair() {//����Ʈ �޼����̴�.
		show("��� �����Ѵ�.");
	}
	static void reset() {//���� �޼����̴�.
		System.out.println("��� �ʱ�ȭ�Ѵ�.");
	}
		

	private void show(String s) {//�ַ� ����� �޼���
		System.out.println(s);
	}
	//�߻�޼����̴�.
	void turnOn();
	void turnOff();
}
