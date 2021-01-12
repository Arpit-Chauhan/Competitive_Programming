import java.io.*;
import java.util.*;


public class LittleElephantandMagicSquare {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc=1;
        while (tc-- > 0) {
            int sum=0;
            int arr[][]=new int[3][3];
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    arr[i][j]= sc.nextInt();
                    sum+=arr[i][j];
                }
            }
             sum=sum/2;
            arr[0][0] = sum - arr[0][1] - arr[0][2];
            arr[1][1] = sum - arr[1][0] - arr[1][2];
            arr[2][2] = sum - arr[2][0] - arr[2][1];
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        out.print(arr[i][j]+" ");
                    }
                    out.println();
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