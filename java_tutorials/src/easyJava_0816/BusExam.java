package easyJava_0816;

public class BusExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus("∂Ÿ∂Ÿ",3000,1050);
		if(bus.name != "∂Ÿ∂Ÿ" ) {
			System.out.println("bus¿« name¿Ã ¥Ÿ∏®¥œ¥Ÿ.");
		}
		else if(bus.number != 3000) {
			System.out.println("bus¿« number∞° ¥Ÿ∏®¥œ¥Ÿ.");
		}
		else if(bus.fee != 1050) {
			System.out.println("bus¿« fee∞° ¥Ÿ∏®¥œ¥Ÿ.");
		}
		else {
			System.out.println("¡§¥‰¿‘¥œ¥Ÿ.");
		}
	}

}
