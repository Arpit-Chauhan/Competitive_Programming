import java.io.*;
import java.util.*;


public class EVENPSUM {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            long a= sc.nextLong();
            long b= sc.nextLong();
            long noa=0,nea=0,nob=0,neb=0;
            if (a%2==0){
                nea=a/2;
                noa=a/2;
            }
            if (a%2!=0){
                noa=(long)Math.ceil(a/2.0);
                nea=noa-1;
            }
            if (b%2!=0){
                nob=(long)Math.ceil(b/2.0);
                neb=nob-1;
            }
            if (b%2==0){
                nob=b/2;
                neb=b/2;
            }
            long ans=(noa*nob)+(nea*neb);
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