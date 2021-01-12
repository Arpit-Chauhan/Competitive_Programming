import java.io.*;
import java.util.*;


public class Antonandcurrencyyouallknow {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc =1;
        while (tc-- > 0) {
            s=sc.nextLine();
            int len=s.length();
            char q=s.charAt(len-1);
            StringBuilder str=new StringBuilder(s);
            boolean flag=false;
            boolean flag2=false;
            for (i = 0; i < s.length(); i++) {
                char p=s.charAt(i);
                int tp=Character.getNumericValue(p);
                int last=Character.getNumericValue(s.charAt(len-1));
                if (tp%2==0 && tp<last){
                    str.setCharAt(i,q);
                    str.setCharAt(len-1,p);
                    flag=true;
                    out.println(str);
                    break;
                }
            }
            if (!flag) {
                for (i = s.length()-1; i>=0; i--) {
                    char p=s.charAt(i);
                    int tp=Character.getNumericValue(p);
                    int last=Character.getNumericValue(s.charAt(len-1));
                    if (tp%2==0 && tp>last){
                        str.setCharAt(i,q);
                        str.setCharAt(len-1,p);
                        flag2=true;
                        out.println(str);
                        break;
                    }
                }
            }
            if (!flag && !flag2)
                out.println(-1);
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