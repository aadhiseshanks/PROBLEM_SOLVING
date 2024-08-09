// Sample Input:
// str = zo[1]ho[1]
// Sample Output:
// zoho

// Sample Input:
// str = zo[2]ho[2]
// Sample Output:
// zozohoho

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        StringBuilder currentString = new StringBuilder();
        int repeatCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                currentString.append(c);
            } else if (c == '[') {
                i++;
                repeatCount = 0;
                while (Character.isDigit(str.charAt(i))) {
                    repeatCount = repeatCount * 10 + (str.charAt(i) - '0');
                    i++;
                }
                i--;

                for (int j = 0; j < repeatCount; j++) {
                    result.append(currentString);
                }

                currentString.setLength(0);
            }
        }
        System.out.println(result.toString());
    }
}
