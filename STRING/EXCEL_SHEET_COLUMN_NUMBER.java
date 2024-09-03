// Leetcode - 171
// Example 1:
// Input: columnTitle = "A"
// Output: 1

// Example 2:
// Input: columnTitle = "AB"
// Output: 28

// Example 3:
// Input: columnTitle = "ZY"
// Output: 701

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = 0;
        for (char c : s.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        System.out.println(result);
    }
}
