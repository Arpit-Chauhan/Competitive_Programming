import java.io.*;
import java.util.*;


public class MEET {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = sc.nextInt();
        while (tc-- > 0) {
            s=sc.nextLine();
            int p=giveMinutes(s);
            n = sc.nextInt();
            i=0;
            int temp=n;
            Pair arr[]=new Pair[n];
            while (temp-->0) {
                String str=sc.nextLine();
                arr[i]=new Pair(giveMinutes(str.substring(0,8)),giveMinutes(str.substring(9)));
                i++;
            }
            StringBuilder sb=new StringBuilder();
            for (i = 0; i < n; i++) {
                if (p>=arr[i].x && p<=arr[i].y)
                    sb.append("1");
                else
                    sb.append("0");
            }
            out.println(sb);
        }
        out.close();
    }

    static int giveMinutes(String s){
        int ans=0;
        if (s.charAt(6)=='A'){
            int hrs=Integer.parseInt(s.substring(0,2));
            int min=Integer.parseInt(s.substring(3,5));
            hrs%=12;
            ans+=hrs*60+min;
        }
        else {
            int hrs=Integer.parseInt(s.substring(0,2));
            int min=Integer.parseInt(s.substring(3,5));
            hrs%=12;
            hrs+=12;
            ans+=hrs*60+min;
        }
        return ans;
    }

    static class Pair{
        int x,y;
        Pair(int x,int y){
            this.x=x;this.y=y;
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