import java.io.*;
import java.util.*;


public class StringGeneration {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            int k=sc.nextInt();
            String pat="abc";
            int c=0;
            if (n==k){
                for (i = 0; i < n; i++)
                    out.print("a");
                out.println();
            }
            else {
                StringBuilder str = new StringBuilder();
                for (i = 0; i < n - k; i++) {
                    out.print(pat.charAt(c));
                    str.append(pat.charAt(c));
                    c++;
                    if (c == 3)
                        c = 0;
                }
                if (str.charAt(str.length() - 1) == 'a') {
                    for (i = 0; i < k; i++)
                        out.print("b");
                } else if (str.charAt(str.length() - 1) == 'b') {
                    for (i = 0; i < k; i++)
                        out.print("c");
                } else if (str.charAt(str.length() - 1) == 'c') {
                    for (i = 0; i < k; i++)
                        out.print("a");
                }
                out.println();
            }
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