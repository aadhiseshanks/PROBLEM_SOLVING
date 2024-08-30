// Sample Input:
// 1234567
// Sample Output:
// 7 5 3

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n > 0) {
            int rem = n % 10;
            boolean flag = true;
            
            if (rem < 2) {
                flag = false; 
            } else {
                for(int i = 2; i <= Math.sqrt(rem); i++) {
                    if(rem % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            
            if (flag) {
                System.out.print(rem + " ");
            }
            
            n /= 10;
        }
    }
}
