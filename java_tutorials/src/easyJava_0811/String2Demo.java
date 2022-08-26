package easyJava_0811;

public class String2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hi,Java!";
		String s2 = new String("Hi,Java");
		String s3 = "Hi,Code!";
		String s4 = "Hi,java!";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//false
		System.out.println(s1.equalsIgnoreCase(s4));//true
		
		System.out.println(s1.compareTo(s3));//문자열을 사전 순으로 비교해 정숫값으로 출력 J-C
		System.out.println(s1.compareToIgnoreCase(s4));//대소문자 무시하고 문자열을 사전순으로 비교
		
		System.out.println(s3.compareTo(s4));//c-j값
		System.out.println("Hi,Java".compareToIgnoreCase("hi,java"));
	}

}
