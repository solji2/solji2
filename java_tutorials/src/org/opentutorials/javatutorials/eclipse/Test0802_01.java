package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;

public class Test0802_01 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");
		
		int i;
		int j;
		int k;
		//int num =13;
		int num = in.nextInt();

		for(i=0; i<num; i++) {
			for(j=1; j<=num-i;j++) {
				System.out.print(" ");
			}
			for(k=0; k<=i*2+1;k++) {
				System.out.print(i%10);
				//System.out.print(" ");
			}
			System.out.println();
		}

	}

}
