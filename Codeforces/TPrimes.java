import java.io.*;
import java.util.*;


public class TPrimes {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        n = sc.nextInt();
        long arr[]=new long[n];
        for (i = 0; i < n; i++)
            arr[i]= sc.nextLong();

        int num=(int)Math.pow(10,6);
        boolean ans[] =checkPrime();
        for (i = 0; i < n; i++) {
            int k=(int)Math.sqrt(arr[i]);
            if((long)k*(long)k==arr[i] && ans[k])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        out.close();
    }

    public static boolean[] checkPrime() {
        int num=(int)Math.pow(10,6);
        boolean prime[]=new boolean[num+1];

        Arrays.fill(prime, true);
        prime[0]=prime[1]=false;

        for(int i=2;i<=Math.sqrt(num);i++) {
            for(int j=i*i;j<=num;j+=i) {
                prime[j]=false;
            }
        }
        return prime;
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

        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }
    }
}