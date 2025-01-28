package AlgoritmerOblig3;

public class Oppgave1_3 {

    public static long C_rekursiv(int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        }
        return C_rekursiv(n-1, m) + C_rekursiv(n-1, m-1);
    }


}
