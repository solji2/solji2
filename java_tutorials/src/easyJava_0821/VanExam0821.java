package easyJava_0821;

public class VanExam0821 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car0821 c = new Van0821();
		c.run();
		
		//error : �θ�Ÿ������ �ڽ��� ����ų ���� ������ �θ�Ÿ������ �ڽ��� ������������ �θ��� �޼��常 ����� �� �ִ�.
		//c.ppangppang();
		//����ȯ
		//����ȯ �̴� : �θ� �ڽ��� ����ų �� ������ �θ� ����Ű�� �������� �θ� �˰� �ִ� �޼�������� ���� �� �� �ֱ⿡
		//�� �� ����ȯ���� ��� �޼��带 �� ����� �� �ִ�.
		Van0821 van = (Van0821)c;
		van.run();
		van.ppangppang();
		
	}

}
