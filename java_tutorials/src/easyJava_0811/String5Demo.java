package easyJava_0811;
//String 클래스의 정적 메서드 이용
public class String5Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version = String.format("%s%d", "JDK",14);//주어진 포맷에 맞춘 문자열을 반환
		System.out.println(version);
		
		String fruits = String.join("-","apple", "banana","cherry","durian");
		//주어진 구분자와 연결한 문자열을 반환
		System.out.println(fruits);
		
		String pi = String.valueOf(3.14);
		System.out.println(pi);
	}

}
