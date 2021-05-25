package DualArray;

public class Quize_pro {

	public static void main(String[] args) {
		int arr[][] = {{10,33,44},{27,5,98}};
		String name = "";
		
		System.out.println("  Name        quiz1   quiz2   quize3   sum    Avg");
		System.out.println("-------------------------------------------------");
		
		for(int i = 0; i < arr.length; i ++) {
			name = (i == 0) ? "Student1" : "Student2";
			System.out.print(" " + name + "       ");
			for(int j = 0; j < arr[i].length; j++) {
				int tempN = arr[i].length;
				System.out.print(arr[i][j]+"      ");
				if(j == arr[i].length-1) {
					int sum = 0;
					float avg = 0.0f;
					for(int k = 0; k < arr[i].length; k++) {
						sum += arr[i][k];
					}
					avg = (float) sum / tempN;
					System.out.print(sum + "   " + String.format("%.1f", avg));
				}
			}
			System.out.println();
				
			}
			
		}
		}

