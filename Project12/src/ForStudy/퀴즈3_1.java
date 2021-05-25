package ForStudy;

public class 퀴즈3_1 {

	public static void main(String[] args) {
		int total = 0;
		int eventotal = 0;
		int oddtotal = 0;
		for(int i = 0; i < 100; i++) {
			int number = i + 1;
			total = total + number;
			if (number % 2 == 0) {
				eventotal = eventotal + number;
			} else {
				oddtotal = oddtotal + number;
			}
		}
		System.out.println(total);
		System.out.println(eventotal);
		System.out.println(oddtotal);
	}

}
