import java.io.*;
import java.util.*;


public class GCDOPS {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            int g;
            n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int b[]=new int[n];
            for (i = 1; i <=n; i++) {
                b[i-1]=i;
            }
            for (i = 0; i < n; i++) {
                if(arr[i]!=b[i]){
                    for (j = 0; j < n; j++) {
                        g=gcd(b[i],arr[j]);
                        if(g==arr[i]) {
                            b[i] = g;
                            break;
                        }
                    }
                }
            }
            if(Arrays.equals(arr, b))
            out.println("YES");
            else
                out.println("NO");
        }
        out.close();
    }

    public static int gcd (int a , int b)
    {
        if(b!=0)
            return gcd (b , a%b);
        else
            return a;
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