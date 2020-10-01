import java.io.*;
import java.util.*;


public class BicycleChain {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,m,c=0,flag=0;
       
        n= sc.nextInt();
        int arr[] = sc.readArray(n);
        m = sc.nextInt();
        int b[] = sc.readArray(m);
        float maxratio=-1;
        int count=0;

        for (i=0;i<n;i++) {
            for (j = m - 1; j >= 0; j--) {
                if(b[j]%arr[i]==0) {
                    float temp = b[j]/(float)arr[i];
                    maxratio=Math.max(temp,maxratio);
                }
            }
        }

        for (i = 0; i < n; i++) {
            for (j = m-1; j>=0 ; j--) {
                if(b[j]/(float)arr[i]==maxratio)
                    count++;
                else if (b[j]/(float)arr[i]<maxratio)
                    break;
            }
        }
        out.println(count);

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