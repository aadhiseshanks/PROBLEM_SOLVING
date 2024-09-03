// Leetcode - 168
// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28 

// Example 1:
// Input: columnNumber = 1
// Output: "A"

// Example 2:
// Input: columnNumber = 28
// Output: "AB"

// Example 3:
// Input: columnNumber = 701
// Output: "ZY"

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder result = new StringBuilder();
        while(num > 0) {
            num--;
            result.insert(0, (char)('A' + num % 26));
            num/=26;
        }
        System.out.println(result.toString());
    }
}
