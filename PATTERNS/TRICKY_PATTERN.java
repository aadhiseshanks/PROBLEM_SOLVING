// Sample Input:
// 5

// Sample Output:
// 1  3  6  10 15 
// 2  5  9  14 19
// 4  8  13 18 22
// 7  12 17 21 24
// 11 16 20 23 25

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int sum = 1;
       for (int i=0; i<n; i++) {
        int num = sum;
        for (int j = 0; j < n; j++) {
            System.out.print(num + " ");
            if(i+j<n-1) num += i+j+2;
            else num += 2*n-(i+j)-1;
        }
        System.out.println();
        sum+=i+1;
        }
    }
}
