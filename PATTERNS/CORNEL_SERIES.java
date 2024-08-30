// Sample Input:
// 5
// Sample Output:
// 1
// 2 4
// 5 7 9
// 10 12 14 16
// 17 19 21 23 25

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int start = 1;
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(start+ " ");
                start += 2;
            }
            start--;
            System.out.println();
        }


    }
}
