
import java.io.*;
import java.util.*;


public class REPLESX {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,x,p,k;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            x = sc.nextInt();
            p = sc.nextInt();
            k = sc.nextInt();
            p--;k--;
            int arr[] = sc.readArray(n);
            Arrays.sort(arr);
            long count=0;

            if (arr[p]==x)
                out.println(0);

            else if (k>=p && arr[p]>=x){
                for (i = p; i >=0 ; i--) {
                    if (arr[i]>x)
                        count++;
                }
                out.println(count);
            }
            else if (k<=p && arr[p]<=x){
                for (i = p; i <n ; i++) {
                    if (arr[i]<x)
                        count++;
                }
                out.println(count);
            }
            else
                out.println(-1);

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