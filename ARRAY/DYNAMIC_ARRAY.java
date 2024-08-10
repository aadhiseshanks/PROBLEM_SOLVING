// Dynamic Array - HackerRank Problem
// n = 2, n is Type, q = 5, q is Query, lastAnswer = 0
// Sample Input:
// 2 5
// T X Y
// 1 0 5 
// 1 1 7
// 1 0 3
// 2 1 0
// 2 1 1
// Sample Output:
// 7 3

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        List<List<Integer>> sequences = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sequences.add(new ArrayList<>());
        }

        int lastAnswer = 0;

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int seqIndex = (x ^ lastAnswer) % n;
            List<Integer> seq = sequences.get(seqIndex);

            if (type == 1) {
                seq.add(y);
            } else if (type == 2) {
                lastAnswer = seq.get(y % seq.size());
                System.out.println(lastAnswer);
            }
        }
    }
}
