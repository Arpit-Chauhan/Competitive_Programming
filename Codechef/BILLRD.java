import java.io.*;
import java.util.*;


public class BILLRD {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = sc.nextInt();
        while (tc-- > 0) {
            n = sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if (x==y)
                out.println(n+" "+n);
            else {
                if (x<y){
                    int firstx=n+x-y;
                    int secy=n+x-y;
                    int thirdx=y-x;
                    int fourthy=y-x;
                    String first=firstx+" "+n;
                    String second=n+" "+secy;
                    String third=thirdx+" "+0;
                    String fourth=0+" "+fourthy;
                    String arr[]={first,second,third,fourth};
                    out.println(arr[(k-1)%4]);
                }
                if (y<x){
                    int firsty=y+n-x;
                    int secx=y+n-x;
                    int thirdy=x-y;
                    int fourthx=x-y;
                    String first=n+" "+firsty;
                    String second=secx+" "+n;
                    String third=0+" "+thirdy;
                    String fourth=fourthx+" "+0;
                    String arr[]={first,second,third,fourth};
                    out.println(arr[(k-1)%4]);
                }
            }
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
        public static int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}