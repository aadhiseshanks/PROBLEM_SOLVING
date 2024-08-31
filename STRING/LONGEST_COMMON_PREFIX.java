// Input: strs = ["flower","flow","flight"]
// Output: "fl"

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(" ");
        if (str.length == 0) {
            System.out.println("");
        }
        String result = "";
        for (int i = 0; i < str[0].length(); i++) {
            char c = str[0].charAt(i);
            boolean match = true;
            for (int j = 1; j < str.length; j++) {
                if (i >= str[j].length() || str[j].charAt(i) != c) {
                    match = false;
                    break;
                }
            }
            if (match) {
                result += c;
            } else {
                break;
            }
        }
        System.out.print(result);
    }
}
