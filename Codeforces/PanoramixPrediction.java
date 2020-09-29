import java.io.*;
import java.util.*;


public class PanoramixPrediction {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,m;
        String s;

        n = sc.nextInt();
        m = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (i = 2; i <= m; i++) {
            int flag=0;
            for (j = 2; j<=i/2 ; j++) {
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            list.add(i);
        }
        if (!list.contains(m))
        out.println("NO");
        else{
            if(list.get(list.size()-2)==n)
                out.println("YES");
            else
                out.println("NO");
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