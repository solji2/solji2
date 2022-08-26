package easyJava_0810;
//정적 블록 활용

public class OneToTenDemo {
	
	static int sumOneToTen;
	static {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum+=i;
			sumOneToTen = sum;
			//System.out.println(sumOneToTen);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(OneToTenDemo.sumOneToTen);
	}

}
