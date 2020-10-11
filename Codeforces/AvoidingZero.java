import java.io.*;
import java.util.*;


public class AvoidingZero {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            int arr[] = sc.readArray(n);

            Arrays.sort(arr);
            long sum=0;
            for (i = 0; i < n; i++)
                sum+=arr[i];
            if (sum==0){
                out.println("NO");
            }
            else {
                out.println("YES");
                if (sum>0){
                    for (i = n-1; i>=0 ; i--)
                        out.print(arr[i]+" ");
                    out.println();
                }
                if (sum<0){
                    for (i = 0; i <n ; i++)
                        out.print(arr[i]+" ");
                    out.println();
                }
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