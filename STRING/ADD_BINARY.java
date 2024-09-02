// Leetcode - 67
// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int n = s1.length(), m = s2.length();
        int i=n-1, j=m-1, carry=0;
        String result = "";
        while(i>=0 || j>=0 || carry !=0) {
            if(i>=0) carry += s1.charAt(i--) - '0';
            if(j>=0) carry += s2.charAt(j--) - '0';
            result += (char)(carry % 2 + '0');
            carry/=2;
        }
        for(int k=result.length()-1; k>=0; k--) {
            System.out.print(result.charAt(k));
        }
    }
}
