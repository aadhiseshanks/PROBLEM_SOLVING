// Rhombus Patterns
/*
     1
    212
   32123
  4321234
 543212345
  4321234
   32123
    212
     1
*/
import java.util.Scanner;
class patrnq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            for(int j=i; j<=num; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=num-1; i>=1; i--) {
            for(int j=i; j<=num; j++) {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
