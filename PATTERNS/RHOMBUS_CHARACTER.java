// Rhombus Character Pattern
/*
  A
 ABA
ABCBA
 ABA
  A
*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        for(int i=1; i<=num; i++) { 
            for(int j=i; j<=num; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++) { 
                System.out.print((char)('A'+j)); 
            }
            for(int j=i-2; j>=0; j--) { 
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
        for(int i=num-1; i>=0; i--) { 
            for(int j=i; j<=num; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++) { 
                System.out.print((char)('A'+j)); 
            }
            for(int j=i-2; j>=0; j--) { 
                System.out.print((char)('A'+j)); 
            }
            System.out.println();
        }
    }
}
