// Sample Input:
// Hi Hell
// Sample Output:
// Jk Lipp

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words[] = str.split(" ");
        for(String word : words) {
            int rot = word.length();
            String result = "";
            for(char c : word.toCharArray()) {
                if(Character.isLetter(c)) {
                    char base = Character.isUpperCase(c) ? 'A' : 'a';
                    char shift = (char)((c - base + rot) % 26 + base);
                    result += shift;
                }
            }
            System.out.print(result+" ");
        }
    }
}
