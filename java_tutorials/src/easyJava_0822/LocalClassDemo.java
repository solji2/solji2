//중첩클래스 - 지역 클래스의 사용
//생성자 또는 메소드 내부에서 선언되는 중첩 클래스
//생성자 또는 메소드가 실행할 때만 사용
package easyJava_0822;

public class LocalClassDemo {
	private String s1 = "외부";
	
	void method() {
		int x = 1;
		class LocalClass{//지역 클래스이다.
			String s2 = "내부";
			String s3 = "s1";//외부 클래스의 private 멤버도 접근 할 수 있다.
			
			public void show() {
				System.out.println("지역 클래스");
				//x=2; //x는 method()메서드 내부에서 선언된 지역변수이다.
						//지역 변수는 사실상 final이므로 수정 할 수 없다.
			}
		}
		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalClassDemo lcd = new LocalClassDemo();
		lcd.method();
	}

}
