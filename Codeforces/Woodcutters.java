import java.io.*;
import java.util.*;


public class Woodcutters {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            Pair arr[]=new Pair[n];
            int ans=2;
            for (i = 0; i < n; i++)
                arr[i]=new Pair(sc.nextLong(),sc.nextLong());
            long point=arr[0].x;
            for (i = 1; i <n-1 ; i++) {
                if(arr[i].x-arr[i].y >point) {
                    ans++;
                    point=arr[i].x;
                }
                else if(arr[i].x+arr[i].y<arr[i+1].x ){
                    ans++;
                    point=arr[i].x+arr[i].y;
                }
                else
                    point=arr[i].x;
            }
            if(n==1) ans--;
            out.println(ans);
        }
        out.close();
    }
	


/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair/* implements Comparable<Pair>*/ {
        long x, y;

        Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }

       /* @Override
        public int compareTo(Pair o) {
            return this.x - o.x;
        }*/
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