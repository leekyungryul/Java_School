import java.util.Scanner; //이아림class

public class Circle extends Base {

	double radius = 0;

	Circle(String name) {
		super(name); // 부모name
	}
	
	@Override
	public void inputData() {
		super.inputData();
		System.out.println("반지름을 입력해주세요.(값은 소수 둘째자리까지)(원주율:3.14로가정)");
		Scanner scanner = new Scanner(System.in);
		String userinputNum = scanner.nextLine();
		this.radius = Double.parseDouble(userinputNum);
	}
	
	@Override
	public void calcArea() {
		area = Math.round(this.radius * this.radius * (3.14) * 100) / (double) 100; // 소수점둘째자리까지나타내기.
		System.out.println("원넓이 : " + area);
	}
}
