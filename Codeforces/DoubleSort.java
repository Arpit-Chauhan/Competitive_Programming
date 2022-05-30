import java.io.*;
import java.util.*;


public class DoubleSort {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int a[] = sc.readArray(n);
            int b[]=sc.readArray(n);
            int ans=0;
            ArrayList<Integer> list=new ArrayList<>();
            for ( i = 0; i < n; i++) {
                for ( j = i + 1; j < n; j++) {
                    if (a[i] > a[j]) {
                        sc.swap(a,i,j);
                        sc.swap(b,i,j);
                        ans++;
                        list.add(i + 1);
                        list.add(j + 1);

                    }
                    if (a[i] == a[j]) {
                        if (b[i] > b[j]) {
                            sc.swap(b,i,j);
                            ans++;
                            list.add(i + 1);
                            list.add(j + 1);

                        }
                    }
                }
            }

            boolean flag = true;

            for ( i = 0; i < n - 1; i++) {
                if (b[i] > b[i + 1]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                out.println(ans);
                for (i = 0; i < list.size(); i += 2)
                    out.println(list.get(i)+" "+list.get(i+1));
            } else
               out.println(-1);

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