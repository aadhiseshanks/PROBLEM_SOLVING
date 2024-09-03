// Leetcode - 137
// Example 1:

// Input: nums = [2,2,3,2]
// Output: 3
// Example 2:

// Input: nums = [0,1,0,1,0,1,99]
// Output: 99

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for(int i=0; i<32; i++) {
            int bitCount = 0;
            for(int num : arr) {
                bitCount += (num >> i) & 1;
            }
            result |= (bitCount % 3) << i;
        }
        System.out.println(result);
    }
}
