package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;

public class Test0802_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("최초 충전금액-->");
		int charge = in.nextInt();
		System.out.println(charge+"원이 충전되었음");
		
		int busCharge1 = 1250;
		
		for(int i =1; i<=5; i++) {
			int busCharge2 = charge - (1250*i);
			//System.out.println(busCharge2);
			System.out.println(i+"회 사용한 후 현재 잔액은"+busCharge2);
			if(charge - (1250*i)==0) {
				break;
			}
		}
	}

}
