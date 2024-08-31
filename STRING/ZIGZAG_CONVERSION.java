// Example 1:

// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"

// Explaination: 
// P   A   H   N
// A P L S I I G
// Y   I   R

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int numRows = sc.nextInt();
        
        if(numRows == 1 || numRows >= s.length()) {
            System.out.println(s);
        }
        
        StringBuilder rows[] = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++) {
            rows[i] = new StringBuilder();
        }
        
        int index = 0;
        while (index < s.length()) {
            // Down
            for (int i = 0; i < numRows && index < s.length(); i++) {
                rows[i].append(s.charAt(index));
                index++;
            }

            // Up
            for (int i = numRows - 2; i >= 1 && index < s.length(); i--) {
                rows[i].append(s.charAt(index));
                index++;
            }
        }
        
        for(StringBuilder str : rows) {
            System.out.print(str.toString());
        }
    }
}
