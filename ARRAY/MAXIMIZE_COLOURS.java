// Codechef - 56
// For the human eye, primary colours are red, green, and blue.
// Combining 11 drop each of any two primary colours produces a new type of secondary colour. For example, 
// mixing red and green gives yellow, mixing green and blue gives cyan, and, mixing red and blue gives magenta.
// You have X, Y, and Z drops of red, green, and blue colours respectively. 
// Find the maximum total number of distinct colours (both primary and secondary) you can have at any particular moment.
// Note: You cannot mix a secondary colour with a primary or another secondary colour to get a new type of colour.

// Sample Input:
// 4
// 1 0 1
// 3 3 0
// 1 1 1
// 0 0 0

// Sample Output:
// 2
// 2
// 3
// 0

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(); 
            int result = 0;
            if (x > 0) result++;
            if (y > 0) result++; 
            if (z > 0) result++; 

            int min = Math.min(x, Math.min(y, z)); 
            if (min >= 11) { 
                result++;
                min -= 11;
                if (min >= 11) result++;
            }

            System.out.println(result); 
        }
    }
}
