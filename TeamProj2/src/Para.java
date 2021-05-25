import java.util.Scanner; //박영선 class

public class Para extends Base {
	double width = 0;
	double height = 0;
	
	Para(String name) {
		super(name);
	}
	
	@Override
	public void inputData() {
		super.inputData();
		Scanner scanner = new Scanner(System.in);
		System.out.println("밑변을 입력해주세요.");
		String inputText = scanner.nextLine();
		this.width = Double.parseDouble(inputText);
		System.out.println("높이를 입력해주세요.");
		inputText = scanner.nextLine();
		this.height = Double.parseDouble(inputText);
	}
	
	@Override
	public void calcArea() {
		this.area = this.width * this.height;
	}
}