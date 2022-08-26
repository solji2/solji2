package easyJava_0809;

public class CalculatorDemo {
	
	public static void avg(int left, int right) {
		System.out.println((left + right)/2);
	}
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//연관,반복 소스가 길어지고 복잡해지므로 버그가 많이 생긴다
		//이럴 때 객체화 시켜야 한다.
		int left,right;
		
		left = 10;
		right = 20;
		
		sum(left,right);
		avg(left,right);
		
		left = 20;
		right = 40;
		
		sum(left,right);
		avg(left,right);
	}

}
