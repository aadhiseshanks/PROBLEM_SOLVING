// Leetcode - 58

// Example 1:
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
  
// Example 2:
// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
  
// Example 3:
// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = 0;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i)==' ') {
                if(length > 0) {
                    break;
                }
            }
            else {
                length++;
            }
        }
        System.out.println(length);
    }
}
