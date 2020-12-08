import java.io.*;
import java.util.*;


public class FixingTypos {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String str=sc.nextLine();
        StringBuilder s =new StringBuilder();
        for (i = 0; i < str.length(); i++) {
            int len=s.length();
            if (len<2)
                s.append(str.charAt(i));
            else if (s.charAt(len-2)==s.charAt(len-1) && s.charAt(len-1)==str.charAt(i))
                continue;
            else if (len>2){
                if(s.charAt(len-3)==s.charAt(len-2) && s.charAt(len-1)==str.charAt(i))
                    continue;
                else
                    s.append(str.charAt(i));
            }
            else
                s.append(str.charAt(i));
        }
        out.println(s);
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