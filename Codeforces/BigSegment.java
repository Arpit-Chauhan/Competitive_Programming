import java.io.*;
import java.util.*;


public class BigSegment {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;


        n = sc.nextInt();
        int arr[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        int d[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            c[i]=arr[i];
            b[i]= sc.nextInt();
            d[i]=b[i];
        }
        Arrays.sort(c);
        Arrays.sort(d);
        int flag=0;
        int min=c[0];int max=d[n-1];
        for (i = 0; i < n; i++) {
            if (arr[i]<=min && b[i]>=max){
                flag=1;
                out.println(i+1);
                break;
            }
        }
        if (flag==0)
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