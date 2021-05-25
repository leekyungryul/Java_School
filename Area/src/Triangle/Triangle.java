package Triangle;

public class Triangle {
	double bottom;
	double height;
	Triangle(double bottom, double height){
		this.bottom = bottom;
		this.height = height;
	}
	public double Cal() {
		double result = (double) (bottom * height) / 2;
		return result;
	}
}
