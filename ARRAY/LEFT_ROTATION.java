// Sample Input:
// 5
// 5 8 7 6 2
// 2
// Sample Output:
// 7 6 2 8 5

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int rot = sc.nextInt();
        for(int i=0; i<rot; i++) {
            int temp = arr[0];
            for(int j=0; j<size-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[size-1] = temp;
        }
        for(int i=0; i<size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
