package easyJava_0809;

class Ccalculator{
	static double PI = 3.14;
	//Ŭ���� ������ base�� �߰��Ǿ���.
	static int base = 0;
	int left;
	int right;
	
	public void calculator(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right+base);
	}
	
	public void avg() {
		System.out.println((this.left+this.right+base)/2);
	}
}

public class CalculatorDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ccalculator c1 = new Ccalculator();
		c1.calculator(10, 20);
		c1.sum();
		
		Ccalculator c2 = new Ccalculator();
		c2.calculator(20, 40);
		c2.sum();
		
		//Ŭ���� ���� base�� ���� 10���� ����
		Ccalculator.base = 10;
		
		c1.sum();
		c2.sum();
	}

}
