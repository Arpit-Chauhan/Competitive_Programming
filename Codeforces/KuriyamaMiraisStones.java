import java.io.*;
import java.util.*;


public class KuriyamaMiraisStones {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,l,r;
        String s;

        n = sc.nextInt();
        int arr[] = sc.readArray(n);
        int b[]=Arrays.copyOf(arr,n);
        sc.sort(b);
        long pret1[]=new long[(int)n+1];
        long pret2[]=new long[(int)n+1];
        pret1[1]=arr[0];
        pret2[1]=b[0];
        for (i = 2; i <=n ; i++)
            pret1[i]=pret1[i-1]+arr[i-1];
        for (i = 2; i <=n ; i++)
            pret2[i]=pret2[i-1]+b[i-1];

        int m=sc.nextInt();
        while(m-->0){
            long sum=0;
            t=sc.nextInt();
            l=sc.nextInt();
            r=sc.nextInt();
            if (t==1)
                out.println(pret1[r]-pret1[l-1]);
            else
                out.println(pret2[r]-pret2[l-1]);
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