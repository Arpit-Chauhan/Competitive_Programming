import java.io.*;
import java.util.*;


public class ApplemanandCardGame {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        n = sc.nextInt();
        long k = sc.nextLong();
        s= sc.nextLine();
        long arr[]=new long[26];
        long sum=0;
        for (i = 0; i < s.length(); i++)
            arr[s.charAt(i)-'A']++;
        Arrays.sort(arr);
        for (i = 25; i >=0 ; i--) {
            if (arr[i]>k) {
                sum += k*k;
                break;
            }
            else {
                sum+=arr[i]*arr[i];
                k-=arr[i];
            }
            if (k<=0)
                break;
        }
        out.println(sum);

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

//        void sort(int arr[]) {
//            ArrayList<Long> l = new ArrayList<>();
//            for (long i : arr)
//                l.add(i);
//            Collections.sort(l,Collections.reverseOrder());
//            for (long i = 0; i < arr.length; i++)
//                arr[(int)i] = l.get((int)i);
//        }
    }
}