import java.io.*;
import java.util.*;


public class TernaryLogic {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;

        tc =1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m= sc.nextInt();
            s=Integer.toString(n,3);
            String p=Integer.toString(m,3);
            int len=Math.max(s.length(),p.length());
            if (s.length()<p.length())
                s=String.format("%1$" + len + "s", s).replace(' ', '0');
            else
                p=String.format("%1$" + len + "s", p).replace(' ', '0');

            StringBuilder ans=new StringBuilder();
            for (i = 0; i <len ; i++) {
                int temp=Integer.parseInt(String.valueOf(s.charAt(i)));
                int tem=Integer.parseInt(String.valueOf(p.charAt(i)));
                ans.append((3-temp+tem)%3);
            }
            String an=new String(ans);
            long a=Long.parseLong(an,3);
            out.println(a);

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
        int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}