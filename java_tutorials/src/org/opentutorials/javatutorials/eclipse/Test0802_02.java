package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;

public class Test0802_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("���� �����ݾ�-->");
		int charge = in.nextInt();
		System.out.println(charge+"���� �����Ǿ���");
		
		int busCharge1 = 1250;
		
		for(int i =1; i<=5; i++) {
			int busCharge2 = charge - (1250*i);
			//System.out.println(busCharge2);
			System.out.println(i+"ȸ ����� �� ���� �ܾ���"+busCharge2);
			if(charge - (1250*i)==0) {
				break;
			}
		}
	}

}
