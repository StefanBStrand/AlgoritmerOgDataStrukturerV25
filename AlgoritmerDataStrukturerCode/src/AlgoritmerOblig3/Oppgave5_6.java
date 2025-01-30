package AlgoritmerOblig3;
import java.util.Scanner;
public class Oppgave5_6 {

    public static long C_iterativ(int n, int m) {
        if (m == 0 || n == m) {
            return 1;
        }

        long [] row = new long[n + 1];
        row[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                row[j] += row[j-1];
            }
        }
        return row[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n ?");
        int n = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= n; i++) {
            C_iterativ(n, i);
            System.out.println("C(" + n + ", " + i +") = " + C_iterativ(n, i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");
    }
}
