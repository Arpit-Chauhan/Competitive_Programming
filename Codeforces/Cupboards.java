import java.io.*;
import java.util.*;


public class Cupboards {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;
        int counta0=0,countb0=0,counta1=0,countb1=0;
        t = sc.nextInt();
        int arr[]=new int[t];
        int b[]=new int[t];
        for(i=0;i<t;i++){
            arr[i]= sc.nextInt();
            if (arr[i]==0)
                counta0++;
            else counta1++;
            b[i]=sc.nextInt();
            if (b[i]==0)
                countb0++;
            else countb1++;
        }

       out.println(Math.min(counta0,counta1)+Math.min(countb0,countb1));

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