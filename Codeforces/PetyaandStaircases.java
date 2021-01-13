import java.io.*;
import java.util.*;


public class PetyaandStaircases {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = 1;
        while (tc-- > 0) {
            n = sc.nextInt();
            int m= sc.nextInt();
            int arr[] = sc.readArray(m);
            if (m>(n/2.0+1))
            out.println("NO");
            else{
                Set<Integer> set=new HashSet<>();
                boolean flag=false;
                for (i = 0; i < m; i++)
                    set.add(arr[i]);
                for (i = 0; i < m; i++) {
                    if (set.contains(arr[i]-1) && set.contains(arr[i]-2)){
                        flag=true;
                        break;
                    }
                }
                if (flag)
                    out.println("NO");
                else if (set.contains(1) || set.contains(n))
                    out.println("NO");
                else
                    out.println("YES");
            }
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
        public static int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}