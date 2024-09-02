// Find PIN: 
// You are at Level-1 of a Maths game. 
// You are provided with 4 numbers: input1, input2, input3 and input4 and are expected to find a secret PIN. 
// The three numbers input1, input2 and input3 are four digit numbers within the range >= 1000 ; and <= 9999 . 
// i.e. 1000 <= input1 <= 9999 
// 1000 <= input2 <= 9999 
// 1000 <= input3 <= 9999 
// input4 is a positive integer number. 
// If input4 is EVEN, the PIN = (sum of even digits in input1 input2 and input3) 
// If input4 is ODD, the PIN = (sum of odd digits in input1 input2 and input3) 
// Example1 - If input4-38 (an EVEN number) and if input1 = 3521 , input2=2452, input3 = 1352 , 
// then PIN = (2+2+4+2+2) = 12 
// Example2 - If input4=37 (an ODD number) and if input1 = 3521 , input2=2452, input3 = 1352 , 
// then PIN =(3+5+1+5+1+3+5)=23 Assuming that the 4 numbers are passed to the given function, 
// Complete the function to find and return the PIN.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt(), input2 = sc.nextInt(), input3 = sc.nextInt(), input4 = sc.nextInt();
        String s1 = String.valueOf(input1), s2 = String.valueOf(input2), s3 = String.valueOf(input3);
        int evenSum = 0, oddSum = 0;
        for(char c:(s1+s2+s3).toCharArray()) {
            int digit = Character.getNumericValue(c);
            if(digit % 2 == 0) evenSum += digit;
            else oddSum += digit;
        }
        if(input4 % 2 == 0) {
            System.out.println(evenSum);
        }
        else {
            System.out.println(oddSum);
        }
        
    }
}
