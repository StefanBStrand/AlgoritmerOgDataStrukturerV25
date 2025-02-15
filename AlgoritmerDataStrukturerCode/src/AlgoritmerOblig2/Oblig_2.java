package AlgoritmerOblig2;

import java.io.*;
import java.util.Scanner;

class Oblig_2
{
    public static void lineær(long n)
    {
        int tmp = 1;
        for (long i = 0; i < n; i++)
            tmp *= 1;
    }

    public static void kvadratisk(long n)
    {
        int tmp = 1;
        for (long i = 0; i < n; i++)
            for (long j = 0; j < n; j++)
                tmp *= 1;
    }

    public static int logaritmisk(long n)
    {
        int tmp = 1, iterasjoner = 0;
        for (long i = n; i > 0; i /= 2, iterasjoner++)
            tmp *= 1;
        return iterasjoner;
    }

    // Task 1a:

    public static void superlineær(long n) {
        int tmp = 1;
        for (long i = 0; i < n; i++) {
            for (long j = n; j > 1; j /= 2) {
                tmp *= 1;
            }
        }
    }

    public static void kubisk(long n) {
        int tmp = 1;
        for (long i = 0; i < n; i++) {
            for (long j = 0; j < n; j++) {
                for (long k = 0; k < n; k++)
                    tmp *= 1;
            }
        }
    }

    public static void eksponentiell(long n) {
        int tmp = 1;
        long iterations = (long) Math.pow(2, n);
        for (long i = 0; i <= iterations; i++) {
            tmp *= 1;
        }
    }

    public static void kombinatorisk(long n) {

        long nFactorial = 1;
        for (long i = 2; i <= n; i++) {
            nFactorial *= i;
        }

        int tmp = 1;
        for (long j = 0; j < nFactorial; j++) {
            tmp *= 1;
        }
    }

    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        long n, T, T1, T2;
        int valg, iterasjoner = 0;

        System.out.print("1:O(n) 2:O(n²) 3:O(log_n) 4:0(n x log_n 5:0(n^3) 6:0(2^n) 7:0(n!) ? ");
        valg = S.nextInt();
        System.out.print("n? ");
        n = S.nextLong();

        T1 = System.currentTimeMillis();

        switch (valg) {
            case 1:
                lineær(n);
                break;
            case 2:
                kvadratisk(n);
                break;
            case 3:
                iterasjoner = logaritmisk(n);
                break;
            case 4:
                superlineær(n);
                break;
            case 5:
                kubisk(n);
                break;
            case 6:
                eksponentiell(n);
                break;
            case 7:
                kombinatorisk(n);
                break;
            default:
                System.out.println("Invalid choice: enter a number between 1 and 7.");
                break;
        }

        T2 = System.currentTimeMillis();

        T = T2 - T1;
        System.out.print("T = " + T+ " ms");
        if (valg == 3)
            System.out.print(" (" + iterasjoner + ")");
        System.out.println();
    }
}


