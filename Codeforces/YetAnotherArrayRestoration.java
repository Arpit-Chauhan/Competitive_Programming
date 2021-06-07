import java.io.*;
import java.util.*;


public class YetAnotherArrayRestoration {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int diff=y-x;
            if (n==2)
            out.println(x+" "+y);
            else if (diff+1==n){
                for (i = x; i <=y ; i++)
                    out.print(i+" ");
                out.println();
            }
            else{
                boolean flag=false;
                for (i = 1; i <=diff ; i++) {
                    if (diff%i==0 && ((diff/i)+1)<=n){
                        flag=true;
                        int count=0;
                        for (j = y; j >=x ; j-=i) {
                            out.print(j+" ");
                            count++;
                        }
                        if (count!=n){
                            while(count!=n){
                                x-=i;
                                if (x<1)
                                    break;
                                out.print(x+" ");
                                count++;
                            }
                        }
                        if (count!=n){
                            while(count!=n){
                                y+=i;
                                out.print(y+" ");
                                count++;
                            }
                        }
                        out.println();
                    }
                    if (flag)
                        break;
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
    }
}