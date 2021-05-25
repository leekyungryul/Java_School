public class Base {
	double area = 0;   
	String name;         

	Base(String name) {   
		this.name = name;
	}

	public void inputData() {
		System.out.println();
		System.out.println("★☆★☆★☆ " + "계산할 도형은:" + this.name + " ★☆★☆★☆");
	}

	public void calcArea() {

	}

	public void printSize() {
		this.calcArea();
		System.out.println(name + "의 넓이는 " + this.area);
	}
}
