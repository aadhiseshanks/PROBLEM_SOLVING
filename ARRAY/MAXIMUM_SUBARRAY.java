// Sample Input:
// 9
// -2 1 -3 4 -1 2 1 -5 4
// Sample Output:
// 6

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0, max = 0;
        for(int i=0; i<size; i++) {
            sum = sum + arr[i];
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
