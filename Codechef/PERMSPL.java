/*
* WRONG ANSWER
* */
import java.io.*;
import java.util.*;


public class PERMSPL {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            int flag=0;
            n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int b[]=new int[101];
            for (i = 0; i < n; i++)
                b[arr[i]]++;
            for (i = 0; i < 101; i++) {
                if(b[i]>2){
                    flag=1;
                    break;
                }
            }

            if(flag==1)
            out.println("NO");
            else{
                if(n==1)
                    out.println("YES");
                else if(n%2==0)
                    out.println("YES");
                else
                    out.println("NO");
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