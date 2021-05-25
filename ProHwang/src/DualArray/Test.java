package DualArray;

public class Test {
    public static void main(String args[] ) {

    // 배열복사

    int array[] = { 1,2,3,4,5 };
    int copy[] = new int[5];

    System.arraycopy(array, 0, copy, 1, 4);

    for(int i =0;i<array.length;i++)
            System.out.print(array[i]);
    System.out.println();
    for(int i =0;i<copy.length;i++)
            System.out.print(copy[i]);
    }
}
