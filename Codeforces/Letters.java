import java.io.*;
import java.util.*;


public class Letters {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m= sc.nextInt();
            long arr[] = sc.readArray(n);
            long b[]= sc.readArray(m);

            long pre[]=new long[n];
            pre[0]=arr[0];
            for (i = 1; i <n ; i++)
                pre[i]=pre[i-1]+arr[i];
            int flor=0;
            for (i = 0; i < m; i++) {
                int high=n-1,low=0;
                while(low<=high){
                    int mid=(low+high)/2;
                    if (b[i]>pre[mid])
                        low=mid+1;
                    else {
                        flor=mid;
                        high=mid-1;
                    }
                }
                out.print((flor+1)+" ");
                if (flor==0)
                    out.println(b[i]);
                else
                    out.println(b[i]-pre[flor-1]);
            }

        }
        out.close();
    }
	


/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair implements Comparable<Pair> {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            return this.x - o.x;
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

        /*DEFINED BY ME*/

        //READING ARRAY
        long[] readArray(int n) {
            long arr[] = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = nextLong();
            return arr;
        }

        //COLLECTIONS SORT
        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }

        //EUCLID'S GCD
        int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}