import java.io.*;
import java.util.*;


public class XeniaandDivisors {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;
        int cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0,cnt6=0,cnt7=0;
        n = sc.nextInt();
        int arr[] = sc.readArray(n);
        for (i = 0; i < n; i++) {
            if (arr[i]==1) cnt1++;
            if (arr[i]==2) cnt2++;if (arr[i]==3) cnt3++;
            if (arr[i]==4) cnt4++;if (arr[i]==5) cnt5++;
            if (arr[i]==6) cnt6++;if (arr[i]==7) cnt7++;
        }
        if (cnt5>0 || cnt7>0)
            out.println(-1);
        else {
            if (cnt1 == n / 3 && cnt2 == cnt1 - cnt3 && cnt6 == cnt1 - cnt4 && cnt4 <= cnt2 && cnt3 <= cnt6) {
                for (i = 0; i < cnt4; i++)
                    out.println("1 2 4");
                for (i = 0; i < cnt3; i++)
                    out.println("1 3 6");
                for (i = 0; i < (cnt2 - cnt4); i++)
                    out.println("1 2 6");
            }
            else
                out.println(-1);
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