package easyJava_0811;

public class String1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hi,Java!";
		String s2 = "Hi,Java!";
		String s3 = new String ("Hi,Java!"); //새로운 문자열 객체를 생성해 String 타입의 s3변수를 초기화
		String s4 = new String ("Hi,Java!");
		//Strng타입의 s3,s4 변수는 내용은 같지만 생성자로 생성한 객체이기 다른 객체이다.
		
		
		System.out.println("s1 == s2 ->"+(s1==s2));//true s1과 s2문자열 객체가 동일한 객체를 가르키는지 조사
		System.out.println("s1 == s3 ->"+(s1==s3));//false
		System.out.println("s2 == s3 ->"+(s2==s3));//false
		System.out.println("s3 == s4 ->"+(s3==s4));//false
		
		s1=s3;
		System.out.println("s1 == s3 ->"+(s1==s3));//true
	}

}
