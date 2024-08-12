// Sample Input1:
// 3
// Oreo Mango Apple
// Sample Output1:
// oreoapple

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str[] = new String[size];
        
        for(int i = 0; i < size; i++) {
            str[i] = sc.next();
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < str.length; i++) {
            if(isVowel(str[i].charAt(0)) && isVowel(str[i].charAt(str[i].length() - 1))) {
                result.append(str[i]); 
            }
        }
        
        if(result.length() == 0) {
            System.out.println("No Match Found");
        } else {
            System.out.println(result.toString().toLowerCase());
        }
    }
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
