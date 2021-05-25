public class ExecClass {
	public static void main(String[] args) {
		Base[] shape = { new Triangle("삼각형"), new Square("사각형"), new Parallelogram("마름모"), new Circle("원") };

		for (int i = 0; i < shape.length; i++) {
			shape[i].inputData();
			shape[i].printSize();
		}
	}
}
