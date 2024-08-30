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
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append((char) ((c - 'a' + rot) % 26 + 'a'));
            } else if (Character.isUpperCase(c)) {
                sb.append((char) ((c - 'A' + rot) % 26 + 'A'));
            } else {
                sb.append(c);
            }
        }
        System.out.print(sb);
    }
}
