/*
5
45
345
2345
12345
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num; i>=1; i--) {
            for(int j=i; j<=num; j++) {
            System.out.print(j);
            }
            System.out.println();
        }
    }   
}
