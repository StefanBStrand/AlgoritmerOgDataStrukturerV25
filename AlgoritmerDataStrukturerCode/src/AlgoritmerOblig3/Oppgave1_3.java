package AlgoritmerOblig3;
import java.util.Scanner;

public class Oppgave1_3 {

    public static long C_rekursiv(int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        }
        return C_rekursiv(n-1, m) + C_rekursiv(n-1, m-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n? ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= n; i++) {
            C_rekursiv(n, i);
            System.out.println("C(" + n + ", " + i +") = " + C_rekursiv(n, i));
        }
    }
}
