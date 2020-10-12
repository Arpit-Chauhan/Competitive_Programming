import java.io.*;
import java.util.*;


public class PresentfromLena {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n,i, j,k,l,m;
        String s;

        n = sc.nextInt();

        for (i = 0; i <=n; i++) {
            for (k = 1; k <= (2*n)-(2*i); k++)
                out.print(" ");
            for (j = 0; j <= i; j++) {
                out.print(j);
                if(j<i)
                    out.print(" ");
            }
            for (l = i-1; l >= 0; l--)
                    out.print(" "+l);
            out.println();
        }
        for (i = n-1; i>=0; i--) {
            for (k = 1; k <=(2*n)-(2*i); k++)
                out.print(" ");
            for (j = 0; j <=i ; j++) {
                out.print(j);
                if(j<i)
                    out.print(" ");
            }
            for (l = i-1; l >=0 ; l--)
                out.print(" "+l);
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