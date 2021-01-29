import java.io.*;
import java.util.*;


public class Inflation {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = sc.nextInt();
        while (tc-- > 0) {
            n = sc.nextInt();
            int k=sc.nextInt();
            double per=k/100.0;
            long arr[] = sc.readArray(n);
            long price=arr[0];
            long ans=0;
            for (i = 1; i <n ; i++) {
               long temp=(arr[i] * 100 - price * k);
               if (temp>0)
                   temp= (long) Math.ceil((double)temp/k);
               else
                    temp=0;
               ans+=temp;
               price+=temp+arr[i];
                }
            out.println(ans);
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

        /*DEFINED BY ME*/

        //READING ARRAY
        long[] readArray(int n) {

            long arr[] = new long[n];

            for (int i = 0; i < n; i++)
                arr[i] = nextLong();

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
        int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}