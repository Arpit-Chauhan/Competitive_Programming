import java.io.*;
import java.util.*;


public class CottageVillage {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int t= sc.nextInt();
            Pair arr[]=new Pair[n];
            for (i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b=sc.nextInt();
                double ans=b/2.0;
                arr[i] = new Pair(a-ans, a+ans);
            }
            Arrays.sort(arr);
            int count=2;
            for (i = 0; i < n-1; i++)
                if (Math.abs(arr[i+1].x-arr[i].y)==t)
                    count++;
                else if (Math.abs(arr[i+1].x-arr[i].y)>t)
                    count+=2;
            out.println(count);
        }
        out.close();
    }

    public static class Pair implements Comparable<Pair>{
        double x,y;
        Pair(double x,double y){
            this.x=x;this.y=y;
        }

        @Override
        public int compareTo(Pair o) {
            Double obj1 = this.x;
            Double obj2 = o.x;
            return obj1.compareTo(obj2);
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