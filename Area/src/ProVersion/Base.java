package ProVersion;

public class Base {
	double areaSize = 0;
	String name;

	Base(String name){
		this.name = name;
	}
	
	public void inputData() {
		System.out.println("----------" + name + "-----------");
	}
	
	public void calcArea() {
		
	}
	
	public void printSize() {
		this.calcArea();
		System.out.println(name + "의 크기는 "+this.areaSize + "cm");
	}
}
