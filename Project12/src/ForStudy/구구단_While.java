package ForStudy;

public class 구구단_While {

	public static void main(String[] args) {
		int number1 = 1;
		int i = 0;
		while(i<9) {
			int number2 = i + 1;
			int resultnumber = number1 + number2;
			System.out.println(""+number1+"X"+number2+"="+resultnumber);
			
			i++;
		}
	}

}
