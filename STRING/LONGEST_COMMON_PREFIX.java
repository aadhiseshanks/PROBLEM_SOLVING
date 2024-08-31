// Input: strs = ["flower","flow","flight"]
// Output: "fl"

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(" ");
        Arrays.sort(str);
        String first = str[0], last = str[str.length - 1];
        String result = "";
        int c = 0;
        while(c < first.length() && c < last.length()) {
            if(first.charAt(c) == last.charAt(c)) {
                result += first.charAt(c);
                c++;
            }
            else {
                break;
            }
        }
        if(result.isEmpty()) {
            System.out.print("");
        }
        else {
            System.out.print(result);
        }
    }
}
