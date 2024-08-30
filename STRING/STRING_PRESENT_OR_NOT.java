// To Check whether all the characters of String1 is present in String2 or not
// Sample Input:
// Hari
// Ranjith
// Sample Output:
// Yes
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
