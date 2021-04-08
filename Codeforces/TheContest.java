import java.io.*;
import java.util.*;


public class TheContest {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int m= sc.nextInt();
            Pair b[]=new Pair[m];
            for (i = 0; i < m; i++)
                b[i]=new Pair(sc.nextInt(), sc.nextInt());
            long sum=0;
            for (int item:arr)
                sum+=item;
            boolean flag=false;
            for (i = 0; i < m; i++) {
                if (b[i].x<=sum && b[i].y>=sum){
                    flag=true;
                    out.println(sum);
                    break;
                }
                else if (b[i].x>sum){
                    flag=true;
                    out.println(b[i].x);
                    break;
                }
            }
            if (!flag)
            out.println(-1);
        }
        out.close();
    }

    static class Pair{
        int x;int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
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
        int[] readArray(int n) {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = nextInt();
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