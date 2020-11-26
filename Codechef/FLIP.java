import java.io.*;
import java.util.*;


public class FLIP {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, i, j;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            String a=sc.nextLine();
            String b= sc.nextLine();
            int ans=0,n=a.length();
            for (i = 0; i < n; i+=2) {
              if (a.charAt(i)==b.charAt(i))
                  continue;
              while (i<n && a.charAt(i)!=b.charAt(i))
                  i+=2;
              ans++;
            }
            for (i = 1; i < n; i+=2) {
                if (a.charAt(i)==b.charAt(i))
                    continue;
                while (i<n && a.charAt(i)!=b.charAt(i))
                    i+=2;
                ans++;
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