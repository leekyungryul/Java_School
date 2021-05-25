package Version2;

public class Class {

	public static void main(String[] args) {
		Kaup kaup = new Kaup();
		double height = kaup.Userinput1();
		double weight = kaup.Userinput2();
		kaup.calKaup(weight, height);
	}

}
