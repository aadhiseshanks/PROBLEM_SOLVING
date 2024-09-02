// Leetcode - 26
// Sample Input:
// 5
// 1 2 2 3 4
// Sample Output:
// 1 2 3 4

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        for(int j=1; j<size; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k=0; k<=i; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
