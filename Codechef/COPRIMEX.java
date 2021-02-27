import java.io.*;
import java.util.*;


public class COPRIMEX {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;
        tc = sc.nextInt();
        TreeSet<Integer> set=checkPrime(10000000);
        while (tc-- > 0) {
            int l= sc.nextInt();
            int r= sc.nextInt();
            int ans= set.higher(r);
            out.println(ans);
        }
        out.close();
    }

    public static TreeSet<Integer> checkPrime(int n) {
        boolean prime[]=new boolean[n+1];

        Arrays.fill(prime, true);
        prime[0]=prime[1]=false;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=2;i<=Math.sqrt(n);i++) {
            for(int j=i*i;j<=n;j+=i) {
                prime[j]=false;
            }
        }

        for(int i=0;i<n;i++) {
            if(prime[i])
                set.add(i);
        }
        return set;
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