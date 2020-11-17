import java.io.*;
import java.util.*;


public class BuyTheString_684 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            int c0=sc.nextInt();
            int c1=sc.nextInt();
            int h= sc.nextInt();
            s=sc.nextLine();
            int count0=0,count1=0;
            int sum1=0,sum2=0,sum3=0;
            for (i = 0; i <s.length(); i++) {
                char p = s.charAt(i);
                if (p == '0') {
                    count0++;
                    sum1 += c0;
                } else {
                    count1++;
                    sum1+=c1;
                }
            }
            sum2=n*c0+(count1*h);
            sum3=n*c1+(count0*h);
            out.println(Math.min(sum1,Math.min(sum2,sum3)));
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