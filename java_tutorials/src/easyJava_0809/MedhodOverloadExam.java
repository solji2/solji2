package easyJava_0809;

class MyClass2{
	//�Ȱ��� �̸����� �޼��带 3���� ������� �̷��� �ϴ°��� �޼��� �����ε��̶���Ѵ�.
	public int plus(int x,int y) {
		return x+y;
	}
	public int plus(int x,int y,int z) {
		return x+y+z;
	}
	public String plus(String x,String y) {
		return x+y;
	}
}

public class MedhodOverloadExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass2 m = new MyClass2();
		System.out.println(m.plus(4, 5));
		System.out.println(m.plus(4, 6, 7));
		System.out.println(m.plus("Hello", "World"));
		//����� ���� ������ �Ű������� ������ �ڷ����� �ٸ��ٸ� �Ȱ��� �޼��带 ������ ����� �� �ֽ��ϴ�.
		//�̰��� �����ε��̶���Ѵ�.
	
	}

}
