import java.io.*;
import java.util.*;


public class EasyNumberChallenge {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,k;
        String s;
        int a= sc.nextInt();
        int b= sc.nextInt();int c= sc.nextInt();
        long sum=0;
        long mod=1073741824;
        int m = a * b * c;
        long[] sol = new long[m + 1];
        long MOD = 1073741824  ;

        for (i = 1; i <= a; i++)
            for (j = 1; j <= b; j++)
                for (k = 1; k <= c; k++)
                    sum += numberOfDivisors(i * j * k, sol);

        out.println(sum % MOD);
        out.close();
    }

     static long numberOfDivisors(long n, long[] sol)
    {
        long ans = 0;

        if (sol[(int) n] != 0)
            return sol[(int) n];

        for (int i = 1; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                ans++;
                if (i * i != n)
                    ans++;
            }
        }
        sol[(int) n] = ans;

        return ans;
    }




    /*
		FASTREADER
	*/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        /*DEFINED BY ME
         */
        int[] readArray(int n) {

            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = nextInt();

            return arr;
        }

        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }
    }
}