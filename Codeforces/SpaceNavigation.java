import java.io.*;
import java.util.*;


public class SpaceNavigation {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            s=sc.nextLine();
            int countl=0,countr=0,countd=0,countu=0;
            boolean flagl=false,flagr=false,flagd=false,flagu=false;
            if (x==0 && y==0)
                out.println("YES");
            else {
                if (x < 0) {
                    flagl = true;
                    countl = Math.abs(x);
                } else {
                    flagr = true;
                    countr = x;
                }
                if (y < 0) {
                    countd = Math.abs(y);
                    flagd = true;
                } else {
                    countu = y;
                    flagu = true;
                }
                int templ = 0, tempr = 0, tempd = 0, tempu = 0;
                for (i = 0; i < s.length(); i++) {
                    char p = s.charAt(i);
                    if (flagl && p == 'L')
                        templ++;
                    else if (flagr && p == 'R')
                        tempr++;
                    else if (flagu && p == 'U')
                        tempu++;
                    else if (flagd && p == 'D')
                        tempd++;
                }
                if ((flagl && flagd) && (countd <= tempd && countl <= templ))
                    out.println("YES");
                else if ((flagl && flagu) && (countu <= tempu && countl <= templ))
                    out.println("YES");
                else if ((flagr && flagd) && (countd <= tempd && countr <= tempr))
                    out.println("YES");
                else if ((flagr && flagu) && (countu <= tempu && countr <= tempr))
                    out.println("YES");
                else
                    out.println("NO");
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
        int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}