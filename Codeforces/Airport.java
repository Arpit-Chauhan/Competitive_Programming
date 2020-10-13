import java.io.*;
import java.util.*;


public class Airport {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,m;
        String s;

        n = sc.nextInt();
        m = sc.nextInt();
        int arr[] = sc.readArray(m);
        int b[]=Arrays.copyOf(arr,m);
        long min=0,max=0;
        int temp=n;
        Arrays.sort(arr);
        for (i = 0; i < m; i++) {
            while(n!=0){
                min+=arr[i];
                arr[i]--;
                n--;
                if (arr[i]==0)
                    break;
            }
        }
        i=0;
            while(temp!=0){
                sc.sort(b);
                max+=b[i];
                b[i]--;
                temp--;
            }

        out.println(max+" "+min);

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
            Collections.sort(l,Collections.reverseOrder());
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }
    }
}