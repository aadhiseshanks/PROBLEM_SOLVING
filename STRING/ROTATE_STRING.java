// Sample Input:
// Zoho
// 4
// Sample Output:
// Dsls

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int rot = sc.nextInt();
        String result = "";
        for (char c : s.toCharArray()) {
            char base = (Character.isUpperCase(c)) ? 'A':'a';
            char shift = (char)((c - base + rot) % 26 + base);
            result += shift;
        }
        System.out.print(result);
    }
}
