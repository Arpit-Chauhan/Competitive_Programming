import java.io.*;
import java.util.*;


public class VasyaandPublicTransport {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            long c1 = sc.nextLong();
            long c2 = sc.nextLong();
            long c3 = sc.nextLong();
            long c4 = sc.nextLong();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int bus[]=sc.readArray(n);
            int troll[]=sc.readArray(m);

            long bussum=0;
            for (i = 0; i < n; i++)
                bussum+= Math.min(bus[i]*c1,c2);
            bussum=Math.min(bussum,c3);
            long trollsum=0;
            for (i = 0; i < m; i++)
                trollsum+= Math.min(troll[i]*c1,c2);
            trollsum=Math.min(trollsum,c3);
            out.println(Math.min(trollsum+bussum,c4));
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
        int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}