// Leetcode - 66

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].

// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int carry = 1;
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                carry = 0;
                break;
            }
            arr[i] = 0;
        }
        
        if (carry == 1) {
            int newdigit[] = new int[size + 1];
            newdigit[0] = 1;
            for (int i = 0; i < size + 1; i++) {
                System.out.print(newdigit[i] + " ");
            }
        } 
        else {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
