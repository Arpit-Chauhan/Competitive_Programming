import java.io.*;
import java.util.*;


public class Bets {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m= sc.nextInt();
            Pair arr[] = new Pair[m];
            for (i = 0; i < m; i++)
                arr[i]=new Pair(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            Arrays.sort(arr);
            long ans=0;
            for (i = 1; i <= n; i++)
                for (j = 0; j <m ; j++) {
                    if (i >= arr[j].l && i <= arr[j].r) {
                        ans += arr[j].c;
                        break;
                    }
                }
            out.println(ans);
        }
        out.close();
    }


    public static class Pair implements Comparable<Pair>{
        int l,r,t,c;
        Pair(int l,int r,int t,int c){
            this.l=l;
            this.r=r;
            this.t=t;
            this.c=c;
        }

        @Override
        public int compareTo(Pair o) {
            return this.t-o.t;
        }
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