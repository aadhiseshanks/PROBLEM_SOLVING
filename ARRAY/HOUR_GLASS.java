// Sample Input:
// 6
// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0

// Sample Output:
// 19

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= size - 3; i++) { 
            for (int j = 0; j <= size - 3; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] 
                        + arr[i+1][j+1]                        
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]; 
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
