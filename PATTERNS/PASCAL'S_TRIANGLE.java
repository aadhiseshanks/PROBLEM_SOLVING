// Leetcode - 118
// Example 1:
// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]


// Example 2:
// Input: numRows = 1
// Output: [[1]]

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[][] = new int[num][];
        for(int i=0; i<num; i++) {
            arr[i] = new int[i+1];
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) {
                    arr[i][j] = 1;
                }
                else arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        for(int i=0; i<num; i++) {
            for(int j=0; j<num-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
