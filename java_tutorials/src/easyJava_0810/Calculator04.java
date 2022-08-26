package easyJava_0810;

class Calculator3{
	public static void sum(int x,int y) {
		System.out.println(x+y);
	}
	public static void avg(int x,int y) {
		System.out.println((x+y)/2);
	}
}

public class Calculator04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
		
	}

}
