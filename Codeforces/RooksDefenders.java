import java.io.*;
import java.util.*;


public class RooksDefenders {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int q=sc.nextInt();
            TreeSet<Integer> rowset = new TreeSet<>();
            TreeSet<Integer> colset = new TreeSet<>();
            for (i = 0; i <= n; i++) {
                rowset.add(i);
                colset.add(i);
            }
            int row[] = new int[n + 1];
            int col[] = new int[n + 1];
            while(q-->0) {
                int temp = sc.nextInt();
                if (temp == 1) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    row[x]++;
                    col[y]++;
                    if (row[x] == 1)
                        rowset.remove(x);
                    if (col[y]==1)
                        colset.remove(y);

                } else if (temp == 2) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    row[x]--;
                    col[y]--;
                    if (row[x] == 0)
                        rowset.add(x);
                    if (col[y] == 0)
                        colset.add(y);
                } else {
                    int x1 = sc.nextInt();
                    int y1 = sc.nextInt();
                    int x2 = sc.nextInt();
                    int y2 = sc.nextInt();
                    if (rowset.floor(x2) < x1 || colset.floor(y2) < y1)
                        out.println("Yes");
                     else
                        out.println("No");
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