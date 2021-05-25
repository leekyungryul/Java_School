public class Exec {
	public static void main(String[] args) {
		
		Base[] team1 = 
			{new Tria("삼각형"), new Rec("사각형"), new Circle("원"), 
					new Para("평행사변형"), new Trapezoid("사다리꼴")};
		
		//삼각형:배영현   사각형:이혜진   원:이아림   평행사변형:박영선   사다리꼴:송혁중   
		
		for (int i = 0; i < team1.length; i++) {
			team1[i].inputData();
			team1[i].printSize();
		}
	}
}