// Key = [largest digit in the thousands place of all three number]
//       [largest digit in the hundreds place of all three number]
//       [largest digit in the tens place of all three number]
//       [largest digit in the units place of all three number]

// Sample Input:
// 3521
// 2452
// 1352
// Sample Output:
// 3552

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int key = 0;
        int thousand = Math.max(Math.max((input1/1000)%10, (input2/1000)%10), (input3/1000)%10);
        int hundred = Math.max(Math.max((input1/100)%10, (input2/100)%10), (input3/100)%10);
        int tens = Math.max(Math.max((input1/10)%10, (input2/10)%10), (input3/10)%10);
        int units = Math.max(Math.max(input1%10, input2%10), input3%10);
        key = thousand * 1000 + hundred * 100 + tens * 10 + units;
        System.out.println(key);

    }
}                                               
