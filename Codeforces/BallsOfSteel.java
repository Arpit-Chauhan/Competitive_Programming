import java.io.*;
import java.util.*;


public class BallsOfSteel {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int test, n, i, j;
        String s;

        test = sc.nextInt();
        while (test-->0) {
            n = sc.nextInt();
            int k=sc.nextInt();
            Rank arr[]=new Rank[n];
            for (i = 0; i < n; i++)
                arr[i]=new Rank(sc.nextInt(), sc.nextInt());

            int count=0,flag=0;
            for (i = 0; i <n ; i++) {
                count=0;
                for (j = 0; j < n; j++) {
                    int temp = Math.abs(arr[i].x - arr[j].x) + Math.abs(arr[i].y - arr[j].y);
                    if (temp<=k)
                        count++;
                }
                if (count==n){
                    flag=1;
                    out.println(1);
                    break;
                }
            }
            if (flag==0)
                out.println(-1);
        }
        out.close();
    }


    static class Rank implements Comparable<Rank>{
        int x,y;
        Rank(int x,int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public int compareTo(Rank o) {
            return this.x-o.x;
        }
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