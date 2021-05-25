import java.util.Scanner;
public class first3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("화면에 숫자를 입력하세요!");
		int a = 0; //변수를 초기화 시켜주기 위해(누군가 다른값을 주입시켜놓았을 경우를 방지)
		
		Scanner s = new Scanner(System.in);
		a= s.nextInt();
		
		System.out.println("당신이 입력한 숫자는"+a);
	}

}
