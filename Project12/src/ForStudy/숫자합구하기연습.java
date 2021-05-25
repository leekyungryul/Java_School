package ForStudy;

public class 숫자합구하기연습 {

	public static void main(String[] args) {
		int total = 0;
		int eventotal = 0;
		int oddtotal = 0;
		
		for(int i = 0; i<10; i++) {
			int a = i + 1;
			total = a + total;
			if(a % 2 == 0) {
				eventotal = eventotal + a;
			} if(a % 2 == 1) {
				oddtotal = oddtotal + a;
			} 
		}System.out.println(total +"+"+eventotal+"+"+oddtotal);
	}

}
