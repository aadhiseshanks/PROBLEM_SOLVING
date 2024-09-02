// Leetcode - 42
// Sample Input:
// 6
// 3 0 0 2 0 4

// Sample Output:
// 10

// Sample Input:
// 6
// 4 2 0 3 2 5
// Sample Output:
// 9

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int height[] = new int[size];
        for(int i=0; i<size; i++) {
            height[i] = sc.nextInt();
        }
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int totalWater = 0;

        while (left <= right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    totalWater += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    totalWater += maxRight - height[right];
                }
                right--;
            }
        }
        System.out.print(totalWater);
    }
}
