// Leetcode - 169

// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.
  
// Example 1:
// Input: nums = [3,2,3]
// Output: 3
  
// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

//  Boyer-Moore Voting Algorithm

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        Integer candidate = null;
        for(int num : arr) {
            if(count == 0) candidate = num;
            count += (num == candidate) ? 1: -1;
        }
        System.out.println(candidate);
    }
}
