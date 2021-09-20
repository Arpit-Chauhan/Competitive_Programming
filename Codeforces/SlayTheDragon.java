import java.io.*;
import java.util.*;


public class SlayTheDragon {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            long arr[] = sc.readArray(n);
            TreeSet<Long> set=new TreeSet<>();
            for (i = 0; i < n; i++)
                set.add(arr[i]);
            long sum=0;
            for (long el:arr)
                sum+=el;
            int m= sc.nextInt();
            while(m-->0){
                long temp1=0,temp2=0;
                long x= sc.nextLong();
                long y= sc.nextLong();
                Long floorval= set.floor(x);
                Long ceilval= set.ceiling(x);
                if(floorval==null){
                    if((sum-ceilval)<y)
                        temp1=Math.abs((sum-ceilval)-y);
                    out.println(temp1);
                }
                else if(ceilval==null){
                    temp1=Math.abs(floorval-x);
                    if ((sum-floorval)<y)
                        temp1+=Math.abs((sum-floorval)-y);
                    out.println(temp1);
                }
                else{
                    if ((sum-ceilval)<y)
                        temp1=Math.abs((sum-ceilval)-y);

                    temp2=Math.abs(floorval-x);
                    if ((sum-floorval)<y)
                       temp2+=Math.abs((sum-floorval)-y);
                    out.println(Math.min(temp1,temp2));
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
        long[] readArray(int n) {
            long arr[] = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = nextLong();
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