import java.io.*;
import java.util.*;


public class AddingDigits {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        StringBuilder s;

        n = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        s = new StringBuilder(Integer.toString(n));
        int flag=0;
        for (i = 0; i <= 9; i++) {
            s.append(i);
            int temp=Integer.parseInt(s.toString());
            if (temp%b==0){
                for (j = 1; j <k ; j++)
                    s.append("0");
                flag=1;break;
            }
            else
               s = new StringBuilder(s.substring(0, s.length() - 1));
        }
        if (flag==1)
            out.println(s);
        else
            out.println(-1);
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