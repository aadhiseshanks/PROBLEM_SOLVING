// Leetcode - 35

// Given a sorted array of distinct integers and a target value, return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2

// Example 2:
// Input: nums = [1,3,5,6], target = 2
// Output: 1

// Example 3:
// Input: nums = [1,3,5,6], target = 7
// Output: 4

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(arr[mid]==mid) {
                System.out.println(mid);
            }
            else if(arr[mid] < target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        System.out.println(left);
    }
}
