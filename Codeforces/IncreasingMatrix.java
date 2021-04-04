import java.io.*;
import java.util.*;


public class IncreasingMatrix {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc =1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int arr[][]=new int[n][m];

            for (i = 0; i < n; i++)
                for (j = 0; j < m; j++)
                    arr[i][j]=sc.nextInt();

            for (i = n-1; i >= 0; i--)
                for (j = m-1; j >= 0; j--)
                    if (arr[i][j]==0)
                        arr[i][j]=Math.min(arr[i][j+1]-1,arr[i+1][j]-1);

            boolean flag=false;
            for (i = 0; i < n; i++)
                for (j = 0; j < m; j++) {
                    if (i<n-1 && arr[i][j]>=arr[i+1][j]){
                        flag=true;
                        break;
                    }
                    if(j < m-1 && arr[i][j] >= arr[i][j+1]){
                        flag=true;
                        break;
                    }
                }

            if (flag)
            out.println(-1);
            else{
                long sum=0;
                for (i = 0; i < n; i++)
                    for (j = 0; j < m; j++)
                        sum+=arr[i][j];
                out.println(sum);
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