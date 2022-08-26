package easyJava_0811;
//다차원 배열 평균 이자율 계산
public class Array2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2개의 대괄호는 2차원 배열 표시
		//int[3]행의개수
		//int[5]열의개수
		int[][]scores = new int[3][5];
		
		//3행4열인 double타입의 2차원 배열
		double[][] intersts = {{3.2,3.1,3.2,3.0},{2.9,2.8,2.7,2.6},{2.7,2.6,2.5,2.7}};
		double[] sum1 = {0.0,0.0,0.0};
		double sum2 = 0.0;
		
		for (int i = 0; i < intersts.length; i++) {
			for (int j = 0; j < intersts.length; j++) {
				System.out.println(j);
			}
			
		}
 	}

}
