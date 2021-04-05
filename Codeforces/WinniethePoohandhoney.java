import java.io.*;
import java.util.*;


public class WinniethePoohandhoney {

    public static void main(String args[])throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");

        int tc, i, j;
        String s;
        char p;

        tc =1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k= sc.nextInt();
            int arr[]=new int[n];
            for (i = 0; i < n; i++)
                arr[i]=sc.nextInt();

            for (j = 0; j < n; j++) {
                if (arr[j]>=3*k)
                    arr[j]-=3*k;
                else
                    arr[j]%=k;
            }

            long sum=0;
            for (i = 0; i < n; i++)
                sum+=arr[i];
            out.println(sum);
        }
        out.close();
    }
}