package Array;

import java.util.Arrays;
import java.util.Random;

public class Homework_0319_선택정렬 {
	/*- 선택정렬에서 두개(i,j)의 값을 비교 후 결과에 따라 숫자가 작은 값을 앞쪽으로 변경하기 위하여 함수를 만들었습니다.
	  -아래 main 메소드에서 생성하여 실행 할 수도 있으나 swap이라는 이름의 메소드를 미리 생성해놓았습니다.
	  - 배열의 이름,변경하고자하는 배열의 인덱스 번호가 입력될 수 있도록 세개의 매개변수를 생성하였습니다.*/
	public static void swap(int[] array, int first, int second) {
		/*1.temp라는 변수에 첫번째 인덱스 값을 담아놓고
		  2.첫번째 인덱스 값을 두번째 인덱스 값으로 변경하고 
		  3.두번째 인덱스 값에는 temp에 담아놓은 값으로 변경합니다.*/
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
	public static void main(String[] args) {
		//랜덤한 숫자를 출력하기 위하여 Random 객체를 생성해서 r1이라는 이름의 인스턴스를 하나 생성했습니다.
		Random r1 = new Random();
		//정수형태의 원소(element)를 30개 가질수 있는 배열을 하나 생성했습니다.
		int[] numbers = new int[10];
		//생성한 배열의 길이만큼 숫자의 원소를 담기 위하여 for문을 생성하였습니다.
		for(int i = 0; i < numbers.length; i++) {
			/*앞서 생성한 r1이라는 이름의 인스턴스에서 nextInt메소드를 실행하여
			  for문에 의해 배열의 각 원소에 index순번대로 하나씩 추가합니다.
			  (1~1000까지의 숫자범위에서 입력되도록 하였습니다.)*/
			numbers[i] = r1.nextInt(100);
			System.out.println(Arrays.toString(numbers));
			for(int j=0; j<i; j++) {
		          if (numbers[i]==numbers[j]) {
		        	  System.out.print(i);
		        	  System.out.println(j);
		             i--;
		          }
		       }
		}		
		//구분을 위하여 "최초 배열목록입니다." 라는 문자열을 출력하였습니다.
		System.out.println("정렬하기 전 배열목록입니다.");
		//위에서 랜덤하게 생성한 정수형태의 원소를 30개 가진 numbers라는 이름의 배열을 출력하였습니다.
		System.out.println(Arrays.toString(numbers));
		/*선택정렬을 위하여 이중for문을 생성하였습니다.
		  - 첫번째 for문에는 i값이 비교 기준이 되어야 하므로 0부터 시작하였으며 
		  - 두번째 for문에는 앞서 비교한 i 값과 중복해서 비교되지 않도록 시작값은 j = i라고 적용했습니다.*/
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				//만약 비교하고자하는 첫번째 값이 두번째 값보다 크다면
				if(numbers[i]>numbers[j]) {
					//앞서 정의해 놓은 swap함수를 이용해서 변경합니다.
					swap(numbers,i,j);
				}
			}
		}		
		//구분을 위하여 "최종 배열목록입니다." 라는 문자열을 출력하였습니다.
		System.out.println("오름차순 정렬한 배열목록입니다.");
		//랜덤하게 생성한 정수형태의 원소를 30개 가진 numbers라는 이름의 배열을 오름차순으로 정렬하여 출력하였습니다.
		System.out.println(Arrays.toString(numbers));
	}

}