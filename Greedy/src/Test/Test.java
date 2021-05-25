package Test;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception{
		Scanner s = new Scanner(System.in);
		System.out.println("반수를 입력하세요");
		int n = s.nextInt();
		int [] test = new int [n];
		int remain;
		int sum = 0;
		for(int i = 0; i < test.length; i++) {
			test[i] = s.nextInt();
		}
		int master = s.nextInt();
		int minor = s.nextInt();
		for(int i = 0; i < test.length; i++) {
			sum++;
			remain = test[i] - master;
			if(remain > 0) {
				int remain2 = remain / minor;
				int remain3 = remain % minor;
				if(remain2 > 0) {
					sum = sum + remain2;
					if(remain3 > 0) {
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}

}
