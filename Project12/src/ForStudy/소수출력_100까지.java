package ForStudy;

public class 소수출력_100까지 {

	public static void main(String[] args) {
		for(int j = 0 ; j < 100; j++) {
			int number = j + 1;
			if(number < 2) {
				continue;
			}
		boolean prime = true;
		for(int i = 0; i < number; i++) {
			if(i < 2) {
				continue;
			} 
			if(number % i ==0) {
				prime = false;
				break;
			} 

			}
		if(prime) {
			System.out.println(number+"is prime");
		} else {
			System.out.println(number + "is not prime");
		}
		
	}
	

	}
}


