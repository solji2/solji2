package org.opentutorials.javatutorials.eclipse;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("근무시간을 입력하시오~~>");
		//근무시간 입력
		double workTime = in.nextInt();
		//필요한 컴퓨터 수량 계산
		double comCnt = 24/workTime;
		//System.out.println(comCnt);
		//필요한 컴퓨터 수량 출력
		System.out.println("필요한 컴퓨터 수량은"+ comCnt);
	}

}
