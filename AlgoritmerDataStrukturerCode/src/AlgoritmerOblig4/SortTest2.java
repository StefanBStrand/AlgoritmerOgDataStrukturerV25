package AlgoritmerOblig4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class SortTest2 {
    public static void main(String[] args) {

        System.out.printf("%-10s %-7s %-7s %-7s\n", "n", "tA", "tL", "tL/tA");
        System.out.println("----------------------------------");

        for (int n = 1000000; n <= 10000000; n += 1000000) {
            int A[] = new int[n];
            Random r = new Random();

            int section = n/3;

            for (int i = 0; i < section; i++) {
                A[i] = i;
            }

           for (int i = section; i < 2 * section; i++) {
               A[i] = r.nextInt(2 * n);
           }

           for (int i = 2 * section; i < n; i ++) {
               A[i] = i - section;
           }

           LinkedList<Integer> L = new LinkedList<>();
           for (int i = 0; i < n; i++) {
               L.add(A[i]);
           }

           long tA, tL, t;

           t = System.currentTimeMillis();
           Arrays.sort(A);
           tA = System.currentTimeMillis() - t;

           t = System.currentTimeMillis();
           Collections.sort(L);
           tL = System.currentTimeMillis() - t;

            System.out.printf("%-10d %-7d %-7d %-7.1f\n", n, tA, tL, (float) tL / tA);
        }
    }
}
