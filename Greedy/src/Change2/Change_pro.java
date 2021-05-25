package Change2;

import java.util.Scanner;

public class Change_pro {
	public static void main(String[] args) {
//		두가지의 주화로 최대한 잔돈이 안생기도록 거스름돈을 돌려주는 방법
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); 
        int numberOfCoin = 0;
        
        if(input % 5 == 0) {
            System.out.println(input / 5);
        } else {
            while(true) {
                
                if(input < 0) {
                    System.out.println(-1);
                    break;
                }
                
                if(input == 0) {
                    System.out.println(numberOfCoin);
                    break;
                }
                
                input -= 2;
                numberOfCoin++;
                
                if(input % 5 == 0) {
                    numberOfCoin += input / 5;
                    System.out.println(numberOfCoin);
                    break;
                }
            }
        }
        
        sc.close();
    }
}