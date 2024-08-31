// At a fresh juice stand, each fresh juice costs $5. Customers are standing in a queue to buy from you and order one at a 
// time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a $5, $10, or 
// $20 bill. You must provide the correct change to each customer so that the net transaction is that the customer pays $5. 
// Note that you do not have any change in hand at first. Given an integer array of bills where bills[i] is the bill the 
// customer pays, return true if you can provide every customer with the correct change, or false otherwise. 
// Example 1: 
// Input: bills [5.5,5,10,20] 
// Output: true 
// Example 2: 
// Input: bills [5,5,10,10,20] 
// Output: false

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int five = 0, ten = 0;
        boolean isValid = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                five++;
            } else if (arr[i] == 10) {
                if (five < 1) {
                    isValid = false;
                    break;
                }
                five--;
                ten++;
            } else if (arr[i] == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
