package easyJava_0811;
//String Ŭ������ �޼��� ���
public class String3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hi,");
		String s2 = new String(" Java");
		
		System.out.println("���ڿ�����(s1): "+ s1.length());
		System.out.println(s1.charAt(1));//�ε����� ������ �� ��ȯ
		
		s1=s1.concat(s2);
		System.out.println(s1+"!");
		System.out.println(s1.concat(s2)+"!");
		System.out.println(s1.toLowerCase()+"!");
		System.out.println(s1.substring(4, 8)+"!");
		
		String s3 = " ";
		System.out.println(s3.isEmpty());//false ���̰�0�̸� true��ȯ
		System.out.println(s3.isBlank());//true ���̰�0�Ǵ� ������ ������ true��ȯ
		String s4 = "";
		System.out.println(s4.isEmpty());//true
		System.out.println(s4.isBlank());//true
		
		String s5 = "*-*";
		System.out.println(s5.repeat(10));
		System.out.println(s2.trim());
		System.out.println(s2.trim().indexOf("v"));
	}

}
