import java.io.*;
import java.util.*;


public class StoneGame {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int min=1;
            int max=n;
            int b[]=new int[n];
            int c=0;
            for (i = n-1; i >=0 ; i--)
                b[c++]=arr[i];

            int posmin=-1,posmax=-1,posmin2=-1,posmax2=-1;
            for (i = 0; i < n; i++) {
                if (arr[i]==min){
                    posmin=i;
                    i++;
                    while(i<n && arr[i]!=max)
                        i++;
                    posmax=Math.min(n-i,i-posmin);
                    break;
                }
                if (arr[i]==max){
                    posmax=i;
                    i++;
                    while(i<n && arr[i]!=min)
                        i++;
                    posmin=Math.min(n-i,i-posmax);
                    break;
                }
            }
            for (i = 0; i < n; i++) {
                if (b[i]==min){
                    posmin2=i;
                    i++;
                    while(i<n && b[i]!=max)
                        i++;
                    posmax2=Math.min(n-i,i-posmin2);
                    break;
                }
                if (b[i]==max){
                    posmax2=i;
                    i++;
                    while(i<n && b[i]!=min)
                        i++;
                    posmin2=Math.min(n-i,i-posmax2);
                    break;
                }
            }
            int ans=posmax+posmin;
            int ans2=posmax2+posmin2;
            out.println(Math.min(ans,ans2)+1);
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