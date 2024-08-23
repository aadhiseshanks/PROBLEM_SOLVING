// Sample Input:
// 20
// Sample Output:
// 8

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i=1; i<=num; i++) {
            if(gcd(i, num)==1) count++;
        }
        System.out.println(count);
    }
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        else return gcd(b, a%b);
    }
}
