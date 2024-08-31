// Sample Input:
// 5
// Sample Output:
// 0 1 1 2 1 2

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        for(int i=1; i<=size; i++) {
            arr[i] = arr[(i&(i-1))]+1;
        }
        for(int i=0; i<=size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
