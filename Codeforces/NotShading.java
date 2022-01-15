import java.io.*;
import java.util.*;


public class NotShading {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m= sc.nextInt();
            int r= sc.nextInt();
            int c= sc.nextInt();
            r--;
                    c--;
            char arr[][] = new char[n][m];
            for (i = 0; i < n; i++) {
                s = sc.nextLine();
                arr[i] = s.toCharArray();
            }
            if (arr[r][c]=='B')
                out.println(0);

            else {
                boolean flag = false;
                boolean flag3=false;
                for (i = 0; i < n; i++) {
                    if (arr[i][c] == 'B') {
                        out.println(1);
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    for (i = 0; i < m; i++) {
                        if (arr[r][i] == 'B') {
                            out.println(1);
                            flag3 = true;
                            break;
                        }
                    }
                }
                if (!flag && !flag3) {
                    boolean flag2=false;
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < m; j++) {
                            if (arr[i][j] == 'B') {
                                out.println(2);
                                flag2 = true;
                                break;
                            }
                        }
                        if (flag2)
                            break;
                    }
                    if (!flag2)
                        out.println(-1);
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