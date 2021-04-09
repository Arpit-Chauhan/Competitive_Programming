import java.io.*;
import java.util.*;


public class LandLot {

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
            int arr[][]=new int[n][m];
            for (i = 0; i < n; i++)
                for (j = 0; j < m; j++)
                    arr[i][j]= sc.nextInt();
            int a= sc.nextInt();
            int b= sc.nextInt();

            int ab=getResult(arr,n,m,a,b);
            int ba=getResult(arr,n,m,b,a);
            out.println(Math.min(ab,ba));

            out.println();
        }
        out.close();
    }

    static int getResult(int arr[][],int n,int m,int a,int b){
        int res=Integer.MAX_VALUE;
        int count=0;
        for (int i = 0; i <= n-a; i++) {
            for (int j = 0; j <= m-b; j++) {
                count = 0;
                for (int k = i; k <i+a; k++) {
                    for (int l = j; l < j+b; l++) {
                        if (arr[k][l] == 1)
                            count++;
                    }
                }
                res = Math.min(count, res);
            }
        }
        return res;
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