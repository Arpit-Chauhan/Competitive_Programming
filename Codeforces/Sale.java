import java.io.*;
import java.util.*;


public class Sale {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,m;
        String s;

        n = sc.nextInt();
        m = sc.nextInt();
        int arr[] = sc.readArray(n);
        Arrays.sort(arr);
        int sum=0;
        for (i = 0; i < m; i++) {
            if(arr[i]<0)
            sum += arr[i];
        }
        out.println(Math.abs(sum));
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