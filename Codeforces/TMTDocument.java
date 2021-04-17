import java.io.*;
import java.util.*;


public class TMTDocument {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            s= sc.nextLine();
            int countm=0;
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='M')
                    countm++;
            }
            if (countm!=n/3)
                out.println("NO");
            else if (s.charAt(n-1)=='M' || s.charAt(0)=='M')
                out.println("NO");
            else{
                boolean flag=false;
                int ft=0,fm=0,bt=0,bm=0;
                for (i = 0; i < n; i++) {
                    if (s.charAt(i)=='T')
                        ft++;
                    else
                        fm++;
                    if (fm>ft) {
                        flag = true;
                        break;
                    }
                }
                for (i = n-1; i >= 0; i--) {
                    if (s.charAt(i)=='T')
                        bt++;
                    else
                        bm++;
                    if (bm>bt) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    out.println("YES");
                else
                    out.println("NO");
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



//    int countft=0,countbft=0;
//    boolean flag=false;
//                i=0;j=n-1;
//                        while(i<=j){
//                        if (s.charAt(i)=='T')
//                        countft++;
//                        if (s.charAt(j)=='T')
//                        countbft++;
//                        if (s.charAt(i)=='M' || s.charAt(j)=='M'){
//                        if(countft<1 || countbft<1) {
//        flag=true;
//        out.println("NO");
//        break;
//        }
//        countft--;
//        countbft--;
//        }
//        i++;j--;
//        }
//        if (!flag)
//        out.println("YES");