import java.io.*;
import java.util.*;


public class CVDRUN {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,x,y,k;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            k = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            List<Integer> list=new ArrayList<>();
            int citynum=x;
            list.add(citynum);
            while(true){
                citynum=(citynum+k)%n;
                if(list.contains(citynum))
                    break;
                else
                    list.add(citynum);
            }
            if (list.contains(y))
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