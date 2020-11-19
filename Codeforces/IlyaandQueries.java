import java.io.*;
import java.util.*;


public class IlyaandQueries {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;
        s=sc.nextLine();
        int arr[]=new int[s.length()];
        for (i = 0; i <s.length()-1 ; i++) {
            char p=s.charAt(i);
            char q=s.charAt(i+1);
            if (p==q)
                arr[i]=1;
            else
                arr[i]=0;
        }
        int prefix[]=new int[s.length()+1];
        prefix[1]=arr[0];

        for (i = 2; i < s.length(); i++)
            prefix[i]=prefix[i-1]+arr[i-1];

        t = sc.nextInt();
        while(t-->0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            out.println(prefix[r-1]-prefix[l-1]);
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