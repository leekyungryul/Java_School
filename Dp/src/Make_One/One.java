package Make_One;

import java.util.Scanner;

public class One {
//	숫자가 주어진다.
//	주어진 숫자는 -1,/2,/3,/5 만 사용가능하다.
//	최적의 사용으로 1을 만들어라
//	앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화 
    public static int[] d = new int[30001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
//        1번인덱스부터 입력을 시작할것이다.
//        1번인덱스값은 0으로 초기화해놓았다
//        그래서 2번부터 반복문을 셋팅했다.
        for (int i = 2; i <= x; i++) {
//          현재의 수에서 1을 빼는 경우
//        	d[i-1]이 이전숫자의 최적해라고 하면 1을 더하여 현재 숫자의 최적해값을 산출해서 d[i]에 대입한다.
            d[i] = d[i - 1] + 1;
            // 현재의 수가 2로 나누어 떨어지는 경우
//    		2로나누어 떨어지는 경우에는 이전숫자 최적해에 1을 더한 값과 2로나눈 몫의 최적해에 1을 더한값을 비교해서 작은 수를 최적해로 d[i]에 대입한다.
//          3,5도 동일한 방법이다.
            if (i % 2 == 0)
                d[i] = Math.min(d[i], d[i / 2] + 1);
//          현재의 수가 3으로 나누어 떨어지는 경우
            if (i % 3 == 0)
                d[i] = Math.min(d[i], d[i / 3] + 1);
//          현재의 수가 5로 나누어 떨어지는 경우
            if (i % 5 == 0)
                d[i] = Math.min(d[i], d[i / 5] + 1);
        }

        System.out.println(d[x]);
    }

}
