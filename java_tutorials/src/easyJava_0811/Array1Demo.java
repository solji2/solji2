package easyJava_0811;

import java.util.Scanner;

//�迭�� ������ �Է��ϰ� ��� ���
public class Array1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		//������ �����ϰ� ���ÿ� 5���� ���Ҹ����� ��ü�� ����
		int scores[] = new int[5];
		int sum=0;
		
		for (int i = 0; i < scores.length; i++) 
			scores[i]=in.nextInt();
		for (int i = 0; i < scores.length; i++) {
			sum+= scores[i];
		}
		System.out.println("���"+sum/5.0);
		
	}

}
