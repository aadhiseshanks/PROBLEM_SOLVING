// Dynamic Array

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
