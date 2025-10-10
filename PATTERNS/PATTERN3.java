/*
    A
   ABA
  ABCAB
 ABCDABC
ABCDEABCD
*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) { // i=2
            for(int j=i; j<=num; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) { // j=1, 3<=3
                System.out.print((char)('A'+j-1)); // 65 + 2 = 67
            }
            for(int j=1; j<i; j++) { // j=1, 1<2
                System.out.print((char)('A'+j-1)); // 65 + 0 = 65
            }
            System.out.println();
        }
    }
}
