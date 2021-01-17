import java.io.*;
import java.util.*;


public class ChatOnline {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = 1;
        while (tc-- > 0) {
            int p= sc.nextInt();
            int q= sc.nextInt();
            int l= sc.nextInt();
            int r= sc.nextInt();
            int count=0;
            Pair b[]=new Pair[p];
            for (i = 0; i <p ; i++)
                b[i]=new Pair(sc.nextInt(), sc.nextInt());
            Pair arr[]=new Pair[q];
            for (i = 0; i < q; i++)
                arr[i]=new Pair(sc.nextInt(), sc.nextInt());
            for (i = l; i <=r ; i++) {
                boolean flag=false;
                for (j = 0; j <q ; j++) {
                   for(int k=0;k<p;k++){
                       if (arr[j].x+i<=b[k].y && b[k].x<=arr[j].y+i) {
                           count++;
                           flag=true;
                           break;
                       }
                   }
                   if (flag)break;
                }
            }
            out.println(count);
        }
        out.close();
    }


     static class Pair{
        int x, y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
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