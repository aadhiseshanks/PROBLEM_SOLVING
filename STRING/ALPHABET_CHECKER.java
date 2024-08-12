// Sample Input1:
// string1 = ACZa
// string2 = CAZa
// Sample Output1:
// Increasing: 2

// Sample Input2:
// string1 = tGBb
// string2 = tbGB
// Sample Output2:
// Decreasing: 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        int increase = 0, decrease = 0;
        boolean isIncrease = true, isDecrease = true;
        
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) > str.charAt(i-1)) {
                isDecrease = false;
            }
            if(str.charAt(i) < str.charAt(i-1)) {
                isIncrease = false;
            }
        }
        
        if(!isIncrease && !isDecrease) {
            System.out.println("Invalid");
            return;
        }
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str1.charAt(i)) {
                if(isIncrease) increase++;
                else decrease++;
            }
        }
        
        System.out.println((isIncrease) ? "Increasing: " + increase : "Decreasing: " + decrease);
    }
}
