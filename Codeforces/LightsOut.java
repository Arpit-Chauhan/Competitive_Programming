import java.io.*;
import java.util.*;


public class LightsOut {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;
        int[][] arr=new int[3][3];

        for ( i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                arr[i][j] = sc.nextInt();
        }

        for ( i = 0; i < 3; i++){
            for ( j = 0; j < 3; j++) {
                int sum = arr[i][j];
                if (i != 0)
                    sum += arr[i - 1][j];
                if (i != 2)
                    sum += arr[i + 1][j];
                if (j != 0)
                    sum += arr[i][j - 1];
                if (j != 2)
                    sum += arr[i][j + 1];
                out.print((sum % 2 == 0 ? 1 : 0));
            }
            out.println();
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