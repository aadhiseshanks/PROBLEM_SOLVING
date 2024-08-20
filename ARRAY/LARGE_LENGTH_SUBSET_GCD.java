// Sample Input:
// 3
// 2 3 4
// Sample Output:
// 3

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = arr[0];
        for(int i=1; i<size; i++) {
            int a = result, b = arr[i];
            // GCD using Euclidean Algorithm
            while(b!=0) {
                int temp = b;
                b = a%b;
                a = temp;
            }
            result = a;
        }
        if(result == 1) {
            System.out.println(size);
        }
        else {
            System.out.println(-1);
        }
    }
}
