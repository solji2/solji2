package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("�ٹ��ð��� �Է��Ͻÿ�~~>");
		//�ٹ��ð� �Է�
		double workTime = in.nextInt();
		//�ʿ��� ��ǻ�� ���� ���
		double comCnt = 24/workTime;
		//System.out.println(comCnt);
		//�ʿ��� ��ǻ�� ���� ���
		System.out.println("�ʿ��� ��ǻ�� ������"+ comCnt);
	}

}
