import java.io.*;
import java.util.*;


public class DataRecovery {

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
            int min= sc.nextInt();
            int max= sc.nextInt();
            int arr[] = new int[m];
            boolean flag=false;
            for (i = 0; i < m; i++) {
                arr[i]= sc.nextInt();
                if (arr[i]<min || arr[i]>max)
                    flag=true;

            }
            if (flag)
                out.println("Incorrect");
            else {
                Set<Integer> set = new HashSet<>();
                for (i = 0; i < m; i++)
                    set.add(arr[i]);
                boolean flagmax=false,flagmin=false;
                if (set.contains(max))
                    flagmax=true;
                if (set.contains(min))
                    flagmin=true;
                if (flagmax && flagmin)
                    out.println("Correct");
                if ((flagmax && !flagmin) || (flagmin && !flagmax)){
                    if (n-m<1)
                        out.println("Incorrect");
                    else
                        out.println("Correct");
                }
                if (!flagmax && !flagmin){
                    if (n-m<2)
                        out.println("Incorrect");
                    else
                        out.println("Correct");
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