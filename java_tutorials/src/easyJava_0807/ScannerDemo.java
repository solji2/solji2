package easyJava_0807;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int i = sc.nextInt();
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
	}

}
