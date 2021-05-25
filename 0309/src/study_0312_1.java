
public class study_0312_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		boolean r1 = a == 4;
		System.out.println(r1);

		r1 = a > 0;
		System.out.println(r1);
		
		r1 = a >= 10;
		System.out.println(r1);
		
		r1 = a != 2;
		System.out.println(r1);
		
		r1 = a > 10 && a == 20;
		System.out.println("a가 10보다 크고 20과 같다면 " +r1);
		
		r1 = a == 10 || a < 10;
		System.out.println(r1);
		
		r1 = true && true; // and연산자
		System.out.println(r1);
		
		r1 = false || false; // or연산자
		System.out.println(r1);
		
		r1 = !false; 
		System.out.println(r1);
	}

}
