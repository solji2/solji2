package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;

public class Test05 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�~~>");
		//���� �Է�
		int score = in.nextInt();
		//�Է��� ���� ���
		//80�� �̻��̸� �� ������
		if(score>=80){
			System.out.println("�� ������");
		}
		else{
			System.out.println("���� �б⿡ �ٽ� ������!");
		}
		
	}

}
