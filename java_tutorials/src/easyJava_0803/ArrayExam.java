package easyJava_0803;

public class ArrayExam {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * //array를 배워보자 //변수가 여러개 필요할 때 사용 //예를 들어 학생 100명의 점수를 저장해야한다.당연 저장할 점수도
	 * 100개이니 이를 저장할 변수도 100개가 됨 //즉 배열은 데이터형이 같은 변수가 여러개 필요할 때 사용
	 * 
	 * //정수 100개를 저장할 수 있는 배열 선언 정수를 저장하므로 int형 변수 //배열을 생성할때 반드시 'new'라는 키워드를 사용
	 * int[] array1 = new int[100]; //배열에 값을 넣어줄 때는 배열의 이름과 배열표시인 대괄호 안에 인덱스(index)를
	 * 적어줘야 한다. array1[0] = 50; //배열 array1의 0번 인덱스에 50이라는 값을 담는다. array1[10] = 100;
	 * //배열 array1의 10번 인덱스에 100이라는 값을 담는다.
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		//배열을 선언하는 동시에 값까지 초기화할 수 있다.
		//배열 크기를 넣지 않고 곧바로 값을 담아준다.
		//정수값 4개를 담은 배열 생성
		//배열에 각각 1,2,3,4라는 정수값을 넣는다.
		int[] array2 = new int[]{1,2,3,4};
		//new라는 코드 없이 {1,2,3,4} 값을 넣어준다.
		int[] array3 = {1,2,3,4};
		
		int value = array3[1];
		System.out.println(value);
	}

}
