

import java.io.*;
import java.util.*;


public class CHEFEZQ {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,k;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            k = sc.nextInt();
            int arr[] = sc.readArray(n);
            long prevsum=0,flag=0;
            for (i = 0; i < n; i++) {
                prevsum+=arr[i]-k;
                if (prevsum<0){
                    flag=1;
                    out.println(i+1);
                    break;
                }
            }
            if(flag!=1) {
                long sum = 0;
                for (i = 0; i < n; i++)
                    sum += arr[i];

                out.println((sum / k) + 1);
            }
        }
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
