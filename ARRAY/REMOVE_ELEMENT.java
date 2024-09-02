// Sample Input:
// 5
// 1 2 3 4 5
// 3
// Sample Output:
// 1 2 4 5
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int index = 0;
        for(int i=0; i<size; i++) {
            if(arr[i]!=val) {
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i=0; i<index; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
