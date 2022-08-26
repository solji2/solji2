package easyJava_0809;

class Calculator{
	int left,right;
	
	public void Calculator(int left,int right) {
		this.left=left;
		this.right=right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}

public class CalculatorDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.Calculator(10, 20);
		cal.sum();
		cal.avg();
		
		Calculator cal2 = new Calculator();
		cal.Calculator(20, 40);
		cal.sum();
		cal.avg();
	}

}
