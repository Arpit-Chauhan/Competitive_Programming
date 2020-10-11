import java.io.*;
import java.util.*;


public class NumbersonWhiteboard_Edu96 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while (t-->0) {

            n = sc.nextInt();
            out.println(2);
            List<Integer> list=new ArrayList<>();
            for (i = 1; i <=n ; i++)
                list.add(i);

            for (i = 1; i <=n-1 ; i++) {
                list.add((int)Math.ceil((list.get(list.size()-1)+list.get(list.size()-2))/(double)2));
                out.println(list.get(list.size()-2)+" "+list.get(list.size()-3));
                list.remove(list.size()-2);
                list.remove(list.size()-2);
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
    }
}