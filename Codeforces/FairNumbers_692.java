import java.io.*;
import java.util.*;


public class FairNumbers_692 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, i, j;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            long n = sc.nextLong();
            while (true) {
                s = Long.toString(n);
                Set<Integer> set = new HashSet<>();
                for (i = 0; i < s.length(); i++) {
                    int temp = Integer.parseInt(String.valueOf(s.charAt(i)));
                    set.add(temp);
                }
                boolean flag = false;
                for (i = 2; i <= 9; i++) {
                    if (set.contains(i)) {
                        if (n % i != 0) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (!flag) {
                    out.println(n);
                    break;
                }
                n++;
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