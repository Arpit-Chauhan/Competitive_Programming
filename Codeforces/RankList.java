import java.io.*;
import java.util.*;


public class RankList {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        n = sc.nextInt();
        int k=sc.nextInt();
        Rank arr[]=new Rank[n];

        for (i = 0; i < n; i++)
            arr[i]=new Rank(sc.nextInt(), sc.nextInt());

        Arrays.sort(arr);
        int prob=arr[k-1].p;
        int time=arr[k-1].t;
        int count=0;
        for (i = 0; i < n; i++) {
            if (arr[i].p==prob && arr[i].t==time)
                count++;
        }
        out.println(count);

        out.close();
    }


    static class Rank implements Comparable<Rank>{
        int p,t;
        Rank(int p,int t){
            this.p=p;
            this.t=t;
        }

        @Override
        public int compareTo(Rank o) {
            if(this.p!=o.p)
                return o.p-this.p;
            else
                return this.t-o.t;
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