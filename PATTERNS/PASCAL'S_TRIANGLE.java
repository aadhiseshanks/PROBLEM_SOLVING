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
        int numRows = sc.nextInt();
        int triangle[][] = new int[numRows][];
        for(int i=0; i<numRows; i++) {
            triangle[i] = new int[i+1];
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) {
                    triangle[i][j] = 1;
                }
                else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }
        for(int i=0; i<numRows; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(triangle[i][j]+" ");
            }
            System.out.println();
        }
    }
}
