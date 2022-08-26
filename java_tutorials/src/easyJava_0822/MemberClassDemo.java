//중첩 클래스의 사용-멤버클래스
//클래스의 멤버로서 선언되는 중첩 클래스
package easyJava_0822;

public class MemberClassDemo {//외부 클래스이다.
	private String Secret = "비공개";
	String s = "외부";
	
	class MemberClass{//내부 클래스이다.
		String s = "내부";
		
		public void show1() {
			System.out.println("내부 클래스");
			System.out.println(Secret);//외부 클래스의 private 멤버도 접근할 수 있다.
			System.out.println(s);//내부 클래스의 멤버 s를 의미
			System.out.println(MemberClassDemo.this.s);//외부 클래스의 멤버 s를 의미
		}
		//static String ss="정적 멤버 필드";  내부 클래스 내부에 정적 변수나 메서드를 포함할 수 없다.
		//static void show2() {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberClassDemo m = new MemberClassDemo();
		MemberClassDemo.MemberClass m1 = m.new MemberClass();//내부 클래스를 생성
		
		System.out.println(m1.s);
		m1.show1();
	}

}
