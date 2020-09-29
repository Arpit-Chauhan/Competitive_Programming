import java.io.*;
import java.util.*;


public class EffectiveApproach {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,m,pos=0;
        long countvasya=0,countpetya=0;

        n = sc.nextInt();
        int arr[]=new int[n+1];
        for (i = 1; i <= n; i++)
            arr[sc.nextInt()]=i;
        m = sc.nextInt();
        int b[]=sc.readArray(m);

        for (i =0; i <m; i++) {
            countvasya+=arr[b[i]];
            countpetya+=n-arr[b[i]]+1;
        }
        out.println(countvasya+" "+countpetya);

        out.close();
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
    }
}