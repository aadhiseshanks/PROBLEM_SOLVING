// R is Move to Next Character
// L is Increment by One Element
// D is Decrement by One Element
// T is Move to Previous Character
// S is Swap the Elements, but S is followed by Number
// Sample Input:
// 6
// 1 2 3 4 5 6
// RLDTS2
// Sample Output:
// 3 2 1 4 5 6


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        String s = sc.next();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                if (j < n - 1) j++;
            }
            else if(s.charAt(i) == 'L') {
                arr[j] = arr[j] + 1;
            }
            else if(s.charAt(i) == 'D') {
                arr[j] = arr[j] - 1;
            }
            else if(s.charAt(i) == 'T') {
                if (j > 0) j--;
            }
            else if(s.charAt(i) == 'S') {
                if (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    int x = Character.getNumericValue(s.charAt(i + 1));
                    if (x >= 0 && x < n) {
                        int y = arr[j];
                        arr[j] = arr[x];
                        arr[x] = y;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
