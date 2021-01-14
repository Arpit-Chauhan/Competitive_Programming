import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringLCM_Edu102 {

    public static void main(String args[]) {

         FastReader sc = new FastReader();
         PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = sc.nextInt();
        while (tc-- > 0) {
            s=sc.nextLine();
            String p=sc.nextLine();
            int len =s.length();
            int lenp=p.length();
            boolean flag=false;
            int lcm=(len*lenp)/sc.gcd(len,lenp);
            StringBuilder sts=new StringBuilder();
            StringBuilder stp=new StringBuilder();
            for (i = 1; i <= lcm/len; i++)
                sts.append(s);
            for (i = 1; i <= lcm/lenp; i++)
                stp.append(p);
            String temps=new String(sts);
            String tempp=new String(stp);
            if (temps.equals(tempp))
                out.println(tempp);
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
            br = new BufferedReader(new InputStreamReader(System.in));
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

        /*DEFINED BY ME*/

        //READING ARRAY
        int[] readArray(int n) {

            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = nextInt();

            return arr;
        }

        //COLLECTIONS SORT
        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }

        //EUCLID'S GCD
         public static int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}
