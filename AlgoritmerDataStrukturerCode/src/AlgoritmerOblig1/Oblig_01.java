package AlgoritmerOblig1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Oblig_01 {

    public static String ROT13(String S) {
        char[] C = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            char c = C[i];
            if (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if (c >= 'N' && c <= 'Z') c -= 13;
            C[i] = c;
        }
        return String.valueOf(C);
    }

    public static String krypter(String S) {
        S = ROT13(S);

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        int n = S.length();

        for (int i = 0; i < n /2; i++) {
            queue.add(S.charAt(i));
        }
        for (int i = n/2; i < n; i++) {
            stack.push(S.charAt(i));
        }

        String T = "";

        while (!stack.isEmpty() || !queue.isEmpty()) {
            if (!stack.isEmpty()) T += stack.pop();
            if (!queue.isEmpty()) T += queue.poll();
        }
        return T;
    }

}
