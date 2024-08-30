// To Check whether all the characters of String1 is present in String2 or not
// Sample Input:
// Hari
// Ranjith
// Sample Output:
// Yes

// Method1:
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean result = true;
        for(char c : str1.toLowerCase().toCharArray()) {
            if(!str2.toLowerCase().contains(String.valueOf(c))) {
                result = false;
                break;
            }
        }
        System.out.println((result)?"Yes":"No");
    }
}

// Method2:
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int length = 0;
        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            for(int j=0; j<str2.length(); j++) {
                if(ch==str2.charAt(j)) {
                    length++;
                    break;
                }
            }
        }
        if(length==str1.length()) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

