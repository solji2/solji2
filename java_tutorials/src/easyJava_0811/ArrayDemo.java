package easyJava_0811;
//5���� ��� ���� ���ϱ�
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���1
		int[] score = {100,90,50,95,85};
		//�迭 ������ ������ �� �迭�� �ʱ�ȭ�� ���� �ݵ�� new �����ڷ� ��ü�� �����ؾ��Ѵ�.
		//���2
		int[] scores = new int[] {100,90,50,95,85};
		//���3
		int[]scoress;
		scoress = new int[] {100,90,50,95,85};
		
		int sum = 0;
		
		for(int i=0;i<5;i++) {
			sum+= score[i];
		}
		double avg = sum/5.0;
		System.out.println(avg);
	}

}
