// Sample Input:
// 5
// Sample Output:
// 1  2  3  4  5
// 16 17 18 19 6
// 15 24 25 20 7
// 14 23 22 21 8
// 13 12 11 10 9

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        int i=0, j=0, row=0, col=0, s=size, row1=s-1, col1=s-1;
        int num = 1;
        while(num <= s*s) {
            for(j=col; j<=col1; j++) {
                arr[row][j] = num;
                num++;
            }
            
            row++;
            for(i=row; i<=row1; i++) {
                arr[i][col1] = num;
                num++;
            }
            
            col1--;
            for(j=col1; j>=col; j--) {
                arr[row1][j] = num;
                num++;
            }
            
            row1--;
            for(i=row1; i>=row; i--) {
                arr[i][col] = num;
                num++;
            }
            col++;
        }
        for(i=0; i<size; i++) {
            for(j=0; j<size; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
