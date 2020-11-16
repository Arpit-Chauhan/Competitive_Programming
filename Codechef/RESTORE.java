import java.io.*;
import java.util.*;


public class RESTORE {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;
        List<Integer> primelist=checkPrime(10000000);
        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int b[]=new int[n];

            for (i = 0; i < n; i++)
                b[i]=primelist.get(i);

            for (i = 0; i <n ; i++) {
                if (arr[i]!=i+1)
                    b[i]=b[arr[i]-1];
            }
            for (int item: b)
                out.print(item+" ");
            out.println();
        }
        out.close();
    }

    public static ArrayList<Integer> checkPrime(int n) {
        boolean prime[]=new boolean[n+1];
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.fill(prime, true);
        prime[0]=prime[1]=false;

        for(int i=2;i<=Math.sqrt(n);i++) {
            for(int j=i*i;j<=n;j+=i) {
                prime[j]=false;
            }
        }

        for(int i=0;i<n;i++) {
            if(prime[i])
                list.add(i);
        }
        return list;
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