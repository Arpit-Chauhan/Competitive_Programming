import java.io.*;
import java.util.*;


public class cAPSlOCK {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            s = sc.nextLine();
            StringBuilder str = new StringBuilder();
            int countcaps = 0, totalchar = 0;
            if (s.length() == 1) {
                if (Character.isLowerCase(s.charAt(0)))
                s = s.toUpperCase();
                else if (Character.isUpperCase(s.charAt(0)))
                    s=s.toLowerCase();
                out.println(s);
            } else {
                for (i = 1; i < s.length(); i++) {
                    p = s.charAt(i);
                    if (p != ' ' && Character.isUpperCase(p)) {
                        countcaps++;
                        totalchar++;
                    }
                    else if(p!=' ')
                    totalchar++;
                }
                if (totalchar != countcaps)
                    out.println(s);
                else {
                    if (Character.isUpperCase(s.charAt(0)))
                        out.println(s.toLowerCase());
                    else {
                        str.append(Character.toUpperCase(s.charAt(0)));
                        str.append(s.substring(1).toLowerCase());
                        out.println(str);
                    }
                }
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