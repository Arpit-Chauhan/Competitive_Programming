import java.io.*;
import java.util.*;


public class ORinMatrix {

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
            int arr[][]=new int[n][m];
            int b[][]=new int[n][m];
            int c[][]=new int[n][m];
            for (i = 0; i < n; i++)
                for (j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                    b[i][j]=1;
                }
            for (i = 0; i < n; i++)
                for (j = 0; j < m; j++) {
                    if (arr[i][j]==0){
                        for (int k=0;k<n;k++)
                            b[k][j]=0;
                        for (int k=0;k<m;k++)
                            b[i][k]=0;
                    }
                }
            boolean flag=false;
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    for(int k=0;k<n;k++)
                        c[i][j] = c[i][j] | b[k][j];
                    for(int k=0;k<m;k++)
                        c[i][j] = c[i][j] | b[i][k];
                    if(c[i][j]!=arr[i][j]){
                        out.println("NO");
                        flag=true;
                        break;
                    }
                }
                if (flag)
                    break;
            }
            if (!flag){
                out.println("YES");
                for (i = 0; i < n; i++) {
                    for (j = 0; j < m; j++)
                        out.print(b[i][j] + " ");
                    out.println();
                }
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

        void swap(int arr[], int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}