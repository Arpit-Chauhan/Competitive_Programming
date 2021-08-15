import java.io.*;
import java.util.*;


public class MochaAndRedAndBlue {

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
            String b="",r="";
            StringBuilder ans=new StringBuilder(s);
            if (n==1 && s.charAt(0)=='?')
                ans.setCharAt(0,'B');
            int pos=-1;
            for (i = 0; i < n; i++) {
                if (ans.charAt(i)!='?') {
                    pos = i;
                    break;
                }
            }
            if (pos==-1)
                ans.setCharAt(0,'B');
            if(ans.charAt(0)=='?' && pos!=-1){
                if (pos%2==0 && ans.charAt(pos)=='R')
                    ans.setCharAt(0,'R');
                if (pos%2==0 && ans.charAt(pos)=='B')
                    ans.setCharAt(0,'B');
                if (pos%2!=0 && ans.charAt(pos)=='R')
                    ans.setCharAt(0,'B');
                if (pos%2!=0 && ans.charAt(pos)=='B')
                    ans.setCharAt(0,'R');
            }
           for(i=1;i<n;i++){
               if (ans.charAt(i)=='?') {
                   if (ans.charAt(i - 1) == 'B')
                       ans.setCharAt(i, 'R');
                   else
                       ans.setCharAt(i, 'B');
               }
           }
           out.println(ans);
        }
        out.close();
    }

//    public static int calc(String s){
//        int count=0;
//        for (int i = 1; i <s.length() ; i++)
//            if (s.charAt(i)==s.charAt(i-1))
//                count++;
//        return count;
//    }


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