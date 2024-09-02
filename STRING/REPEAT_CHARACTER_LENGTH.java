// Leetcode - 3
// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        int index[] = new int[128];
        int start = 0, result = 0;
        for(int end = 0; end < s.length(); end++) {
            if(index[s.charAt(end)] != 0) {
                start = Math.max(start, index[s.charAt(end)]);
            }
            result = Math.max(result, end-start+1);
            index[s.charAt(end)] = end+1;
        }
        System.out.print(result);
    }
}
