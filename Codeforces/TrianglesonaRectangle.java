import java.io.*;
import java.util.*;


public class TrianglesonaRectangle {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            long w = sc.nextLong();
            long h = sc.nextLong();
            int k= sc.nextInt();
            long temp,maxhz=0,minhz=0,minver=0,maxver=0;
            for (i = 0; i < k; i++) {
                if (i==0)
                    minhz=sc.nextLong();
                else if (i==k-1)
                    maxhz=sc.nextLong();
                else
                    temp= sc.nextLong();
            }
            long diffhz=Math.abs(minhz-maxhz);
            k= sc.nextInt();
            for (i = 0; i <k ; i++) {
                if (i==0)
                    minhz=sc.nextLong();
                else if (i==k-1)
                    maxhz=sc.nextLong();
                else
                    temp= sc.nextLong();
            }
            diffhz=Math.max(diffhz,Math.abs(maxhz-minhz));
            k= sc.nextInt();
            for (i = 0; i <k ; i++) {
                if (i==0)
                    minver=sc.nextLong();
                else if (i==k-1)
                    maxver=sc.nextLong();
                else
                    temp= sc.nextLong();
            }
            long diffver= Math.abs(minver-maxver);
            k= sc.nextInt();
            for (i = 0; i <k ; i++) {
                if (i==0)
                    minver=sc.nextLong();
                else if (i==k-1)
                    maxver=sc.nextLong();
                else
                    temp= sc.nextLong();
            }
            diffver=Math.max(diffver,Math.abs(maxver-minver));
            long ans1=diffhz*h;
            long ans2=diffver*w;

            out.println(Math.max(ans1,ans2));
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