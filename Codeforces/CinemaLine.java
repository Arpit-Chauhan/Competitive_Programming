import java.io.*;
import java.util.*;


public class CinemaLine {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        n = sc.nextInt();
        int arr[] = sc.readArray(n);
        int cnt25=0,cnt50=0;
        int flag=0;
        for (i = 0; i < n; i++) {
            if (arr[i]==25)
                cnt25++;
            else if (arr[i]==50){
                cnt50++;
                if (cnt25<1){
                    flag=1;
                    break;
                }
                else
                    cnt25--;
            }
            else {
                if ((cnt25<3 && cnt50<1) || (cnt50>=1 && cnt25<1)) {
                    flag = 1;
                    break;
                }
                else if (cnt50<1 && cnt25>=3){
                    cnt25-=3;
                }
                else {
                    cnt25--;
                    cnt50--;
                }
            }
        }
        if (flag==1)
            out.println("NO");
        else
            out.println("YES");

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