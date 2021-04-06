import java.io.*;
import java.util.*;


public class AfricanCrossword {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            char arr[][]=new char[n][m];
            boolean crossed[][]=new boolean[n][m];

            for (i = 0; i < n; i++)
                arr[i]=sc.nextLine().toCharArray();

            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    p=arr[i][j];
                    for (int k=i+1;k<n;k++)
                        if (arr[k][j]==p) {
                            crossed[k][j] = true;
                            crossed[i][j]=true;
                        }
                    for (int l=j+1;l<m;l++)
                        if (arr[i][l]==p) {
                            crossed[i][l] = true;
                            crossed[i][j]=true;
                        }
                }
            }
            StringBuilder ans=new StringBuilder();
            for (i = 0; i < n; i++)
                for (j = 0; j < m; j++)
                    if (!crossed[i][j])
                        ans.append(arr[i][j]);
            out.println(ans);
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