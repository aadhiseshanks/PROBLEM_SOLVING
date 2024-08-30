// Sample Input:
// 4
// Sample Output:
// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

import java.util.*;
class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 4
        int size = n*2-1; // 7
        int first = 0, last = size-1;
        int a[][] = new int[50][50];
        while(n!=0) {
            for(int i=first; i<=last; i++) {
                for(int j=first; j<=last; j++) {
                    if(i==first || i==last || j==first || j==last) {
                        a[i][j] = n;
                    }
                }
            }
            first++;
            last--;
            n--;
        }
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
