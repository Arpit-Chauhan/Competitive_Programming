import java.io.*;
import java.util.*;


public class Coins {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int a=0,b=0,c=0;
            for (i = 0; i < 3; i++) {
                s= sc.nextLine();
                char arr[]=s.toCharArray();
                if (arr[1]=='>'){
                 if (arr[2]=='A')
                     a++;
                 else if (arr[2]=='B')
                     b++;
                 else
                     c++;
                }
                if (arr[1]=='<'){
                    if (arr[0]=='A')
                        a++;
                    else if (arr[0]=='B')
                        b++;
                    else
                        c++;
                }
            }
            if (a==b && b==c)
                out.println("Impossible");
            else {
                if (a > b && b > c)
                    out.println("ABC");
                if (c > b && b > a)
                    out.println("CBA");
                if (b > a && a > c)
                    out.println("BAC");
                if (c > a && a > b)
                    out.println("CAB");
                if (a > c && c > b)
                    out.println("ACB");
                if (b > c && c > a)
                    out.println("BCA");
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