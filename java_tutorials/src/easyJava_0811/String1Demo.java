package easyJava_0811;

public class String1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hi,Java!";
		String s2 = "Hi,Java!";
		String s3 = new String ("Hi,Java!"); //���ο� ���ڿ� ��ü�� ������ String Ÿ���� s3������ �ʱ�ȭ
		String s4 = new String ("Hi,Java!");
		//StrngŸ���� s3,s4 ������ ������ ������ �����ڷ� ������ ��ü�̱� �ٸ� ��ü�̴�.
		
		
		System.out.println("s1 == s2 ->"+(s1==s2));//true s1�� s2���ڿ� ��ü�� ������ ��ü�� ����Ű���� ����
		System.out.println("s1 == s3 ->"+(s1==s3));//false
		System.out.println("s2 == s3 ->"+(s2==s3));//false
		System.out.println("s3 == s4 ->"+(s3==s4));//false
		
		s1=s3;
		System.out.println("s1 == s3 ->"+(s1==s3));//true
	}

}
