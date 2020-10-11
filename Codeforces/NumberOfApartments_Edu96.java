import java.io.*;
import java.util.*;


public class NumberOfApartments_Edu96 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            long count=0;
            n = sc.nextInt();
            int b=0,c=0;
            count=n/3;
            if(n>=3) {
                if (n % 3 == 0) {
                    out.println(count + " " + b + " " + c);
                    continue;
                }
                if (n > 4 && n % 3 == 1 && (n - ((count - 2) * 3)) == 7) {
                    count -= 2;
                    c++;
                } else if (n % 3 == 2 && (n - ((count - 1) * 3)) == 5) {
                    count--;
                    b++;
                } else {
                    out.println(-1);
                    continue;
                }
            }
            else {
                out.println(-1);
                continue;
            }
            out.println(count+" "+b+" "+c);
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