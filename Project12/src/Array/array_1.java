package Array;

import java.util.Arrays;

public class array_1 {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = arr1;
		//레퍼런스 참조
		//값을 가져오는것과 주소를 가져오는것은 다르다.
		//쓰지마라
		System.out.println(arr2[2]);
		arr2[2] = 10;
		
		System.out.println(arr1[2]);
		
		System.out.println(arr1);
		System.out.println(arr2);
		//주소값이 동일해 졌다.
		
		System.out.println(arr1[2]);
		int b1 = arr1[4];
		b1 = 10;
		
		//배열을 복사하고 싶을때는 특별한 방법을 쓰자
		int arr3[] = {1,2,3,4,5};
		int arr4[] = new int[arr3.length];
		//칸수를 동일하게 맞추어서 빈 배열을 만든다.
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		//복사하고 싶은 순서 (복사할 곳 시작인덱스, 붙여넣기 할 곳 시작인덱스,   )
		
		arr3[1] = 10;
		arr4[1] = 20;
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}

}
