// Sample Input:
// 6
// 3 0 0 2 0 4

// Sample Output:
// 10

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int height[] = new int[size];
        for(int i=0; i<size; i++) {
            height[i] = sc.nextInt();
        }
        if (height == null || height.length == 0) {
            System.out.println(0);
        }

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped += rightMax - height[right];
                }
                right--;
            }
        }

        System.out.println(waterTrapped);
    }
}
