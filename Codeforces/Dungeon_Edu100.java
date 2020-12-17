import java.io.*;
import java.util.*;


public class Dungeon_Edu100 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int temp = Math.min(a, Math.min(b, c));
            long sum = 0;
            sum += a + b + c;
            if (sum % 9 == 0) {
                if (sum / 9 <= temp)
                    out.println("YES");
                else
                    out.println("NO");
            } else
                out.println("NO");
        }
        out.close();
    }
}


